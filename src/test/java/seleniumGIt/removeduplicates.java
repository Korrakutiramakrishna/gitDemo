package seleniumGIt;

public class removeduplicates 
{
	public static void main(String[] args)
	{
		String word="aabbcdde";
		char[] s2=word.toCharArray();
		System.out.println(s2);
		for(int i=0;i<s2.length;i++)
		{
			int count=0;
			for(int j=0;j<s2.length;j++) {
				if(s2[i]==s2[j])
				{
					count++;
					
				}
			}
			if(count==1) 
			{
				System.out.println(s2[i]);
		}
			
		}
	}
}

