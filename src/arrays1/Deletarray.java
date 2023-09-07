package arrays1;

public class Deletarray 
{
	public static void main(String[] args) 
	{
		int[] ar= {23,45,56,78,32,85};
		int[] d=deletArr(ar,6);
		for (int i = 0; i < d.length; i++) {
			System.out.print(d[i]+" ");
			
		}
		
	}
	static int[] deletArr(int []arr,int in)
	{
		if(in<0||in>arr.length)
		{
			System.out.println("index in not in range:");
			return arr;
		}
		int [] br=new int[arr.length-1];
		for(int i=0;i<br.length;i++)
		{
			if(i<in)
			br[i]=arr[i];
			else
				br[i]=arr[i+1];
		}
		return br;
	}

}
