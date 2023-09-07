package dstack;

import java.util.Scanner;
import java.util.Stack;

public class Balaenc 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enrer the String:");
		String st=sc.next();
		boolean rs=isBlanche(st);
		if(rs)
			System.out.println("Stack balench");
		else
			System.out.println("Stack is not balench");
		
		
	}
  static  boolean isBlanche(String st)
  {
	  Stack<Character> s=new Stack<Character>();
	  for(int i=0;i<st.length();i++)
	  {
		  char ch=st.charAt(i);
		  if(ch=='{'||ch=='['||ch=='(')
			  s.push(ch);
		  else
		  {
			  if(s.isEmpty())
				  return false;
			  if(ch=='}')
				  if(s.pop()!='{')
					  return false;
				  else if(ch==']')
				  {
					  if(s.pop()!='[')
						  return false;
				  }
				  else if(ch==')')
				  {
					  if(s.pop()!=')')
						  return false;
				  }
			  
		  }
	  }
		return s.isEmpty(); 
		  
  }
}
