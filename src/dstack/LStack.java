package dstack;

public class LStack 
{
	class Node
	{
		Object data;
		Node prev;
		Node(Object data)
		{
			this.data=data;
		}
	}
	Node top;
	int size;

	public void push(Object data) 
	{
		Node n=new Node(data);
		if(top==null)
		{
			top=n;
		}
		else {
			n.prev=top;
			top=n;
		}
		size++;
	}

	public Object pop() 
	{
		if(top==null)
		{
			System.out.println("stack unsdrFlow....");
			return null;
		}
		Object data=top.data;
		top=top.prev;
		size--;
		return data;

	}

	public Object peek() {
		if(top==null)
		{
			System.out.println("stack underflow..");
			return null;
		}
		return top.data;
		
	}

	public void display() {
		print(top);
		
	}

	private void print(Node start) 
	{
		if(start==null)
			return;
		print(start.prev);
		System.out.print(start.data+" ");
		
		
	}

	public int size() {
		
		return  size;
	}

	public int search(Object data) {
		Node temp=top;
		int i=0;
		while(temp!=null)
		{
			i++;
			if(temp.data==data)
			{
				return i;
			}
			temp=temp.prev;
		}
		return 0;
	}


}
