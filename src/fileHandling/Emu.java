package fileHandling;

import java.util.Enumeration;
import java.util.Vector;

public class Emu 
{
	public static void main(String[] args) 
	{
		Vector v=new Vector<>();
		v.add("ramesh");
		v.add("sumesh");
		v.add("ramkesh");
		v.add("damesh");
		System.out.println(v);
		
		Enumeration en=v.elements();
		
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
		
	}

}
