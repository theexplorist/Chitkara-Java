package com.chitkara.hashmap;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {

		Map<Integer, Integer> map = new HashMap<>();

		// for(int i = 0; i < nums.length; i++) {
		// map.put(nums[i], i); //k - nums[i], value - index of nums[i]
		// }

		for (int curr = 0; curr < nums.length; curr++) {
			int search = target - nums[curr]; // nums[curr] = 2, search = 7

			if (map.containsKey(search) && curr != map.get(search)) {
				int[] ans = new int[2];

				ans[0] = curr; // first index of pair
				ans[1] = map.get(search); // second index of pair
				return ans;
			}
			map.put(nums[curr], curr);
		}
		return null;
	}
}
