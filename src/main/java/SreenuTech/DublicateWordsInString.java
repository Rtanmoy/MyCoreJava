package SreenuTech;

import java.util.HashMap;
import java.util.Set;

public class DublicateWordsInString {
	
	public static void main(String[] args) {
		duplicateWords("Count the Word");
	}
	
  public static void duplicateWords(String str) {
	  String[] words=str.split("");
	  HashMap<String,Integer> wcount=new HashMap<>();
	  for(String word:words) {
		  if(wcount.containsKey(word.toLowerCase())) {
			  wcount.put(word.toLowerCase(),wcount.get(word.toLowerCase())+1 );
		  }else {
			  wcount.put(word.toLowerCase(),1);
		  }
	  }
	  Set<String> tword=wcount.keySet();
	  for(String word:tword) {
		  if(wcount.get(word)>1) {
			  System.out.println(word+" "+wcount.get(word));
		  }
	  }
  }
}
