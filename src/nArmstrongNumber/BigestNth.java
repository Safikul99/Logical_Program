package nArmstrongNumber;

public class BigestNth 
{
	public static void main(String[] args) 
	{
		int []n= {56,28,78,23,48,44};
		int res=nThrargest(n,4);
		System.out.println(res);

	}
	static int nThrargest(int[]n,int x)
	{
		for (int i = 0;  i< n.length; i++)
		{
			int count=0;
			for (int j = 0; j < n.length; j++) 
			{
				if(n[j]>n[i])
					count++;


			}
			if(count==x-1)
				return n[i];


		} 
		return 0;
	}

}
