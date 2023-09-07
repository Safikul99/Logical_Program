package dSrime;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo5 
{

	public static void main(String[] args) {
		/*
		Comparator<String>	com=new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {

				return -o1.compareTo(o2);
			}
		};
		 */

		Comparator<String> com=(o1,o2)->
		{
			if(o1.compareTo(o2)>=0)
				return 1;
			else 
				return -1;
		};

		TreeSet<String> ts=new TreeSet<String>((o1,o2)->o1.compareTo(o2)>=0?1:-1);
		ts.add("Rama");
		ts.add("Shama");
		ts.add("Bhama");
		ts.add("Rama");
		System.out.println(ts);
	}



}
