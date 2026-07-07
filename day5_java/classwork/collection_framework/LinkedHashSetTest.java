package com.coforge.day5_java.classwork.collection_framework;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {
	public static void main(String[] args) {
		
		Set<Integer> set = new LinkedHashSet<>();
		
		set.add(new Integer(10)); // BOXING
		
		set.add(20); // AUTOBOXING
		
		set.add(30);
		set.add(40);
		set.add(20);
		
		System.out.println(set); // internally it is calling toString()
		// System.out.println(set.get(0)); --error  - no index based accessing
		
		//remove
		System.out.println("removed : " + set.remove(20)); //returns true - directly object based removing
		System.out.println(set);
		System.out.println("removed:  " + set.remove(1)); //returns false -  No index based removing
		System.out.println(set);
	
	 	
	 	//Traverse without index
	 	for(int num : set) {
	 		System.out.println(num);
	 	}
	 	
	 	//Traverse using iterator 
	 	Iterator<Integer> it = set.iterator();
	 	while(it.hasNext()) {
	 		System.out.println(it.next());
	 	}
	}
}
