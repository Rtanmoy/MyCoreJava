package com.core.String;

public class Student {
	
		private String name;
		private int rollNo;
		public Student(String name, int rollNo) {
			super();
			this.name = name;
			this.rollNo = rollNo;
		}
		public static void main(String[] args) {
			Student s1=new Student("Ram", 12);
			Student s2=new Student("Sam",13);
			Student s3=new Student("Jadu", 4);
			s2=s3;
			System.out.println(s1.equals(s2)+" s1==> "+s1.hashCode()+"  s2==> "+s2.hashCode()+"  s2==> "+s2.hashCode());
			System.out.println(s2.equals(s3));
			
		}
		
	}


