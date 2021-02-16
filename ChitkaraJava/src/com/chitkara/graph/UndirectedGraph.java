package com.chitkara.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class UndirectedGraph {
	Map<Integer, List<Integer>> adJList; // key -> vertices - value -> neighbours

	public UndirectedGraph() {
		// TODO Auto-generated constructor stub
		this.adJList = new HashMap<>();
	}

	// v1 - 1, v2 - 2
	private void addEdge(int v1, int v2) { //Bidirectional
		// TODO Auto-generated method stub
		List<Integer> neighboursV1 = adJList.getOrDefault(v1, new ArrayList<>());
		neighboursV1.add(v2); // 1 ke neighbour mein 2 ko add kr dia

		List<Integer> neighboursV2 = adJList.getOrDefault(v2, new ArrayList<>());
		neighboursV2.add(v1); // 2 ke neighbour mein 1 ko add kr dia

		adJList.put(v1, neighboursV1);
		adJList.put(v2, neighboursV2);
	}
	
	private void display() {
		// TODO Auto-generated method stub
		for(int key : adJList.keySet()) { //(1, 2, 3, 4) keyset - vertices
			System.out.println(key + " -> " + adJList.get(key));
		}

	}
	
	private void bFS(int src) {
		// TODO Auto-generated method stub
		Map<Integer, Boolean> vis = new HashMap<>();
		Queue<Integer> lvl = new LinkedList<>();
		
		lvl.add(src);
		vis.put(src, true);
		
		while(!lvl.isEmpty()) {
			int first = lvl.remove(); //2
			
			//neighbour nikal lo
			List<Integer> neighbours = adJList.get(first); //{1, 3}
			
			for(int neighbour : neighbours) { //0
				if(!vis.containsKey(neighbour)) {
					lvl.add(neighbour);
					vis.put(neighbour, true);
				}
			}
			
			System.out.print(first + " "); //2
		}
		
	}
	
	//Recursive src -> 4
	private void dFSUtil(int src, Map<Integer, Boolean> vis) {
		// TODO Auto-generated method stub
		System.out.print(src + " ");
		vis.put(src, true);
		
		List<Integer> neighbourSrc = adJList.get(src); //{1 3 4}
		
		for(int neighbour : neighbourSrc) { //4
			if(!vis.containsKey(neighbour))
			dFSUtil(neighbour, vis); 
		}

	}
	private void dFS(int src) {
		// TODO Auto-generated method stub
		this.dFSUtil(src, new HashMap<>());
	}
	
	private void printConnComp() {
		int count = 1;
		Map<Integer, Boolean> vis = new HashMap<>();
		for (int vertex : adJList.keySet()) { //
			if(!vis.containsKey(vertex)) {
				dFSUtil(vertex, vis); //5, vis //yahan aa jaega wapis?
				System.out.print("ye hai connected component number " + count);
				count++;
				System.out.println();
			}
		}
	}
	
	private void sSSP(int src) { //BFS version
		// TODO Auto-generated method stub
		Map<Integer, Integer> vis = new HashMap<>();
		for(int vertex : adJList.keySet()) {
			vis.put(vertex, Integer.MAX_VALUE);
		}
		
		vis.put(src, 0); //src - 0
		Queue<Integer> lvl = new LinkedList<>();
		lvl.add(src);
		
		while(!lvl.isEmpty()) {
			int first = lvl.remove();
			List<Integer> neighbours = adJList.get(first); //1 3 4
			
			for(int neighbour : neighbours) { //1
				if(vis.get(neighbour) == Integer.MAX_VALUE) {
					int timeFirst = vis.get(first);
					int timeNeigh = timeFirst + 1; //dis(1) = dis(0) + 1 = 0 + 1 = 1
					vis.put(neighbour, timeNeigh); // 1 - 1
					lvl.add(neighbour);
					System.out.println(neighbour + " is at a time " + timeNeigh + " from " + src);
				}
			}
			
		}
		
	}

	public static void main(String[] args) {
		UndirectedGraph g1 = new UndirectedGraph();
		/*
		g1.addEdge(1, 2); // 1 and 2 vertices ke beech mein edge add
		g1.addEdge(2, 3);
		g1.addEdge(2, 4);
		g1.addEdge(3, 4);
		g1.display();
		*/
		
		g1.addEdge(0, 1);
		g1.addEdge(0, 3);
		g1.addEdge(0, 4);
		g1.addEdge(1, 2);
		g1.addEdge(2, 3);
//		g1.addEdge(5, 6);
//		g1.addEdge(6, 7);
		g1.display();
		
		//g1.bFS(0);
		//g1.dFS(0);
		//g1.printConnComp();
		g1.sSSP(0);
		
	}
}
