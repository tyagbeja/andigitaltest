package com.andigital.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.util.UriComponentsBuilder;

import com.andigital.foursquare.model.Item;
import com.andigital.foursquare.model.Result;
import com.andigital.model.Venue;

@Controller
public class VenueController extends WebMvcConfigurerAdapter {
	
	public static String FOURSQUARE_REST_URL = "https://api.foursquare.com/v2/";
    public static String FOURSQUARE_VENUES_SEARCH = "venues/explore";
    private static final Logger log = LoggerFactory.getLogger(Application.class);
    
    
    @Autowired
    private RestTemplate restTemplate;
    
    @Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
    

    @GetMapping("/")
    public String searchVenue(Venue venue) {
        return "search";
    }
	
	@PostMapping("/")
	@ResponseBody
    public List<Item> searchVenues(@Valid Venue venue, BindingResult bindingResult) {
		UriComponentsBuilder builder = getURIBuilder(venue.getName());
		try{
			Result result = restTemplate.getForObject(builder.build().encode().toUriString(), Result.class);
			return result.getResponse().getGroups().get(0).getItems();
		}
		catch (Exception ex){
			log.error(ex.getMessage());
			return new ArrayList<Item>();
		}
    }
	
    @RequestMapping("/venue")
	@ResponseBody
	public List<Item> venue(@RequestParam(value="name") String name){	
		UriComponentsBuilder builder = getURIBuilder(name);
		try{
			Result result = restTemplate.getForObject(builder.build().encode().toUriString(), Result.class);
			return result.getResponse().getGroups().get(0).getItems();
		}
		catch (Exception ex){
			log.error(ex.getMessage());
			return new ArrayList<Item>();
		}
	}


	private UriComponentsBuilder getURIBuilder(String name) {
		return UriComponentsBuilder.fromHttpUrl(FOURSQUARE_REST_URL + FOURSQUARE_VENUES_SEARCH)
                .queryParam("near", name)
                .queryParam("client_id", "JSXJQI0ETWLQOYB04LH5IYEPFMYWNVJN4SDDIM054VSKJ5V0")
                .queryParam("client_secret", "32AHLOLL3JIU13LUKVZDYDWERLHQMBRJO1RPNF5PORGTRBKP")
                .queryParam("v", "20160801");
	}
}
