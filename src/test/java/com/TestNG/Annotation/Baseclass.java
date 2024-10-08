package com.TestNG.Annotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Baseclass {
	
	public WebDriver driver;
	
  @BeforeClass
  public void btest() 
  {
	  driver = new ChromeDriver();
	  
	  driver.get("https://automationplayground.com/crm/");	  
  }
  
  @AfterClass
  public void atest() 
  {
	  driver.quit();	  
  }
  
  @BeforeMethod
  public void Url()
  {
	  System.out.println("Current Url of CRM:" + driver.getCurrentUrl());
	  
  }
  
  @AfterMethod
  public void Title()
  {
	  System.out.println("Title of CRM:" + driver.getTitle());
	  
  }
  
  
}
