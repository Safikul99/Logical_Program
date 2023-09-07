package doublelinklist;

public class MainRunner 
{
    public static void main(String[] args) 
    {
    	DoublyLinkedList dl=new DoublyLinkedList();
    	dl.add(23);
    	dl.add(56);
    	dl.add(89);
    	dl.add(28);
    	dl.display();
    	dl.addFirst(35);
    	dl.display();
    	dl.add(39,2);
    	dl.display();
    	System.out.println(dl.deleteFirst());
    	System.out.println(dl.deleteFirst());
    	
		
	}

}
