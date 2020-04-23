package ArrayList.w3resource;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class ArrayList17 {

	public static void main(String[] args) throws Exception {
		ArrayList<String> list = new ArrayList<>(7);
		list.add("RED");
		list.add("BLUE");
		list.add("WHITE");
		list.add("YELLOW");
		// checking a list is empty or not
		boolean b = list.isEmpty();
		System.out.println(list + "  " + b + " Capacity :" + findCapacity(list));
		// remove all element
		// list.removeAll(list);
		boolean b1 = list.isEmpty();
		System.out.println(list + "  " + b1);
		// trim the arraysize
		list.trimToSize();
		// increase the arrayList size
		list.ensureCapacity(6);
		// replace by specific element
		list.set(1, "VIOLET");
		System.out.println(list);
		// print all the elements of a ArrayList using the position of the elements.
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	static int findCapacity(ArrayList<String> al) throws Exception {
		Field field = ArrayList.class.getDeclaredField("elementData");
		field.setAccessible(true);
		return ((Object[]) field.get(al)).length;
	}
}
