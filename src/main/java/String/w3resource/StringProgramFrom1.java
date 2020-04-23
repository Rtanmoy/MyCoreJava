package String.w3resource;

public class StringProgramFrom1 {

	public static void main(String[] args) {
		// get specified index element
		String str = "Java Exercises!";
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(10));
		// get the character (Unicode code point) at the given index within the String.
		System.out.println(str.codePointAt(1));
		System.out.println(str.codePointAt(5));
		//to get the character (Unicode code point) before the specified index within the String.
		System.out.println(str.codePointBefore(2));
		//count a number of Unicode code points in the specified text range of a String.
		System.out.println(str.codePointCount(1, 3));
		// compare two strings lexicographically.
		String str1="Java World 1";
		String str2="Java World 1";
		int result=str1.compareTo(str2);
		if(result<0) {
			System.out.println(str1+" <==is less than==> "+str2);
		}else if(result==0) {
			System.out.println(str1+" <==is equal to==> "+str2);
		} else {
			System.out.println(str1+" <==is greater than==> "+str2);
		}
        // compare two strings lexicographically ignore case
		String str3="java world 1";
		int result1=str1.compareToIgnoreCase(str3);
		System.out.println(result<0?"<==is less than==>":result==0?" <==is equal to==> ":"<==is greater than==>");
		//concatenate two different string
		String concate1=str1+str3;
		System.out.println(str1+=str2);
		System.out.println(concate1);
		System.out.println(str1.concat(str2));
		
		//check specified portion is present or not
		boolean checkP=str1.contains("World");
		CharSequence cs="ava";
		System.out.println(checkP+"  "+str1.contains(cs));
		StringBuffer sb=new StringBuffer("Java World 1");
		System.out.println(str2.contentEquals(sb));
	}

}
