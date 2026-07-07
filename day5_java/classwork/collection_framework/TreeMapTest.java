package com.coforge.day5_java.classwork.collection_framework;

import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {
	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<>(Collections.reverseOrder());

		map.put(10, "Java");
		map.put(5, "Python");
		map.put(20, "Angular");
		map.put(30, "React");
		System.out.println(map);

		map.put(30, "NextJs"); // replaces previous value
		System.out.println(map);

		// remove
		map.remove(5);
		System.out.println(map);

		System.out.println(map.get(10));

		// Traverse the map collection
		Set<Integer> keys = map.keySet();
		for (int key : keys) {
			System.out.println(key + " => " + map.get(key));
		}

		Set<Entry<Integer, String>> entries = map.entrySet();
		for (Entry<Integer, String> entry : entries) {
			System.out.println(entry.getKey() + " => " + entry.getValue());
		}

	}
}
