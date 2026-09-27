package seleniumGIt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class browser {

    public static WebDriver driver;

    @BeforeMethod
    public void launchbrowser() {

        String filepath = "C:\\gitDemo\\Drivers\\msedgedriver.exe";

        System.setProperty("webdriver.edge.driver", filepath);
        System.out.println("BeforeMethod is executing");
        driver = new EdgeDriver();

        driver.manage().window().maximize();
    }

    @Test()
    public void youtube() {

        driver.get("https://www.youtube.com/");
        driver.findElement(By.name("search_query")).sendKeys("ganesh Songs"); 
        driver.findElement(By.xpath("//button[@title='Search']")).click();
    }

    @Test()
    public void Google() {

        driver.get("https://www.google.com/");
    }

    @Test()
    
    public void facebook() {

        driver.get("https://www.facebook.com/");
    }

    @Test(groups = "smoke", priority = 3)
    public void Flipkart() {

        driver.get("https://www.flipkart.com/");
    }

    @Test()
    public void amazon() {

        driver.get("https://www.amazon.com/");
    }

    @AfterMethod
    public void logout() {

        if (driver != null) {
            driver.quit();
        }
    }
}