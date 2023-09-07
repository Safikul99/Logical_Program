package arrays1;

public class FirstBigAndSecBig 
{
	public static void main(String[] args) 
	{
		int []arr= {23,45,67,35,67,42,48};
		int fbig=Integer.MIN_VALUE;
		int sbig=Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]>fbig)
			{
				sbig=fbig;
				fbig=arr[i];
				
			}if(arr[i]>sbig&&arr[i]!=fbig)
			{
				sbig=arr[i];
			}
			
		}
		System.out.println("First Bigest is :"+fbig);
		System.out.println("Second Bigest is :"+sbig);
		
	}

}
