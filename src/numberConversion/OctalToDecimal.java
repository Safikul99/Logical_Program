package numberConversion;

public class OctalToDecimal 
{

	public static void main(String[] args) 
	{
		int oct=371;
		int res=toDecimalConver(oct);
		System.out.println(res);
	}
	static int toDecimalConver(int oct)
	{
		int dec=0,p=1;
		do
		{
			int d=oct%10;
			dec=dec+d*p;
			p=p*8;
			oct=oct/10;
		}while(oct!=0);
		return dec;

	}




}
