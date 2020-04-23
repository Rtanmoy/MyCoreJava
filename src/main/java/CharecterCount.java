import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CharecterCount {

	public static void main(String[] args) {
		String str="today is holiday";
		char[]charArr=str.toCharArray();
		Map<Character, Integer>charMap=new HashMap<Character, Integer>();
		for(Character ch:charArr) {
			if(charMap.containsKey(ch)) {
				charMap.put(ch,charMap.get(ch)+1);
			}else {
				charMap.put(ch, 1);
			}
		}
		System.out.println("Occurence of character=> "+charMap);
		Set<Map.Entry<Character, Integer>>entry=charMap.entrySet();
		for (Map.Entry<Character, Integer> count:entry) {
			if(count.getValue()>1) {
				System.out.println(count.getKey()+"   "+count.getValue());
			}
			
		}
		
	}

}
