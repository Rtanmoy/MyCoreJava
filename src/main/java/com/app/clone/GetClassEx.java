package com.app.clone;

public class GetClassEx implements Cloneable {
	public static void main(String[] args) {
		Object obj=new String("Tanmoy");
		System.out.println("Runtime class defination of an object ==>> "+obj.getClass().getName());
	}

}
