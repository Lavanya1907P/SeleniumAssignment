package webElementsHandlingUsingTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.Alert;



public class alert {
	@Test
  public void testcase1() throws InterruptedException 
  {
   
	  WebDriver driver=new ChromeDriver();
	  
	  //get the url
	  
	  driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	  
	  // Alert 1 Handling
	  
	  driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
	  
	  //alert ok button click and text read
	  
	  Alert w1=driver.switchTo().alert();
	  
	  System.out.println("Alert 1 text:" +w1.getText());
	  
	  w1.accept();
	
	  // Alert 2 Handling
	  
	  driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
	  
	  //alert ok button click and text read
	  
	  Alert w2=driver.switchTo().alert();
	  
	  System.out.println("Alert 2 text:" +w2.getText());
	  
	  w2.dismiss();
	  	  
	  // Alert 3 Handling
	  
	  driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
	  
	  Thread.sleep(5);
	  
	  //alert ok button click and text read
	  
	  Alert w3=driver.switchTo().alert();
	  
	  w3.sendKeys("test check");
	  
	  System.out.println("Alert 3 text:" +w3.getText());
	  
	  w3.accept();
	  
      WebElement e3=driver.findElement(By.id("result"));
	  
	  System.out.println("Result of the alert: " +e3.getText());
	  
	  driver.close();
	    
  }
}
