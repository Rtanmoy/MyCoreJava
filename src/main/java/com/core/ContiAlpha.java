package com.core;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class ContiAlpha {
	public static void main(String[] args) throws IOException {
		try {
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			String s1 = "I saw a cd ghplayer"; //and a modem degh in ccd ";
			s1 = s1.toLowerCase(); //convert to lower character
			
			System.out.println("1111111111= "+s1.length());
		/*	System.out.println(s1.charAt(2 + 1)+"  "+s1.charAt(2 + 1)+"     "+s1.charAt(2));
			int demo = (s1.charAt(9)-s1.charAt(8))-s1.charAt(7);
			System.out.println("@@@@+ "+demo);  */
			
			for (int i = 0; i < (s1.length() - 1); i++) {
				if (s1.charAt(i + 1) - s1.charAt(i) == 1) {
					String word = s1.charAt(i) + "" + s1.charAt(i + 1);

					if (map.containsKey(word)) {
						int value = map.get(word);
						map.put(word, ++value);
					} else {
						map.put(word, 1);
					}
				}
			}
			System.out.println("22222222"+map);
			
			
			///Sorting depend on value
			ArrayList<ContiSortByValue> list = new ArrayList<ContiSortByValue>();
			Set<String> keySet = map.keySet();
			String s2 = s1;
			for (String k : keySet) {
				s2 = s2.replace(k, "");
				int value = map.get(k);
				list.add(new ContiSortByValue(k, value));
			}
			System.out.println("888888  "+s2);
			Collections.sort(list);
			for (ContiSortByValue sort : list) {
				System.out.println(sort);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}