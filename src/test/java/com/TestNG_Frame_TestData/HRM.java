package com.TestNG_Frame_TestData;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HRM {
	@Parameters ({"un","psw"})
  @Test 
  public void hrmApplication(String un, String psw) 
  {
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  driver.findElement(By.name("username")).sendKeys(un);
	  
	  driver.findElement(By.name("password")).sendKeys(psw);
	  
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
	  Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),"Test Fail");
	  
	  System.out.println("Test Pass");
	  
	  
	  
	  
  }
}
