package com.TestNG.Annotation;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class annotationDemo1 {
	
	@BeforeClass
	public void bclass()
	{
		System.out.println("Will run before the first test case");
	}
		
	@BeforeMethod
	public void beforeTest()
	{
		System.out.println("Will run before every test case");
	}
	
	
  @Test
  public void test1() 
  {
	  System.out.println("Test case1");
  }
  
  @Test
  public void test2() 
  {
	  System.out.println("Test case2");
  }
  
  @Test
  public void test3() 
  {
	  System.out.println("Test case3");
  }
  
  @Test
  public void test4() 
  {
	  System.out.println("Test case4");
  }
  
  
  @AfterMethod
  
  public void afterTest()
	{
		System.out.println("Will run after every test case");
	}
  
  @AfterClass
	public void aclass()
	{
		System.out.println("Will run after the last test case");
	}
}
