import java.util.HashSet;
import java.util.Set;

public class StudentHashCode {

	public static void main(String[] args) {
		Set<Student> st = new HashSet<>();
		st.add(new Student("A"));
		st.add(new Student("B"));
		st.add(new Student("A"));

		System.out.println(st);

	}

}
