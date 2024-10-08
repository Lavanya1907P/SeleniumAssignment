package com.TestNG;

import org.testng.annotations.Test;

public class TestNG_enable {
	  @Test(priority=2,description="Test2",invocationCount=3)
	  public void Login() 
	  {
		  
		  System.out.println("Login the Application");
	  }
	  @Test(priority=1)
	  public void Browser() 
	  {
		  
		  System.out.println("Open the Browser");
	  }
	  
	  @Test(priority=4, enabled=false)
	  public void CloseBrowser() 
	  {
		  
		  System.out.println("Close the Browser");
	  }
	  
	  @Test(priority=3)
	  public void ApplicationLogut() 
	  {
		  
		  System.out.println("Logout the application");
	  }
	
}
