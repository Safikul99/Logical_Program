package dthread1;

public class Arithmetic 
{
	int a;
	int b;
	public Arithmetic(int a, int b) {
		this.a = a;
		this.b = b;
	}

 synchronized void addition()
	{
		System.out.println("first value"+a);
		System.out.println("first value"+b);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e);

		}
		System.out.println("sum is: "+(a+b));
	}

	void update()
	{
		a=a+10;
		b=b-5;
	}

}
