package fileHandling;

import java.io.File;

public class DisplayOnlyFile 
{
	public static void main(String[] args) 
	{
		int count=0;
		File f=new File("D:\\safi");
		String[] s=f.list();
		for(String s1:s)
		{
			File f1=new File(f,s1);
			if(f1.isFile())
				count++;
			System.out.println(s1);
		}
		System.out.println("The total number of File: "+count);
	}
}




