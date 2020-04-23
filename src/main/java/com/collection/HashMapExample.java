package com.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String,String> m=new HashMap<>();
		m.put("11","AA");
		m.put("12","ABC");
		m.put("13","AAC");
		m.put("14","ABB");
		m.put("15","ACC");
		System.out.println(m);
		Set<String> set=m.keySet();
		System.out.println(set);
		Collection<String> collec=m.values();
		Set<Entry<String, String>> collect=m.entrySet();
		System.out.println(collec+"   "+collect);
		Set eset=m.entrySet();
		Iterator itr=eset.iterator();
		while(itr.hasNext()) {
			Map.Entry m1=(Entry) itr.next();
			System.out.println(m1.getKey()+"    "+m1.getValue());
		}
	}

}
