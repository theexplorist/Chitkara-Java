package com.chitkara.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {
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
		public List<List<Integer>> levelOrder(TreeNode root) {
			List<List<Integer>> ans = new ArrayList<>();
			
			if(root == null) { //tree hi ni hai
				return ans;
			}
			
			Queue<TreeNode> q = new LinkedList<>();
			q.add(root);
			
			while(!q.isEmpty()) {
				
				List<Integer> currLvl = new ArrayList<>();
				int size = q.size();
				
				for(int i = 0; i < size; i++) { //ek level ki saari values hain apne pass
					TreeNode front = q.remove();
					currLvl.add(front.val);
					
					if(front.left != null) {
						q.add(front.left);
					}
					
					
					
					if(front.right != null) {
						q.add(front.right);
					}
				}
				ans.add(currLvl);
			}
			
			return ans;
 		}
	}
}
