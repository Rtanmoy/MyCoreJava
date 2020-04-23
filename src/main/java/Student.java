
public class Student {
	private String name;

	public Student(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}

	@Override
	public int hashCode() {
		int hashcode = 0;
		return hashcode = hashcode + name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student st = (Student) obj;
			return st.name.equals(this.name);
		} else {
			return false;
		}
	}
}
