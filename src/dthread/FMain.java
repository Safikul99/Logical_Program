package dthread;

public class FMain
{
	public static void main(String[] args) 
	{
		System.out.println("main method started");
		
		Runnable ar=new AppleRunnable();
		Thread t1=new Thread(ar);
		t1.start();

		Runnable or=new OrangeRunnnable();
		Thread t2=new Thread(or);
		t2.start();
		System.out.println("main method end");

	}

}
/*Thread t1=new AppleThread();
t1.start();

Thread t2=new OrangeThread();
t2.start();*/