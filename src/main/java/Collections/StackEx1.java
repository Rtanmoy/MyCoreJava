package Collections;

import java.util.Stack;

public class StackEx1 {

	public static void main(String[] args) {

		Stack s=new Stack();
		s.push("A");
		s.push("B");
		s.push("C");
		System.out.println(s);
		System.out.println(s.search("B"));
	}

}

