package Collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorEx1 {

	public static void main(String[] args) {
     LinkedList l=new LinkedList();
     l.add("Kristy");
     l.add("Sweety");
     l.add("Shipra");
     l.add("Riya");
     l.add("Priyanka");
     l.add("Tanny");
     System.out.println(l);
     
     ListIterator lt=l.listIterator();
     while(lt.hasNext()){
    	String s=(String)lt.next();
    	if(s.equals("Riya")) {
    		lt.remove();
    	}else {
    		lt.add("Chandrani");
    	}
    	
     }
 	System.out.println(l);	
	}

}
