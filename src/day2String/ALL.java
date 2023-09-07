package day2String;

import java.util.Scanner;

public class ALL 
{

	public static void main(String[] args) 
	{
		Scanner  sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=sc.nextLine();
		countSp(str);


	}
	static void countSp(String st)
	{
		int cap=0,smal=0,dig=0,spe=0,vow=0,con=0;
		for (int i = 0; i <st.length(); i++) 
		{
			char ch=st.charAt(i);
			if(ch>='A'&&ch<='Z')
			{
				cap++;
				if(ch=='A'||ch=='E'|| ch== 'I'||ch== 'O'||ch=='U')
					vow++;
				else
					con++;
			}

			else  if(ch>='a' &&ch<='z')
			{
				smal++;
				if(ch=='a'||ch=='e'|| ch== 'i'||ch== 'o'||ch=='u')
					vow++;
				else
					con++; 
			}

			else if(ch>='0'&&ch<='9')
			{
				dig++;
			}
			else
				spe++;
		}
		System.out.println("Consonant: "+con);
		System.out.println("Vowles: "+vow);
		System.out.println("Digits: "+dig);
		System.out.println("Special: "+spe);
		System.out.println("capital: "+cap);
		System.out.println("small: "+smal);
	}



}
