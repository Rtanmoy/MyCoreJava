package Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx1 {

	public static void main(String[] args) {
		Map m=new LinkedHashMap();
		m.put("Abhi", 1000);
		m.put("Bubai", 800);
		m.put("Partha", 700);
		m.put("Yubaraj", 600);
		m.put("Biju", 500);
		System.out.println(m);
		System.out.println(m.put("Abhi", 1200));
	}

}
