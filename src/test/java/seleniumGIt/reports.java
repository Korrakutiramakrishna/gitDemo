package seleniumGIt;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class reports 
{
	public static void main(String[] args) {

		File folder = new File("Reports");
		if (!folder.exists()) {
			folder.mkdir();
		}

		ExtentSparkReporter spark =
				new ExtentSparkReporter("Reports/ExtentReport.html");

		ExtentReports extent = new ExtentReports();
		extent.attachReporter(spark);

		ExtentTest test = extent.createTest("Login Test");
		test.pass("Login Successful");

		extent.flush();

		System.out.println("Report Generated");
		String driverPath = System.getProperty("user.dir") + "/Drivers/msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", driverPath);
		WebDriver driver =new EdgeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		test.log(Status.FAIL ,"url laucned sucessfully");

	}

}
