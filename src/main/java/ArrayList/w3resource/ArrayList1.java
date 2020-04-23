package ArrayList.w3resource;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("RED");
		list.add("BLUE");
		list.add("WHITE");
		list.add("YELLOW");
		System.out.println(list);
		// Iterate element
		for (String s : list) {
			System.out.println(s);
		}
		// list.stream().forEach(System.out::println); ///java8
		// adding element in first position
		list.add(0, "VIOLET");
		System.out.println(list);
		//retreive element at specific index
		String we=list.get(3);
		System.out.println(we);
		//update element
		list.set(0, "ORANGE");
		System.out.println(list);
		//remove an element
		list.remove(2);
		list.remove("VIOLET");
		System.out.println(list);
		//search an elememt
		boolean b=list.contains("WHITE");
		System.out.println(b);
		//sorting an arraylist
		Collections.sort(list);
		System.out.println(list);
	}

}
