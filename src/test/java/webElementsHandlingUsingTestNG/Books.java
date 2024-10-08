package webElementsHandlingUsingTestNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Books {
  @Test
  public void listOfBooks() throws InterruptedException 
  {
	  WebDriver s1=new ChromeDriver();
	  
	  //get the url
	  
	  s1.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
	  
	  //maximize the window.
	  
	  s1.manage().window().maximize();
	  
	  //wait time
	  
	  s1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  //inside the frame.
	  
	  s1.switchTo().frame("globalSqa");
	  
	  //find the search element.
	  
	  WebElement e1=s1.findElement(By.id("s"));
	  
	  
	  //send what to search.
	  
	  e1.sendKeys("Books",Keys.ENTER);
	  
	  List <WebElement> Le1 =s1.findElements(By.xpath("//div[@id='wrapper'] // ol[@class='search_res'] //li//h3//a"));
	  	  
	  System.out.println("Number of books in the frame :" +Le1.size());
	  
	  Thread.sleep(5000);
	  
	  for(WebElement b1:Le1)
	  {
		  System.out.println("Books names : " +b1.getAttribute("href"));
		  System.out.println("Books names : " +b1.getText());
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
