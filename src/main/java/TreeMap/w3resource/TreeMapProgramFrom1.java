package TreeMap.w3resource;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map.Entry;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapProgramFrom1 {

	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<>(new MyComparator());
		map.put(1, "SAM");
		map.put(22, "RAM");
		map.put(21, "RAMU");
		map.put(3, "JADU");
		map.put(2, "RAGHU");
		System.out.println(map);
		for (Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		map.forEach((e, v) -> System.out.println("ForEach==>> " + e + " " + v));
		// Get all keySet
		Set set = map.keySet();
		System.out.println(set);
		// map.clear();//remove all element
		// get first key and last key
		System.out.println(map.firstKey());
		System.out.println(map.lastKey());
		NavigableSet<Integer> rKey = map.descendingKeySet();
		System.out.println(rKey);
		System.out.println("FloorKey=> "+map.floorKey(22)+" FloorEntry=> "+map.floorEntry(22));//key<=e(21)
		System.out.println("LowerKey=> "+map.lowerKey(22)+" LowerEntry=> "+map.lowerEntry(22));
		System.out.println("Ceiling=> "+map.ceilingKey(22)+" CeilingEntry=> "+map.ceilingEntry(22));//key>=
		//get the portion of this map whose keys are strictly less than a given key
		System.out.println(map.headMap(1));
		System.out.println(map.headMap(10));
		//get the portion of this map whose keys are less than(or equal to, if inclusive is true) a given key
		System.out.println(map.headMap(3,true));
		//get NavigableSet view of the keys contained in a map.
		System.out.println(map.navigableKeySet());
		// remove and get a key-value mapping associated with the least key in a map.
		System.out.println(map.pollFirstEntry());
		System.out.println(map.pollLastEntry());
		//get the portion of a map whose keys range from a given key (inclusive), to another key (exclusive).
		TreeMap<Integer, String>subMap=(TreeMap<Integer, String>) map.subMap(21, 2);
		System.out.println(subMap);
		
		
	}

}

class MyComparator implements Comparator<Integer> {
	@Override
	public int compare(Integer o1, Integer o2) {

		return o2.compareTo(o1);
	}

}
