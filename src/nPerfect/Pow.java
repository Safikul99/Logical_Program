package nPerfect;

public class Pow 
{
	public static void main(String[] args) 
	{
		int p1=pow(5,4);
		System.out.println(p1);
		int p2=pow(5,0);
		System.out.println(p2);
		int p3=pow(4,2);
		System.out.println(p3);
		
	}

	static int pow(int n,int p)
	{
		int prod=1;
		while(p>0)
		{
			prod=prod*n;
			p--;
		}
		return prod;
	}
}
