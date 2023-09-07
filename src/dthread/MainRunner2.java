package dthread;

public class MainRunner2 
{
	public static void main(String[] args) 
	{
	     Runnable r=new MyRunable();
		Thread t=new Thread(r);
		System.out.println(t.getName());
		
		Thread t2=new Thread(r,"safikul");
		System.out.println(t2.getName());
		t.run();
		
		
		
		
	}

}
