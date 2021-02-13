package com.chitkara.binarytree.qps;

import com.chitkara.binarytree.qps.MaxDepth.TreeNode;

public class DiameterOfTree {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {

		public class Pair {
			int dia;
			int dep;

			public Pair(int dia, int dep) {
				this.dia = dia;
				this.dep = dep;
			}
		}

		/*
		 * public int maxDepth(TreeNode root) {
		 * 
		 * if (root == null) { return 0; }
		 * 
		 * int leftD = maxDepth(root.left); int rightD = maxDepth(root.right);
		 * 
		 * int myAns = Math.max(leftD, rightD) + 1; return myAns; }
		 */

		/*
		public int diameterOfBinaryTree(TreeNode root) {

			if (root == null) {
				return 0;
			}
			// Diameter root vali ke liye

			int leftDep = maxDepth(root.left); // 2
			int rightDep = maxDepth(root.right); // 1

			int rootDia = leftDep + rightDep; // 2 + 1 = 3 //meri takat

			int leftDia = diameterOfBinaryTree(root.left); // l bhai ki
			int rightDia = diameterOfBinaryTree(root.right); // r bhai ki

			return Math.max(rootDia, Math.max(leftDia, rightDia));
		}
		*/

		public Pair diameterOfBinaryTree(TreeNode root) {

			if(root == null) {
				return new Pair(0, 0);
			}
			
			//Post order wala kaam 
			Pair leftPair = diameterOfBinaryTree(root.left);
			Pair rightPair = diameterOfBinaryTree(root.right);
			//int rootDia = leftDep + rightDep; 
			int khudKaDia = leftPair.dep + rightPair.dep; 
			
			//Math.max(leftD, rightD) + 1;
			int khudKiDep = Math.max(leftPair.dep, rightPair.dep) + 1;
			
			//return Math.max(rootDia, Math.max(leftDia, rightDia));
			int maxDia = Math.max(khudKaDia, Math.max(leftPair.dia, rightPair.dia));
			
			return new Pair(maxDia, khudKiDep);
		}
	}
}
