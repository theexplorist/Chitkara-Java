package com.chitkara.multithreading;

import java.util.concurrent.TimeUnit;

public class IronManBananeKiFactory extends Thread {

	int count = 0;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 100; i++) {
			try {
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				
			}
			count++;
			System.out.println(count + " Iron man ban gaya ");
		}
		
		
	}
}
