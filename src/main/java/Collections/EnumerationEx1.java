package Collections;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationEx1 {
	public static void main(String[] args) {
		Vector v=new Vector();
		for(int i=0;i<=15;i++) {
			v.add(i);
		}
		System.out.println(v);
		
		Enumeration e=v.elements();
		while(e.hasMoreElements()) {
			Integer I=(Integer)e.nextElement();
			if(I%2==0)
				System.out.print(I+" ");
		}
		System.out.println(v);
	}

}
