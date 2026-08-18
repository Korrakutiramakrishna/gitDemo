package seleniumGIt;

import java.net.HttpURLConnection;
import java.net.URI;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class brokenlink
{
	public static void main(String[] args) 
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		List<WebElement>links=driver.findElements(By.tagName("a"));
		for(WebElement link:links)
		{
			String hreds=link.getAttribute("href");
			if(hreds==null ||hreds.isEmpty()||hreds.isBlank())
			{
				System.out.println("brokesnlinks");
				continue ;
			}
			try {
				HttpURLConnection https=(HttpURLConnection) URI.create(hreds).toURL().openConnection();
				https.connect();

				int responseCode = https.getResponseCode();

				if (responseCode >= 400) {
					System.out.println(
							"Broken Link: " + hreds +
							" | Status: " + responseCode);
				} else {
					System.out.println(
							"Valid Link: " + hreds +
							" | Status: " + responseCode);
				}

				https.disconnect();

			} catch (Exception e)
			{
				System.out.println("tose are brokenlinks");
				System.out.println("Unable to access: " + hreds.length());
			}
		}
	}

}