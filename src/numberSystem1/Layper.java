package numberSystem1;

import java.util.Scanner;

public class Layper 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int  y=sc.nextInt();
		if(y%4==0&&y%100!=0||y%400==0)
			System.out.println(y+" is lapyer");
		else
			System.out.println(y+" is lapyer");
	}




}