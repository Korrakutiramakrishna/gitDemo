package Programming;

import java.util.Scanner;

public class reverse 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number ");
		int n=s.nextInt();
		int sum=0 ;
		while(n!=0) {
			int rem=n%10;
			 sum=sum*10+rem;
			 n/=10;
		}
		System.out.println(sum);
		

	}

}
