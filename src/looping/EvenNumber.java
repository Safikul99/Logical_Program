package looping;

import java.util.Scanner;

public class EvenNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range:");
		//int n=sc.nextInt();
//		for(int i=2;i<=n;i=i+2)//o(n/2) time coml+
//		{
//			if(i%2==0)
//			{
//				System.out.println(i+" ");
//			}
//				
//		}
//		for(int i=1;i<=n;i++)   //o(n)
//		{
//			if(i%2==0)
//			{
//				System.out.println(i+" ");
//			}
//				
//		}
//		
		
		int p=sc.nextInt();
		int sum=0;
		for(int i=0;i<=p;i++)
		{
			sum=sum+i;
		}
		System.out.println("sum of "+ p + " digits "+sum);
		
	}

}
