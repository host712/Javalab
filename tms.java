import java.util.*;
import java.util.Scanner;
 
//Main Method of Travel Management System
class tms
{
	public static void main(String args[])
	{
	System.out.println("Travel management system using Java Programming" );
    	Scanner sc=new Scanner(System.in); //using scanner package to get user input 
		int ch=0;
		do
		{
			System.out.println("----------------------------------------------");
			System.out.println("-------------Welcome to Arc Travels-----------");
			System.out.println("----------------------------------------------");
			System.out.println("1.Log In   2 .Sign up ");
			System.out.print("Enter the value to perform the function : ");
			int nm =sc.nextInt();
			switch(nm)
			{
       				case 1:System.out.println("Log In");  //Log in Option
       				login l1 =new  login(); //created an object to call the class called login
					l1.log(); //refering to log in class
       				break;
       				case 2:System.out.println("Sign Up");  //Sign Up options 
       				signup s1 = new signup(); //created an object to call the class called signup
					s1.sign(); //referring to signup class
       				break;
       				default:System.out.println("Not found:)");
			}
			System.out.println("Press 1 to Stay back");
			System.out.println("Press 0 to Close the application");
			ch=sc.nextInt();
		}while(ch==1); //using do-while loop for continuity'
	}
}
//*************************************************************************************************************
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
			//if(pw==pw1) //tried using the string comparison for password match on signup
			//{
				System.out.println("Thank you for Signing Up on Arc Travels");
				booking b1=new booking();
				b1.book(); //referring to booking class 
			//}
			System.out.println("#1.Home #0.Exit");
			num1=sc.nextInt();
		}while(num1==1);
	}
}
//*************************************************************************************************************
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
		booking b1=new booking();
		b1.book();
    }
}
//*************************************************************************************************************
//Booking Option after SignUp or Login to an account 
class booking 
{
	Scanner sc=new Scanner(System.in);
	public void book()
	{

		int num=0;
		do
		{
			System.out.println("1.Booking  2.Booking Details  3.Cancel Bookings");
			System.out.print("Select the option : ");
			int n = sc.nextInt();
			switch(n)
			{
				case 1:System.out.println("Booking");
				System.out.println("1.Flight  2.Hotel  3.Car ");
				System.out.print("Select the option : ");
				int nn=sc.nextInt();
				switch(nn)
				{
					case 1:System.out.println(" ");
					System.out.println("Flight");
					System.out.println(" ");
					String[] locations={"1.London","2.Paris","3.Singapore","4.Malaysia","5.Sydney","6.Dubai","7.Iceland","8.Greece","9.England","10.Egypt","11.Brazil","12.Peru",};
					for(String str : locations)
					{
						System.out.println(str);
					}
					System.out.print("Select the location : ");
					int ch = sc.nextInt();
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
						System.out.println("Thank you for booking the Airline, as there was a pandemic in our country we request you to wait for the update of the Journey details");
					}
					break;
					case 2:System.out.println(" ");
					System.out.println("Hotels");
					System.out.println(" ");
					stay st1=new stay("Germany","22/12/20","14/12/20",2,2);
					st1.display();
					break;
					case 3:System.out.println(" ");
					System.out.println("Car");
					System.out.println(" ");
					car_rental c1=new car_rental("Chennai MAR","Vellore","12/12/20","14/12/20");
						
				}
				break;
				case 2:System.out.println("Booking Details");
				System.out.println("Your Bookings is in progress as our country in pandemic we will be Updating you soon (:");
				System.out.println("Our services are getting delayed due to COVID-19");
				break;
				case 3:System.out.println("Cancel Bookings");
				System.out.println("Your Booking has been Cancelled");
				break;
				default:System.out.println("404 Error");
			}
			System.out.println("#1.Home #0.Exit");
			num=sc.nextInt();
		}while(num==1);
		System.out.println("You were logged out");
		System.out.println("Visit us back for best offers");
	}
}
//*************************************************************************************************************
//Bookings for Hotel Stays
class stay
{
	String Hotel_location;
	String check_in;
	String check_out;
	int travellers;
	int rooms;
	public stay(String h,String cin,String cout,int t,int r)
	{
		Hotel_location=h;
		check_in=cin;
		check_out=cout;
		travellers=t;
		rooms=r;
	}
	void display()
	{
		System.out.println("Hotel Location : "+Hotel_location);
		System.out.println("Check-in Date : "+check_in);
		System.out.println("Check-out Date : "+check_out);
		System.out.println("Number of Travellers : "+travellers);
		System.out.println("Number of Rooms Booked : "+rooms);
	}
}
//*************************************************************************************************************
//Account Personal Details 
class  personaldetails
{
	public void personal()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("First Name : ");
		String fname =sc.nextLine();
		System.out.println("Second Name : ");
		String  sname =sc.nextLine();
		System.out.println("Phone number : ");
		long phonenumber =sc.nextLong();
		System.out.println("Alternate Phone number : ");
		long altphonenumber =sc.nextLong();
		System.out.println("Gender");
		System.out.println("Date of Birth : dd/mm/yyyy");
		//make a calendar 
		System.out.println("   ");
		System.out.println("Address : ");
		String address =sc.nextLine();
		System.out.println("State : ");
		String state =sc.nextLine();
		System.out.println("Country : ");
		String country =sc.nextLine();
		System.out.println("Postal code : ");
		int post_code =sc.nextInt();
	}
}
//*************************************************************************************************************
//Car
class car_rental
{
	String pickup,drop,pickup_date,drop_date;	

	public car_rental(String p,String d,String pd,String dd)
	{
		System.out.println("Pickup Location -"+p);
		System.out.println("Drop Location -"+d);
		System.out.println("Pickup Date -"+pd);
		System.out.println("Drop Date -"+dd);
		System.out.println("Car is booked you can pickup the car from "+p+" and Enjoy your Drive");
	}
}
//*************************************************************************************************************
class password
{
	Scanner sc=new Scanner(System.in);
	public void password()
	{
		System.out.println("Current Password : ");
		String pw1=sc.nextLine();
		System.out.println("New Password : ");
		String pw2=sc.nextLine();
		if(pw1!=pw2)
		{
			System.out.println("Retype Password : ");
			String pw3=sc.nextLine();
			if(pw2==pw3)
			{
				System.out.println("Password changed successfully");
			}
		}
		else
			System.out.println("New Password is same as Current Password");
	}
}