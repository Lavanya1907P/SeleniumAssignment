package com.TestNG_Frame_TestData;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestData {
	
	@Parameters({"un","psw"})
  @Test
  public void Test1(String un,String psw) 
  {
	  
	  System.out.println("Username is :" +un);
	  System.out.println("Password is :" +psw);
	  
  }
}
