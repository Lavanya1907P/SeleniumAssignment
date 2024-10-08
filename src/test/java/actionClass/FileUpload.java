package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUpload {
  @Test
  public void fileUploadTest() 
  {
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://the-internet.herokuapp.com/upload");
	  
	  //File upload using sendKeys
	  
	  driver.findElement(By.id("file-upload")).sendKeys("D:\\Abisha\\StarAgile Training\\Web driver\\selenium class assignment.txt");
	  
	  driver.findElement(By.id("file-submit")).click();
	  
  }
}
