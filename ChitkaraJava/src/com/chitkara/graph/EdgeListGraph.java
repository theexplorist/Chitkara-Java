package com.chitkara.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EdgeListGraph {

	class Edge { // u and v se ek edge ban rahi hai
		int u;
		int v;
		int weight;

		public Edge(int u, int v, int weight) {
			this.u = u;
			this.v = v;
			this.weight = weight;
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return u + " and " + v + " with weight " + weight;
		}

	}

	int V; // count of vertices
	List<Edge> edgeList; // store kregi edges ko

	public EdgeListGraph(int V) {
		// TODO Auto-generated constructor stub
		this.V = V;
		this.edgeList = new ArrayList<>();
	}

	public void addEdge(int u, int v, int weight) {
		Edge e = new Edge(u, v, weight);
		this.edgeList.add(e);
	}

	public void display() {
		System.out.println(this.edgeList);
	}

	// u = 1, u = nextIndex
	public int findParent(int[] parent, int u) {
		if (parent[u] == -1) { // matlab u khud ka parent hai/godfather/leader/founder
			return u;
		}
		return findParent(parent, parent[u]);
	}

	public void union(int v1, int v2, int[] parent) {

		// 1. leader/founder dhundo dono ke
		int parentV1 = findParent(parent, v1); // 4
		int parentV2 = findParent(parent, v2); // 6

		// 2. kya disjoint hai dono/ parent/leader different hai?
		if (parentV1 != parentV2) {
			// Ab tum union kr sakte ho
			// parent[v1] = v2;
			// parent[4] = 6
			parent[parentV1] = parentV2;
		}
	}

	// parent[] = -1 all
	public boolean isCyclic(int[] parent) {
		for (Edge edge : this.edgeList) {
			int v1 = edge.u;
			int v2 = edge.v;

			// leader dhundo
			int p1 = findParent(parent, v1);
			int p2 = findParent(parent, v2);

			if (p1 != p2) {
				union(v1, v2, parent);
			} else {
				return true;
			}
		}

		return false;
	}

	public int kruskal(int[] parent) {
		Collections.sort(this.edgeList, new Comparator<Edge>() {

			@Override
			public int compare(Edge o1, Edge o2) { // this - o1, other - o2
				// TODO Auto-generated method stub
				return o1.weight - o2.weight;
			}
		});
		
		int minWt = 0;
		for(Edge edge : this.edgeList) {
			
			int v1 = edge.u;
			int v2 = edge.v;
			int wt = edge.weight;
			
			int p1 = this.findParent(parent, v1);
			int p2 = this.findParent(parent, v2);
			
			if(p1 != p2) { //mst mein edge include kr
				this.union(v1, v2, parent);
				minWt += wt; //included edge ka wt add kr
			}
		}
		
		return minWt;
	}

	public static void main(String[] args) {
		EdgeListGraph g1 = new EdgeListGraph(4);
		// 1, 2, 3, 4
		g1.addEdge(1, 2, 1);
		g1.addEdge(1, 3, 2);
		g1.addEdge(1, 4, 2);
		g1.addEdge(2, 3, 2);
		g1.addEdge(2, 4, 3);
		g1.addEdge(4, 3, 3);
		// g1.addEdge(4, 1);

		int[] parent = new int[5];
		Arrays.fill(parent, -1);
		System.out.println(g1.kruskal(parent));
		// System.out.println(g1.isCyclic(parent));
		g1.display();
	}

}
