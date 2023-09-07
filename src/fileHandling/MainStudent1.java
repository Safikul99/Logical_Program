package fileHandling;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class MainStudent1 
{
	public static void main(String[] args) throws Exception 
	{
		Student std=new Student(101,"safikul",76.35);
		Student std1=new Student(102,"juned",86.21);

		System.out.println("First Student info....");
		System.out.println("ID: "+std.getId());
		System.out.println("Name: "+std.getName());
		System.out.println("Persentage: "+std.getPer());

		System.out.println("Second Student info....");
		System.out.println("ID: "+std.getId());
		System.out.println("Name: "+std.getName());
		System.out.println("Persentage: "+std.getPer());


		FileOutputStream fout=new FileOutputStream("D:\\safi\\mystd1");
		ObjectOutputStream out=new ObjectOutputStream(fout);

		ArrayList<Student> stds=new ArrayList<Student>(2);
		stds.add(std);
		stds.add(std1);


		out.writeObject(stds);
		fout.flush();
		out.flush();
		out.close();
		System.out.println("Sucessfully writen.....");
	}


}
