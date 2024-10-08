package com.TestNG;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class TestNG_assertions {
  @Test(enabled=false)
  public void hardAssertion() 
  {
	  String act = "Selenium is an automation tool";
	  String expe = "Selenium is an automation tool1";
	  
	 /* Assert.assertEquals(act, expe,"Test Fail");
	  
	  System.out.println("Test Pass");
	  
	  */
	  
	//  Assert.assertTrue(act.equals(expe),"Test Fail");
    // System.out.println("Test Pass");
	  	  
	  Assert.assertFalse(act.equals(expe),"Test Fail");
	  System.out.println("Test Pass");
  }
  
  @Test
  
  public void softAssertion()
  {
	  int a=100,b=109;
	  
	  SoftAssert as= new SoftAssert();
	  
	  Assert.assertEquals(a, b, "Test Fail");
	  
	  System.out.println("Test Pass");

	  as.assertAll();
	  
  }
  
}
