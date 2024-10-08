package actionClass;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DoubleClick {
  @Test
  public void doubleClickTest() 
  {
      WebDriver driver= new ChromeDriver();
      
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	  
	  WebElement w1 =driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	  
	  Actions ac= new Actions(driver);
	  
	  ac.doubleClick(w1).perform();
	  
	  Alert a1 = driver.switchTo().alert();
	  
	  System.out.println(a1.getText());
	  
	  a1.accept();
	  
	  
	  
	  
	  
  }
}
