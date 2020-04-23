package Collections.tree5;

import java.util.Comparator;

public class MyComparator5 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {

		EmployeeSorting e1=(EmployeeSorting)o1;
		EmployeeSorting e2=(EmployeeSorting)o2;
		String s1=e1.name;
		String  s2=e2.name;
		return s1.compareTo(s2);
		
		
	}
}
