package com.chitkara.multithreading;

public class ChaiKiFactory extends FaaduMachine implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " chai chotu number " + Thread.currentThread().getName() + " ne banayi");
		}
	}
}
