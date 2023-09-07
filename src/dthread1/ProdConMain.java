package dthread1;

public class ProdConMain 
{
	public static void main(String[] args) throws InterruptedException
	{
		ProducerandConsumer p=new ProducerandConsumer();
		Thread t1=new Thread(){
			public void run()
			{
				p.produce();
			}
		};
		Thread t2=new Thread(){
			public void run()
			{
				p.consume();
			}
		};
		t1.start();
		t1.join(5000);
		t2.start();
		
	}

}
