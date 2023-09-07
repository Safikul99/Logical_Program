package fileHandling;

import java.io.File;

public class CountFiles 
{
	public static void main(String[] args) 
	{
		int count=0;
		File f=new File("C:\\Users\\user\\OneDrive\\Desktop\\new logical ragu\\Number_Conversion\\src\\array2D");
		String[] s=f.list();
		for(String s1:s)
		{
			if(s1.endsWith(".java"))
			{
				count++;
				System.out.println(s1);
			}

		}
		System.out.println("The total number: "+count);
		//System.out.println(f.getParent());
		

	}

}


