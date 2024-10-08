package com.TestNG_Frame_TestData;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import webElement.configReader;

public class HRMReadingfromPropertiesFile {
  @Test
  public void f() {
	  
      WebDriver driver = new ChromeDriver();
      
      configReader c1 = new configReader("config");
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  driver.get(c1.getData("url"));
	  
	  driver.findElement(By.name("username")).sendKeys(c1.getData("un"));
	  
	  driver.findElement(By.name("password")).sendKeys(c1.getData("psw"));
	  
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
	  Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),"Test Fail");
	  
	  System.out.println("Test Pass");
  }
}
