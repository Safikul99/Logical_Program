package datastructure;

import java.math.BigInteger;
import java.util.List;
import java.util.Scanner;

public class MainRunner1 
{
	public static void main(String[] args) 
	{
	
		 String sum=veryBigSum(null);
		 System.out.println(sum);
		
	}
	static String veryBigSum(List<Long>values)
	{
		Long a=Long.MAX_VALUE;
		Long b=Long.MAX_VALUE;
		String s1=a.toString();
		String s2=b.toString();
		
		BigInteger ba=new BigInteger(s1);
		BigInteger bb=new BigInteger(s2);
		
		BigInteger sum=ba.add(bb);
		return sum.toString();
		//return new BigInteger((a.toString()).add(new BigInteger(b.toString())).toString();
				
		
		
	}
}
