package ydurgaSir;

abstract class Person
{
	String name;
	int age;
}
class Student extends Person
{
	int rollno;
	int marks;
	Student(String name,int age,int rollno,int marks)
	{
		this.name=name;
		this.age=age;
		this.rollno=rollno;
		this.marks=marks;
	}

}
class Teacher extends Person
{
	double salary;
	String sub;
	Teacher(String name,int age,double salary,String sub)
	{
		this.name=name;
		this.age=age;
		this.salary=salary;
		this.sub=sub;

	}
}


public class AbsStudent 
{
	public static void main(String[] args) 
	{
		Student s1=new Student("safikul", 22, 101, 87);
		System.out.println(s1.name+" ;"+s1.age+" ;"+s1.rollno+" ;"+s1.marks);

		Teacher t=new Teacher("vivek",40,50000.00,"java");
		System.out.println(t.name+" ,"+t.age+", "+t.salary+", "+t.sub);
	}


}
