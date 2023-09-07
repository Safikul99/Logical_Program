package link;

public class LinkList 
{
	class Node
	{
		Object data;
		Node next;
		Node (Object data)
		{
			this.data=data;
		}
		
	}
	Node head;
	Node tail;
	public void add(Object data)
	{
		Node n=new Node(data);
		if(head==null)
		{
			head=tail=n;
			return ;
		}
		tail.next=n;
		tail=n;
	}





}
