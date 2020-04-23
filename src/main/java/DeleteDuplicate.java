import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class DeleteDuplicate {
public static void main(String[] args) {
	String str1="java by java brains";
	String str=Arrays.asList(str1.split("")).stream().distinct().collect(Collectors.joining(" "));
	System.out.println(str);
	
		
		  char[]charArr=str.toCharArray();
		   Set<Character>setString=new HashSet<Character>();
		   for(Character c:charArr) {
			   setString.add(c);
		   }
		 StringBuilder sb=new StringBuilder();
		 for(Character c:setString) {
			 sb.append(c);
		 }
		 System.out.println(sb);
}
}
