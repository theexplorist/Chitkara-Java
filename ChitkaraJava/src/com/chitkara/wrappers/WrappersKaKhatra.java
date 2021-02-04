package com.chitkara.wrappers;

public class WrappersKaKhatra {
	public static boolean equal(int a, int b) {
		if(a == b) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean equal(Integer a, Integer b) {
//		if(a == b) { //address ko
//			return true;
//		} else {
//			return false;
//		}
		
		if(a.equals(b)) { //values ko
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean equal(Integer a, int b) {
		//a - ref, b - prim
		//a - autounboxing into primitive
		if(a == b) {
			return true;
		} else {
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//long startTime = System.nanoTime();
		/*
		Integer count = 0; //Auto boxing
		//Integer count = new Integer(0);
		for(int i = 0; i < 100000; i++) {
			//count- ref, 1 - pri
			count = count + 1; //Auto unboxing and Auto boxing
			//int temp = count.intValue() + 1;
			//Integer count = new Integer(temp); //Immutable
		}
		*/
		
		/*
		int count = 0;
		for(int i = 0; i < 100000; i++) {
			count = count + 1;
		}
		
		long total = System.nanoTime();
		
		long timeTaken = total - startTime;
		System.out.println(timeTaken/1000000);
		*/
		
		System.out.println(equal(new Integer(4), 4));
		
	}

}
