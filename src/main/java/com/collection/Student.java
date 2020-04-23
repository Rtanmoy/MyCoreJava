package com.collection;

public class Student {
private String rollNo;
private int mark;

public Student(String rollNo, int mark) {
	super();
	this.rollNo = rollNo;
	this.mark = mark;
}
/**
 * @return the rollNo
 */
public String getRollNo() {
	return rollNo;
}
/**
 * @param rollNo the rollNo to set
 */
public void setRollNo(String rollNo) {
	this.rollNo = rollNo;
}
/**
 * @return the mark
 */
public int getMark() {
	return mark;
}
/**
 * @param mark the mark to set
 */
public void setMark(int mark) {
	this.mark = mark;
}
@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", mark=" + mark + "]";
}

}
