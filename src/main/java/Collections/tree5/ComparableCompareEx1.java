package Collections.tree5;

import java.util.TreeSet;

public class ComparableCompareEx1 {

	public static void main(String[] args) {
      
		EmployeeSorting e1=new EmployeeSorting("Roy",100);
		EmployeeSorting e2=new EmployeeSorting("Raj",30);
		EmployeeSorting e3=new EmployeeSorting("Das",60);
		EmployeeSorting e4=new EmployeeSorting("Sau",80);
		TreeSet t=new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		System.out.println(t);
		
		  System.out.println("///////////"+"\\\\\\\\\\\\"); 
		  TreeSet t1=new TreeSet(new
		  MyComparator5()); t1.add(e1); t1.add(e2); t1.add(e3); t1.add(e4);
		  System.out.println(t1);
		 
	}

}
