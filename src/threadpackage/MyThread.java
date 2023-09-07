package threadpackage;

public class MyThread  implements Runnable
{

	@Override
	public void run() 
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+" ");
			try
			{
				Thread.sleep(3000);
			}
			catch(Exception e)
			{
				
				
			}
			
		}
		
		
		
	}
	public static void main(String[] args) 
	{
		MyThread t1=new MyThread();
		Thread th=new Thread(t1);
		MyThread1 t2=new MyThread1();
		th.start();
		t2.start();
		
		
	}

}
