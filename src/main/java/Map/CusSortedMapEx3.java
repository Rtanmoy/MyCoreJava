package Map;

import java.util.Comparator;
import java.util.TreeMap;

public class CusSortedMapEx3 {

	public static void main(String[] args) {
		TreeMap<String, Integer>sort=new TreeMap<>(new MyComparator());
		sort.put("AA", 4);
		sort.put("A", 44);
		sort.put("B", 7);
		sort.put("AAA", 444);
		System.out.println(sort);

	}

}
class MyComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		
		return -o1.compareTo(o2);
	}
	
}