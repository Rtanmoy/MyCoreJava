package count;

import java.util.HashMap;

public class DuplicateTEst {

	public static void main(String[] args) {
		String s="tata consultancy services";
		
		char[] c=s.toCharArray();
		
		HashMap<Character,Integer> map=new HashMap();
		
		for(Character ch:c) {
			
			
			if(map.containsKey(ch))
System.out.print(" ");			
			else {
				map.put(ch, 1);
				System.out.print(ch);
			
			}
			
		}			
	}

}
