package arrays1;

public class RemoveDiplicate 
{

	public static void main(String[] args) 
	{
		int []arr= {23,56,78,56,32,43,32,29};
		int[] rs=removeDuplicate(arr);
		for (int i = 0; i < rs.length; i++) 
		{
			System.out.println(rs[i]);
		}
	}
	static int[] removeDuplicate(int [] arr)
	{
		int count=0;
		boolean b[]=new boolean[arr.length];
		for (int i = 0; i < arr.length; i++) 
		{
			if(b[i]==false)
			{
				for (int j =i+1; j < arr.length; j++) 
				{
					if(arr[i]==arr[j])
					{
						b[j]=true;
						count++;
					}
				}
			}
		}
		int [] br=new int[arr.length-count];
		int j=0;
		for (int i = 0; i < arr.length; i++) 
		{
			if(b[i]==false)
				br[j++]=arr[i];
		}
		return br;
	}
}











