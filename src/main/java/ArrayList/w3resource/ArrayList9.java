package ArrayList.w3resource;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList9 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("RED");
		list.add("BLUE");
		list.add("WHITE");
		list.add("YELLOW");
		System.out.println(list);
		// Iterate element
		for (String s : list) {
			System.out.println(s);
		}
		List<String> list1 = new ArrayList<>();
		list1.add("VIOLET");
		list1.add("PERPLE");
		/*
		for (String s : list) {
			list1.add(s);
		}
		*/
		//copy one list into another
		Collections.copy(list, list1);
		System.out.println(list);
		//shuffle list elements
		Collections.shuffle(list);
		System.out.println("Shuffle "+list);
		//reverse elements
		Collections.reverse(list);
		System.out.println("Reverse= "+list);
		Collections.reverseOrder();
		System.out.println("ReverseOrder= "+list);
		//create sublist
		List<String>subList=list.subList(0, 2);
		System.out.println(subList);
		//compare two list
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("VIOLET");
		list2.add("PERPLE");
		System.out.println(list1+"  "+list2);
		for(String s:list2) {
			if(list1.contains(s)) {
				System.out.println("Present "+s);
			}else {
				System.out.println("Not Present :"+s);
			}
		}
		//swapping two element in an arraylist
		Collections.swap(list2, 0, 1);
		System.out.println(list2);
        //Join two arrays
		list2.addAll(list1);
		list2.addAll(list1);
		System.out.println(list2);
		//Cloning an array
		ArrayList<String>list2Clone=(ArrayList<String>) list2.clone();
		System.out.println(list2Clone);
		
	}

}
