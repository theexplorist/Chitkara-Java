package com.chitkara.collectionframework;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<Integer> list1 = new ArrayList<>(); //default non parametrized constr
//		for(int i = 1; i <= 15; i++) {
//			list1.add(i * 10);
//		}
//		
//		list1.add(6);
//		System.out.println(list1);
		
		//int a = 5;
		//System.out.println(a);
		ArrayList<Integer> list2 = new ArrayList<>(20); //Capacity Wala Constructor
		
		for(int i = 1; i <= 5; i++) {
			list2.add(i * 10);
		}
		
		list2.remove(Integer.valueOf(10));
		
		ArrayList<Integer> list3 = new ArrayList<>(list2);//Collection wala constructor
		System.out.println(list3);
		
		int removedItem = list3.remove(1); //at index
		System.out.println(removedItem);
		System.out.println(list3);
		
//		list3.remove(new Integer(30));//jo remove krna hai wahi le raha hai
//		System.out.println(list3);
//		
//		list3.clear();
//		System.out.println(list3);
		boolean kyaElementHai = list3.contains(30);
		System.out.println(kyaElementHai);
		
		int prevKyatha = list3.set(1, 60); 
		System.out.println(prevKyatha);
		System.out.println(list3);
		
		int b = list3.get(1);
		System.out.println(b + " pada hai 1 index pr" );
		for(int i = 0; i < list3.size(); i++) {
			System.out.println(list3.get(i)); //arr[i]
		}
		
		//for each loop
		for(int element : list3) {
			System.out.println(element);
		}
	}

}
