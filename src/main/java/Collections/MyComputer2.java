package Collections;

import java.util.Comparator;

public class MyComputer2 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {

		String s1=(String)o1;
		String s2=o2.toString();
		return -s1.compareTo(s2);//desending
		//return s1.compareTo(s2);//asending 
	}

}
