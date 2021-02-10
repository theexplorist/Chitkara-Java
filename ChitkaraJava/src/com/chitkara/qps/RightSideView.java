package com.chitkara.binarytree.qps;

import java.util.ArrayList;
import java.util.List;

class RightSideView {

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

	static int maxLvl;

	public List<Integer> rightSideView(TreeNode root) {
		maxLvl = 0;
		List<Integer> ans = new ArrayList<>();
		rH(root, 1, ans);
		return ans;
	}

	public void rH(TreeNode root, int lvl, List<Integer> ans) {
		if (root == null) {
			return;
		}

		if (maxLvl < lvl) {
			ans.add(root.val);
			System.out.println(root.val);
			maxLvl = lvl;
		}

		rH(root.right, lvl + 1, ans);
		rH(root.left, lvl + 1, ans);
	}
}
