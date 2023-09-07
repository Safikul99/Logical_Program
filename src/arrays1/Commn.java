package arrays1;

public class Commn 
{
	public static void main(String[] args) 
	{
		int []a= {23,48,59,32,45,78};
		int []b= {49,45,78,67,23,96,34};
		int [] res=comm(a,b);
		for (int i = 0; i < res.length; i++) 
		{
			System.out.print(res[i]+" ");
			
		}


	}
	static int[] comm(int []a,int []b)
	{
		int[] c=new int[a.length];
		int k=0;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < b.length; j++) 
			{
				if(a[i]==b[j])
				{
					c[k]=a[i];
					k++;
					break;
				}
				
				
			}
			
		}
		int[] d=new int[k];
		for (int i = 0; i <k; i++) 
		{
			d[i]=c[i];
			
			
		}
		return d;
	}

}
