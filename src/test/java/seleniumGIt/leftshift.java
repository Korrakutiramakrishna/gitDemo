package seleniumGIt;

public class leftshift 
{
	public static void main(String[] args) 
	{
		int a[]= {2,1,4,5,6};
		int frist =a[0];
		for(int i=0;i<a.length-1;i++)
		{
			a[i]=a[i+1];
		}
		a[a.length-1]=frist;
		for(int i:a)
		{
			System.out.println(i);
		}
		
	}

}
