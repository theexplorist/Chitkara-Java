package com.chitkara.addvanced.recursion;

public class PrintAllSubsequences {

	// abc, ""
	private static void printSubs(String input, String ans) {
		// TODO Auto-generated method stub

		if (input.length() == 0) {
			System.out.println(ans);
			return;
		}
		char zeroth = input.charAt(0); // a
		String bachiHuiString = input.substring(1); // bc

		printSubs(bachiHuiString, ans + zeroth);// Inc
		printSubs(bachiHuiString, ans); // exc
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSubs("abc", "");
	}

}
