package Wrapper;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class IntVal {

	private int i;

	public IntVal(int a) {

		i = a;
	}

	public int getVal() {

		return i;
	}

	public void setValue(int a) {

		this.i = a;
	}

	public void increment() {

		i++;
	}

	@Override
	public int hashCode() {
		int hashCode = 0;
		return hashCode += i * 20;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof IntVal) {
			IntVal iv = (IntVal) obj;
			return iv.i == this.i;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {

		return Integer.toString(i);
	}
}

public class WrapperClass {

	public static void main(String[] args) {

		List<IntVal> list = new ArrayList<>();

		for (int i = 0; i < 10; i++) {

			list.add(new IntVal(i));

		}
		System.out.println(list);

		for (int i = 0; i < list.size(); i++) {
			((IntVal) list.get(i)).increment();

		}
		System.out.println(list);

		HashSet<IntVal> set = new HashSet<>();
		set.add(new IntVal(7));
		set.add(new IntVal(5));
		set.add(new IntVal(6));
		set.add(new IntVal(5));
		System.out.println("HashSet==> " + set);
        System.out.println(new IntVal(5).hashCode());
	}

}