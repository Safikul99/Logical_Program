package fileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class MainStudent 
{
	public static void main(String[] args) throws Exception 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id name and persentage: ");
		int id=sc.nextInt();
		String name=sc.next();
		double per=sc.nextDouble();
		Student std=new Student(id, name, per);
		System.out.println("ID: "+std.getId());
		System.out.println("Name: "+std.getName());
		System.out.println("Persentage: "+std.getPer());
		
		FileOutputStream fout=new FileOutputStream("D:\\safi\\mystd");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		out.writeObject(std);
		fout.flush();
		out.flush();
		out.close();
		System.out.println("Sucessfully writen.....");
	}
	
}
		
		
		
		

		
