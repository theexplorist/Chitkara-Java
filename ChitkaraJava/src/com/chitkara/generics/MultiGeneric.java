package com.chitkara.generics;

public class MultiGeneric<Kuch, Bhi, Bhej> {

	Kuch val1;
	Bhi val2;
	Bhej val3;
	
	public MultiGeneric(Kuch val1, Bhi val2, Bhej val3) {
		// TODO Auto-generated constructor stub
		this.val1 = val1;
		this.val2 = val2;
		this.val3 = val3;
		
		System.out.println("Hum teen teen hain!" + this.val1 + " " + this.val2 + " " + this.val3);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiGeneric<Integer, String, Integer> obj = new MultiGeneric<>(10, "Ferrari", 20);
	}

}
