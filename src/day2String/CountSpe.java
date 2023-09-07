package day2String;

import java.util.Scanner;

public class CountSpe 
{
	public static void main(String[] args) 
	{
		Scanner  sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=sc.nextLine();
		int res=countSp(str);
		System.out.println(res);

	}
	static int countSp(String st)
	{
		int count=0;
		for (int i = 0; i <st.length(); i++) 
		{
			char ch=st.charAt(i);
			if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z' ||ch>='0'&&ch<='9')
			{
				
			}
			else
				count++;
		}
		return count++;
	}

}
