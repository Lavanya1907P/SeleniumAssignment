package actionClass;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseAct {
  @Test
  public void MouseTest() throws InterruptedException 
  {
	  WebDriver driver= new ChromeDriver();
	  
	  driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	  
	  WebElement ele=driver.findElement(By.xpath("//span[text()='right click me']"));
	  
	  Actions act= new Actions(driver);
	  
	  act.contextClick(ele).perform();
	  
	  List<WebElement> l1 = driver.findElements(By.xpath("(//ul)[3]//li//span"));
	  
	  System.out.println("Number of Options" +l1.size());
	  
	  for(WebElement s1:l1)
	  {
		  System.out.println(s1.getText());
		  
		  if(s1.getText().contains("Paste"))
		  {
			  s1.click();
			  
			  break;
		  }
	  }
	  
	  Thread.sleep(2000);
	  
	  
	  Alert a1 = driver.switchTo().alert();
	  
	  a1.accept();
	  
	  
	  
	
	  
  }
}
