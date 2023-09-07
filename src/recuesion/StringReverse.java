package recuesion;

public class StringReverse 
{
	public static void main(String[] args) 
	{
		
		String  res=reverse("safikul");
		System.out.println(res);
	}
	static String reverse(String st)
	{
		return reverse(0,st);
	}
	static String reverse(int in,String st)
	{
		if(in==st.length()-1)
			return st.charAt(in)+"";
		return reverse(in+1,st)+st.charAt(in); 
	}

}
