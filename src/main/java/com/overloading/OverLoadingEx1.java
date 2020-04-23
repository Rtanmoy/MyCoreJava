package com.overloading;

public class OverLoadingEx1 {
	public void methodOne() {
		System.out.println("Zero -methodone");
	}

	public long methodOne(long i) {
		System.out.println("long -methodone");
		return i;
	}

	public void methodOne(double d) {
		System.out.println("double -methodone");
	}

	public static void main(String[] args) {
      OverLoadingEx1 ol=new OverLoadingEx1();
      ol.methodOne();
      ol.methodOne(12.2f);
      ol.methodOne(10);
      
	}

}
