package dSrime;

import java.util.Comparator;
import java.util.TreeSet;

public class MainStudent 
{
	static void update(Student std)
	{
		std.setsMarkes(std.getsMarkes()+5.0);
	}
	public static void main(String[] args) 
	{
		Comparator<Student> comper=(s1,s2)-> -s1.getsMarkes().compareTo(s2.getsMarkes());
			
			
		
		
		TreeSet<Student> ts=new TreeSet<Student>(comper);
		ts.add(new Student(123,"ramesh",67.89));
		ts.add(new Student(124,"rajesh",57.93));
		ts.add(new Student(123,"rakesh",97.85));
		ts.add(new Student(123,"raveesh",57.32));
		ts.add(new Student(123,"ropesh",77.89));
		
		ts.forEach(MainStudent::update);
		ts.forEach(System.out::println);
	}
	
	
	

}
