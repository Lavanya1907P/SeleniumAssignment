package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseOver {
  @Test
  public void MouseOverTest() 
  {
	  WebDriver driver =new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://www.w3schools.com/JSREF/tryit.asp?filename=tryjsref_onmouseover");
	  
	  //frame
	  
	  WebElement fre= driver.findElement(By.id("iframeResult"));
	  
	  driver.switchTo().frame(fre);
	  
	  WebElement ele = driver.findElement(By.xpath("//img[@alt='Smiley']"));
	  
	  Actions a1 =new Actions(driver);
	  
	  a1.moveToElement(ele).perform();
	  
	  
	  
  }
}
