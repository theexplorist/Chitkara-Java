package com.chitkara.priiorityqueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	class Node {
		int val;
		int weight;
		
		public Node(int val, int weight) {
			this.val = val;
			this.weight = weight;
		}
		
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "weight hai " + this.weight;
		}
	}
	
	public void test() {
		PriorityQueue<Node> q = new PriorityQueue<>(new Comparator<Node>() {

			@Override
			public int compare(Node o1, Node o2) {
				// TODO Auto-generated method stub
				return o1.weight - o2.weight;
			}
			
		});
		q.add(new Node(10, 20));
		q.add(new Node(20, 10));
		System.out.println(q);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		PriorityQueue<Integer> pq = new PriorityQueue<>();  //min heap
		
		pq.add(3);
		pq.add(1);
		pq.add(5);
		
		System.out.println(pq);
		while(!pq.isEmpty()) {
			//top wale element ko nikalna/delete
			System.out.println(pq.poll());
		}
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
		
		maxHeap.add(1);
		maxHeap.add(1);
		maxHeap.add(1);
		
		while(!maxHeap.isEmpty()) {
			//top wale element ko nikalna/delete
			System.out.println(maxHeap.poll());
		}
		*/
		PriorityQueueDemo d = new PriorityQueueDemo();
		d.test();
	}

}
