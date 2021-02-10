package com.chitkara.binarytree;

import java.util.ArrayList;
import java.util.List;

import com.chitkara.binarytree.PreOrderSelfish.TreeNode;

public class PostOrderSelfless {
	
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
		public List<Integer> postorderTraversal(TreeNode root) {
			List<Integer> ans = new ArrayList<>();
			postorderTraversal(root, ans);
			return ans;
		}

		public void postorderTraversal(TreeNode root, List<Integer> ans) {
			if(root == null) {
				return;
			}
			
			postorderTraversal(root.left, ans); //recu left ke liye kaam kro
			postorderTraversal(root.right, ans); //recu right ka kaam kiya
			System.out.println(root.val); //self ka kaam
		}
	}
}
