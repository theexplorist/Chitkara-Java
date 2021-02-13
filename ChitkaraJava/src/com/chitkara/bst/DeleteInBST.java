package com.chitkara.operations.bst;

import com.chitkara.operations.bst.InsertBST.TreeNode;

public class DeleteInBST {

	public int min(TreeNode root) {
		
		if(root.left == null) {
			return root.val;
		}
		int leftA = min(root.left);
		
		return leftA;
	}
	
	public TreeNode deleteNode(TreeNode root, int key) {
		
		if(root == null) {
			return null;
		}
		
		if(root.val > key) {
			root.left = deleteNode(root.left, key);
		} else if(root.val < key) {
			root.right = deleteNode(root.right, key);
		} else { //root.val == key
			if(root.left == null && root.right == null) {
				return null;
			} else if(root.left == null) {
				return root.right;
			} else if(root.right == null) {
				return root.left;
			} else { //2 child
				int minV = min(root.right); //11
				root.val = minV; //11 copied
				root.right = deleteNode(root.right, minV);
			}
		}
		
		return root;
	}
}
