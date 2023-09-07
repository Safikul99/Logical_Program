package dQueue;

public class MainQueue 
{
	public static void main(String[] args) 
	{
		Queue q=new Queue(5);
		q.enQueue(23);
		q.enQueue(34);
		q.enQueue(56);
		q.enQueue(89);
		q.enQueue(99);
		q.display();
//		System.out.println("number of element in the queue:"+q.size());
//		q.display();
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		q.display();
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		q.display();
		
		
		
	}

}
