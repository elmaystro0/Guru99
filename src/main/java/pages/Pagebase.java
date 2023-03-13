package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Pagebase {
	public WebDriver driver;
	public JavascriptExecutor Jse ;
	public Alert alert;
	public Select select;
	public Actions action;
	
	public  Pagebase (WebDriver driver)
	{
		this.driver = driver;
		JavascriptExecutor Jse = (JavascriptExecutor)driver;
	}

}
