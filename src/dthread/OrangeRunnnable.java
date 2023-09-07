package dthread;

public class OrangeRunnnable implements Runnable
{
	Fruits f=new Fruits();
	public void run()
	{
		f.saleOrange();
	}

}
