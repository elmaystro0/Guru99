package testCases;

import org.testng.annotations.Test;

import pages.DeleteAccountPage;
import pages.HomePage;
import pages.ManagerPage;

public class DeleteAccountTestCase extends Testbase{
	HomePage HomeObject;
	ManagerPage ManagerObject;
	DeleteAccountPage DeleteAccountObject;
	String CorrectUSerIDTXT = "mngr481277";
	String CorrectPasswordTXT = "987654@";
	String AccountIDTXT = "119196";

	@Test(priority = 1)
	public void ManagerCanLoginusingCorrectUserIdandCorrectPassword()
	{
		HomeObject = new HomePage(driver);
		HomeObject.ManagerCanLoginWithCorrectUserNameAndPassword(CorrectUSerIDTXT, CorrectPasswordTXT);
	}

	@Test(priority = 2)
	public void ManagerCanDeleteAnAccount() throws InterruptedException
	{
		ManagerObject = new ManagerPage(driver);
		ManagerObject.OpenDeleteAccountLink();
		DeleteAccountObject = new DeleteAccountPage(driver);
		DeleteAccountObject.ManagerCanDeleteAccount(AccountIDTXT);
	}
}
