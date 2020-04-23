package List;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {

	public static void main(String[] args) {
		List<String>list=new ArrayList<>(12);
		System.out.println(list.size());
		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println(list);
		System.out.println(list.indexOf("B"));

	}

}
