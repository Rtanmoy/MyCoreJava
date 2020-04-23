package com.app;

import java.util.Scanner;

public class SplitONLetter {

	public static void main(String[] args) {
		
				Scanner sn=new Scanner(System.in);
				System.out.println("Enter a String::");
				String st=sn.nextLine();
				String[] words=st.split("a");//Split words depends on white space
				for(String w:words)      //foreach method
				{			
					System.out.println(w+"Length of the aray:"+words.length);
				}

			}

		

	}


