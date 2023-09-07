package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MainRunner2 
{
	public static void main(String[] args) 
	{
		FileInputStream fin=null;
		try {
			fin=new FileInputStream("D:\\safi\\smaple.text"); // "src\\     \\MainRunner2.java"
			int b=0;
			while((b=fin.read())!=-1)
			{
				System.out.print((char)b);
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		finally {
			try {
				fin.close();
			} catch (IOException e) {
				System.out.println(e);
				
			}
			
		}
		
		

	}

}
//wjpt print the source code the output
//wjpt  copy the cantain to one fole to anaother file