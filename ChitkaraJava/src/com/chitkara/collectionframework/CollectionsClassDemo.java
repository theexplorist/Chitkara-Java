package com.chitkara.collectionframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Immutable
		List<Integer> emptyList = Collections.emptyList();
		System.out.println(emptyList);
		
		//emptyList.add(10);
		
		//Single Immutable
		List<String> ekHiCar = Collections.singletonList("Ferrari");
		//ekHiCar.add("Santro");
		
		List<String> gaadiyan = new ArrayList<>();
		gaadiyan.add("Ferrari");
		gaadiyan.add("Lambo");
		gaadiyan.add("Aston Martin");
		gaadiyan.add("Bugatti");
		gaadiyan.add("Tesla");
		
		List<String> midClassGaadiyan = new ArrayList<>();
		midClassGaadiyan.add("Santro");
		midClassGaadiyan.add("Swift");
		midClassGaadiyan.add("Maruti");
		midClassGaadiyan.add("Tesla");
		
		//Mutable se immutable list
	//	List<String> paiseKhatam = Collections.unmodifiableList(gaadiyan);
//		
//		System.out.println(paiseKhatam);
		
		//Legacy method for immutable list
//		List<Integer> l2 = Arrays.asList(1, 2, 3);//List.of
//		l2.add(10);
		
		//Processing Lists
		/*
		System.out.println(gaadiyan);
		Collections.sort(gaadiyan);
		System.out.println(gaadiyan);
		
		List<Integer> l = new ArrayList<>(List.of(1, 2, 3, 4, 5));
		l.add(6);
		System.out.println(l);
		Collections.reverse(l);
		System.out.println(l);
		
//		Collections.shuffle(l); //random permutation
//		System.out.println(l);
		
		//Collections.sort(paiseKhatam);
		
		Collections.rotate(l, 2);
		System.out.println(l);
		*/
		//Calculations On List
		List<Integer> l = new ArrayList<>(List.of(1, 2, 3, 4, 5, 2, 3, 3));
		int minE = Collections.min(l);
		System.out.println(minE);
		
		int maxE = Collections.max(l);
		System.out.println(maxE);
		
		int freqE = Collections.frequency(l, 3);
		System.out.println(freqE);
		
		System.out.println(Collections.disjoint(gaadiyan, midClassGaadiyan));
	}

}
