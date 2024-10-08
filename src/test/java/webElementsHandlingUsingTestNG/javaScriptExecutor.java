package webElementsHandlingUsingTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class javaScriptExecutor {
  @Test
  public void testExecutor() throws InterruptedException 
  {
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://www.amazon.in");
	  
	  driver.manage().window().maximize();
	  
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	 
    	//js.executeScript("window.scrollTo(0,5000)");
	  
	  //Scroll to top
	  
	  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	  
	  Thread.sleep(5000);
	  
	  //Scroll to bottom
	  
	  js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
	  
	  //scroll to specific height.
	  
	  WebElement e1=driver.findElement(By.xpath("(//h2[@class='as-title-block-left'])[4]"));
	  
	  js.executeScript("arguments[0].scrollIntoView(true);", e1);
	  

	  //refresh
	  
	  js.executeScript("history.go(0)");
	  
	  
	  
	  //get title
	  
	  String s1 = js.executeScript("return document.title").toString();
	  
	  System.out.println("Title of the window :" +s1);
	  
	  //element click
	  
	  
	  WebElement e2=driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_15']"));
	  
	  js.executeScript("arguments[0].click()", e2);
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
