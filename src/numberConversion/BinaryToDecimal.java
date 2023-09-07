package numberConversion;

public class BinaryToDecimal 
{
	public static void main(String[] args) 
	{
		int bin=627;
		int res=toDecimalConver(bin);
		System.out.println(res);
		
		
	}
    static int toDecimalConver(int n)
    {
    	
    	int dec=0,p=0;
    	while(n!=0)
    	{
    		int d=n%10;
    		dec=(int) (dec+d*Math.pow(8, p));
    		n=n/10;
    		p++;
    		
    	}
    	return dec;
    	
    }
}
