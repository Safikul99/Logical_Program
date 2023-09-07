package doublelinklist;

public class DoublyLinkedList 
{
	class Node
	{
		Object data;
		Node next;
		Node preve;
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
			n.data=data;
			head=tail=n;
		}
		n.preve=tail;
		tail.next=n;
		tail=n;

	}
	public void display() 
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+"<=>");
			temp=temp.next;
		}


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
		head.preve=n;
		head=n;


	}
	public void add(Object data, int in) 
	{
		if(in==0)
		{
			addFirst(data);
			return ;
		}
		Node temp=head;
		while(in>1&&temp!=null)
		{
			in--;
			temp=temp.next;
		}
		if(temp==null)
		{
			System.out.println("index not in the range....");
		}
		else
		{
			Node n=new Node(data);
			n.next=temp.next;
			n.preve=temp;
			temp.next=n;
			if(n.next!=null)
			{
				n.next.preve=n;
			}
			else
				tail=n;
		}


	}
	public Object deleteFirst() {
		if(head==null)
			throw new UnsupportedOperationException("List is empty");
		Object data=head.data;
		head=head.next;
		if(head!=null)
			head.preve=null;
		else
			tail=null;
		return data;
	}

}


















