package dthread;

public class CapitalTread extends Thread
{
	public void run()
	{
		for(char ch='A';ch<='Z';ch++)
		{
			System.out.println(ch);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);

			}

		}
	}

}
