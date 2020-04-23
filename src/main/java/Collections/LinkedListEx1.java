package Collections;

import java.util.LinkedList;

public class LinkedListEx1 {
public static void main(String[] args) {
	LinkedList l=new LinkedList();
	l.add("A");
	l.add(30);
	l.add(null);
	l.add("Tony");
	l.add(78);
	System.out.println(l);
	l.add(0,"B");
	l.addFirst("AA");
	l.addLast("BYE");
	l.add(2, "Kristy");
	System.out.println(l);
}
}
