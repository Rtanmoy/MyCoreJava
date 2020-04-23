package com.interview;

public class ReverseNumber {

	public static void main(String[] args) {
	       String str="Good Morning";
	       //Using StringBuilder
	       StringBuilder builder=new StringBuilder();
	       builder.append(str);
	       StringBuilder string=builder.reverse();
          // System.out.println(string);
           
           //Using for loop
           char[]arr=str.toCharArray();
           for(int i=arr.length-1;i>=0;i--) {
        	 //  System.out.println(arr[i]);
           }
           //Using chatAt()
           String reverse="";
           int original=str.length();
           for(int i=original-1;i>=0;i--) {
        	   reverse=reverse+str.charAt(i);
           }
           System.out.println(reverse);
           
           //Using split()
           String[]str2=str.split("");
           for(int i=str2.length -1;i>=0;i--) {
        	   System.out.println(str2[i] + "");
           }
	}

}
