package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class DeserializableStudent 
{
	public static void main(String[] args) throws Exception 
	{
		FileInputStream fis=new FileInputStream("D:\\safi\\mystd");
		ObjectInputStream ois=new ObjectInputStream(fis);

		Student std=(Student) ois.readObject();
		System.out.println("Student id: "+std.getId());
		System.out.println("Student name: "+std.getName());
		System.out.println("Student Persentage: "+std.getPer());
		System.out.println("--------------------------------");


	}

}
