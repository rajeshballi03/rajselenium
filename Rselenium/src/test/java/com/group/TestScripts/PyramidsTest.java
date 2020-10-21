package com.group.TestScripts;

import org.testng.annotations.Test;

public class PyramidsTest {

	@Test
	public static void pyramidTest() {
		// TODO Auto-generated method stub
		
	
		/*
		 * int rows =5;
		 * 
		 * for (int i=0; i<=rows;i++) { for(int j=0; j<=i; j++) { System.out.print(" * "
		 * + ""); } System.out.println(); }
		 */
		
		/* **************************************** */
		
		/*
		 * int count =1; int j=1; for (int i=5; i>=0; i--)
		 * 
		 * { for (j=1; j<=i;j++) { System.out.print(count + " "); count ++;
		 * 
		 * }
		 * 
		 * System.out.println(); }
		 */
		
		/* **************************************** */
		
			//int count = 1;
			/*
			 * for (int i=5; i>=0; i--) { for (int j=5; j>=i; j--) { System.out.print(count
			 * + " "); count ++; } System.out.println(); }
			 */
			//or
			
			/* 1-10 print pyramid
			 * for (int i=1; i<=5; i++) { for(int j=1; j<i; j++) { System.out.print(count +
			 * " "); count ++; } System.out.println(); }
			 */
			
			/* 1234 pyramid
			 * for (int i=1; i<=5; i++) { for (int j=1; j<i; j++) { System.out.print(j +
			 * " "); }System.out.println(); }
			 */
			int count = 3;
			for(int i=1; i<=4; i++) {
				for(int j=1; j<i; j++) {
					System.out.print(count + " ");
					count = count + 3;
				} System.out.println();
			}
			
	}

	
	}


