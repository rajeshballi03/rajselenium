package com.group.TestScripts;

public class TestPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * int i=1; int pn=20; Boolean flag = null;
		 * 
		 * while (i<pn) {
		 * 
		 * if (i%2==0) { System.out.println(i); flag=true; } i++; } if(!flag) {
		 * System.out.println("It is a prime number"); } else {
		 * System.out.println("not a prime number" +i); }
		 */
		
		int num = 10;   //29
        boolean flag = false;
        for(int i = 2; i <= num/2; ++i)
        {
            // condition for nonprime number
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }

}
