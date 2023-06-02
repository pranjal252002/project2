import java.util.*;
interface Nooftickets
{
	Scanner sc=new Scanner(System.in);
	void in();
	void out();
}
interface Date 
{
	void get();
	void put();
}
class Location implements Nooftickets,Date
{
	String from,to;
	int time;
	String ans;
	int n;
	String date;
	float total;
	public void in()
	{
		System.out.println("How many tickets you want to book");
		n=sc.nextInt();
		System.out.println("");
	}
	public void out()
	{
		System.out.println("                                  ");
		System.out.println("No of tickets : "+n);
	}
	public void get()
	{
		System.out.println("Enter the date(dd-mm-yyyy) ");
		date=sc.next();
	}
	public void put()
	{
		System.out.println("Date : "+date);
	}
	void getdata()
	{
		System.out.println("From : ");
		System.out.println("");
		System.out.println("mumbai");
		System.out.println("pune");
		System.out.println("kolhapur");
		System.out.println("nashik");
		System.out.println("nagpur");
		System.out.println("sangli");
		System.out.println("satara");
		System.out.println("miraj");
		System.out.println("");
		System.out.println("Enter city name from above citiy");
		System.out.println("");
		do
		{
		System.out.println("From : ");
		from=sc.next();
		if(from.equals("mumbai")||from.equals("pune")||from.equals("kolhapur")||from.equals("nashik")||from.equals("nagpur")||from.equals("sangli")||from.equals("satara")||from.equals("miraj"))
		{
			break;
		}
		else
		{
				System.out.println("City not available");
		}
		}while(!from.equals("mumbai")||!from.equals("pune")||!from.equals("kolhapur")||!from.equals("nashik")||!from.equals("nagpur")||!from.equals("sangli")||!from.equals("satara")||!from.equals("miraj"));
		do
		{
		System.out.println("To : ");
		to=sc.next();
		if(to.equals("mumbai"))
		{
			System.out.println("timing :");
			System.out.println("1.7:00am");
			System.out.println("2.7:00pm");
			System.out.println("Select the timing");
			time=sc.nextInt();
			switch(time)
			{
				case 1:
					System.out.println("----------------------------------------");
					System.out.println("Rate is 600 rs per person");
					System.out.println("----------------------------------------");
					break;
				case 2:
					System.out.println("");
					System.out.println("----------------------------------------");
					System.out.println("Rate is 600 rs per person");
					System.out.println("----------------------------------------");
					break;
			}
			break;
		}
		else if(to.equals("pune"))
		{
			System.out.println("Timing :");
			System.out.println("1.7:00am");
			System.out.println("2.7:00pm");
			System.out.println("Select the timing");
			time=sc.nextInt();
			switch(time)
			{
				case 1:
					System.out.println("----------------------------------------");
					System.out.println("Rate is 500 rs per person");
					System.out.println("----------------------------------------");
					break;
				case 2:
					System.out.println("----------------------------------------");
					System.out.println("Rate is 500 rs per person");
					System.out.println("----------------------------------------");
					break;
			}
			break;
		}
		else if(to.equals("kolhapur"))
		{
			System.out.println("Timing : ");
			System.out.println("1.9:00am");
			System.out.println("2.4:00pm");
			System.out.println("3.10:00pm");
			System.out.println("Select the timing");
			time=sc.nextInt();
			switch(time)
			{
				case 1:
					System.out.println("----------------------------------------");
					System.out.println("Rate is 500 rs per person");
					System.out.println("----------------------------------------");
					break;
				case 2:
					System.out.println("----------------------------------------");
					System.out.println("Rate is 500 rs per person");
					System.out.println("----------------------------------------");
					break;
				case 3:
					System.out.println("----------------------------------------");
					System.out.println("Rate is 500 rs per person");
					System.out.println("----------------------------------------");
					break;
			}
			break;
		}
		else if(to.equals("nashik"))
		{
			System.out.println("Timing : ");
			System.out.println("1.9:00am");
			System.out.println("2.4:00pm");
			System.out.println("3.10:00pm");
			System.out.println("Select the timing");
			time=sc.nextInt();
			switch(time)
			{
				case 1:
					System.out.println("----------------------------------------");
					System.out.println("Rate is 800 rs per person");
					System.out.println("----------------------------------------");
					break;
				case 2:
					System.out.println("----------------------------------------");
					System.out.println("Rate is 800 rs per person");
					System.out.println("----------------------------------------");
					break;
				case 3:
					System.out.println("----------------------------------------");
					System.out.println("Rate is 800 rs per person");
					System.out.println("----------------------------------------");
					break;
			}
			break;
		}
		else if(to.equals("nagpur"))
		{
			System.out.println("Timing : ");
			System.out.println("1.9:00am");
			System.out.println("2.4:00pm");
			System.out.println("3.10:00pm");
			System.out.println("Select the timing");
			time=sc.nextInt();
			switch(time)
			{
				case 1:
					System.out.println("----------------------------------------");
					System.out.println("Rate is 1000 rs per person");
					System.out.println("----------------------------------------");
					break;
				case 2:
					System.out.println("----------------------------------------");
					System.out.println("Rate is 1000 rs per person");
					System.out.println("----------------------------------------");
					break;
				case 3:
					System.out.println("----------------------------------------");
					System.out.println("Rate is 1000 rs per person");
					System.out.println("----------------------------------------");
					break;
			}
			break;
		}
		else if(to.equals("sangli"))
		{
			System.out.println("Timing : ");
			System.out.println("1.9:00am");
			System.out.println("2.4:00pm");
			System.out.println("3.10:00pm");
			System.out.println("Select the timing");
			time=sc.nextInt();
			switch(time)
			{
				case 1:
					System.out.println("----------------------------------------");
					System.out.println("Rate is 200 rs per person");
					System.out.println("----------------------------------------");
					break;
				case 2:
					System.out.println("----------------------------------------");
					System.out.println("Rate is 200 rs per person");
					System.out.println("----------------------------------------");
					break;
				case 3:
					System.out.println("----------------------------------------");
					System.out.println("Rate is 200 rs per person");
					System.out.println("----------------------------------------");
					break;
			}
			break;
		}
		else if(to.equals("satara"))
		{
			System.out.println("Timing : ");
			System.out.println("1.9:00am");
			System.out.println("2.4:00pm");
			System.out.println("3.10:00pm");
			System.out.println("Select the timing");
			time=sc.nextInt();
			switch(time)
			{
				case 1:
					System.out.println("----------------------------------------");
					System.out.println("Rate is 500 rs per person");
					System.out.println("----------------------------------------");
					break;
				case 2:
					System.out.println("----------------------------------------");
					System.out.println("Rate is 500 rs per person");
					System.out.println("----------------------------------------");
					break;
				case 3:
					System.out.println("----------------------------------------");
					System.out.println("Rate is 500 rs per person");
					System.out.println("----------------------------------------");
					break;
			}
			break;
		}
		else if(to.equals("miraj"))
		{
			System.out.println("Timing : ");
			System.out.println("1.9:00am");
			System.out.println("2.4:00pm");
			System.out.println("3.10:00pm");
			System.out.println("Select the timing");
			time=sc.nextInt();
			switch(time)
			{
				case 1:
					System.out.println("----------------------------------------");
					System.out.println("Rate is 100 rs per person");
					System.out.println("----------------------------------------");
					break;
				case 2:
					System.out.println("----------------------------------------");
					System.out.println("Rate is 100 rs per person");
					System.out.println("----------------------------------------");
					break;
				case 3:
					System.out.println("----------------------------------------");
					System.out.println("Rate is 100 rs per person");
					System.out.println("----------------------------------------");
					break;
			}
			break;
		}
		else
		{
			System.out.println("City not available");
			System.out.println("Available cities : ");
			System.out.println("mumbai");
			System.out.println("pune");
			System.out.println("kolhapur");
			System.out.println("nashik");
			System.out.println("nagpur");
			System.out.println("sangli");
			System.out.println("satara");
			System.out.println("miraj");
		}
		}while(!to.equals("mumbai")||!to.equals("pune")||!to.equals("kolhapur")||!to.equals("nashik")||!to.equals("nagpur")||!to.equals("sangli")||!to.equals("satara")||!to.equals("miraj"));
	}
	void putdata()
	{
		System.out.println("From : "+from);
		System.out.println("To : "+to);	
		System.out.println("Total price");
		if(to.equals("mumbai"))
		{
			total=600*n;
			System.out.println(total);
		}	
		else	if(to.equals("pune"))
			{
				total=500*n;
				System.out.println(total);
			}
		else	if(to.equals("kolhapur"))
			{
				total=500*n;
				System.out.println(total);
			}	
		else 	if(to.equals("nashik"))
			{
				total=800*n;
				System.out.println(total);
			}
		else 	if(to.equals("nagpur"))
			{
				total=1000*n;
				System.out.println(total);
			}
		else 	if(to.equals("sangli"))
			{
				total=200*n;
				System.out.println(total);
			}
		else 	if(to.equals("satara"))
			{
				total=500*n;
				System.out.println(total);
			}
		else 	if(to.equals("miraj"))
			{
				total=100*n;
				System.out.println(total);
			}
	}
	void show()
	{
		System.out.println("Do want to book ticket ?(yes/no)");
		ans=sc.next();
		if(ans.equals("yes"))
		{
			System.out.println("Your ticket booked. Thank you for booking the tickets.");
		}		
		else if(ans.equals("no"))
		{
			System.out.println("See you soon Thank you for visiting us");
		}
	}
}
public class Rail
{
	
	public static void main(String[] args)
	{
		Location l=new Location();
		l.in();
		l.get();	
		l.getdata();
		l.out();	
		l.put();
		l.putdata();
		l.show();
	}
}		