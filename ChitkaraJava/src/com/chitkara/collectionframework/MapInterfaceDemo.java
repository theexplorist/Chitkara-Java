package com.chitkara.collectionframework;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> contactList = new LinkedHashMap<>();//Unordered
		System.out.println(contactList);
		
		//K-V processing
		contactList.put("Raj", 98765432);
		contactList.put("Manni", 98765431);
		contactList.put("Rahul", 98765431);
		System.out.println(contactList);
		
		//contactList.remove("Rahul");
		if(contactList.containsKey("Rahul")) {
			System.out.println(contactList.get("Rahul"));
		} else {
			System.out.println("Save hi ni hai!");
		}
		
		if(contactList.containsValue(98765432)) {
			System.out.println("Saved hai bhai!");
		} else {
			System.out.println("Save hi ni hai!");
		}
		
		System.out.println(contactList);
		
		//Collection like method #selfmade
		System.out.println(contactList.size());
		
		//contactList.clear();
		System.out.println(contactList.isEmpty());
		
		//Advanced Methods
		//int a = contactList.get("Rahul") + 1; //null/gustakhi
		
		//naukri bachane wala method(null pointer exception se bachaega)
		int a = contactList.getOrDefault("Rahul", 10) + 1;//(Key, answer agar key ni hai to);
		System.out.println(a);
		contactList.putIfAbsent("Ashish", 98745632);
		System.out.println(contactList);
		contactList.putIfAbsent("Ashish", 98745634);
		System.out.println(contactList);
		
		//Iterate over maps
		
		System.out.println("Iterate kr rahe hain");
		Set<String> keysKaSet = contactList.keySet(); //Big B
		System.out.println(keysKaSet);
		for(String key : keysKaSet) {
			System.out.println(key + " " + contactList.get(key));
		}
		
		System.out.println(contactList.entrySet());//k - v pair
		for(Map.Entry<String, Integer> pair : contactList.entrySet()) {
			System.out.println(pair.getKey() + " " + pair.getValue());
		}
	}
}
