package dQueue;

public class LQueue 
{
	class Node
	{
		Object data;
		Node next;
		Node(Object data)
		{
			this.data=data;

		}
	}
	Node front;
	Node rear;
	int size=0;
	void enQueue(Object data)
	{
		Node n=new Node(data);
		if(front==null)
		{
			front=rear=n;

		}
		else
		{
			rear.next=n;
			rear=n;
		}
		size++;
	}
	public Object deQueue()
	{
		if(front==null)
		{
			System.out.println("Queue is Empty...");
			return null;
		}
		Object data=front.data;
		front=front.next;
		if(front==null)
			rear=null;
		size--;
		return data;
	}
	public int size()
	{
		return size;
	}
	public void display()
	{
		Node temp=front;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
}
