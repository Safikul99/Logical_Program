package numberSystem1;

import java.util.Scanner;

public class BigestCondi 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();

		int big=(a>b&&a>c)?a:(b>c)?b:c;//nested conditilal operater
		System.out.println("Bigest is: "+big);



	}

}
