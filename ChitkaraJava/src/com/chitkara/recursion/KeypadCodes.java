package com.chitkara.addvanced.recursion;

public class KeypadCodes {
	
	private static String getCode(char c) {
		// TODO Auto-generated method stub
		if (c == '2') {
			return "abc";
		} else if (c == '3') {
			return "def";
		} else if (c == '4') {
			return "ghi";
		} else if (c == '5') {
			return "jkl";
		} else if (c == '6') {
			return "mno";
		} else if (c == '7') {
			return "pqrs";
		} else if (c == '8') {
			return "tuv";
		} else if (c == '9') {
			return "wxyz";
		} else {
			return "";
		}
	}

	// 23, ""
	private static void printCodes(String inp, String ans) {

		if (inp.length() == 0) {
			System.out.println(ans);
			return;
		}
		char zeroth = inp.charAt(0); // 2
		String bachiHuiString = inp.substring(1); // 3

		String zerothWali = getCode(zeroth); // abc

		for (int i = 0; i < zerothWali.length(); i++) {
			printCodes(bachiHuiString, ans + zerothWali.charAt(i));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printCodes("23", "");
	}

}
