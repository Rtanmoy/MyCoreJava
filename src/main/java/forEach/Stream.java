package forEach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
	     
		Consumer<Integer> action = System.out::println;
		
		// strem example
		numberList.stream().filter(n -> n%2  == 0)//even no
		                   .forEach( System.out::println );//forEach(action)
		System.out.println("**********************************");
		//list example
		numberList.forEach(action);
		
	}

}
