package Assignment;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Screenshot {
  @Test
  public void test() throws IOException 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.flipkart.in");
	  
	  String timestamp=new SimpleDateFormat("yyyy.MM.dd.hh.mm.ss").format(new Date());
	  TakesScreenshot ts=(TakesScreenshot) driver;
	  File temp=ts.getScreenshotAs(OutputType.FILE);
	  File dest=new File(System.getProperty("user.dir")+"//Screenshots//filpkart"+timestamp+".png");
	  
	  FileHandler.copy(temp, dest);
	  	  
  }
}