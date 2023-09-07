package arrays;

public class Demo3 
{
	public static void main(String[] args) 
	{
		int []num= {3,5,7,1,9};
		count(num);
		
		
	}
	public static void count(int []n)
	{
		int []res=new int[n.length];
		for(int i=0;i<n.length;i++)
		{
			res[i]=n[i];
		}
		for(int j=0;j<res.length;j++)
		{
			System.out.print(res[j]+" ");
		}
		 System.out.println();
	}

}
