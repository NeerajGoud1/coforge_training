package com.coforge.day5_java.classwork.collection_framework;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
		//ArrayList<Integer> list = new ArrayList<>();
		
		List<Integer> list = new ArrayList<>();
		
		list.add(new Integer(10)); // BOXING
		
		list.add(20); // AUTOBOXING
		
		list.add(30);
		list.add(40);
		list.add(20);
		
		System.out.println(list); // internally it is calling toString()
		System.out.println(list.get(0)); // index based collection
		
		//remove
		System.out.println(list.remove(new Integer(20))); //object based removing
		System.out.println(list);
		System.out.println(list.remove(1)); //index based removing
		System.out.println(list);
		
		//update
		System.out.println(list.set(0, 100)); //returns the replaced value
	 	System.out.println(list);
	 	
	 	//Traverse using index
	 	for(int i = 0; i < list.size(); i++) {
	 		System.out.println(list.get(i));
	 	}
	 	
	 	//Traverse without index
	 	for(int num : list) {
	 		System.out.println(num);
	 	}
	 	
	 	//Traverse using iterator 
	 	Iterator<Integer> it = list.iterator();
	 	while(it.hasNext()) {
	 		System.out.println(it.next());
	 	}
	}
}
