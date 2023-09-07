package dSrime;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo8 
{


	public static void main(String[] args) 
	{
		ArrayList<Integer>l=new ArrayList<Integer>();
		l.add(2);
		l.add(5);
		l.add(7);
		l.add(4);
		System.out.println(l);
		
//	  Function<Integer,Integer>f=new Function<Integer, Integer>() {
//		
//		@Override
//		public Integer apply(Integer x) {
//			
//			return x*x;
//		}
//	};
		Function<Integer,Integer>f=(x)->x*x;
		
	List<Integer>l1=l.stream().map(x->x*x).collect(Collectors.toList());
	System.out.println(l1);
	
	}


}
