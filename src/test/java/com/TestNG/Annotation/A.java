package com.TestNG.Annotation;

import org.testng.annotations.*;

public class A {
  
	@BeforeClass
	
	public void bclass()
	{
		System.out.println("Launch the browser");
	}
	
	@BeforeSuite
    public void bsuit() 
    {
	  
	  System.out.println("Before suite will run at the top level/before test");
    }
	
	@AfterSuite
    public void asuit() 
    {
	  
	  System.out.println("After suite will run after test");
    }
	
	  @Test
      public void test1() 
      {
	  
	  System.out.println("Register");
      }
	
	 @BeforeTest
	  public void atest() 
	  {
		  
		  System.out.println("Before Test will run before all the classes");
	  }
	 
	 @AfterTest
	  public void aatest() 
	  {
		  
		  System.out.println("After Test will run after all the classes");
	  }
}
