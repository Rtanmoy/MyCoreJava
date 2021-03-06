package Stream;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

public class SreamCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//--1--//
		Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
        stream.forEach(p -> System.out.println(p));
        System.out.println("*****************1****************");
        //---2--//
        Stream<Integer> stream1= Stream.of( new Integer[]{1,2,3,4,5,6,7,8,9} );
        stream1.forEach(p -> System.out.println(p));
        System.out.println("*****************2****************");
        
        //----3----//
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i = 1; i< 10; i++){
            list.add(i);
        }

        Stream<Integer> stream2 = list.stream();
        stream2.forEach(p -> System.out.println(p)); 
        System.out.println("*****************3****************");
        
        //-----4----//
		/*
		 * Stream<Date> stream3 = Stream.generate(() -> { return new Date(); });
		 * stream3.forEach(p -> System.out.println(p));
		 */
        
        
	}

}
