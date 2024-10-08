package com.TestNG;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

public class TestNG_dependsOnMethod {
  @Test(priority=1)
  public void dependsOnTest() 
  {
	  String act = "Selenium Test";
	  String expec= "Selenium Test1";
	  
	  AssertJUnit.assertEquals(act, expec,"Test Fail");
	  
	  System.out.println("Test Pass");
  }
  
  @Test(priority=2,dependsOnMethods = "dependsOnTest")
  public void Test() 
  {
	  System.out.println("Depends validation check");
  }
}
