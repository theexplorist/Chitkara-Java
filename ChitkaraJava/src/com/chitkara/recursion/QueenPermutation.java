package com.chitkara.addvanced.recursion;

public class QueenPermutation {

	public static void kitneWays(boolean[] buildings, int n, int totalBande, int kitnePlaceHoGye, String res) {
		if (totalBande == kitnePlaceHoGye) {
			System.out.println(res);
			return;
		}

		for (int i = 0; i < n; i++) {
			if (buildings[i] != true) {
				buildings[i] = true;

				kitneWays(buildings, n, totalBande, kitnePlaceHoGye + 1, res + "c" + i + "q" + kitnePlaceHoGye + " ");
				buildings[i] = false;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] buildings = new boolean[4];
		kitneWays(buildings, 4, 2, 0, "");
	}

}
