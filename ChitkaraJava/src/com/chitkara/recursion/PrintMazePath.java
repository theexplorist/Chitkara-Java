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
	
	private static void printPathFour(int cr, int cc, String path, int n, boolean[][] vis) {
		// TODO Auto-generated method stub
		//maze se bahar ni jaana
		if(cr >= n || cc >= n || cr < 0 || cc < 0 || vis[cr][cc] == true ) {//
			return;
		}
		
		//pos base case
		
		if(cr == n - 1 && cc == n - 1) {//
			System.out.println(path);
			return;
		}
		
		vis[cr][cc] = true;
		printPathFour(cr - 1, cc, path + 'U', n, vis); //Up
		printPathFour(cr + 1, cc, path + 'D', n, vis); //Down
		printPathFour(cr, cc - 1, path + 'L', n, vis); //Left
		printPathFour(cr, cc + 1, path + 'R', n, vis); //Right
		vis[cr][cc] = false; //backtracking step
	}
	
	private static void printPathFourObs(int[][] maze, int cr, int cc, String path, int n, boolean[][] vis) {
		// TODO Auto-generated method stub
		//maze se bahar ni jaana
		if(cr >= n || cc >= n || cr < 0 || cc < 0 || vis[cr][cc] == true || maze[cr][cc] == 1 ) {//
			return;
		}
		
		//pos base case
		
		if(cr == n - 1 && cc == n - 1) {//
			System.out.println(path);
			return;
		}
		
		vis[cr][cc] = true;
		printPathFourObs(maze, cr - 1, cc, path + 'U', n, vis); //Up
		printPathFourObs(maze, cr + 1, cc, path + 'D', n, vis); //Down
		printPathFourObs(maze, cr, cc - 1, path + 'L', n, vis); //Left
		printPathFourObs(maze, cr, cc + 1, path + 'R', n, vis); //Right
		vis[cr][cc] = false; //backtracking step
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3 * 3
//		boolean[][] vis = new boolean[3][3];
//		
//		for(int i = 0; i < 3; i++) {
//			for(int j = 0; j < 3; j++) {
//				System.out.print(vis[i][j] + " ");
//			}
//			
//			System.out.println();
//		}
//		
//		printPathFour(0, 0, "", 3, vis);
//		
//		for(int i = 0; i < 3; i++) {
//			for(int j = 0; j < 3; j++) {
//				System.out.print(vis[i][j] + " ");
//			}
//			
//			System.out.println();
//		}
		
		int[][] maze = {{0, 1, 0, 0}, {0, 0, 0 ,0}, {0, 1, 0, 0}, {0, 1, 1, 0}};
		boolean[][] vis = new boolean[4][4];
		printPathFourObs(maze, 0, 0, "", 4, vis);
	}

}
