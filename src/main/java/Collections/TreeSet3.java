package Collections;

import java.util.TreeSet;

public class TreeSet3 {

	public static void main(String[] args) {
		TreeSet t=new TreeSet(new MyComparator3());
  
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("V"));
		t.add(new StringBuffer("S"));
		t.add(new StringBuffer("W"));
		System.out.println(t);
	}

}
