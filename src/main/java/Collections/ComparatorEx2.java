package Collections;

import java.util.TreeSet;

public class ComparatorEx2 {

	public static void main(String[] args) {
  
		TreeSet t=new TreeSet(new MyComputer2());
		t.add("Kristy");
		t.add("Sweety");
		t.add("Chandrany");
		t.add("Riya");
		System.out.println(t);
		
	}

}
