package Programming;

public class reverseString 
{
	public static void main(String[] args)
	{
		String s1="ramakrishna";
//		String s2="";
//		for(int i=s1.length()-1;i>=0;i--)
//		{
//			s2=s2+s1.charAt(i);
//		}
//		System.out.println(s2);
		String s2=new StringBuilder(s1).reverse().toString();
		System.out.println(s2);
	
		

	}

}
