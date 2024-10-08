package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Resizeable {
  @Test
  public void sliderTest() 
  {
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://jqueryui.com/resizable/");
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  driver.manage().window().maximize();
	  
	  driver.switchTo().frame(0);
	  
	  WebElement ele=driver.findElement(By.xpath("(//div[@id='resizable']//div)[3]"));
	  
	  Actions ac =new Actions(driver);
	  
	  ac.clickAndHold(ele).moveByOffset(0, 80).perform();
	  
	  
	  
	  
  }
}
