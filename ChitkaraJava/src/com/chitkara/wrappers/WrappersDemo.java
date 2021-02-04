package com.chitkara.wrappers;

public class WrappersDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 6;//Yahan sb simple, its fast
		
		//Ref - Left, Primitve - Right
		Integer b = 5; //Autoboxing
		//Integer b = new Integer(5); implicitly 
		System.out.println(a + " " + b);
		
		//Integer ans = b * 7;
		//int temp = b.intValue() * 7; //Auto unboxing
		//Integer ans = new Integer(temp); //Auto boxing
		
		
		//Integer ans = b * 7;
		int temp = b.intValue() * 7; // khud unboxing
		Integer ans = new Integer(temp); //khud boxing
		System.out.println(ans);
		
		Integer c = new Integer("20");//1 - purane zaamane ka
		//c = Integer.valueOf("20EFFF");//2 - modern Exception degi
		c = Integer.valueOf("20");
	}
}

