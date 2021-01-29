package com.chitkara.multithreading;

import java.util.concurrent.TimeUnit;

public class FactoryRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IronManBananeKiFactory ironManPlant = new IronManBananeKiFactory();
		EngineerBananeKiFactory engineerPlant = new EngineerBananeKiFactory();
		
		Thread chaiPlant = new Thread(new ChaiKiFactory());
		ironManPlant.start();
		engineerPlant.start();
		chaiPlant.start();
		for(int i = 1; i <= 100; i++) {
			try {
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				
			}
			System.out.println(i + " pokemon ban gya!");
		}
	}
}
