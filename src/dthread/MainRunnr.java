package dthread;

public class MainRunnr 
{
	public static void main(String[] args) 
	{
		Thread t=new Thread();
		System.out.println("Name:"+t.getName());
		System.out.println("Id:"+t.getId());
		System.out.println("Priority:"+t.getPriority());
		System.out.println();
		  
		
		t.setName("java");
		t.setPriority(10);
		System.out.println("Name:"+t.getName());
		System.out.println("Priority:"+t.getPriority());
		System.out.println();
		
		//t.setPriority(Thread.MAX_PRIORITY);
		//t.setPriority(Thread.MIN_PRIORITY);
		t.setPriority(Thread.NORM_PRIORITY);
		System.out.println("Priority:"+t.getPriority());
	}

}
