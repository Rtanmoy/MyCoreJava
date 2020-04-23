package SreenuTech;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class RemoveDuplicates {

public static void main1(String[] args) {
        
        String str = 
            "The first second was alright but the second second was tough.";
        
        System.out.println("Original String: ");
        System.out.println(str);
      
        
        /*
         * Since the words are separated by space,
         * we will split the string by one or more space
         */
        
       String[] strWords = str.split("\\s+");
        
        //convert String array to LinkedHashSet to remove duplicates
        LinkedHashSet<String> lhSetWords 
            = new LinkedHashSet<String>( Arrays.asList(strWords) );
        System.out.println( lhSetWords);
        
        //join the words again by space
        StringBuilder sbTemp = new StringBuilder();
        int index = 0;
        
        for(String s : lhSetWords){
            
            if(index > 0)
                sbTemp.append(" ");
        
            sbTemp.append(s);
            index++;
        }
        
        str = sbTemp.toString();
        
        System.out.println("String after removing duplicate words: ");
        System.out.println(str);
 
}

//using above code in sotest way
/*
 *
 public static void main2(String[] args) {
	
}
String str = 
"The first second was alright but the second second was tough.";

str = new LinkedHashSet<String>( Arrays.asList(str.split("\\s+")) ).toString().replaceAll("[\\[\\],]", "");

System.out.println("String after removing duplicate words: ");
System.out.println(str);

*/

  ///using java 8
 public static void main(String[] args) {
    
    String str = 
        "The first second was alright but the second second was tough.";
        
    str = Arrays.stream( str.split("\\s+")).distinct().collect(Collectors.joining(" ") );
    
    System.out.println(str);

}
}
