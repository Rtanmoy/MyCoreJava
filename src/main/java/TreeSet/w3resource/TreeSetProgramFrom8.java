package TreeSet.w3resource;

import java.util.TreeSet;

public class TreeSetProgramFrom8 {

	public static void main(String[] args) {
		//Create treeset and elements
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("BLUE");
		treeSet.add("WHITE");
		treeSet.add("GOLD");
		treeSet.add("YELLOW");
		TreeSet<String> treeSet1 = new TreeSet<>();
		treeSet1.add("PERPLE");
		treeSet1.add("ROSE RED");
		treeSet.add("WHITE");
		treeSet1.add("VIOLET");
		System.out.println(treeSet);
		 
		//compare two tree sets
		treeSet1.stream().map(e->treeSet.contains(e)?"YES":"NO").forEach(System.out::println);
		
		// find the numbers less than 7 in a tree set
		TreeSet<Integer> treeSet2 = new TreeSet<>();
		treeSet2.add(2);
		treeSet2.add(9);
		treeSet2.add(4);
		treeSet2.add(11);
		treeSet2.add(5);
		
		treeSet2.stream().filter(e->e<7).forEach(System.out::println);
		
		TreeSet <Integer>treeheadset = new TreeSet<>();
		treeheadset=(TreeSet<Integer>) treeSet2.headSet(7);
		System.out.println(treeheadset);
		
		//Get the element in a tree set which is greater than or equal to the given element
		treeSet2.stream().filter(e->7<=e).forEach(System.out::println);
		System.out.println("Celling=> "+treeSet2.ceiling(7));
		System.out.println("Higher=> "+treeSet2.higher(7));
		//
		System.out.println("Floor=> "+treeSet2.floor(7));
		System.out.println("Lower=> "+treeSet2.lower(7));
	
		//retreive and remove 1st element
		System.out.println("Rereiving=> "+treeSet2.first()+"  "+treeSet2.pollFirst());
		System.out.println("Removing=>  "+treeSet2.pollLast());
		System.out.println(treeSet2);
	}
  
}
