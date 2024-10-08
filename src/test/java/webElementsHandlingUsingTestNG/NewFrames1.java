package webElementsHandlingUsingTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewFrames1 {
  @Test
  public void frames() 
  {
	  WebDriver driver =new ChromeDriver();
	  
	  driver.get("https://ui.vision/demo/webtest/frames/");
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));          
	  
	  driver.manage().window().maximize();
	  
	  WebElement El1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
	  
	  driver.switchTo().frame(El1);
	  
	  driver.findElement(By.name("mytext1")).sendKeys("Lavanya");
	  
	  //how to move back from frame to main parent frame
	  
	  driver.switchTo().defaultContent();
	  
      WebElement El2 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
	  
	  driver.switchTo().frame(El2);
	  
	  driver.findElement(By.name("mytext3")).sendKeys("Magzhini");
	  
	  //switching to iframe inside the frame.
	  
	  driver.switchTo().frame(0);
	  
	  driver.findElement(By.xpath("//div[@id='i8']")).click();
	  
	  
	  
	  
	 
	  
  }
}
