package seleniumGIt;

public class missing 
{
	public static void main(String[] args)
	{
		int a[]= {1,2,4,5};
		int n=5;
		int esum=n*(n+1)/2;
		int asum =0;
	
		for(int i=0;i<a.length;i++)
		{
			asum=asum+a[i];
		}
		int	 total =esum-asum;
		System.out.println(total);
		System.out.println(asum);
		
	}

}
