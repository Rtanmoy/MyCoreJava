package com.interview;

public class ReplaceWhiteSpace {

	public static void main(String[] args) {

		// Using predefined method replace()
		String str1 = "Good    morning    everybody";
		String str2 = str1.replaceAll("\\s", "");
		System.out.println(str2);

		// without using predefined metod

		char[] chars = str1.toCharArray();
		 
        StringBuffer sb = new StringBuffer();
 
        for (int i = 0; i < chars.length; i++)
        {
            if( (chars[i] != ' ') && (chars[i] != '\t') )
            {
                sb.append(chars[i]);
            }
        } 
        System.out.println(sb); 
    }

}
