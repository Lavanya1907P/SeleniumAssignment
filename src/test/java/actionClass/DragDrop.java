package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragDrop {
  @Test
  public void dragDropTest() 
  {
	  WebDriver driver =new ChromeDriver();
	  
	  driver.get("https://jqueryui.com/droppable/");
	  
	  driver.switchTo().frame(0);
	  
	  WebElement ele =driver.findElement(By.xpath("//div[@id='draggable']//p"));
	  
	  WebElement tar =driver.findElement(By.id("droppable"));
	  
	  Actions a1 = new Actions(driver);
	  
	  a1.dragAndDrop(ele, tar).perform();
  }
}
