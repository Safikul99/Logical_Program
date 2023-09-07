package dthread1;

public class AMain 
{
	public static void main(String[] args) 
	{
		Account ac=new Account(12000);
		
		Thread t1=new Thread() {
			public void run()
			{
				ac.upiTransction(5000);
			}
		};
		Thread t2=new Thread() {
			public void run()
			{
				ac.netBanking(5000);
			}
		};
		Thread t3=new Thread() {
			public void run()
			{
				ac.cardTransction(5000);
			}
		};
		t1.start();
		t2.start();
		t3.start();
		
	}
	

}
