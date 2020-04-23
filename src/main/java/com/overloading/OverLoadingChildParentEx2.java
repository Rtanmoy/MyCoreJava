package com.overloading;

public class OverLoadingChildParentEx2 {
	public void methodOne(StringBuffer sb) {
		System.out.println("Zero -methodone");
	}

	public String methodOne(String i) {
		System.out.println("String -methodone");
		return i;
	}

	public void methodOne(Object d) {
		System.out.println("double -methodone");
	}

	public static void main(String[] args) {
      OverLoadingChildParentEx2 ol=new OverLoadingChildParentEx2();
      ol.methodOne("Raju");
      ol.methodOne(10);
    //  ol.methodOne(null); ///getting compile time error bc both has same priority and accept null
      
	}

}
