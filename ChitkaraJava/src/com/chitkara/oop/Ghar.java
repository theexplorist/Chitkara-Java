package com.chitkara.oop;

//Noun
public class Ghar {
	
	//Adjectives/data memebers
	int size;
	String color;
	int price;//ye powerful
	private int doors = 6;
	
	//Constructor Overloading
	public Ghar() { //Cons 1
		this(1000, "Yellow", 20000);
	}
	
	//2000, Red, 1000000
	public Ghar(int size, String color, int price) { //Const2
		this.size = size;
		this.color = color;
		this.price = price;
	}
	
	public Ghar(int size, String color) { //Const 3
		this.size = size;
		this.color = color;
		this.price = 30000;
	}
	public void gharKiPriceBata(Ghar g1) {
		// TODO Auto-generated method stub
		System.out.println(this.price);// price/this.price
		//System.out.println(g1.price);
	}
	
	public void priceSet(int price) {
		this.price = price;//ambiguity
	}
	
	public int getDoors() {
		return this.doors;
	}
}
