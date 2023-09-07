package link;

public class Tmove 
{
	public static void main(String[] args) 
	{
		tmove(3,'S','T','D');
		
	}
   static void tmove(int n,char src,char temp,char dst)
   {
	   if(n==1)
	   {
		   System.out.println(n+"move from"+src+"to"+dst);
		   return ;
	   }
	   tmove(n-1,src,dst,temp);
	   System.out.println(n+"move from "+src+"to"+dst);
	   tmove(n-1,temp,src,dst);
	   
   }
}
