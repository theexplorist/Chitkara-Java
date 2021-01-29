package com.chitkara.multithreading;

public class FerrariBananeKiFactory extends Thread {
	
	FerrariCount countFerrari;
	
    public FerrariBananeKiFactory(FerrariCount countFerrari) {
		// TODO Auto-generated constructor stub
    	this.countFerrari = countFerrari;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 400; i++)
		this.countFerrari.increment();
	}
}
