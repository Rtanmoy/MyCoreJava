package HashSet.w3resource;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetProgramFrom1 {
	public static void main(String[] args) {
		// append the specified element to the end of a hash set.
		HashSet<String> set=new HashSet<String>();
		set.add("Abhijit");
		set.add("Shiddhu");
		set.add("Jimut");
		set.add("Yubaraj");
		set.add("Shovon");
		System.out.println(set);
		//iterate HashSet
		System.out.println("========= Using ForEach =========");
		for(String s:set) {
			System.out.println(s);
		}
		System.out.println("========= Using java8 =========");
		set.stream().forEach(System.out::println);
		System.out.println("========= Using Iterator =========");
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			Object s=itr.next();
			System.out.println(s);
		}
		//get the number of elements in a hash set
		int setLength=set.size();
		System.out.println("Length=>> "+setLength);
		//remove all element and convert empty hashset
		set.removeAll(set);
		System.out.println(set);
		
	}
}
