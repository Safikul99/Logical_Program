package fileHandling;

import java.io.File;
import java.io.IOException;

public class Demo1 
{
	public static void main(String[] args) 
	{
		File f=new File("D:\\safi","File3.text");
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		f.mkdir();
		
		
	}

}
