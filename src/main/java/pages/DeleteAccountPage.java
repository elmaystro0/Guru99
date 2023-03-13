package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeleteAccountPage extends Pagebase{

	public DeleteAccountPage(WebDriver driver) {
		super(driver);
	}
	
	WebElement DeleteAccountNumberField = driver.findElement(By.name("accountno"));
	WebElement DeleteAccountSubmitBTN = driver.findElement(By.name("AccSubmit"));
	
	public void ManagerCanDeleteAccount(String AccountNumber) throws InterruptedException
	{
		DeleteAccountNumberField.sendKeys(AccountNumber);
		DeleteAccountSubmitBTN.click();
		Alert deleteAccountAlert = driver.switchTo().alert();
		deleteAccountAlert.accept();
		Thread.sleep(5000);
	}

}
