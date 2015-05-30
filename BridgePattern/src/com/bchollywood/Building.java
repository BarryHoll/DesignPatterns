package com.bchollywood;

public abstract class Building {
	
	protected BuildAPI buildAPI;
	
	protected Building(BuildAPI buildAPI) {
		this.buildAPI = buildAPI;
	}
	
	public abstract void build();

}
