package TreeSet.w3resource;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetProgramFrom1 {

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
		treeSet1.add("VIOLET");
		System.out.println(treeSet);
		
		//iterate through all elements in a tree set
		treeSet.stream().forEach(System.out::println);
		
		// add all the elements of a specified tree set to another tree set
		treeSet1.addAll(treeSet);
		System.out.println(treeSet1);
		
		//create a reverse order view of the elements contained in a given tree set
		Iterator itr=treeSet.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//to get the first and last elements in a tree set
		System.out.println(treeSet.first());
		System.out.println(treeSet.last());
		
		//Clone a tree set list to another tree set
		TreeSet<String> cloneTSet=(TreeSet<String>) treeSet.clone();
		System.out.println(cloneTSet);
		
		//get number of element in tree set
		System.out.println("Number of Element => "+treeSet.size());
	}
  
}
