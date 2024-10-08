package actionClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FileUploadUsingRobortClass {
  @Test
  public void fileUploadRbt() throws AWTException 
  {
      WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://the-internet.herokuapp.com/upload");
	  
	  WebElement ele=driver.findElement(By.id("file-upload"));
	  
	  Actions ac= new Actions(driver);
	  
	  ac.click(ele).perform();
	  
	  //Robot class
	  
	  Robot rb = new Robot();
	  
	  rb.delay(5000);
	  
	  //string class
	  
	  StringSelection sc = new StringSelection("D:\\Abisha\\StarAgile Training\\Web driver\\selenium class assignment.txt");
	  
	  //toolkit class
	  
	  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sc, null);
	  
	  //press the key
	  rb.keyPress(KeyEvent.VK_CONTROL);
	  	  
	  rb.keyPress(KeyEvent.VK_V);
	  
	  
	  //release the key
	  
	  rb.keyRelease(KeyEvent.VK_CONTROL);
  	  
	  rb.keyRelease(KeyEvent.VK_V);
	  
	  //enter
	  
	  rb.keyPress(KeyEvent.VK_ENTER);
	  
	  driver.findElement(By.id("file-submit")).click();
  }
}
