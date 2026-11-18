package Programming;

public class bobblesort 
{
	public static void main(String[] args) 
	{
		int a[]= {10,20,4,8,7,8,9,4,5,8,};
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=a[j];
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{

			System.out.println(a[i]);
		}
	
	}
}