package com.andigital.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Venue {
	@NotNull
    @Size(min=2, max=30)
    private String name;

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}
}
