package dthread;
class MyThread extends Thread
 {
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("chiled thred");
		}
			
			
	}

 }
public class Demo 
{
	public static void main(String[] args) 
	{
		MyThread t=new MyThread();
		t.run();
		for(int i=0;i<10;i++)
		{
			System.out.println("main thred");
		}
		

	}

}
