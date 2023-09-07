package numberSystem1;

import java.util.Scanner;

public class Ascc 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int samll=(a<b&&a<c)?a:(b<c)?b:c;
		int big=(a>b&&a>c)?a:(b>c)?b:c;
		System.out.println(samll);
		System.out.println((a+b+c)-(samll+big));
		System.out.println(big);
		
	}

}
