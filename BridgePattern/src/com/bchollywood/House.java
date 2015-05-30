package com.bchollywood;

public abstract class House {
	
	protected BuildAPI buildAPI;
	
	protected House(BuildAPI buildAPI) {
		this.buildAPI = buildAPI;
	}
	
	public abstract void build();

}
