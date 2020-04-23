package Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;



public class Test {
public static void main(String[] args) {
	Map<Employee,Integer>map=new HashMap<>();
	Set<Employee>set=new HashSet<>();
	set.add(new Employee(2,"AA"));
	set.add(new Employee(3,"BB"));
	set.add(new Employee(4,"CC"));
	map.put((Employee) set, 1);
	
	System.out.println(map);
}
}
class Employee{
	private Integer empId;
	private String empName;
	public Employee(Integer empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	/**
	 * @return the empId
	 */
	public Integer getEmpId() {
		return empId;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}
	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	
}