package com.chitkara.collectionframework;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class ListInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		//Mutable - Parivartan Possible - srk
		List<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(20);
		System.out.println(list1);
		
		//Immutable - No Parivartan - Big B
		List<Integer> list2 = List.of(); //Empty
		System.out.println(list2);
		
		//list2.add(10); //Unsupported Operation
		
		List<Integer> list3 = List.of(1, 2, 3, 4);
		System.out.println(list3.size());
		
		//list3.remove(1);
		//list3.set(0, 10);
		
		List<String> weekDays = List.of("Mon", "Tue", "Wed", "Thur", "Fri", "Sat", "Sun");
		List<String> panchDin = weekDays.subList(0, 5);//[0, 5) //Ye bhi big b
		//panchDin.add("aaramDay"); //Sublist bhi immutable hai
		System.out.println(panchDin);
		//Immutable list to mutable list copy
		List<String> weekDaysParivartan = new ArrayList<>(weekDays);
		System.out.println(weekDaysParivartan);
		weekDaysParivartan.add("aaramDay");
		System.out.println(weekDaysParivartan);
		*/
		
		/*
		List<Integer> res = List.of(1, 2, 3, 1, 4, 1);
		System.out.println(res.indexOf(0)); //first index occ, if not present then -1
		System.out.println(res.lastIndexOf(1));
		
		//LL implementation
		List<Integer> ll = new LinkedList<>();
		*/
		
		List<Integer> l1 = List.of(1, 2, 3);
		List<Integer> l2 = List.of(1, 2, 3);
		//elements and order both should be same
		System.out.println(Objects.equals(l1, l2));//Default Equality
		for(int el : l1) {
			System.out.println(el);
		}
	}
	

}
