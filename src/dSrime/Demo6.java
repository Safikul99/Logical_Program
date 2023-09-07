package dSrime;

import java.util.TreeSet;

public class Demo6 
{
	public static void main(String[] args) 
	{
		TreeSet<String> ts=new TreeSet<String>((o1,o2)->o1.compareTo(o2)>=0?1:-1);
		ts.add("Rama");
		ts.add("Shama");
		ts.add("Bhama");
		ts.add("Rama");
		System.out.println(ts);
	}

}
