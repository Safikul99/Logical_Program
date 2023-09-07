package day2String;

public class LowercaseAll 
{
	public static void main(String[] args)
	{
		String st=tolower("Raghu");
		System.out.println(st);

	}
	static String tolower(String str)
	{
		char ch[]=str.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
           if(ch[i]>='A' &&ch[i]<='Z')
           {
        	  ch[i]=(char)(ch[i]+32); 
           }

		}
		return new String(ch);//st=new String(ch)
	}                        //return st;
}
