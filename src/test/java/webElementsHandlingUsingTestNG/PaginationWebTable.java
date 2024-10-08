package webElementsHandlingUsingTestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PaginationWebTable {
  @Test
  public void TestTable() 
  {
	  
      WebDriver driver =new ChromeDriver();
	  
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  driver.manage().window().maximize();
	  
	  System.out.println("***Size of the page***");
	  
	  List<WebElement> s1=driver.findElements(By.xpath("//ul//li"));
	  
	  System.out.println("Size of the Table :" +s1.size());
	  
	  for(WebElement w1: s1)
	  {
		  w1.click();
		  
		  List<WebElement> s2 = driver.findElements(By.xpath("//table[@id='productTable']//tbody/tr//td"));
		  
		  for(WebElement j:s2)
		  {
		  System.out.println(j.getText());
		
		  }
		  
		  
	  }
	  
	  
	  
	  
  }
}
