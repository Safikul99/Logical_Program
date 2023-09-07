package dstack;
//implementation of stack by using array
public class Stack 
{
	private Object[] obj;
	private int capacity;
	private int top;

	public Stack(int capacity) 
	{
		this.capacity=capacity;
		top=-1;
		obj=new Object[capacity];
	}

	public void push(Object data) 
	{
		if(top==capacity-1)
		{
			System.out.println("stack overflow..");
			return;
		}
		obj[++top]=data;
	}

	public Object pop() {
		if(top==-1)
		{
			System.out.println("stack underflow...");
			return null;
		}
		return obj[top--];

	}
	public void display() 
	{
		for(int i=0;i<=top;i++)
		{
			System.out.println(obj[i]+" ");
		}
		System.out.println();
	}
	public Object peek() 
	{
		if(top==-1)
		{
			System.out.println("stack underflow....");
			return null;
		}

		return obj[top];
	}

	public int search(Object data) 
	{
		for(int i=top;i>=0;i--)
		{
			if(obj[i]==data)
				return top-i+1;
		}

		return 0;
	}

	public int size() {

		return top+1;
	}









}
