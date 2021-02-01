package com.chitkara.addvanced.recursion;


//https://leetcode.com/problems/generate-parentheses/
public class GenerateParenthesis {

	public static void printAll(int n, String ans, int op, int cl) {

		if (op == n && cl == n) {
			System.out.println(ans);
			return;
		}

		if (op < n) {
			printAll(n, ans + '(', op + 1, cl);
		}

		if (op > cl) {
			printAll(n, ans + ')', op, cl + 1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printAll(3, "", 0, 0);
	}

}
