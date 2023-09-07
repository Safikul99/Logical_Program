package dSrime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo7 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer>l=new ArrayList<Integer>();
		l.add(2);
		l.add(5);
		l.add(7);
		l.add(4);
		System.out.println(l);
	//	List<Integer>l1=Arrays.asList(2,5,7,4,3);
		for(int i=0;i<l.size();i++)
		{
			int x=l.get(i);
			l.set(i,x*x);
		}
	   System.out.println(l);	
	}
}
