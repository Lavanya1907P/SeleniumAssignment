package webElementsHandlingUsingTestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class webTableHandle {
  @Test
  public void tableHan() 
  {
	  WebDriver driver =new ChromeDriver();
	  
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  driver.manage().window().maximize();
	  
	  // automate the headings
	  
	  System.out.println("***********Headings of the table*********");
	  
	  List<WebElement> s1= driver.findElements(By.xpath("//table[@name='BookTable']//tr//th"));
	  
	  System.out.println("Size of the table:" +s1.size());
	  
	  for (WebElement l1:s1)
	  {
		  System.out.println("Headings:" +l1.getText());
	  }
	  
	  System.out.println("***********Number of Rows*********");
	  
	  List<WebElement> s2= driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
	  
	  System.out.println("Size of the row:" + (s2.size()-1));
	  
	  System.out.println("***********Number of Columns*********");
	  
      List<WebElement> s3= driver.findElements(By.xpath("//table[@name='BookTable']//tr//th"));
	  
	  System.out.println("Size of the column:" + s3.size());
	  
	  // get the details of row number 3
	  
	  System.out.println("*********Data of the specific row***********");
	  	  
	  List<WebElement> s4= driver.findElements(By.xpath("//table[@name='BookTable']//tr[4]//td"));
	  
	  for(WebElement i:s4)
	  {
		  System.out.print(i.getText() +" ");
	
	  }
	  System.out.println();
	  
	  System.out.println("*********Data of the specific column***********");
	  
	  List<WebElement> s5= driver.findElements(By.xpath("//table[@name='BookTable']//tr//td[2]"));
      
	  for(WebElement i2:s5)
	  {
		  System.out.println(i2.getText() +" ");
	
	  }
   
	  // print the data 
	  
      System.out.println("***********HPrint the data*********");
	  
	  List<WebElement> s6= driver.findElements(By.xpath("//table[@name='BookTable']//tr//td"));
	  
	  System.out.println("Size of the table:" +s6.size());
	  
	  for (WebElement l3:s6)
	  {
		  System.out.println(l3.getText());
	  }
	  
  
  
  
  } 
  
  
  
  
}
