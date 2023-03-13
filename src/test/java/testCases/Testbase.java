package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class Testbase {
	public static WebDriver driver;
	
	@BeforeSuite
	public void opendriver()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.navigate().to("https://www.demo.guru99.com/V4/");
	}
	
	@AfterSuite
	public void closedriver()
	{
		driver.quit();
	}
	@AfterMethod
	public void TakeScreenShots(ITestResult result)
	{
		utilities.Util.TakeScreenShot(driver, result.getName());
	}

}
