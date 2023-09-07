package day1String;

import java.util.Scanner;

public class Demo1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Sentence: ");
		String st=sc.nextLine();
		int vc=0,cc=0,dc=0,sp=0;
		for(int i=0;i<st.length();i++)
		{
		  char  ch=st.charAt(i);
		  if(ch>='A'&&ch<='Z')
		  {
			  if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
				 vc++;
			  else
				  cc++;
		  }
		  else if(ch>='a'&&ch<='z')
		  {
			  if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
					 vc++;
				  else
					  cc++;
			  
		  }
		  else if(ch>='0'&&ch<='9')
		  {
			 dc++; 
		  }
		  else
			  sp++;
		}
		System.out.println("Total Vowel :"+vc);
		System.out.println("Total Consencel :"+cc);
		System.out.println("Total Digit :"+dc);
		System.out.println("Total Digit :"+sp);
		
	}

}



