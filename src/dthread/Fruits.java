package dthread;

public class Fruits 
{  
	void saleApple()
	{
		for (int i = 0; i <=10; i++) 
		{
			System.out.println(i+" Apple");
			if(i==5)
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) 
			{

					System.out.println(e);
			}

		}
	}
	void saleOrange()
	{
		for (int i = 0; i <=10; i++) 
		{
			System.out.println(i+" Orange");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) 
			{

				System.out.println(e);
			}

		}
	}


}
