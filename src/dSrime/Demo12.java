package dSrime;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Demo12 
{
	public static void main(String[] args) 
	{

		ArrayList<Integer>l=new ArrayList<Integer>();
		l.add(2);
		l.add(5);
		l.add(7);
		l.add(4);
		System.out.println(l);


		int sum=l.stream()
				.reduce(0, (a,b)->a+b);

		System.out.println(sum);


		
	}



}
