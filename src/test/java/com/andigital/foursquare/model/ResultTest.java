package com.andigital.foursquare.model;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ResultTest {

	@Test
	public void testGetAndSetResponse() {
		Result result = new Result();
		Response response = new Response();
		result.setResponse(response);
		assertThat(result.getResponse(), equalTo(response));
	}

}
