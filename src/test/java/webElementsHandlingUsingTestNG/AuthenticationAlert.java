package webElementsHandlingUsingTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AuthenticationAlert {
  @Test
  public void testCase2()
  {
	  WebDriver q1= new ChromeDriver();
	  
	  q1.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	  
	  WebElement e1=q1.findElement(By.xpath("//p[contains(text(),'Congratulations')]"));
	  
	  System.out.println(e1.getText());  
	  
	  
	  
	  
	  
  }
}
