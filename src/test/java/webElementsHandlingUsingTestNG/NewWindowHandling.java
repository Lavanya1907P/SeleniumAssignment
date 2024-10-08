package webElementsHandlingUsingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewWindowHandling {
  @Test
 
  public void newTab () 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com");
	  WebDriver newtab=driver.switchTo().newWindow(WindowType.TAB);  
	  newtab.get("https://www.amazon.in");
  }
  
  @Test
  
  public void newWindow() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com");
	  WebDriver newwind=driver.switchTo().newWindow(WindowType.WINDOW);  
	  newwind.get("https://www.facebook.in");
  }
}
