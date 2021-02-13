package com.chitkara.hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
	/*
	 * public static List<List<String>> groupAnagrams(String[] strs) {
	 * 
	 * Map<String, List<String>> res = new HashMap<>();
	 * 
	 * for(String str : strs) { char[] ar = str.toCharArray(); Arrays.sort(ar);
	 * //10000
	 * 
	 * String key = String.valueOf(ar); //sorted hogi
	 * 
	 * /* if(res.containsKey(key)) { List<String> value = res.get(key);
	 * value.add(str); res.put(key, value); } else { List<String> value = new
	 * ArrayList<>(); value.add(str); res.put(key, value); }
	 * 
	 * 
	 * List<String> value = res.getOrDefault(key, new ArrayList<>());
	 * value.add(str); res.put(key, value); }
	 * 
	 * for(List<String> val : res.values()) { System.out.println(val); }
	 * 
	 * return new ArrayList<>(res.values()); }
	 */

	public static List<List<String>> groupAnagrams(String[] strs) {

		Map<String, List<String>> res = new HashMap<>();

		int[] count = new int[26];
		for (String str : strs) {
			
			Arrays.fill(count, 0);
			
			for(int i = 0; i < str.length(); i++) {
				char c = str.charAt(i); //'e'
				int index = c - 'a';
				count[index]++;
			}
			
			System.out.println(Arrays.toString(count));
			
			StringBuilder sb = new StringBuilder();
			
			for(int counter : count) {
				sb.append("#");
				sb.append(counter);
			}
			
			String key = sb.toString();
			System.out.println(key);

			List<String> value = res.getOrDefault(key, new ArrayList<>());
			value.add(str);
			res.put(key, value);
		}

		for (List<String> val : res.values()) {
			System.out.println(val);
		}

		return new ArrayList<>(res.values());
	}

	public static void main(String[] args) {
		String[] str = { "eat", "tea", "tan", "ate", "nat", "bat" };
		//String[] str = {"bbbbbbbbbbbc", "bccccccccccc"};
		groupAnagrams(str);
	}
}
