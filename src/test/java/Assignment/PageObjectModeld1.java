package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObjectModeld1 {


	WebDriver driver;
	
	//constructor
	public PageObjectModeld1(WebDriver driver)//current session driver
	{
		this.driver=driver;
	}
	
	//Locators
	By username=By.name("username");
	By password=By.name("password");
	By loginBtn=By.xpath("//button[@type='submit']");
	
	
	//Action Methods
	public void setUserName(String un)
	{
		driver.findElement(username).sendKeys(un);
	}
	
	
	public void setPassword(String psw)
	{
		driver.findElement(password).sendKeys(psw);
	}
	
	public void clickOnButton()
	{
		driver.findElement(loginBtn).click();
		
	}
	
	public void doLogin(String un,String psw)
	{
		driver.findElement(username).sendKeys(un);
		driver.findElement(password).sendKeys(psw);
		driver.findElement(loginBtn).click();
	}
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	public String getUrl()
	{
		return driver.getCurrentUrl();
	}
	
	
}