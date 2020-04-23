package com.collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetStudent {

	public static void main(String[] args) {
		Student s1=new Student("r1", 410);
		Student s2=new Student("r1", 410);
		Student s3=new Student("r2", 40);
        List<Student>list=new ArrayList<Student>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        System.out.println(list+"  "+list.size());
		Set<Student>set=new LinkedHashSet<Student>();
		set.add(s1);
		set.add(s2);
		set.add(s3);
		System.out.println(set+"   "+set.size());
	}

}
