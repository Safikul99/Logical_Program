package day3String;

import java.util.Scanner;

public class Demo5 
{

	public static void main(String[] args) 
	{
		Scanner  sc=new Scanner(System.in);
		System.out.println("enter the Sentence");
		String str=sc.nextLine();
		String s=reverSen(str);
		System.out.println(s);

	}
	static String reverSen(String st)
	{

		char ch[]=st.toCharArray();
		String rs="";
		for (int i =ch.length-1; i>=0; i--) 
		{
			int l=i;
			while(i>=0&&ch[i]!=' ')
			{
				i--;
			}
			int f=i+1;
			while(f<=l)
			{
				rs=rs+ch[f];
				f++;
			}
			if(i>=0)
				rs=rs+ch[i];
		}
		return rs;

	}

}
//reverse the sentance 
//input:-rama is a good boy
//output:-boy good a is rama
//wajpt check two string are anangram are not
//wajpt check user enter  string is  anangram are not
//wajpt calculte the sum of number 23+5+60=
//wajpt cal  feq of each char given string
//wajpt cal fer of each Aplhabaet given string
