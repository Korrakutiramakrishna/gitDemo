package snippet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Snippet {
	public static void main(String[] args) 
	{
		WebDriver driver =new EdgeDriver();
		System.out.println("commit1");
		System.out.println("commit2");
		System.out.println("commit3");
		System.out.println("recent commites");
		System.out.println("Om namah Sivaiah");
		try {
			System.out.println("i love you ");
			System.out.println("org.openqa.selenium.SessionNotCreatedException ==>"+driver.toString());
		}
		catch(Exception e)
		{
			System.out.println("i Love you 2");
		}
	}
		public static void Test()
		{
			System.out.println(":)==>at org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:114)");
		}
		public static void Test(String name)
		{
			System.out.println(":)==>at org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:114)");
		}
		
	
}

