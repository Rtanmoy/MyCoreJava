package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx1 {

	public static void main(String[] args) {
        ArrayList s=new ArrayList();
        for(int i=0;i<12;i++) {
        	s.add(i);
        }
        System.out.println(s);
		
		  Iterator itr=s.iterator();
		  while(itr.hasNext()) 
		  { 
			  Integer i=(Integer)itr.next(); 
			  if(i%2==0) {
		  System.out.println(i);
		  }
		  
		  }
		 
	}

}
