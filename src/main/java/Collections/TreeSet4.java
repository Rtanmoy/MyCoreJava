package Collections;

import java.util.TreeSet;

public class TreeSet4 {

	public static void main(String[] args) {
  TreeSet t=new TreeSet(new MyComparator4());
     t.add("X");
     t.add(new StringBuffer("V"));
     t.add(new StringBuffer("XX"));
     t.add(new StringBuffer("VV"));
     t.add("AAA");
     t.add("AA");
     t.add("A");
     System.out.println(t);
	}

}
