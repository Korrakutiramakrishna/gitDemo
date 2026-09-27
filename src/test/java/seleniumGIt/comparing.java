package seleniumGIt;

import java.util.Arrays;

public class comparing
{
	public static void main(String[] args)
	{
		int[] list1 = {1,2,3,4};
		int list2[] = {1,3,2,4};
		Arrays.sort(list2);
		Arrays.sort(list1);
	if(	Arrays.equals(list1, list2))
	{
			System.out.println("true");
		}
	else {
		System.out.println("false");;
	}
		
		
	}

}
