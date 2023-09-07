package arrays1;

public class Marge 
{
	public static void main(String[] args) 
	{
		int []a= {25,56,78,82,92};
		int []b= {21,31,41};
		int [] res=marge(a,b);
		for (int i = 0; i < res.length; i++) 
		{
			System.out.print(res[i]+" ");
			
		}


	}
	static int[] marge(int[] a, int[] b) 
	{
		int c[]=new int [a.length+b.length];
		int i=0,j=0,k=0;
		while(i<a.length&&j<b.length)
		{
			if(a[i]<b[j])
			{
				c[k]=a[i];
				k++;
				i++;
			}
			else
				c[k]=b[j];
			k++;
			j++;
		}
		while(i<a.length)
		{
			c[k]=a[i];
			k++;
			i++;
		}
		while(j<b.length)
		{
			c[k]=b[j];
			k++;
			j++;
		}
		return c;
	}


}
