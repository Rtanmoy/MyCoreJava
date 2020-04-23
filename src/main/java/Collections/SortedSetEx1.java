package Collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetEx1 {
  public static void main(String[] args) {
	SortedSet s=new TreeSet();
	s.add("B");
	s.add("C");
	s.add("E");
	s.add("A");
	s.add("D");
	System.out.println(s);
	System.out.println(s.first());
	System.out.println(s.last());
	System.out.println(s.headSet("C"));
	System.out.println(s.tailSet("B"));
	System.out.println(s.subSet("B","D"));
	
}
}
