package practice;

public class Demo11 
{
	public static void main(String[] args) 

	{
		int size=5;
		int star=1;
		int space=size/2;
		for(int i=1;i<=size;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=star;k++)
			{
				if(k%2!=0)
					System.out.print("1 ");
				else
					System.out.print("@ ");
			}
			if(i<=size/2)
			{
				space--;
				star=star+2;
			}
			else
			{
				space++;
				star=star-2;
			}
			System.out.println();	
		}

	}

}
