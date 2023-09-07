package dClass;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class MainRunner4 
{
	public static void main(String[] args) 
	{
	Comparator<String> com=new Comparator<String>() {

		@Override
		public int compare(String o1, String o2) {
			if(o1.compareTo(o2)>=0)
				return 1;
			else
			return -1;
		}
		
	};
			
	
		TreeSet<String> t=new TreeSet<String>(com);
		t.add("Ramesh");
		t.add("Rajesh");
		t.add("Lokesh");
		t.add("Rajesh");
		t.add("Mahesh");
		for (String name : t) 
		{
			System.out.println(name);
		}
	}
	

}
