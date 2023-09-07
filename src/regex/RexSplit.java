package regex;

import java.util.regex.Pattern;

public class RexSplit 
{
	public static void main(String[] args) 
	{
		String p="www safikul com";
		String[]s=p.split("\\s");
		
		for (String string : s) 
		{
			System.out.println(string);
			
		}
		
	}
	
}
 