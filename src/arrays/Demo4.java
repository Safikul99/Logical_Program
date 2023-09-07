package arrays;

public class Demo4 
{
	public static void main(String[] args) 
	{
		int num[]= {2,5,3,7,9,4,8};
		System.out.println(countEven(num));
				
	}
	public static int countEven(int []n)
	{
		int count=0;
		for(int i=0;i<n.length;i++)
		{
			if(n[i]%2==0)
				count++;

		}
	  return count ;	
	}
}
