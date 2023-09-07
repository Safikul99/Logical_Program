package dthread;

public class MainLeter 
{
	public static void main(String[] args) 
	{
		Thread t1=new SamllThread();
		Thread t2=new CapitalTread();
		t1.run();
		t2.run();
//		t1.start();
//		t2.start();
		
		
	}

}
