package arrays1;

public class MargeTwoArrayIndex 
{

	public static void main(String[] args) 
	{
		int []a= {25,56,78,82,92};
		int []b= {21,31,41,};
		int [] res=marge(a,b,2);
		for (int i = 0; i < res.length; i++) 
		{
			System.out.print(res[i]+" ");
			
		}


	}
	static int[] marge(int[] a, int[] b,int in) 
	{
		int c[]=new int [a.length+b.length];
		
		if(in<0||in>a.length)
		{
			System.out.println("index not in range:");
			return a;
		}
		for (int i=0; i< b.length; i++) 
		{
			c[in+i]=b[i];
		}
		for (int i=0; i< a.length; i++) 
		{
			if(i<in)
				c[i]=a[i];
			else
				c[i+b.length]=a[i];
		}
		
		return c;
	}




}
