package Programming;

public class countarray
{
	public static void main(String[] args)
	{
		int a[]= {10,20,4,8,7,8,9,4};
		 for(int i=0;i<=a.length-1;i++)
		 {
			 int count =0;
			 for(int j=0;j<=a.length-1;j++)
			 {
				 if(a[i]==a[j])
				 {
					 count++;
				 }
			 }
			 if(count>=1)
			 {
				 System.out.println("count+"+count +" "+a[i]);
			 }
		 }
		
	}
	

}
