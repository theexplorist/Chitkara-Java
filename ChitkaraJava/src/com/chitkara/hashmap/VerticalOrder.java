package com.chitkara.hashmap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class VerticalOrder {
	
	//K - level, Value - List of nodes at that level
	static Map<Integer, List<TreeNode>> store = new TreeMap<>();
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
	
	public void verticalOrder(TreeNode root, int level) {
		
		if(root == null) {
			return;
		}
		
		putInMap(level, root); //apne ko map mein store krna
		
		verticalOrder(root.left, level - 1);
		verticalOrder(root.right, level + 1);
	}
	
	public void putInMap(int level, TreeNode currNode) {
		
		
		
		//List nikaali
		List<TreeNode> nodesAtThatLevel = store.getOrDefault(level, new ArrayList<>());
		
		//List mein add kia
		nodesAtThatLevel.add(currNode);
		
		//updated list ko put kia
		store.put(level, nodesAtThatLevel);
	}
	
}
