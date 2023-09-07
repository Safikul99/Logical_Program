package dTree;

public class MainTree 
{
	public static void main(String[] args) 
	{
		BalancedTree t=new BalancedTree();
		t.add(23);
		t.add(56);
		t.add(18);
//		t.add(35);
//		t.add(15);
		t.displayI();
		System.out.println();
		t.displayPs();
		System.out.println();
		t.displayPr();
		
	}

}
