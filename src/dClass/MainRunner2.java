package dClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import dClass.MainRunner1.DescComparator;

public class MainRunner2 
{
	
	public static void main(String[] args) 
	{
		class DescComparator implements Comparator<Integer>
		{
			static int a=10;
			int b=20;
			@Override
			public int compare(Integer o1, Integer o2) {
				
				return -o1.compareTo(o2);
			}
			
		}
		System.out.println(DescComparator.a);
		System.out.println(new MainRunner1().new DescComparator().b);
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(35);
		l.add(48);
		l.add(23);
		l.add(49);
		l.add(28);
		Comparator<Integer> mycom= new MainRunner1().new DescComparator();
		Collections.sort(l,mycom);
		System.out.println(l);
		
	}
	
}
