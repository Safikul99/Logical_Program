package recuesion;

public class Palindrom 
{
	public static void main(String[] args) 
	{
		boolean rs=isPalindrom("madum");
		System.out.println(rs);
		 
	}
	static boolean isPalindrom(String st)
	{
		return isPalindrom(st,0,st.length()-1);
	}
	static boolean isPalindrom(String st,int f,int l)
	{
		if(f>=l)
			return true;
		if(st.charAt(f)!=st.charAt(l))
			return false;
		return isPalindrom(st,f+1,l-1);
	}

}
