package dthread;

public class OrangeThread extends Thread
{
	Fruits f=new Fruits();
	public void run()
	{
		f.saleOrange();
	}
	

	
}
