package mixNumber;

import java.util.Scanner;

public class XylemANDPhloem 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		String st=checkXP(n);
		System.out.println(n+" is a "+st);

	}
	static String checkXP(int x)
	{
		int es=0,ms=0,t=x;
		do {
			int d=x%10;
			if(t==x||x==d)
				es=es+d;
			else
				ms=ms+d;
			x=x/10;
		}while(x!=0);
		if(ms==es)
			return "xylem";
		else
			return "phloem";
	}
}
