package numberSystem;

import java.util.Scanner;

public class Demo 
{
	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int  n=sc.nextInt();
		String [] st= {"even","odd"};
		System.out.println(n+" is an "+st[n%2]+" number");
		
	}

}
