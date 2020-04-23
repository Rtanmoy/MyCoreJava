package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortedByKey {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("AA", 77);
		map.put("A", 88);
		map.put("B", 44);
		map.put("S", 44);

		printMap(map);
		System.out.println("========>>>>>Default sorting<<<<<=========");
		Map<String, Integer> treeMap = new TreeMap<>(map);
		printMap(treeMap);

		System.out.println("========>>>>>customize sorting<<<<<=========");
		Map<String, Integer> cusTreeMap = new TreeMap<>(new Customize());
		  cusTreeMap.putAll(map);//to add hashmap into treemap
          printMap(cusTreeMap);
	}

	private static void printMap(Map<String, Integer> map) {

		for (Map.Entry<String, Integer> prity : map.entrySet()) {
			System.out.println(prity.getKey() + " " + prity.getValue());
		}

	}

}
