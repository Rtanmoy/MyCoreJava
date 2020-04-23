package HashMap.w3resource;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapProgramFrom1 {

	public static void main(String[] args) {
		HashMap<String,Integer>map=new HashMap<>();
		map.put("AA", 22);
		map.put("SS", 55);
		map.put("WWW", 11);
		map.put("ZZ", 756);
		map.put("AA", 33);
		//retreive key and value
		for(Entry<String, Integer> s:map.entrySet()) {
			System.out.println(s.getKey()+"  "+s.getValue());
		}
       //retrive the totel key size
		System.out.println(map.size());
		HashMap<String,Integer>map1=new HashMap<>();
		map1.putAll(map);
		System.out.println(map1);
		
		//remove all element
		map1.clear();
		System.out.println(map1);
		
		//check map contains key-value mappings (empty) or not.
		System.out.println(map.isEmpty());
		//shallow copy
		HashMap<String,Integer>map2=(HashMap<String, Integer>) map.clone();
		System.out.println("Cloned Map => "+map2);
		//check specific key  and values present or not
		Set<String>keys=map.keySet();
		boolean isKey=map.containsKey("ZZ");
		System.out.println(isKey+" ALL KEYS=> "+keys);
		
		Collection values=map.values();
		boolean isValue=map.containsValue(33);
		System.out.println(isValue+" ALL VALUES=>"+values);
		//create a set view of the mappings contained in a map.
		Set set=map.entrySet();
		System.out.println(set);
		//Get specific key
		Integer s=map.get("ZZ");
		System.out.println(s);
		//
	}

}
