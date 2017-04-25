package com.andigital.foursquare.model;

import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public class ResponseTest {

	@Test
	public void testGetAndSetGroups() {
		Response response = new Response();
		List<Group> groups = new ArrayList<Group>();
		groups.add(new Group());
		response.setGroups(groups);
		assertThat(response.getGroups(), equalTo(groups));
		assertThat(response.getGroups().size(), is(1));
	}

}
