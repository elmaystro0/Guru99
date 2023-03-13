package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends Pagebase{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	WebElement UserNameField = driver.findElement(By.name("uid"));
	WebElement PasswordField = driver.findElement(By.name("password"));
	WebElement LoginBTN = driver.findElement(By.name("btnLogin"));
	public String WrongLoginAlertMessage;

	public void ManagerCanLoginWithCorrectUserNameAndPassword(String CorrectUSerName, String CorrectPassword)
	{
		UserNameField.sendKeys(CorrectUSerName);
		PasswordField.sendKeys(CorrectPassword);
		LoginBTN.click();
	}
	
	public void ManagerCAnnotLoginWithIncorrectUaserAndPassword(String IncorrectUserID, String IncorrectPassword)
	{
		UserNameField.sendKeys(IncorrectUserID);
		PasswordField.sendKeys(IncorrectPassword);
		LoginBTN.click();
		Alert wrongLogiAlert = driver.switchTo().alert();
		WrongLoginAlertMessage = wrongLogiAlert.getText();
		wrongLogiAlert.accept();
	}
}
