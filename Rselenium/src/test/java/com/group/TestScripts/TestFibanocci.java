package com.group.TestScripts;

//import java.util.Scanner;

public class TestFibanocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//0 1 1 2 3 5 8 13 21
		
		/*
		 * Scanner inp = new Scanner("RajTest"); inp.nextLine();
		 */
		/*
		 * sum=1 fsum=0 fb=fsum+sum sum=fb
		 */
		
		int numb1=0;
		int numb2=1;
		int fsum=0;
		//int count=0;
		

				while (numb1<100) {
					
				System.out.println(numb1 + " ");
				
				fsum = numb1+ numb2;
				numb1=numb2;
				numb2=fsum;
				
			//	count = numb1;
				
				
					
				}
	}

}
