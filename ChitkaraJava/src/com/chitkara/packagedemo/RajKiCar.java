package com.chitkara.packagedemo;

import com.chitkara.inheritance.IronManSuitV1;
import com.chitkara.oop.Ghar;

public class RajKiCar {
	
	public void rajKiGaadi() {
		// TODO Auto-generated method stub
		System.out.println("Main raj ki gaadi chala raha hun");
	}
	
	public static void main(String[] args) {
		RahulKiBike bike = new RahulKiBike();
		bike.rahulKiBike();
		
		com.chitkara.packagedemofirse.ShyamKiFerrari ferrari = new com.chitkara.packagedemofirse.ShyamKiFerrari();
		ferrari.ferrari();
		System.out.println(RajKiCar.class.getName());
	}
}
