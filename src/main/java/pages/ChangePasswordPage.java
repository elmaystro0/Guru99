package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChangePasswordPage extends Pagebase {

	public ChangePasswordPage(WebDriver driver) {
		super(driver);
	}
	
	WebElement OldPasswordField = driver.findElement(By.name("oldpassword"));
	WebElement NewPasswordField = driver.findElement(By.name("newpassword"));
	WebElement ConfirmPasswordField = driver.findElement(By.name("confirmpassword"));
	WebElement SubmitChangePasswordBTN = driver.findElement(By.name("sub"));
	public String WrongOldPasswordMessageAlert;
	
	public void ManagerCannotChangeHisPasswordwithwronfoldpassword(String OldPassword, String NewPassword)
	{
		OldPasswordField.sendKeys(OldPassword);
		NewPasswordField.sendKeys(NewPassword);
		ConfirmPasswordField.sendKeys(NewPassword);
		SubmitChangePasswordBTN.click();
		Alert WrongOldPasswordAlert = driver.switchTo().alert();
		WrongOldPasswordMessageAlert = WrongOldPasswordAlert.getText();
		WrongOldPasswordAlert.accept();
	}
	

}
