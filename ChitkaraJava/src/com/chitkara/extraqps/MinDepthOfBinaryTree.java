package com.chitkara.extraqps;

public class MinDepthOfBinaryTree {

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

	public int minDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		return minDepthH(root);
	}

	public int minDepthH(TreeNode root) {

		if (root == null) {
			return Integer.MAX_VALUE;
		}

		if (root.left == null && root.right == null) {
			return 1;
		}

		int leftD = minDepthH(root.left);
		int rightD = minDepthH(root.right);

		int myAns = Math.min(leftD, rightD) + 1;

		return myAns;
	}
}
