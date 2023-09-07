package datastructure;

import java.math.BigInteger;
import java.util.Scanner;

public class MAinRunner 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Integer values");
		String a=sc.next();
		String b=sc.next();

		BigInteger sum=new BigInteger(a);
		sum=sum.add(new BigInteger(b));
		System.out.println(sum);


	}

}
