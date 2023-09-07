package dthread;

public class SamllThread extends Thread
{
	public void run()
	{
		for(char ch='a';ch<='z';ch++)
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
