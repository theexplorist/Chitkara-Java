package com.chitkara.addvanced.recursion;

public class PrintMazePath {
	
	private static void printPath(int cr, int cc, String path, int n) {
		// TODO Auto-generated method stub
		//maze se bahar ni jaana
		if(cr >= n || cc >= n) {
			return;
		}
		
		//pos base case
		
		if(cr == n - 1 && cc == n - 1) {
			System.out.println(path);
			return;
		}
		
		printPath(cr, cc + 1, path + 'H', n);
		printPath(cr + 1, cc, path + 'V', n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3 * 3
		printPath(0, 0, "", 4);

	}

}
