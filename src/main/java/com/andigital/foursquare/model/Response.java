package com.andigital.foursquare.model;

import java.util.List;

public class Response {
	List<Group> groups;
	public Response() {

	}

	public List<Group> getGroups() {
		return groups;
	}

	public final void setGroups(List<Group> groups) {
		this.groups = groups;
	}
}
