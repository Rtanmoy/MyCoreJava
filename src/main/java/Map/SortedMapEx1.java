package Map;

import java.util.TreeMap;

import Collections.MyComparator;

public class SortedMapEx1 {

	public static void main(String[] args) {

		TreeMap m=new TreeMap(new MyComparator());
		m.put(10, "Ram");
		m.put(14, "Laxman");
		m.put(5, "Bishnu");
		m.put(11, "Shankar");
		System.out.println(m);
	}

}
