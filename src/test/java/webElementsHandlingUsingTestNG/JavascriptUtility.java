package webElementsHandlingUsingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import webElement.Utility;

public class JavascriptUtility {
  @Test
  public void f() 
  {
	  WebDriver driver =new ChromeDriver();
	  
	  driver.get("https://amazon.in");
	  
	  Utility.pageUp(driver);
	  
	  Utility.pageDown(driver);
	  
	  
  }
}
