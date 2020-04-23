package com.interview;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapIteration {

	public static void main(String[] args) {
		String str = "AAABBCCC";
		char[] charArr = str.toCharArray();
		Map<Character, Integer> mapCount = new HashMap<>();
		for (Character ch : charArr) {
			if (mapCount.containsKey(ch)) {
				mapCount.put(ch, mapCount.get(ch) + 1);
			} else {
				mapCount.put(ch, 1);
			}
		}
		// map iteration using defferent ways
		for (Character key : mapCount.keySet()) {
			System.out.print(key + "" + mapCount.get(key));
		}

		System.out.println(mapCount);

		Set<Map.Entry<Character, Integer>> map = mapCount.entrySet(); // map iteration
		System.out.println(map);
		for (Map.Entry<Character, Integer> ch : map) {
			System.out.print(ch.getKey() + "" + ch.getValue());
		}
		System.out.println("\n");
		Collection<Map.Entry<Character, Integer>> map1 = mapCount.entrySet(); // map iteration
		for (Map.Entry<Character, Integer> ch : map1) {
			System.out.print(ch.getKey() + "" + ch.getValue());
		}
		System.out.println("\n");
		Iterator<Map.Entry<Character, Integer>> map2 = mapCount.entrySet().iterator(); // map iterator
		while (map2.hasNext()) {
			Map.Entry<Character, Integer> entry = map2.next();
			System.out.print(entry.getKey() + "" + entry.getValue());
		}
		System.out.println("\n");
		System.out.println("=====>> Using Java 8 <<======");
		/// Using Java 8
		mapCount.forEach((key, value) -> System.out.println(key + "" + value));
		System.out.println("\n");
		mapCount.entrySet().stream().forEach(e -> System.out.println(e.getKey() + "" + e.getValue()));
	}

}
