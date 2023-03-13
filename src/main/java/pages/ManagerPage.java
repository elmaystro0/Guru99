package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ManagerPage extends Pagebase{

	public ManagerPage(WebDriver driver) {
		super(driver);

	}
	public WebElement ManagerWelocmeMessage = driver.findElement(By.cssSelector("marquee.heading3"));
	WebElement changePasswordBTN = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[11]/a"));
	WebElement NewCustomerLink = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a"));
	WebElement NewAccountLink = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[5]/a"));
	WebElement DeleteAccountLink = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[7]/a"));
	
	public void openChangePasswordLink()
	{
		changePasswordBTN.click();
	}
	
	public void OpenNewCustomerLink()
	{
		NewCustomerLink.click();
	}
	public void OpenNewAccountLink()
	{
		NewAccountLink.click();
	}
	public void OpenDeleteAccountLink()
	{
		DeleteAccountLink.click();
	}

}
