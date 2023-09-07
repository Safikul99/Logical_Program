package ydurgaSir;

abstract class Person1
{
	String name;
	int age;
	Person1(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
}
class Student1 extends Person1
{
	int rollno;
	int marks;
	Student1(String name,int age,int rollno,int marks)
	{
		super(name,age);
		this.rollno=rollno;
		this.marks=marks;
	}
	
}
class Teacher1 extends Person1
{
	double salary;
	String sub;
	Teacher1(String name,int age,double salary,String sub)
	{
		super(name,age);
		this.salary=salary;
		this.sub=sub;
	}
}
public class AbsWithConstructor 
{
	public static void main(String[] args) 
	{
		Student1 s1=new Student1("safikul", 22, 101, 87);
		System.out.println(s1.name+" ;"+s1.age+" ;"+s1.rollno+" ;"+s1.marks);
		
		Teacher1 t=new Teacher1("vivek",40,50000.00,"java");
		System.out.println(t.name+" ,"+t.age+", "+t.salary+", "+t.sub);
	}
}
		
		
		


	
	
	

	


