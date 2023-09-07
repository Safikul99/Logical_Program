package dQueue;

public class Queue 
{
	int front ,rear;
	int capacity;
	Object[] obj;
	Queue(int capacity)
	{
		this.capacity=capacity;
		obj=new Object[capacity];
		rear=front=-1;
		
	}
	public void enQueue(Object data)
	{
		if(rear==capacity-1)
		{
			System.out.println("Queue is full....");
			return ;
		}
		if(front==-1)
			front=0;
		obj[++rear]=data;
	}
	public int size()
	{
		return rear-front+1;
	}
	public void display()
	{
		if(front!=-1)
		{
			for(int i=front;i<=rear;i++)
			{
				System.out.print(obj[i]+" ");
			}
		}
		System.out.println("Queue is empty.....");
		System.out.println();
	}
   public Object deQueue()
   {
	   if(front==-1)
	   {
		   System.out.println("Queue is empty...");
		   return null;
	   }
	   Object data=obj[front++];
	   if(front>rear)
		   front=rear=-1;
	   return data;
   }
}
