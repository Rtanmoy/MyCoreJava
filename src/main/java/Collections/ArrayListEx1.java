package Collections;

import java.util.ArrayList;

public class ArrayListEx1 {
	public static void main(String[] args) {
		
	
  ArrayList l=new ArrayList();
  l.add("A");
  l.add(14);
  l.add("W");
  l.add("QA");
  System.out.println(l);
  l.remove(1);
  System.out.println(l);
  l.add(1, "EF");
  System.out.println(l);
  
	}
}
