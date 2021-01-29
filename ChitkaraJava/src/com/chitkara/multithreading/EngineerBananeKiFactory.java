package com.chitkara.multithreading;

import java.util.concurrent.TimeUnit;

public class EngineerBananeKiFactory extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 200; i++) {
			try {
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				
			}
			System.out.println(i + " engineer ban gya!");
		}	
	}
}
