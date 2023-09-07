package Pattern;


import java.util.Scanner;

public class Pattern1 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		Patten( n);


	}
	static void Patten(int num)
	{
		char i;
		char j;
		for( i='A';i<='E';i++)
		{
			for( j='A';j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
			}
			
		}

	}


