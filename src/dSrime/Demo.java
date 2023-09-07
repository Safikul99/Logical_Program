package dSrime;

import java.util.Arrays;
import java.util.Comparator;

public class Demo 
{
	public static void main(String[] args) 
	{
		Integer []arr= {23,45,67,89,13};
		//System.out.println(arr.getClass().getName());
		Comparator<Integer> mycom=new Comparator<Integer>()
		{

			@Override
			public int compare(Integer o1, Integer o2) 
			{
		
				return -o1.compareTo(o2);
			}
			
		};
		
		//Arrays.sort(arr,mycom);
		
		System.out.println(Arrays.toString(arr));
		
		
	}

}
//Comparator<Integer> mycom=(o1,o2) -> -o1.compareTo(o2);