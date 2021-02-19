package com.chitkara.priiorityqueue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class MergeK {

	class Node {
		int val;
		int row;
		int col;

		public Node(int val, int row, int col) {
			this.val = val;
			this.row = row;
			this.col = col;
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return this.val + " row hai " + this.row + " col hai " + this.col;
		}
	}

	public void mergeK(int[][] arr) {
		PriorityQueue<Node> minHeap = new PriorityQueue<>(new Comparator<Node>() {

			@Override
			public int compare(Node o1, Node o2) {
				// TODO Auto-generated method stub
				return o1.val - o2.val;
			}

		});
		
		for(int i = 0; i < arr.length; i++) {
			minHeap.add(new Node(arr[i][0], i, 0));
		}
		
		System.out.println(minHeap);
		
		List<Integer> ans = new ArrayList<>();
		while(!minHeap.isEmpty()) {
			Node top = minHeap.poll();
			int val = top.val;
			int row = top.row;
			int col = top.col;
			
			ans.add(val);
			
			if(col + 1 < arr[row].length)
			minHeap.add(new Node(arr[row][col + 1], row, col + 1));
		}

		System.out.println(ans);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = { { 2, 6, 12, 15 }, { 1, 3, 14, 20 }, { 3, 5, 8, 10 } };
		MergeK d = new MergeK();
		d.mergeK(arr);
		
	}

}
