package com.chitkara.collectionframework;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection<Integer> list = new ArrayList<>();//
		
		list.add(10);
		System.out.println(list);
		
		
		//list.clear();
		System.out.println(list.isEmpty());
		Collection<Integer> list2 = new ArrayList<>();
		list2.add(20);
		list2.add(30);
		list.addAll(list2);
		System.out.println(list);
	}

}
