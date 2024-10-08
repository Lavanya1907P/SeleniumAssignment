package com.TestNG.Annotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CRM extends Baseclass

{
  @Test(priority=1)
  public void SignIN()
  {
	  
	  driver.findElement(By.partialLinkText("Sign In")).click();
	  
	  
  }
  
  @Test(priority=2)
  public void Login()
  {
	  
	  driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
	  
	  driver.findElement(By.id("password")).sendKeys("test123");
	  
	  driver.findElement(By.id("submit-id")).click();
	  
  }
  
  @Test(priority=3)
  public void Logout()
  {
	  
	  WebElement signout=driver.findElement(By.partialLinkText("Sign Out"));
	  
	  if(signout.isDisplayed())
	  {
		  signout.click();
	  }
	  
  }
}
