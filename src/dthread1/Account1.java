package dthread1;

public class Account1 
{
	int bal;

	public Account1(int bal) {
		this.bal = bal;
	}
	synchronized void withdraw(int amt)
	{
		if(amt>bal)
		{
			System.out.println("low balanec...");
			try {
				wait();
			} catch (InterruptedException e) {

				//e.printStackTrace();
				withdraw(amt);
				return;
			}
			bal=bal-amt;
			System.out.println(amt+"sucessfully withdrawn...");
			System.out.println("avaiable balance:"+bal);
		}
	}
	synchronized void deposite(int amt) 
	{
		bal=bal+amt;
		System.out.println(amt+" sucessfully deposite ...");
		System.out.println("avaiable balance:"+bal);
		notify();
	}

}
