package dSrime;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo10 
{
   public static void main(String[] args) 
   {

		ArrayList<Integer>l=new ArrayList<Integer>();
		l.add(2);
		l.add(5);
		l.add(7);
		l.add(4);
		System.out.println(l);


		List<Integer>evenList=l.stream().sorted((o1,o2)->-o1.compareTo(o2)).collect(Collectors.toList());

		System.out.println(evenList);
	
}



}
