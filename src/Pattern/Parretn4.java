package Pattern;

import java.util.Scanner;

public class Parretn4 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		Patten( n);
	}
	static void Patten(int num)
	{
		int x=1;
		for(int i=1;i<=num;i++)
		{
			for( int j=1;j<=num;j++)
			{
				System.out.print(x%2+" ");
				x++;
//				if(x==10)
//					x=1;//System.out.print(x+" ");
			}
			System.out.println();
		}

	}


}
