package dthread;

public class MainNameRunnerable 
{
	public static void main(String[] args) throws InterruptedException 
	{
		Runnable r1=new NameRunnerable();
		Thread t1=new Thread(r1,"java");
		t1.start();
		
		Thread.sleep(3000);
		t1.suspend();
		Thread.sleep(3000);
		//t1.resume();
		
		
		
		
		
		
//		Thread t2=new Thread(r1,"python");
//		Thread t3=new Thread(r1,"golang");
//		
//		
//		t1.start();
//		try {
//			t1.join();
//		} catch (InterruptedException e) {
//			 System.out.println(e);
//	
//		}
//		t2.start();
//		try {
//			t2.join(5000);
//		} catch (InterruptedException e) {
//			 System.out.println(e);
//	
//		}
//		t3.start();
//		try {
//			t3.join(2000,2000);
//		} catch (InterruptedException e) {
//			 System.out.println(e);
//	
//		}
	
	}

}
