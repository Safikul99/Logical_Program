package array2;

import java.util.Iterator;

public class Demo1 
{
	public static void main(String[] args) {
		int []a= {1,2,3};
		int []b= {4,5,6,7};
		int [] x=maege(a,b);
		for (int i = 0; i < x.length; i++) 
		{
			System.out.print(x[i]+" ");
			
		}
		
		
	}
	public static int [] maege(int []a,int []b)
	{
		int c[]=new int[a.length+b.length];
		for (int i = 0; i < a.length; i++) 
		{
			c[i]=a[i];
			
		}
		for (int j = 0; j < b.length; j++) 
		{
			c[a.length+j]=b[j];
			
		}
		return c;
	}

}
