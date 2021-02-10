package com.chitkara.binarytree;

import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class InOrderTraversal {


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
		public List<Integer> inorderTraversal(TreeNode root) {
			List<Integer> ans = new ArrayList<>();
			inorderTraversal(root, ans);
			return ans;
		}

		public void inorderTraversal(TreeNode root, List<Integer> ans) {
			if(root == null) {
				return;
			}
			inorderTraversal(root.left, ans); //recu left ke liye kaam kro
			System.out.println(root.val); //self ka kaam
			inorderTraversal(root.right, ans); //recu right ka kaam kiya
		}
	}
}
