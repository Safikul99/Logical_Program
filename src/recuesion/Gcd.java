package recuesion;

public class Gcd 
{
	public static void main(String[] args) 
	{
		int res=gcd(12,8);
		System.out.println(res);		
	}
	static int gcd(int m,int n)
	{
		if(m>n)
			return gcd(n,m);
		if(n%m==0)
			return m;
		return gcd(n%m,m);			
	}


}
