package date;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Entter the First Date(dd mm yyyy)");
		int d1=sc.nextInt();
		int m1=sc.nextInt();
		int y1=sc.nextInt();
		Date dt1=new Date(d1,m1,y1);
		System.out.println("Entter the second Date(dd mm yyyy)");
		int d2=sc.nextInt();
		int m2=sc.nextInt();
		int y2=sc.nextInt();
		Date dt2=new Date(d2,m2,y2);
		
		 int x=dt1.noOfDays();
		 int y=dt2.noOfDays();
		 System.out.println("number of days between these two dates: "+(y-x));
		 
		 System.out.println("day name of first date: "+dt1.dayName());
		 System.out.println("day name of second date: "+dt2.dayName());
	}
 
}
