package pramid;

import java.util.Scanner;

public class Demo2 
{


	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		Star(n);


	}
	public static void Star(int n)
	{
		int sp=n/2;
		int st=1;
		for (int i=1; i<=n; i++) 
		{
			for (int j=1;j<=sp;j++) 
			{
				System.out.print("  ");
			}
			int x=st/2+1;
			for(int j=1;j<=st;j++)
			{
				System.out.print(x+" ");
				if(j<=st/2)
					x--;
				else
					x++;
			}

			if(i<=n/2)
			{
				sp--;
				st=st+2; 
			}

			else {
				sp++;
				st=st-2;
			}
			System.out.println();


		}

	}





}
