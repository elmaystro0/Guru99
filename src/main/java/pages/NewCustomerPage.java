package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewCustomerPage extends Pagebase {

	public NewCustomerPage(WebDriver driver) {
		super(driver);
	}
	
	JavascriptExecutor Jse;
	WebElement NewCustomerName = driver.findElement(By.name("name"));
	WebElement NewCustomerDateOfBirth = driver.findElement(By.id("dob"));
	WebElement NewCustomerAddress = driver.findElement(By.name("addr"));
	WebElement NewCustomerCity = driver.findElement(By.name("city"));
	WebElement NewCustomerState = driver.findElement(By.name("state"));
	WebElement NewCustomerPin = driver.findElement(By.name("pinno"));
	WebElement NewCustomerMobile = driver.findElement(By.name("telephoneno"));
	WebElement NewCustomerEmail = driver.findElement(By.name("emailid"));
	WebElement NewCustomerPassword = driver.findElement(By.name("password"));
	WebElement NewCustomerSubmitBTN = driver.findElement(By.name("sub"));
	public WebElement NewCustomerSuccessfull = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/p"));
	public WebElement NewCustomerID = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]"));
	
	public String NewCustomerIDNumber;
	public String NewCustomerSuccessfullMessage;
	
	public void ManagerCanAddNewCustomer
	(String Name, String DayOfBirth,String MonthOfBirth,String YearOfBirth, String Address, String City, String State, String Pin, String Mobile, String Email, String Password) throws InterruptedException
	{
		NewCustomerName.sendKeys(Name);
		//Jse.executeScript("arguments[0].value='10/10/2000'", driver.findElement(By.id("dob")));
		NewCustomerDateOfBirth.sendKeys(DayOfBirth);
		NewCustomerDateOfBirth.sendKeys(MonthOfBirth);
		NewCustomerDateOfBirth.sendKeys(YearOfBirth);
		Thread.sleep(5000);
		NewCustomerAddress.sendKeys(Address);
		NewCustomerCity.sendKeys(City);
		NewCustomerState.sendKeys(State);
		NewCustomerPin.sendKeys(Pin);
		NewCustomerMobile.sendKeys(Mobile);
		NewCustomerEmail.sendKeys(Email);
		NewCustomerPassword.sendKeys(Password);
		NewCustomerSuccessfullMessage = NewCustomerSuccessfull.getText();
		NewCustomerIDNumber = NewCustomerID.getText();
		NewCustomerSubmitBTN.click();
		Thread.sleep(5000);
	}
		
}
