package fileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainRunner 
{
	public static void main(String[] args)
	{
		String str="java is an ObjectOrienate langauge";
		FileOutputStream fort=null;
		try {
			fort=new FileOutputStream("D:\\safi\\smaple.text");
			byte[]	b=str.getBytes();
			fort.write(b);  //fort.write(b,0,5);fort.write(b,start index,ends index); (or) write(b)
			fort.flush();
			System.out.println("Sucessfully writen....");
		} catch (FileNotFoundException e) {
			System.out.println(e);

		} catch (IOException e) {
			System.out.println(e);

		}
		finally 
		{
			try {
				fort.close();
			} catch (IOException e) {

				System.out.println(e);
			}

		}
		System.out.println("Thank you...");


	}

}
