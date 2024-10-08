package Assignment;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass 
{
	
	@Test(priority=1)
	public void validateUrl()
	{  //PageObjectModeld1 lp=new PageObjectModeld1(driver);
	String actUrl=lp.getUrl();
	Assert.assertTrue(actUrl.contains("login"),"Url not matched!");
	System.out.println("Url is matched!");
		
	}
	
	@Test(priority=2)
	public void validateTitle()
	{  //PageObjectModeld1 lp=new PageObjectModeld1(driver);
	String actTitle=lp.getAppTitle();
	Assert.assertTrue(actTitle.contains("HRM"),"Title is not matched!");
		System.out.println("Title is matched!");
	}
	
	
  @Test(priority=3)
  public void validateLogin() 
  {
	  //PageObjectModeld1 lp=new PageObjectModeld1(driver);
//	  lp.setUserName("Admin");
//	  lp.setPassword("admin123");
//	  lp.clickOnButton();
	  lp.doLogin("Admin","admin123");
	  Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),"LoginFail!");
	  System.out.println("Login Pass!");
  }
}
