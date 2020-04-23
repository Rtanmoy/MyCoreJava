package forEach;

import java.util.HashMap;

public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,Integer>map=new HashMap<>();
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		System.out.println(map);
		
		map.entrySet().forEach(System.out::println);
		
		map.keySet().forEach(System.out::println);
		map.values().forEach(System.out::println);
	}

}
