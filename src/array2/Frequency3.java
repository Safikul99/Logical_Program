package array2;

public class Frequency3 
{
	public static void main(String[] args) 
	{
		int []arr= {23,56,78,56,32,43,32,29,23,78};
		printFre(arr);
	}
	static void printFre(int[] arr)
	{
		int big=arr[0];
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]>big)
			{
				big=arr[i];
			}
		}
		int [] count=new int[big+1];
		for (int i = 0; i < arr.length; i++) 
		{
			count[arr[i]]++;
			
		}
		for (int i = 0; i <arr.length; i++) 
		{
			if(count[arr[i]]!=0)
			{
				System.out.println(arr[i]+"-->"+count[arr[i]]);
				count[arr[i]]=0;
			}
			
		}
	}

}
