package fileHandling;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class DeserializableStudent1 
{
	public static void main(String[] args) throws Exception 
	{
		FileInputStream fis=new FileInputStream("D:\\safi\\mystd1");
		ObjectInputStream ois=new ObjectInputStream(fis);

		ArrayList<Student> sts=(ArrayList<Student>) ois.readObject();
		
		for (Student std: sts) 
		{
			
			System.out.println("Student id: "+std.getId());
			System.out.println("Student name: "+std.getName());
			System.out.println("Student Persentage: "+std.getPer());
			System.out.println("--------------------------------");
			
		}


	}

}
