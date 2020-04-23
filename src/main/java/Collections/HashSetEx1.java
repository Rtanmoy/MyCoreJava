package Collections;

import java.util.HashSet;

public class HashSetEx1 {
	public static void main(String[] args) {
		HashSet h=new HashSet();
		h.add("AA");
		h.add("BB");
		h.add("CC");
		h.add(89);
		h.add(520);
		h.add("AA");
		System.out.println(h);
	}

}
