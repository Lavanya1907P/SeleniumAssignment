package com.TestNG;

import org.testng.annotations.Test;

public class TestNG_timeout {
	  @Test(priority=2,description="Test2")
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
	  
	  @Test(priority=3,timeOut = 5000)
	  public void ApplicationLogut() throws InterruptedException 
	  {
		  
		  System.out.println("Logout the application within 5sec");
		  
		  Thread.sleep(7000);
	  }
	
}
