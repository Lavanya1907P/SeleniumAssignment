package capabilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class incognito {
  @Test
  public void incognitotest() 
  {
	  ChromeOptions opt = new ChromeOptions();
	  
	  opt.addArguments("--incognito");
	  
	  WebDriver driver =new ChromeDriver(opt);
	  
	  driver.get("https://www.facebook.com");
	  
  }
}
