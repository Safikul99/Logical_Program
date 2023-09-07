package dthread1;

public class Annno 
{
	public static void main(String[] args) 
	{
		Object o1=new Object() {
			public String toString()
			{
				return "i am object1";
			}

		};
		System.out.println(o1);

		Object o2=new Object() {
			public String toString()
			{
				return "i am object2";
			}

		};
		System.out.println(o2);

	}

}
