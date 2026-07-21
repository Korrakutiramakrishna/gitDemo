package seleniumGIt;

import java.util.ListIterator;
import java.util.Vector;

public class collections
{
	public static void main(String[] args) {
     Vector v1 =new Vector();
     System.out.println(v1.capacity());
     for(char ch='A';ch<='Z';ch++)
     {
    	 v1.add(ch);
     }
     ListIterator i1=v1.listIterator();
     System.out.println(v1.capacity());
     while(i1.hasNext())
     {
     System.out.println(i1.next());
     System.out.println(i1.hasPrevious());
     }
       
    }
}