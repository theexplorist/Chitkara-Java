package com.chitkara.operations.bst;

public class InsertBST {
	
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
	    public void insertIntoBST(TreeNode root, int val) {
	        if(root.val < val) {
	        	if(root.right == null) {
	        		TreeNode right = new TreeNode(val);
	        		root.right = right;
	        	} else {
	        		insertIntoBST(root.right, val);
	        	}
	        } else if(root.val > val) {
	        	if(root.left == null) {
	        		TreeNode left = new TreeNode(val);
	        		root.left = left;
	        	} else {
	        		insertIntoBST(root.left, val);
	        	}
	        }
	    }
	}
}
