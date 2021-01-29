package com.chitkara.packagedemo;

import com.chitkara.inheritance.IronManSuitV1;

public class IronManSuitV3 extends IronManSuitV1 {

	public static void main(String[] args) {
		IronManSuitV3 ir = new IronManSuitV3();
		System.out.println(ir.arcReactor); // Access of protected in child class of parent in different package
	}
}
