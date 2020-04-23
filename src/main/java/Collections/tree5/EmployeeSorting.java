package Collections.tree5;

public class EmployeeSorting implements Comparable {
	
	String name;
	int eid;
	

	public EmployeeSorting(String name, int eid) {
		super();
		this.name = name;
		this.eid = eid;
	}


	@Override
	public String toString() {
		return "EmployeeSorting [name=" + name + ", eid=" + eid + "]";
	}


	@Override
	public int compareTo(Object obj) {
		
		int eid1=this.eid;
		EmployeeSorting es=(EmployeeSorting)obj;
		int eid2=es.eid;
		if(eid1<eid2)
			return -1;
		else if(eid1>eid2)
			return 1;
		else 
			return 0;
	}
 
}
