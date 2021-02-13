package com.chitkara.binarytree.qps;

public class MaxDepth {

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
		public int maxDepth(TreeNode root) {
			
			if(root == null) {
				return 0;
			}
			
			int leftD = maxDepth(root.left);
			int rightD = maxDepth(root.right);

			int myAns = Math.max(leftD, rightD) + 1;
			return myAns;
		}
	}
}
