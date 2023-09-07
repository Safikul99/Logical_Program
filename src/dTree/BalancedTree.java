package dTree;

public class BalancedTree 
{
	class Node
	{
		int data;
		Node right;
		Node left;
		Node(int data)
		{
			this.data=data;
		}
	}
	Node root;
	public void add(int data) 
	{
		Node n=new Node(data);
		if(root==null)
		{
			root=n;
			return;
		}
		add(root,n);
	}
	public void add(Node rt, Node n) //8000,4000
	{
		if(n.data>rt.data)
		{
			if(rt.right!=null)
				add(rt.right,n);
			else
				rt.right=n;
		}
		else
		{
			if(rt.left!=null)
				add(rt.left,n);
			else
				rt.left=n;
		}
	}
	public void displayI() 
	{
		inorder(root);
	}

	public void displayPs() 
	{
		postorder(root);
	}

	public void displayPr() 
	{

		preorder(root);

	}
	private void inorder(Node rt) 
	{
		if(rt==null)
			return;
		inorder(rt.left);
		System.out.print(rt.data+" ");
		inorder(rt.right);
	}
	private void postorder(Node rt) 
	{
		if(rt==null)
			return;
		postorder(rt.left);
		postorder(rt.right);
		System.out.print(rt.data+" ");

	}
	private void preorder(Node rt) 
	{
		if(rt==null)
			return;
		System.out.print(rt.data+" ");
		preorder(rt.left);
		preorder(rt.right);


	}

}
