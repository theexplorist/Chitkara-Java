package com.chitkara.trie;

import java.util.HashMap;
import java.util.Map;

public class Trie {

	public class Node {

		char data;
		Map<Character, Node> children;
		boolean isTerminal; // agar hai to shade krdo
		int count = 0;

		// a
		public Node(char data) {
			this.data = data;
			this.children = new HashMap<>();
			this.isTerminal = false;
		}
	}

	Node root;

	public Trie() {
		this.root = new Node('*');
	}

	// "Raj"
	public void insert(String word) {
		Node curr = root;
		// RAHUL
		char[] wordA = word.toCharArray(); // 'R', 'A', 'J"

		for (char c : wordA) { // c = 'R'
			if (curr.children.containsKey(c)) { // is 'R' present
				curr = curr.children.get(c); // 'R' ke corresponding node nikal 'R' waali
			} else {
				Node n = new Node(c); // 'R'
				curr.children.put(c, n);
				curr = n;
			}
			
			curr.count++;
		}

		// 'R', 'A', 'J' is added

		// curr = 'J' wali node, shade krdo isko
		curr.isTerminal = true;
	}

	public boolean search(String word) {
		Node curr = root;
		for (char c : word.toCharArray()) { // c = 'R'
			if (curr.children.containsKey(c)) {
				curr = curr.children.get(c);
			} else {
				return false;
			}
		}

		// jis node pr ho matlab curr, check kro kya shaded hai
		return curr.isTerminal;
	}

	public boolean startsWith(String prefix) {
		Node curr = root;
		
		for (char c : prefix.toCharArray()) { // c = 'R'
			if (curr.children.containsKey(c)) {
				curr = curr.children.get(c);
			} else {
				return false;
			}
		}
		
		return true;
	}
	
	public int countPrefix(String prefix) {
		Node curr = root;
		for (char c : prefix.toCharArray()) { // c = 'R'
			if (curr.children.containsKey(c)) {
				curr = curr.children.get(c);
			} else {
				return 0;
			}
		}
		
		//prefix mil gyi
		return curr.count;
	}

	public static void main(String[] args) {
		Trie t = new Trie();
		t.insert("Raj");
		t.insert("Rahul");
		System.out.println(t.search("Raj"));
		System.out.println(t.search("Rahul"));
		System.out.println(t.startsWith("Ra"));
		System.out.println(t.countPrefix("Ra"));
	}
}
