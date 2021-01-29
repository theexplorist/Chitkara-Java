package com.chitkara.inheritance;

public class IronManSuitV2 extends IronManSuitV1 {
	
	String arcReactor = "Vibranium";
	String power = "Invisible";
	public void uniBeam() {
		// TODO Auto-generated method stub
		System.out.println("Main unibeam fenkta hun!");
	}
	
	@Override
	public void canFly() {
		// TODO Auto-generated method stub
		super.canFly();
		System.out.println("Main ud sakta hun!");
	}
}
