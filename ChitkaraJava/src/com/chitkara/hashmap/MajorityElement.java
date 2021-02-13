package com.chitkara.hashmap;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {2,2,1,1,1,2,2};

		int n = nums.length;
		Map<Integer, Integer> freq = new HashMap<>();

		
		//getOrDefault
		for (int num : nums) {
			/*
			if (freq.containsKey(num)) {
				int prevFreq = freq.get(num); // 1
				freq.put(num, prevFreq + 1);
			} else {
				freq.put(num, 1);
			}
			*/
			
			freq.put(num, freq.getOrDefault(num, 0) + 1);
		}
		
		int nBy2 = n / 2, ans = 0; //1
		/*
		for(int key : freq.keySet()) { //(2, 3)
			int valFreq = freq.get(key);
			if(valFreq > nBy2) {
				ans = key;
				break;
			}
		}
		*/
		
		for(var kVPair : freq.entrySet()) {
			
			var key = kVPair.getKey();
			var value = kVPair.getValue();
			
			if(value > nBy2) {
				ans = key;
				break;
			}
		}
		
		System.out.println(ans);
	}

}
