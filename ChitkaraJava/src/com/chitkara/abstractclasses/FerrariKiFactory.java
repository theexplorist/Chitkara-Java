package com.chitkara.abstractclasses;

public class FerrariKiFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FerrariCalifornia car = new FerrariCalifornia(2);//
		System.out.println(car.kitneDarwaaje());//2
		FerrariEnzo car2 = new FerrariEnzo(4);//
		System.out.println(car2.kitneDarwaaje());
	}

}
