package List;

import java.util.ArrayList;
import java.util.List;

public class AddAllMethod {

	public static void main(String[] args) {

		List l=new ArrayList() ;
		l.add(7);
		l.add(9);
		l.add(2);
		l.add(1);
		System.out.println(l);
		
		List l1=new ArrayList() ;
		l1.add("W");
		l1.add("D");
		l1.add("J");
		l1.add("X");
		
		l1.addAll(l);
		
		System.out.println(l1);
		
		
		
	}

}
