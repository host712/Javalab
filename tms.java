//Travel management system in Java

import java.util.*;
import java.util.Scanner; 
class tms
{
	public static void main(String args[])
	{
    	Scanner sc=new Scanner(System.in);
		int ch=0;
		do
		{
			System.out.println("---------------------------------------");
			System.out.println("------Welcome to Arc Travels-----------");
			System.out.println("---------------------------------------");
			System.out.println("1.Log In   2 .Sign up ");
			System.out.print("Enter the value to perform the function : ");
			int nm =sc.nextInt();
			switch(nm)
			{
       				case 1:System.out.println("Log In");  //Log in Option
       				System.out.println(" ");
       				login l1 =new  login(); //created an object to call the class called login
					l1.log();
       				break;
       				case 2:System.out.println("Sign Up");  //Sign Up options 
					System.out.println(" ");
       				signup s1 = new signup(); //created an object to call the class called signup
					s1.sign();
       				break;
       				default:System.out.println("Not found:)");
			}
			System.out.println("Type 1 to Stay back");
			System.out.println("Type 0 to Close the application");
			ch=sc.nextInt();
		}while(ch==1);
	}
}
//************************************************************************
//Sign Up Option
class signup
{
	Scanner sc=new Scanner(System.in);
	public void sign()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("First Name  :  ");
		String nm1= sc.nextLine();
		System.out.print("Last Name  :  ");
		String nm2= sc.nextLine();
		System.out.print("Email ID  :  ");
		String id= sc.nextLine();
		System.out.print("Contact Number :  ");
		String cn= sc.nextLine();
		System.out.print("Username :  ");
		String un= sc.nextLine();
		System.out.print("Set Password :  ");
		String pw = sc.nextLine();
		System.out.print("Confirm Password :  ");
		String pw1= sc.nextLine();
		int num1=0;
		do 
		{
			
			
				System.out.println(" ");
				System.out.println("Thank you for Signing Up on Arc Travels");
				booking b1=new booking();
				b1.book();
			
			System.out.println("#1.Home #0.Exit");
			num1=sc.nextInt();
		}while(num1==1);
	}
}
//***************************************************************************************
//Login Option
class login
{
	Scanner sc=new Scanner(System.in);
	public void log()
	{	
		System.out.print("Username or Email ID : ");
		String un= sc.nextLine();
		System.out.print("Password  : ");
		String pw= sc.nextLine();
		System.out.println("You have Successfully logged in");
		System.out.println(" ");
		booking b1=new booking();
		b1.book();
    }
}
//****************************************************************
//Booking Option after SignUp or Login to an account 
class booking 
{
	Scanner sc=new Scanner(System.in);
	public void book()
	{

		int num=0;
		do
		{
			System.out.println(" ");
			System.out.println("1.Booking  2.Booking Details  3.Cancel Bookings");
			System.out.println(" ---------------------------------------------------------");
			System.out.print("Select the option : ");
			int n = sc.nextInt();
			switch(n)
			{
				case 1:System.out.println("---Booking---");
				String[] locations={"1.London","2.Paris","3.Singapore","4.Malaysia","5.Sydney","6.Dubai","7.Iceland","8.Greece","9.England","10.Egypt","11.Brazil","12.Peru",};
				for(String str : locations)
				{
					System.out.println(str);
				}
				System.out.println("");
				System.out.print("Select the location : ");
				int ch = sc.nextInt();
				System.out.println(" ");
				if(ch==1)
				{System.out.println("Selected location is London");} 
				else if(ch==2)
				{System.out.println("Selected location is Paris");} 
				else if(ch==3)
				{System.out.println("Selected location is Singapore");} 
				else if(ch==4)
				{System.out.println("Selected location is Malaysia");} 
				else if(ch==5)
				{System.out.println("Selected location is Sydney");} 
				else if(ch==6)
				{System.out.println("Selected location is Dubai");} 
				else if(ch==7)
				{System.out.println("Selected location is Iceland");} 
				else if(ch==8)
				{System.out.println("Selected location is Greece");} 
				else if(ch==9)
				{System.out.println("Selected location is England");} 
				else if(ch==10)
				{System.out.println("Selected location is Egypt");} 
				else if(ch==11)
				{System.out.println("Selected location is Brazil");}
				else if(ch==12)
				{System.out.println("Selected location is Peru");}
				else
				{System.out.println("No more options");
				System.out.println("You can visit again for the best offers and more exciting locations");}
				if (ch<=12 && ch>=1)
				{     
					System.out.println("");
					System.out.println("Thank you for booking the location,as there was a pandemic in our country we request you to wait for the update of the Journey details");
				}
				break;
				case 2:System.out.println("---Booking Details---");
				System.out.println("");
				System.out.println("Your Bookings is in progress as our country in pandemic we will be Updating you soon (:");
				System.out.println("Our services are getting delayed due to COVID-19");
				break;
				case 3:System.out.println("---Cancel Bookings---");
				System.out.println("");
				System.out.println("Your Booking has been Cancelled");
				break;
				default:System.out.println("404 Error");
			}
			System.out.println("#1.Home #0.Exit");
			num=sc.nextInt();
		}while(num==1);
		System.out.println("You were logged out");
	}
}
