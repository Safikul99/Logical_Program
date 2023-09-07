package dstack;

public class Main2 
{

	public static void main(String[] args) 
	{
		LStack s=new LStack();
		s.push(23);
		s.push(85);
		s.push(90);
		s.push(98);
		s.push(97);
		System.out.println(s.pop());
		System.out.println(s.pop());
		s.display();
		System.out.println(s.peek());
		System.out.println(s.peek());
		s.display();
        System.out.println(s.search(23));
		s.push(83);
		s.display();
		System.out.println(s.size());
		
	}
	



}
