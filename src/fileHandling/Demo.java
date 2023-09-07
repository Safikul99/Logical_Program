package fileHandling;

import java.io.File;

public class Demo 
{
	public static void main(String[] args) 
	{
		int count=0;
		File f=new File("C:\\Users\\user\\OneDrive\\Desktop\\new logical ragu\\Number_Conversion\\src\\array2D");
		String[] s=f.list();
		for(String s1:s)
		{
			count++;
			System.out.println(s1);
		}
		System.out.println("The total number: "+count);
		
		
		
	}

}
 