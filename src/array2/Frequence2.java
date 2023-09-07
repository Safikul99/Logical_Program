package array2;

public class Frequence2 
{

	public static void main(String[] args) 
	{
		int []arr= {1,2,3,2,1,2,4,3};
		coutnFre(arr);
		
	}
	static void coutnFre(int [] arr)
	{
		int n=arr.length;
		for (int i = 0; i < n; i++) 
		{
			if(arr[i]!=-1)
			{
				int count=1;
				for (int j =i+1; j < n; j++) 
				{
					if(arr[i]==arr[j])
					{
						count++;
						arr[j]=arr[n-1];
						n--;
						j--;
					}
					
				}
				System.out.println(arr[i]+" -->"+count);

				
			}
						
		}
	}



}
