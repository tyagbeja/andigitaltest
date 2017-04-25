package com.andigital.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.andigital.foursquare.model.Item;
import com.andigital.foursquare.model.Result;

@RestController
public class VenueController {
	
	public static String FOURSQUARE_REST_URL = "https://api.foursquare.com/v2/";
    public static String FOURSQUARE_VENUES_SEARCH = "venues/explore";
    private static final Logger log = LoggerFactory.getLogger(Application.class);
    
    @Autowired
    private RestTemplate restTemplate;
    
    @Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@RequestMapping("/venue")
	public List<Item> venue(@RequestParam(value="name") String name){	
		final UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(FOURSQUARE_REST_URL + FOURSQUARE_VENUES_SEARCH)
                .queryParam("near", name)
                .queryParam("client_id", "JSXJQI0ETWLQOYB04LH5IYEPFMYWNVJN4SDDIM054VSKJ5V0")
                .queryParam("client_secret", "32AHLOLL3JIU13LUKVZDYDWERLHQMBRJO1RPNF5PORGTRBKP")
                .queryParam("v", "20160801");
		try{
			Result result = restTemplate.getForObject(builder.build().encode().toUriString(), Result.class);
			return result.getResponse().getGroups().get(0).getItems();
		}
		catch (Exception ex){
			log.error(ex.getMessage());
			return new ArrayList<Item>();
		}
	}
	
}
