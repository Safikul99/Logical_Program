package dthread1;

public class Account 
{
	int bal;

	public Account(int bal) {
		this.bal = bal;

	}

	synchronized	void upiTransction( int amt)
	{
		if(amt<=bal)
		{
			System.out.println("transcted successfull..");
			bal=bal-amt;
		}
		else
		{
			System.out.println("transcetion faild..");
		}
	}
	synchronized void netBanking(int amt)
	{
		if(amt<=bal)
		{
			System.out.println("transcted successfull..");
			bal=bal-amt;
		}
		else
		{
			System.out.println("transcetion faild..");
		}

	}

	synchronized void cardTransction(int amt)
	{

		if(amt<=bal)
		{
			System.out.println("transcted successfull..");
			bal=bal-amt;
		}
		else
		{
			System.out.println("transcetion faild..");
		}
	}


}
