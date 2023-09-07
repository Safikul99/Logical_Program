package numberConversion;

public class BinaryToDecimal2 
{

	public static void main(String[] args) 
	{
		int bin=1000;
		int res=toDecimalConver(bin);
		System.out.println(res);


	}
	static int toDecimalConver(int bin)
	{
		int dec=0,p=1;
		do
		{
			int d=bin%10;
			dec=dec+d*p;
			p=p*2;
			bin=bin/10;
		}while(bin!=0);
		return dec;

	}


}
