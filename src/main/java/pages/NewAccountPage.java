package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewAccountPage extends Pagebase {

	public NewAccountPage(WebDriver driver) {
		super(driver);
	}
	WebElement NewAccountCustomerIDField = driver.findElement(By.name("cusid"));
	WebElement NewAccountIntialDepositField = driver.findElement(By.name("inideposit"));
	WebElement NewAccountSubmitBTN = driver.findElement(By.name("button2"));
	

	
	public void ManagerCanAddNewAccountForCurrentCustomer(String CustomerId, String IntialDeposit)
	{
		NewAccountCustomerIDField.sendKeys(CustomerId);
		NewAccountIntialDepositField.sendKeys(IntialDeposit);
		NewAccountSubmitBTN.click();
	}
	

}
