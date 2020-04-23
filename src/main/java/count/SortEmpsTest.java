package count;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortEmpsTest {

	public static void main(String[] args) {
		Employee e1=new Employee(101, "shabbir", 10000);
		Employee e2=new Employee(102, "vipin",20000);

		Employee e3=new Employee(103, "tanmoy", 30000);

		Employee e4=new Employee(104, "vinod", 40000);
		List<Employee> empList=new ArrayList();

		empList.add(e1);empList.add(e2);empList.add(e3);empList.add(e4);
		
	//	Collections.sort(empList, (e11,e22)->e11.getSalary()-e22.getSalary());
		
	//	empList.forEach(e->System.out.println(e.toString()));
		System.out.println("==================================");
		empList.stream().sorted((e11,e22)->e11.getSalary()-e22.getSalary()).forEach(System.out::println);
	    
	}

}
