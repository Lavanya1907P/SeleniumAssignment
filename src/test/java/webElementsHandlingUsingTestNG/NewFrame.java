package webElementsHandlingUsingTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewFrame {
  @Test
  public void fra1() 
  {
	  WebDriver driver =new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
	  
	  // frame with name
	  //driver.switchTo().frame("globalSqa");
	  
	  //frame with Webelement
	  WebElement Ele1=driver.findElement(By.name("globalSqa"));
	  
	  driver.switchTo().frame(Ele1);
	  
	  WebElement e1 = driver.findElement(By.id("s"));
	  
	  e1.sendKeys("Books",Keys.ENTER);
	  
	  
	  

	  
	 
	  
  }
}
