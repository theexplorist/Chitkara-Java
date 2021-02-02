package com.chitkara.addvanced.recursion;

public class RajKaGharKiRenovation {

	public static void renovation(boolean[] raj, int si) {
		
		if(si == raj.length) {
			return;
		}
		
		raj[si] = true;
		renovation(raj, si + 1);
		raj[si] = false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean[] raj = new boolean[3];
		renovation(raj, 0);
		for(int i = 0; i < 3; i++) {
			System.out.println(raj[i]);
		}
	}

}
