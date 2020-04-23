package Collections;

import java.util.Comparator;
import java.util.TreeSet;


public class TreeSetEx2 {
	
	
	public static void main(String[] args) {
   
		TreeSet t=new TreeSet(new MyComparator());
		t.add(10);
		t.add(10);
		t.add(15);
		t.add(20);
		t.add(20);
		t.add(45);
		System.out.println(t);
	}

}
