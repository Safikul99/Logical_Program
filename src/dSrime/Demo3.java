package dSrime;

import java.util.Arrays;
import java.util.Comparator;

public class Demo3 
{


	public static void main(String[] args) 
	{
		Integer []arr= {23,45,67,89,13};
	
		Arrays.sort(arr,(o1,o2)-> -o1.compareTo(o2));
		
		System.out.println(Arrays.toString(arr));
		
		
	}

}
