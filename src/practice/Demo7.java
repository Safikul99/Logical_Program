package practice;

import java.util.Scanner;

public class Demo7 
{
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number");
			int n=sc.nextInt();
			Patten( n);
		}
		static void Patten(int num)
		{
			for(int i=num;i>=1;i--)
			{
				for(int j=1;j<=num-i;j++)
				{
					System.out.print("  ");
				}
				int k=num-i+1;
				for(int j=1;j<=2*i-1;j++)
				{
					System.out.print(k+" ");
					if(j<i)
						k++;
					else
						k--;

				}
				
				System.out.println();
			}

		}




}
