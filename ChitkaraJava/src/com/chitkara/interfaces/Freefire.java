package com.chitkara.interfaces;

public interface Freefire {
	
	public void sastiSystemRequirements();
	
	default public void jyadaCharacters() {
		System.out.println("Hamari game mein 50 characters hai!");
	}
}
