package link;

public class SinglyLinkedList 
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
	public void addFirst(Object data) 
	{
		Node n=new Node(data);
		if(head==null)
		{
			head=tail=n;
			return ;
		}
		n.next=head;
		head=n;


	}
	public void display() {
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data+" ->");
			temp=temp.next;
		}

	}
	public Object deleteFirst() {
		if(head==null)
			throw new UnsupportedOperationException("List is empty");
		Object data=head.data;
		head=head.next;
		if(head==null)
			tail=null;
		return data;
	}
	public Object deleteLast() {
		if(head==null)
			throw new UnsupportedOperationException("List is empty");
		Object data=tail.data;
		Node temp=head;
		Node prev=null;
		while(temp.next!=null)
		{
			prev=temp;
			temp=temp.next;
		}
		tail=prev;
		if(prev!=null)
			prev.next=null;
		//			else
		//				heda=null
		return data;
	}
	public void add(Object data, int in)
	{
		if(in==0)
		{
			addFirst(data);
			return ;

		}
		Node temp=head;
		while(temp!=null&&in>1)
		{
			temp=temp.next;
			in--;

		}
		if(temp!=null)
		{
			Node n=new Node(data);
			n.next=temp.next;
			temp.next=n;
			if(n.next==null)
				tail=n;
		}
		else {
			System.out.println("index not in the range:");
		}
	}
	public Object delete(int in) 
	{
		if(in==0)
			return deleteFirst();
		Node temp=head;
		Node prev=null;
		while(temp!=null&&in>0)
		{
			prev=temp;
			in--;
			temp=temp.next;
		}
		if(temp!=null)
		{
			prev.next=temp.next;
			if(temp.next==null)
				tail=prev;
			return temp.data;
		}
		else
		{
			System.out.println("index not in the range");
			return null;
		}
			

		
	}
	public void printReverse() 
	{
		reverse(head);
		
		
	}
	private void reverse(Node start)
	{
		if(start.next!=null)
			reverse(start.next);
		System.out.print(start.data+" <-");
			
	}


}





















