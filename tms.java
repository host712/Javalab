//Travel management system in Java

import java.util.*;
import java.util.Scanner; 
class tms
{
	public static void main(String args[])
    	{
    		Scanner sc=new Scanner(System.in);
    		System.out.println("1.Log In   2 .Sign up ");
    		System.out.print("Enter the value to perform the function : ");
    		int nm =sc.nextInt();
    		switch(nm)
       		{
        			case 1:System.out.println("---Log In---");  //Log in Option
        			System.out.println(" ");
        			login l1 =new  login(); //created an object to call the class called login
			l1.log();
        			break;
        			case 2:System.out.println("---Sign Up---");  //Sign Up options 
			System.out.println(" ");
        			signup s1 = new signup(); //created an object to call the class called signup
			s1.sign();
        			break;
        			default:System.out.println("Not found:)");
		}
        	}
}