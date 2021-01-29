package com.chitkara.interfaces;

public interface PubG extends Freefire, GTA{
	
	public void jyadaVehicles();
	
	public void acheGraphics();
	
	default public void acheWeapons() {
		System.out.println("Isme ache weapons hain!");
	}
}
