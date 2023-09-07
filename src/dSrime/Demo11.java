package dSrime;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo11 
{
	public static void main(String[] args) 
	{

		ArrayList<Integer>l=new ArrayList<Integer>();
		l.add(2);
		l.add(5);
		l.add(7);
		l.add(4);
		System.out.println(l);


		int c=l.stream().filter(x->x%2==0).collect(Collectors.toList()).size();
		long c1=l.stream().filter(x->x%2==0).count();

		System.out.println(c);
		System.out.println(c1);


		
	}

}
