package com.overloading;

public class OverLoadingEx2varargs {
	public void methodOne() {
		System.out.println("Zero -methodone");
	}

	public long methodOne(int i) {
		System.out.println("int -methodone");
		return i;
	}

	public void methodOne(int... i) {
		System.out.println("var-args -methodone");
	}

	public static void main(String[] args) {
      OverLoadingEx2varargs ol=new OverLoadingEx2varargs();
      ol.methodOne();
      ol.methodOne(10);
      ol.methodOne(10,12);
      
	}

}
