package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class CountJavaFile 
{
	public static void main(String[] args) throws Exception 
	{
	
		File f=new File("C:\\Users\\user\\OneDrive\\Desktop\\new logical ragu\\Number_Conversion\\src\\array2D"); 
		Vector<InputStream> v=new Vector<InputStream>();
		
		String[] s=f.list();
		for(String s1:s)
		{
			if(s1.endsWith(".java"))
			{
				FileInputStream fin=new FileInputStream(f.getAbsolutePath()+"\\"+s1);
				System.out.println(f.getAbsolutePath()+"\\"+s1);
				v.add(fin);
			}
			

		}
		Enumeration<InputStream> en=v.elements();
		SequenceInputStream sin=new SequenceInputStream(en);
		
		FileOutputStream fout=new FileOutputStream("D:\\safi\\abc.text");
		int b=0;
		while((b=sin.read())!=-1)
			
		{
			System.out.print((char)b);
			fout.write(b);
		}
		fout.flush();
		fout.close();
		sin.close();
		
		

	}

}
