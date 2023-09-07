package day1String;

public class MainString1 
{
	public static void main(String[] args) {
		String s="jspider";
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(2));
		System.out.println(s.indexOf('j'));
		System.out.println(s.indexOf('s'));
		System.out.println(s.indexOf('z'));
		
		System.out.println(s.length());
		char ch[]=s.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
			System.out.println(i+" -->"+ch[i]);
			
		}
		
		char c[]= {'K','U','M','A','R','Y'};
		String s1=new String(c);//char to String
		System.out.println(s1);
		
		
	}

}
