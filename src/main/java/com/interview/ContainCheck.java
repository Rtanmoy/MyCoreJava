package com.interview;

import java.util.HashSet;
import java.util.Set;

public class ContainCheck {
public static void main(String[] args) {
	
	
	String input="babcccd";
	String input1="abcddd";
   String output = removeDups(input);
    String output1=removeDups(input1);
    System.out.println("String without duplicate characters is "+"Output= "+output+"  Output1= "+output1+" ---- " + output.compareTo(output1));

 /*   String withoutDups = removeDupsInPlace(input);
    String withoutDups1 = removeDupsInPlace(input1);
    System.out.println(withoutDups.hashCode()+"   "+withoutDups1.hashCode());
    System.out.println("String without duplicate characters in place is "
        + withoutDups.equals(withoutDups1));
  
 */
  }
 
  /**
   * Java method to remove duplicate characters from String This method uses a
   * HashSet collection to get rid of duplicate characters.
   * 
   * @param word
   * @return String without duplicate characters
   */
  public static String removeDups(String word) {
    Set<Character> chars = new HashSet<>();
    StringBuilder output = new StringBuilder(word.length());
 
    for (int i = 0; i < word.length(); i++) {
      char ch = word.charAt(i);
      if (chars.add(ch)) {
        output.append(ch);
      }
    }
 
    return output.toString();
  }
 
  /**
   * A java method to remove duplicate characters from String in place. It
   * doesn't use additional buffer like HashSet we have used previously.
   * 
   * @param word
   * @return String without duplicates
   */
  public static String removeDupsInPlace(String word) {
    final StringBuilder output = new StringBuilder();
 
    for (int i = 0; i < word.length(); i++) {
      String character = word.substring(i, i + 1);
      if (output.indexOf(character) < 0) // if not contained
        output.append(character);
    }
    return output.toString();
  }
 
}

