package com.ruchi.prac;

import java.util.Scanner;

public class Palindrome {
	
		   private static final String str1 = null;

		public static void main(String args[])
		   {
		      String str, rev = "";
		      Scanner sc = new Scanner(System.in);
		 
		      System.out.println("Enter a string:");
		      str = sc.nextLine();
		      
		      int length = str.length();
		      System.out.println(length+" is a length");
		      
		      
		 
		      for ( int i = length - 1; i >= 0; i-- )
		         rev = rev + str
		         .charAt(i);
		 
		      if (str.equals(rev))
		         System.out.println(str.toUpperCase()+" is a palindrome");
		      else
		         System.out.println(str.toUpperCase()+" is not a palindrome");
		 
		   }
		}
