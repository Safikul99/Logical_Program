package dthread1;

import java.util.ArrayList;

public class ProducerandConsumer 
{
	ArrayList<String>proudcts=new ArrayList<String>();
	int capacity=5;
	synchronized void produce()
	{
		int i=1;
		while(true)
		{
			String prod="Product"+i++;
			System.out.println("produced product is : "+prod);
			proudcts.add(prod);
			try {
				Thread.sleep(500);
				notify();
				if(proudcts.size()==capacity)
					wait();

			}catch (Exception e) {

			}
		}
	}
	synchronized void consume()
	{ 
		while(true)
		{
			try {
				if(proudcts.size()==0)
				{
					notify();
					wait();
				}
				String prod=proudcts.remove(0);
				Thread.sleep(500);
				System.out.println("consumeds product is : "+prod);
				

			} catch (Exception e) {

			}
		}


	}

}
