package com.chitkara.inheritance;
/*Demp Pull Request*/
public class IronManFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Case 1 - 
		
		/*
		IronManSuitV1 suit1 = new IronManSuitV1();
		System.out.println(suit1.arcReactor);
		suit1.canFly();
		suit1.flameThrower();
		*/
		
		//Case 2 - 
		
		IronManSuitV1 suit2 = new IronManSuitV2();
		((IronManSuitV2)suit2).uniBeam();//line
		System.out.println(((IronManSuitV2)suit2).arcReactor);
		System.out.println(((IronManSuitV2)suit2).power);
		((IronManSuitV1)suit2).canFly();
		
		
		//Case 3 - 
		/*
		IronManSuitV2 suit3 = new IronManSuitV1();
		suit3.uniBeam();
		*/
		
		//Case 4 - 
		IronManSuitV2 suit4 = new IronManSuitV2();
		suit4.canFly();
		suit4.flameThrower();
		System.out.println(suit4.arcReactor);
		System.out.println(suit4.power);
		suit4.canFly();
	}
}
