package dQueue;

public class MainLQueue 
{
	public static void main(String[] args) 
	{
		LQueue q=new LQueue();
		q.enQueue(23);
		q.enQueue(34);
		q.enQueue(56);
		q.enQueue(89);
		q.enQueue(99);
     	System.out.println("number of element in the queue:"+q.size());
     	q.display();
//		System.out.println(q.deQueue());
//		System.out.println(q.deQueue());
//		q.display();
//		System.out.println(q.deQueue());
//		System.out.println(q.deQueue());
//		q.display();
//		System.out.println(q.deQueue());
		
		
		
	}

}
