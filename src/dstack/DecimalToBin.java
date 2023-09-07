package dstack;

import java.util.Stack;

public class DecimalToBin 
{
	public static void main(String[] args) 
	{
		System.out.println(decToBin(20));

	}
	static int decToBin(int n)
	{
		Stack<Integer> s=new Stack<Integer>();
		do {
			int b=n%2;
			s.push(b);
			n=n/2;
		}while(n!=0);
		int bin=0;
		while(s.isEmpty()==false)
		{
			bin=bin*10+s.pop();
		}
		return bin;
	}
}
