package testCases;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.ManagerPage;
import pages.NewCustomerPage;

public class NewCustomerTestCases extends Testbase {
	
	HomePage HomeObject;
	ManagerPage ManagerObject;
	NewCustomerPage NewCustomerObject;
	String NewCustomerNameTXT = "Mohamed Salama";
	String NewCustomerDayOfBirth = "10";
	String NewCustomerMonthOfBirth = "11";
	String NewCustomerYearOfBirth = "1990";
	String NewCustomerAddressTXT = "Ajman  UAE";
	String NewCustomerCityTXT = "AjmanCity";
	String NewCustomerStateTXT = "AjmanState";
	String NewCustomerPINTXT = "011989";
	String NewCustomerMobileTXT = "1234567890";
	String NewCustomerEmailTXT = "s1ddftauw@tsnydg.com";
	String NewCustomerPasswordTXT = "123456789";
	String ExpectedNewCustomerSuccessfulMessage = "Customer Registered Successfully!!!";
	
	
	String CorrectUSerIDTXT = "mngr481277";
	String CorrectPasswordTXT = "987654@";

	@Test(priority = 1)
	public void ManagerCanLoginusingCorrectUserIdandCorrectPassword()
	{
		HomeObject = new HomePage(driver);
		HomeObject.ManagerCanLoginWithCorrectUserNameAndPassword(CorrectUSerIDTXT, CorrectPasswordTXT);
	}

	
	@Test(priority = 2)
	public void ManagerCanAddNewCustomer() throws InterruptedException
	{
		ManagerObject = new ManagerPage(driver);
		ManagerObject.OpenNewCustomerLink();
		NewCustomerObject = new NewCustomerPage(driver);
		NewCustomerObject.ManagerCanAddNewCustomer
		(NewCustomerNameTXT, NewCustomerDayOfBirth, NewCustomerMonthOfBirth, NewCustomerYearOfBirth, NewCustomerAddressTXT, NewCustomerCityTXT,
				NewCustomerStateTXT, NewCustomerPINTXT, NewCustomerMobileTXT, NewCustomerEmailTXT,
				NewCustomerPasswordTXT);
		//Assert.assertEquals(NewCustomerObject.NewCustomerSuccessfullMessage, ExpectedNewCustomerSuccessfulMessage);
		//System.out.println(NewCustomerObject.NewCustomerID.getText());
	}

}
