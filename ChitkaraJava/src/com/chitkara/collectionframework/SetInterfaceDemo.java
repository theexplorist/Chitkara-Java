package com.chitkara.collectionframework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 5;
		System.out.println(a);
		Set<Integer> hashSet = new HashSet<>();
		Set<Integer> llSet = new LinkedHashSet<>();
		Set<Integer> trSet = new TreeSet<>();
		
		hashSet.add(1);
		hashSet.add(2);
		hashSet.add(3);
		hashSet.add(4);
		
		System.out.println(hashSet);
		
		Set<String> countries = new HashSet<>();
		countries.add("america");
		countries.add("Portugal");
		countries.add("argentina");
		countries.add("brazil");
		
		System.out.println(countries);
		
		Set<String> countriesLL = new LinkedHashSet<>();
		countriesLL.add("america");
		countriesLL.add("Portugal");
		countriesLL.add("argentina");
		countriesLL.add("brazil");
		
		System.out.println(countriesLL);
		
		Set<String> countriesTr = new TreeSet<>();
		countriesTr.add("america");
		countriesTr.add("portugal");
		countriesTr.add("argentina");
		countriesTr.add("brazil");
		
		System.out.println(countriesTr);
	}

}
