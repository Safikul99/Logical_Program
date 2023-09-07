package dstack;

import java.util.Scanner;
import java.util.Stack;

public class Post 
{
	public static void main(String[] args) 
	{
		int	value=eve("abc*+d-");
		System.out.println(value);

	}

	static int eve(String str) 
	{
		Scanner sc=new Scanner(System.in);
		Stack<Integer> s=new Stack<Integer>();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(Character.isAlphabetic(ch))
			{
				System.out.println("Enter the value of"+ch);
				s.push(sc.nextInt());
			}
			else
			{
				int y=s.pop();
				int x=s.pop();
				switch(ch)
				{
				case '+':s.push(x+y);
				break;
				case '-':s.push(x-y);
				break;
				case '/':s.push(x/y);
				break;
				case '*':s.push(x*y);
				break;
				case '%':s.push(x%y);
				break;
				}
			}
		}


		return s.pop();
	}

}
