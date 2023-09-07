package day1String;

import java.util.Scanner;

public class ReadFindCSDS 
{
	public static void main(String[] args) 
	{
		Scanner  sc=new Scanner(System.in);
	 System.out.println("enter the Sentence");
	 String str=sc.nextLine();
	  int uc=0,lc=0,dc=0,spc=0;
	  for (int i = 0; i < str.length(); i++) 
	  {
		  char ch=str.charAt(i);
		  if(ch>='A'&&ch<='Z')
			  uc++;
		  else if(ch>='a'&&ch<='z')
			  lc++;
		  else if(ch>='0'&&ch<='9') 
			  dc++;
		  else
			  spc++;
		  
		
	  }
	  System.out.println("Number of capatial leter "+uc);
	  System.out.println("Number of small leter "+lc);
	  System.out.println("Number of digit number "+dc); 
	  System.out.println("Number of specis number "+spc);
		
	}

}
