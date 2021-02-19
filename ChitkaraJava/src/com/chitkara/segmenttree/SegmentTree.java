package com.chitkara.segmenttree;

import java.util.Arrays;

public class SegmentTree {

	//l -> 1, r -> 6
	public static void build(int[] inp, int[] segTree, int ci, int l, int r) {
		
		if(l == r) {
			segTree[ci] = inp[l]; //or inp[r] because l = r
			return;
		}
		
		int mid = (l + r) / 2;
		build(inp, segTree, 2 * ci, l, mid); //l -> 1, r -> 3
		build(inp, segTree, 2 * ci + 1, mid + 1, r); //l -> 4, r -> 6
		segTree[ci] = Math.min(segTree[2 * ci], segTree[2 * ci + 1]);
	}
	
	public static int queryMin(int[] segTree, int ci, int ql, int qr, int al, int ar) {
		
		//No overlap
		if(ar < ql || al > qr) {
			return Integer.MAX_VALUE;
		}
		
		//Complete Overlap -> main query ki range mein hun
		if(al >= ql && ar <= qr) {
			return segTree[ci];
		}
		
		//Partial overlap
		int mid = (al + ar) / 2;
		int left = queryMin(segTree, 2 * ci, ql, qr, al, mid);
		int right = queryMin(segTree, 2 * ci + 1, ql, qr, mid + 1, ar);
		
		int myAns = Math.min(left, right);
		return myAns;
	}
	
	//Update query
	
	public static void update(int[] inp, int[] segTree, int ci, int l, int r, int updateInd) {
		
		if(l == r) {
			segTree[ci] = inp[l]; //or inp[r] because l = r
			return;
		}
		
		int mid = (l + r) / 2;
		
		if(updateInd <= mid) { //update kr left tree ko
			update(inp, segTree, 2 * ci, l, mid, updateInd);
		} else { //update kr right tree ko
			update(inp, segTree, 2 * ci + 1, mid + 1, r, updateInd);
		}
		
		segTree[ci] = Math.min(segTree[2 * ci], segTree[2 * ci + 1]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inp = {0, 1, 5, 2, -3, 4, -1}; // 1 based indexing
		int[] segTree = new int[4 * inp.length];

		build(inp, segTree, 1, 1, 6); //l - r -> 1 - 6, segTree[1] = ? 
		
		for(int i = 1; i < segTree.length; i++) {
			if(segTree[i] != 0) {
				System.out.print(segTree[i] + " ");
			}
		}
		
		System.out.println();
		System.out.println(queryMin(segTree, 1, 2, 5, 1, 6));
		
		inp[2] = -2;
		
		System.out.println(Arrays.toString(inp));
		update(inp, segTree, 1, 1, 6, 2);
		
		for(int i = 1; i < segTree.length; i++) {
			if(segTree[i] != 0) {
				System.out.print(segTree[i] + " ");
			}
		}
	}

}
