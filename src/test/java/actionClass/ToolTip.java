package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ToolTip {
  @Test
  public void ToolTipTest() 
  {
	  
      WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://jqueryui.com/tooltip/");
	  
	  driver.switchTo().frame(0);
	  
	  WebElement el1 = driver.findElement(By.id("age"));
	  
	  Actions a1 = new Actions(driver);
	  
	  a1.moveToElement(el1).perform();
	  
	  String el2 =driver.findElement(By.xpath("(//div[text()='We ask for your age only for statistical purposes.'])[1]")).getText();
	  
	  System.out.println("Text of the hover : " +el2);
	  
  }
}
