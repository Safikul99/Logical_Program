package recuesion;

public class BinarySearch 
{
	public static void main(String[] args) 
	{
		int []ar= {10,15,25,38,56,98};
		int in=binary(ar,35);
		if(in==-1)
			System.out.println("element not present");
		else
			System.out.println("element is present");
		
	}
	static int binary(int []ar,int ele)
	{
		return binary(ar,ele,0,ar.length-1);
	}
    static int binary(int []x,int ele,int low,int hig)
    {
    	if(low>hig)
    		return -1;
    	int mid=(low+hig)/2;
    	if(x[mid]==ele)
    	return mid;
    	if(ele>x[mid])
    		return binary(x,ele,mid+1,hig);
    		else
    			return binary(x,ele,low,mid-1);
    }
}
