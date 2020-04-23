package com.interview;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindSpecial {

	public static void main(String[] args) {
    String str="@@acv&ieru^";
    Pattern p=Pattern.compile("\\W");//[^a-z0-9 ]
    Matcher m=p.matcher(str);
    int count=0;
    while(m.find()) {
    	count=count+1;
    	System.out.println(m.start()+" ===>> "+m.group());
    }
    System.out.println("Total no special char==> "+count);
	}

}
