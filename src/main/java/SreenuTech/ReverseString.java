package SreenuTech;

public class ReverseString {
	/*
	// Function to reverse a string in Java 
	public static String reverseString(String s){
	//Converting the string into a character array
	char c[]=s.toCharArray();
	String reverse="";
	//For loop to reverse a string
	for(int i=c.length-1;i>=0;i--){
	reverse+=c[i];
	}
	return reverse;
	}

	public static void main(String[] args) {
    
		System.out.println(reverseString("Hi All"));
		System.out.println(reverseString("Welcome to Edureka Blog"));    */
	
	
	public static void main(String[] args) {
	    
         String s="sreenu technologies for java realtime project";
		char c[]=s.toCharArray();
		String reverse="";
		//For loop to reverse a string
		for(int i=c.length-1;i>=0;i--){
		reverse+=c[i];
		}
		System.out.println(reverse);

		
	
			
		
		
		
		
		
		
		
		
	/*	package Edureka;
		import java.util.*; 
		public class StringRev{
		 // Function to reverse a string in Java using StringBuffer
		public static String rev(String s){ 
		return new StringBufferr(s).reverse().toString(); 
		} 
		public static void main(String[] args){ 
		String s= "Welcome to Edureka"; 
		// Note that string is immutable in Java
		 s= rev(s); 
		System.out.println("Result after reversing a string is : "+s); 
		} 
		}	
		
		
		*/
	/*	package Edureka; 
		import java.util.*; 
		public class StringRev{
		// Function to reverse a string in Java using StringBuilder
		public static String rev(String s){
		return new StringBuilder(s).reverse().toString();
		}
		public static void main(String[] args){
		String s= "Welcome to Edureka"; // Note that string is immutable in Java
		s= rev(s);
		System.out.println("Result after reversing a string is : "+s);
		}
		}	*/
		
		
	}

}
