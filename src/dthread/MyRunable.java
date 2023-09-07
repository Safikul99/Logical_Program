package dthread;

public class MyRunable implements Runnable{

	@Override
	public void run() 
	{
		System.out.println("running....");
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
		}
	
		
	}

}
