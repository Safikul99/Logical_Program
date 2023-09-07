package dthread1;

public class AMain1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		Account1 ac=new Account1(12000);
		
		Thread t1=new Thread() {
			public void run()
			{
				ac.withdraw(5000);
			}
		};
		Thread t2=new Thread() {
			public void run()
			{
				ac.deposite(5000);
			}
		};
		Thread t3=new Thread() {
			public void run()
			{
				ac.deposite(5000);
			}
		};
		t1.start();
		Thread.sleep(20000);
		t2.start();
		Thread.sleep(20000);
		t3.start();
		
	}
	



}
