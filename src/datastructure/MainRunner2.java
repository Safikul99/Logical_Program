package datastructure;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainRunner2 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Long>list= new ArrayList<Long>();
		System.out.println("Enter the long values to stop press 0");
		while(true)
		{
		 Long ele=sc.nextLong();
		 if(ele==0)
			 break;
		 list.add(ele);
		}
	System.out.println("sum of above values: "+veryBigSum(list));
		
	}
	static String veryBigSum(List<Long>values)
	{
		BigInteger sum=new BigInteger(values.get(0).toString());
		for (int i =1; i <values.size(); i++) 
		{
			BigInteger ele=new BigInteger(values.get(i).toString());
			sum=sum.add(ele);
		}
		return sum.toString();
		
		
	}


}
