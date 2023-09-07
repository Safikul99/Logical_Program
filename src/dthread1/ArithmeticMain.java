package dthread1;

public class ArithmeticMain 
{
	public static void main(String[] args)
	{
		Arithmetic ari=new Arithmetic(20,30);
		Thread t1=new Thread() {
			public void run()
			{
				ari.addition();
			}
		};
		Thread t2=new Thread() {
			public void run()
			{
				ari.update();
			}
		};
		t1.start();
		t2.start();

	}

}
