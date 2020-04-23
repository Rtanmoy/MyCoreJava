package com.overriding;
class Parent{
	public void marry(){
		System.out.println("tanny");
	}
}
 class Test extends Parent {
       @Override
    public void marry() {
    	System.out.println("Taniya");
    }
}
 public class OverRidingEx1{
	public static void main(String[] args) {
		Parent p=new Parent();
		Test t=new Test();
		Parent p1=new Test();
		p.marry();  //tanny
		t.marry();  //taniya
		p1.marry();  //taniya
	}

}
