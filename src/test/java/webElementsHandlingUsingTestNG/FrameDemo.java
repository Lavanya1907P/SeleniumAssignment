package webElementsHandlingUsingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameDemo {
  @Test
  public void nestedFrame() 
  {
	  WebDriver driver =new ChromeDriver();
	  
	  driver.get("https://the-internet.herokuapp.com/nested_frames");
	  
	  driver.switchTo().frame(0).switchTo().frame("frame-left");
	  
	  System.out.println("Left frame pagesource :" +driver.getPageSource());
	  
	  driver.switchTo().defaultContent();
	  
	  driver.switchTo().frame(0);
	  
	  driver.switchTo().frame("frame-middle");
	  
	  System.out.println("Left frame pagesource :" +driver.getPageSource());
	  
	  
	  
	  
  }
}
