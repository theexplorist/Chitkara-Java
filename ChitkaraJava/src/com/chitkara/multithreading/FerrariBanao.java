package com.chitkara.multithreading;

public class FerrariBanao {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		FerrariCount count = new FerrariCount();
		FerrariBananeKiFactory fact1 = new FerrariBananeKiFactory(count);
		FerrariBananeKiFactory fact2 = new FerrariBananeKiFactory(count);
		
		fact1.start();
		fact1.join();//fact2 ko waiting
		
		fact2.start();
		fact2.join();//main ko waiting 
		
		System.out.println(count.getCount());
	}

}
