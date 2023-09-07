package recuesion;

public class Search 
{
	public static void main(String[] args) 
	{
		int []ar= {25,28,38,18,15,24};
		int in=search(ar,39);
		if(in==-1)
			System.out.println("not present");
		else
			System.out.println("present :"+in);

	}
	static int search(int []ar,int ele)
	{
		return search(ar,ele,ar.length-1);
	}
	static int search(int []ar,int ele,int index)
	{
		if(index<0)
			return -1;
		if(ar[index]==ele)
			return index;
		return search(ar,ele,index-1);

	}
}
