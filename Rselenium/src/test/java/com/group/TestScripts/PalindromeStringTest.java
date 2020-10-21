package com.group.TestScripts;

import java.util.Scanner;

import org.testng.annotations.Test;

public class PalindromeStringTest {
	
	@Test

	public static void palindromeTest() {
		// TODO Auto-generated method stub
		/*
		 * String ip = "aba"; StringBuffer a = new StringBuffer("aba"); a.reverse();
		 * String b = a.toString();
		 * 
		 * if(ip.equals(b)){
		 * 
		 * System.out.println("Given below String is Palindrome is: ");
		 * System.out.println(ip);
		 * 
		 * } else { System.out.println("Given String is not a Palindrome");
		 * System.out.println(ip); }
		 */
	
		
		//or
		/*
		 * @SuppressWarnings("resource") Scanner ip = new Scanner(System.in); String a =
		 * ip.nextLine();
		 */
		String a = "rar";
		int l = a.length();
		String b = "";
		
		for (int i=l-1; i>=0;i--) {
			b = b + a.charAt(i);
			
		}
		
		if (a.equals(b)) {
			System.out.println("Given String is a Palindrome");
		}
		
		else {
			System.out.println("Given String is not a palindrome");
		}
		
		
		

	}

}
