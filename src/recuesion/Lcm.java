package recuesion;

public class Lcm 
{
	public static void main(String[] args) 
	{
		int res=lcm(15,25);
		System.out.println(res);

	}
	static int lcm(int m,int n)
	{
		if(m>n)
			return lcm(n,m,m);
		else
		return lcm(m,n,n);
	}
	static int lcm(int m,int n,int prod)
	{
		if(prod%m==0)
			return prod;
		return lcm(m,n,prod+n);
	}
}
