package fileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainRunner3 
{
	public static void main(String[] args) throws Exception
	{

		FileInputStream fin=new FileInputStream("D:\\safi\\smaple.text");
		FileOutputStream fout=new FileOutputStream("E:\\test.text");
		int b=0;
		while((b=fin.read())!=-1)
		{
			System.out.print((char)b);
			fout.write(b);	
			Thread.sleep(300);
		}
		System.out.println("\nSucessfully copid.....");





	}

}
