package HashSet.w3resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class HashSetProgramFrom7 {
	public static void main(String[] args) {
		// append the specified element to the end of a hash set.
		HashSet<String> set = new HashSet<>();
		set.add("Abhijit");
		set.add("Shiddhu");
		set.add("Jimut");
		set.add("Yubaraj");
		set.add("Shovon");
		System.out.println(set);
		HashSet<String> set1 = new HashSet<>();
		set1.add("Shiddhu");
		set1.add("Yubaraj");
		set1.add("Jimut");
		set1.add("Abhijit");
		set1.add("Shovon");
		HashSet<String> set2 = new HashSet<>();
		set2.add("Shiddhu");
		set2.add("Abhijit");

		// convert HashSet to array
		Object[] arr = set.toArray();
		System.out.println(Arrays.toString(arr) + "  " + arr);

		String arr1[] = new String[set.size()];
		set.toArray(arr1);
		System.out.println(Arrays.toString(arr) + " <<== String Array  ");

		// convert HashSet to TreeSet
		TreeSet<String> treeSet = new TreeSet<>(set);
		System.out.println(treeSet + " <<==TreeSet");

		// convert HashSet to List/ArrayList
		List<String> list = new ArrayList<String>(set);
		System.out.println(list + " <<==List");

		// compare to HashSet
		for (String s1 : set1) {
			//System.out.println(set.contains(s1) ? "YES" : "NO");
			if(set.contains(s1)) {
				System.out.println("YES  "+s1);
			} else {
				System.out.println("NO  "+s1);
			}
		}
		//compare two sets and retain elements which are same on both sets.
        set.retainAll(set2);
        System.out.println("After Retain = > "+set);
        
        //remove all of the elements from a hash set.
        set2.clear();
        System.out.println(set2);
	}
}
