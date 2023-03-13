package testCases;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.ManagerPage;
import pages.NewAccountPage;
import pages.NewCustomerPage;

public class NewAccountTestCases extends Testbase {

	ManagerPage ManagerObjct;
	NewAccountPage NewAccountObject;
	NewCustomerPage NewCustomerObject;
	String NewCustomerIDTXT = "9786";
	String IntialDepositTXT = "1000";
	HomePage HomeObject;
	
	String CorrectUSerIDTXT = "mngr481277";
	String CorrectPasswordTXT = "987654@";

	@Test(priority = 1)
	public void ManagerCanLoginusingCorrectUserIdandCorrectPassword()
	{
		HomeObject = new HomePage(driver);
		HomeObject.ManagerCanLoginWithCorrectUserNameAndPassword(CorrectUSerIDTXT, CorrectPasswordTXT);
	}

	@Test(priority = 2)
	public void ManagerCanAddNewAccountForCurrentCustomer()
	{
		ManagerObjct = new ManagerPage(driver);
		ManagerObjct.OpenNewAccountLink();
		NewAccountObject = new NewAccountPage(driver);
		NewAccountObject.ManagerCanAddNewAccountForCurrentCustomer(NewCustomerIDTXT, IntialDepositTXT);
	}
}
