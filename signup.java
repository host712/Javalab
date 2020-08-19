import java.util.Scanner; 
import java.util.*;
public class signup
{
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
        System.out.println("Thank you for Signing Up");
        int num2=0;
        do{
        System.out.println("1.Booking  2.Booking Details  3.Cancel Bookings");
        System.out.print("Select the option : ");
        int n = sc.nextInt();
        switch(n)
        {
            case 1:System.out.println("--Booking--");
            System.out.println("1.LONDON--London, the capital of England and the United Kingdom, is a 21st-century city with history stretching back to Roman times. At its centre stand the imposing Houses of Parliament, the iconic ‘Big Ben’ clock tower and Westminster Abbey, site of British monarch coronations. Across the Thames River, the London Eye observation wheel provides panoramic views of the South Bank cultural complex, and the entire city. ");
System.out.println("");
            System.out.println("2.PARIS--Paris, France's capital, is a major European city and a global center for art, fashion, gastronomy and culture. Its 19th-century cityscape is crisscrossed by wide boulevards and the River Seine. Beyond such landmarks as the Eiffel Tower and the 12th-century, Gothic Notre-Dame cathedral, the city is known for its cafe culture and designer boutiques along the Rue du Faubourg Saint-Honoré. ");
System.out.println("");
            System.out.println("3.DUBAI-- Dubai is a city and emirate in the United Arab Emirates known for luxury shopping, ultramodern architecture and a lively nightlife scene. Burj Khalifa, an 830m-tall tower, dominates the skyscraper-filled skyline. At its foot lies Dubai Fountain, with jets and lights choreographed to music. On artificial islands just offshore is Atlantis, The Palm, a resort with water and marine-animal parks.");
System.out.println("");
            System.out.println("4.MALAYSIA--Malaysia is a Southeast Asian country occupying parts of the Malay Peninsula and the island of Borneo. It's known for its beaches, rainforests and mix of Malay, Chinese, Indian and European cultural influences. The capital, Kuala Lumpur, is home to colonial buildings, busy shopping districts such as Bukit Bintang and skyscrapers such as the iconic, 451m-tall Petronas Twin Towers.");
	System.out.println("");
            System.out.println("5.SYDNEY--Sydney, capital of New South Wales and one of Australia's largest cities, is best known for its harbourfront Sydney Opera House, with a distinctive sail-like design. Massive Darling Harbour and the smaller Circular Quay port are hubs of waterside life, with the arched Harbour Bridge and esteemed Royal Botanic Garden nearby. Sydney Tower’s outdoor platform, the Skywalk, offers 360-degree views of the city and suburbs.");
System.out.println("");
            System.out.print("Select the location : ");
            int ch = sc.nextInt();
	System.out.println("");
            if(ch==1)
            {System.out.println("Selected location is London");} 
            else if(ch==2)
            {System.out.println("Selected location is Paris");} 
            else if(ch==3)
            {System.out.println("Selected location is Dubai");} 
            else if(ch==4)
            {System.out.println("Selected location is Malaysia");} 
            else if(ch==5)
            {System.out.println("Selected location is Sydney");} 
            else
            {System.out.println("No more options");
             System.out.println("You can visit again for the best offers and more exciting locations");}
            if (ch<=5  && ch>=1)
            {System.out.println("Thank you for selecting the location,as there was a pandemic in our country we request you to wait for the update of the Journey details");}
            break;
            case 2:System.out.println("--Booking Details--");
	System.out.println("");
            System.out.println("Your Bookings  is in progress as our country is in pandemic we will be Updating you soon (:");
            System.out.println("Our services are getting delayed due to COVID-19");
            break;
            case 3:System.out.println("--Cancel Bookings--");
	System.out.println("");
            System.out.println("Your Booking has been Cancelled");
            break;
            default:System.out.println("Page not found 404");
        }
        System.out.println("#1.Home #0.Exit");
        num2=sc.nextInt();
    }while(num2==1);
  }  
}