package array2;

public class Frequency1 
{

	public static void main(String[] args) 
	{
		int []arr= {1,2,3,2,1,2,4,3};
		coutnFre(arr);
		
	}
	static void coutnFre(int [] arr)
	{
		boolean b[]=new boolean[arr.length];
		for (int i = 0; i < arr.length; i++) 
		{
			if(b[i]==false)
			{
				int count=1;
				for (int j =i+1; j < arr.length; j++) 
				{
					if(arr[i]==arr[j])
					{
						count++;
						b[j]=true;
					}
					
				}
				System.out.println(arr[i]+" -->"+count);
				}
						
		}
	}



}
