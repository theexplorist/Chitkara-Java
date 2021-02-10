package com.chitkara.generictree;

import java.util.List;

public class PreOrder {
	
	
	// Definition for a Node.
	class Node {
	    public int val;
	    public List<Node> children;

	    public Node() {}

	    public Node(int _val) {
	        val = _val;
	    }

	    public Node(int _val, List<Node> _children) {
	        val = _val;
	        children = _children;
	    }
	};
	

	class Solution {
		//2k
	    public List<Integer> preorder(Node root) {
	        
	    	System.out.println(root.val);
	    	
	    	//Not fixed recursive calls
	    	//child = 2k;
	    	for(Node child  : root.children) {
	    		//Recursive Call
	    		preorder(child);//2k
	    	}
	    	
	    	return null;
	    }
	}
}
