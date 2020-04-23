package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx1 {

	public static void main(String[] args) {
     
		Map<String,Integer> m=new HashMap<>();
		m.put("Abhi", 1000);
		m.put("Bubai", 800);
		m.put("Partha", 700);
		m.put("Yubaraj", 600);
		m.put("Biju", 500);
		m.put(null, 4);
		System.out.println(m);
		System.out.println(m.put("Abhi", 1200));
		Set s=m.keySet();
		System.out.println(s);
		Set s1=m.entrySet();
		System.out.println(s1);
		Collection s2=m.values();
		System.out.println(s2);
		System.out.println(m.isEmpty());
		System.out.println(m.containsKey(m));
		Iterator itr=s1.iterator();
		while(itr.hasNext()) {
			Map.Entry m1=(Map.Entry)itr.next();
			System.out.println(m1.getKey()+"----"+m1.getValue());
		}
		//iteration 2 using entrySet()
		System.out.println("============>>>>>>>entrySet<<<<<<<==============");
		for(Map.Entry<String, Integer> map: m.entrySet()) {
			System.out.println(map.getKey()+" "+map.getValue());
		}
		//iteration using keySet()
		System.out.println("============>>>>>>>keySet<<<<<<<==============");
		for(String map: m.keySet()) {
			System.out.println(map+" "+m.get(map));
		}
		System.out.println("============>>>>>>>stream api<<<<<<<==============");
		m.entrySet().stream().forEach(System.out::println);
		System.out.println("============>>>>>>>only foreach<<<<<<<==============");
		m.forEach((key,value)->System.out.println(key+" "+value));
		
	}

}
