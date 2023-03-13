package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.ManagerPage;

public class LoginTestCases extends Testbase {
	HomePage HomeObject;
	ManagerPage ManagerObject;
	
	String CorrectUSerIDTXT = "mngr481277";
	String CorrectPasswordTXT = "987654@";
	String InCorrectUSerIDTXT = "mngr48127s7";
	String InCorrectPasswordTXT = "98765a4@";
	String ExpectedMessage = "Welcome To Manager's Page of Guru99 Bank";
	String AlertExpectedMessage = "User or Password is not valid";
	
	@Test (priority = 2)
	public void ManagerCanLoginusingCorrectUserIdandCorrectPassword()
	{
		HomeObject = new HomePage(driver);
		HomeObject.ManagerCanLoginWithCorrectUserNameAndPassword(CorrectUSerIDTXT, CorrectPasswordTXT);
		ManagerObject = new ManagerPage(driver);
		System.out.println(ManagerObject.ManagerWelocmeMessage.getText());
		Assert.assertEquals(ManagerObject.ManagerWelocmeMessage.getText(), ExpectedMessage);
	}
	@Test(priority = 1)
	public void ManagerCannotLoginWithIncorrectUserIDorPassowrd()
	{
		HomeObject = new HomePage(driver);
		HomeObject.ManagerCAnnotLoginWithIncorrectUaserAndPassword(InCorrectUSerIDTXT, InCorrectPasswordTXT);
		System.out.println(HomeObject.WrongLoginAlertMessage);
		Assert.assertEquals(HomeObject.WrongLoginAlertMessage, AlertExpectedMessage);
	}

}
