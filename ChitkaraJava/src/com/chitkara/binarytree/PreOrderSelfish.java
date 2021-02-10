package com.chitkara.binarytree;

import java.util.ArrayList;
import java.util.List;

import com.chitkara.binarytree.InOrderTraversal.TreeNode;

public class PreOrderSelfish {
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
		public List<Integer> preorderTraversal(TreeNode root) {
			List<Integer> ans = new ArrayList<>();
			preorderTraversal(root, ans);
			return ans;
		}

		public void preorderTraversal(TreeNode root, List<Integer> ans) {
			if(root == null) {
				return;
			}
			
			System.out.println(root.val); //self ka kaam
			preorderTraversal(root.left, ans); //recu left ke liye kaam kro
			preorderTraversal(root.right, ans); //recu right ka kaam kiya
		}
	}
}
