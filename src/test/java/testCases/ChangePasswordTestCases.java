package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ChangePasswordPage;
import pages.HomePage;
import pages.ManagerPage;

public class ChangePasswordTestCases extends Testbase {
	HomePage HomeObject;
	ManagerPage ManagerObject;
	ChangePasswordPage ChangePasswordObject;
	String CorrectUserIdTXT = "mngr481277";
	String CorrectPasswordTXT = "987654@";
	String IncorrectPasswordTXT = "123456789";
	String NewPasswordTXT = "1234567@";
	String ExpectedWrongOldPasswordMessageAlert = "Old Password is incorrect";
	
	@Test(priority = 1)
	public void ManagerCanLoginWithCorrectUserAndPassword()
	{
		HomeObject = new HomePage(driver);
		HomeObject.ManagerCanLoginWithCorrectUserNameAndPassword(CorrectUserIdTXT, CorrectPasswordTXT);
	}
	@Test(priority = 2)
	public void OpenChangePasswordLink()
	{
		ManagerObject = new ManagerPage(driver);
		ManagerObject.openChangePasswordLink();
		ChangePasswordObject = new ChangePasswordPage(driver);
		ChangePasswordObject.ManagerCannotChangeHisPasswordwithwronfoldpassword(IncorrectPasswordTXT, NewPasswordTXT);
		System.out.println(ChangePasswordObject.WrongOldPasswordMessageAlert);
		Assert.assertEquals(ChangePasswordObject.WrongOldPasswordMessageAlert, ExpectedWrongOldPasswordMessageAlert);
	}

}
