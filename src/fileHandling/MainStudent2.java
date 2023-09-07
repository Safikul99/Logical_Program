package fileHandling;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class MainStudent2 
{
	public static void main(String[] args) throws Exception 
	{
		Scanner sc=new Scanner(System.in);
		FileOutputStream fout=new FileOutputStream("D:\\safi\\mystd2");
		ObjectOutputStream out=new ObjectOutputStream(fout);

		ArrayList<Student> stds=new ArrayList<Student>();
		while(true)
		{

			System.out.println("Enter the id name and persentage: ");
			int id=sc.nextInt();
			String name=sc.next();
			double per=sc.nextDouble();
			Student std=new Student(id, name, per);
			stds.add(std);
			System.out.println("do you have more student (yes/no): ");
			String res=sc.next();
			if(res.equalsIgnoreCase("no"))
				break;

		}
		out.writeObject(stds);
		fout.flush();
		out.flush();
		out.close();
		fout.close();
		System.out.println("Sucessfully writen.....");
	}

}





