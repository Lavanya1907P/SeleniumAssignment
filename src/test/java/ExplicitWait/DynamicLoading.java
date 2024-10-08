package ExplicitWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import webElement.Utility;

public class DynamicLoading {
  @Test
  public void testWebDriverWait()
 {
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://the-internet.herokuapp.com/dynamic_loading");
	  
	  driver.findElement(By.xpath("(//a)[3]")).click();
	  
	  By Button = By.xpath("//button[text()='Start']");
	  
	  By text = By.xpath("(//h4)[2]");
	  
	  driver.findElement(Button).click();
	  
	  Utility.visibilityOfElementLocated(driver, text);
	  
	  String s1=driver.findElement(text).getText();
	 
	  System.out.println(s1);
	  
	  
	  
  }
}
