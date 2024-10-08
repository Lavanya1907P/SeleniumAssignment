package com.TestNG.Annotation;

import org.testng.annotations.*;

public class B {
  
	@AfterClass
	
	public void bclass()
	{
		System.out.println("close browser");
	}
	
	
	@Test
  public void test2() 
  {
	  
	  System.out.println("Login");
  }
}
