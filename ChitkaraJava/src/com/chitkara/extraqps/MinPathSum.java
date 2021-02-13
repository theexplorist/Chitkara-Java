package com.chitkara.extraqps;

public class MinPathSum {
	
	//cr = cost.length - 1 -> 2, cc = cost[0].length - 1 -> 2, er = 0, ec = 0
	private static int minCost(int[][] cost, int cr, int cc, int er, int ec, int[][] dp) {
		// TODO Auto-generated method stub
		if(cr == er && cc == ec) { //Main pahunch gya
			return cost[cr][cc];
		}
		
		if(dp[cr][cc] != -1) {
			return dp[cr][cc];
		}
		if(cr == 0) {
			return dp[cr][cc] = minCost(cost, cr, cc - 1, er, ec, dp) + cost[cr][cc];
		}
		
		if(cc == 0) {
			return dp[cr][cc] = minCost(cost, cr - 1, cc, er, ec, dp) + cost[cr][cc];
		}
		//Up wala move chalna
		int up = minCost(cost, cr - 1, cc, er, ec, dp);
		
		//Left wala move chalna
		int left = minCost(cost, cr, cc - 1, er, ec, dp);
		
		int myAns = Math.min(up, left) + cost[cr][cc];
		
		return dp[cr][cc] = myAns;
	}
	
	/*
	//cr = 0, cc = 0, er = cost.length - 1 ec = cost[0].length - 1
	private static int minCost(int[][] cost, int cr, int cc, int er, int ec) {
		// TODO Auto-generated method stub
		
		//Up wala move chalna
		int down = minCost(cost, cr + 1, cc, er, ec);/
		
		//Left wala move chalna
		int right = minCost(cost, cr, cc + 1, er, ec);
		
		int myAns = Math.min(down, right) + cost[cr][cc];
		
		return myAns;
	}
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
