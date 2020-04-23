package MethodReferences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MRExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> integers = Arrays.asList(1,12,433,5);
        
		Optional<Integer> max = integers.stream().reduce( Math::max );
		 
		max.ifPresent(value -> System.out.println(value));
		
		//using instance method reference
       max.ifPresent(System.out::println);
       
       
       
       List<String> strings = Arrays
    	        .asList("how", "to", "do", "in", "java", "dot", "com");
    	 
    	List<String> sorted = strings
    	        .stream()
    	        .sorted((s1, s2) -> s1.compareTo(s2))
    	        .collect(Collectors.toList());
    	 
    	System.out.println(sorted);
    	 
    	List<String> sortedAlt = strings
    	        .stream()
    	        .sorted(String::compareTo)
    	        .collect(Collectors.toList());
    	 
    	System.out.println(sortedAlt);
       
       
       
    	List<Integer> integers1 = IntStream
                .range(1, 100)
                .boxed()
                .collect(Collectors.toCollection( ArrayList::new ));
 
    			Optional<Integer> max1 = integers.stream().reduce(Math::max);
 
    				max1.ifPresent(System.out::println);
       
       
	}

}
