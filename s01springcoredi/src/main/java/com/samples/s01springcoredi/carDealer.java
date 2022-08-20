package com.samples.s01springcoredi;

import java.util.List;
import java.util.Set;

public class carDealer {
	
	private String name;
	private Set<String> models;
	public String getName() {
		return name;
		
	}
	public Set<String> getModels() {
		return models;
	}
	public void setModels(Set<String> models) {
		this.models = models;
	}
	public void setName(String name) {
		this.name = name;
		
	}
	@Override
	public String toString() {
		return "carDealer [name=" + name + ", models=" + models + "]";
	}

}
