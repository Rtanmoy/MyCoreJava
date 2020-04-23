package TreeMap.w3resource;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapProgramFrom20 {

	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(1, "SAM");
		map.put(22, "RAM");
		map.put(21, "RAMU");
		map.put(3, "JADU");
		map.put(2, "RAGHU");
		map.forEach((e, v) -> System.out.println("ForEach==>> " + e + " " + v));
		//get the portion of a map whose keys range from a given key (inclusive), to another key (exclusive).
		SortedMap<Integer, String>subMap=map.subMap(1, 3);
		System.out.println(subMap);
		//get the portion of a map whose keys range from a given key to another key.
		SortedMap<Integer, String>subMap1=map.subMap(1,true, 3,true);
		System.out.println(subMap1);
		//get a portion of a map whose keys are greater than or equal to a given key.
		System.out.println(map.tailMap(3));
		System.out.println(map.tailMap(3,true));
		
	}

}
