package webElementsHandlingUsingTestNG;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandling {
  @Test
  public void test() throws InterruptedException 
  {
	  WebDriver d1=new ChromeDriver();
	  
	  d1.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  String parentid=d1.getWindowHandle();  
	  
	  System.out.println("Parentid :" +parentid);
	  
	  d1.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
	  
	  Set <String> childid=d1.getWindowHandles();
	  
	  System.out.println("Child id:" +childid);
	  
	  
	  for(String s1:childid)
	  {
		  if(!parentid.equals(s1))
		  {			 
			  d1.switchTo().window(s1);
			  Thread.sleep(5);
			  d1.findElement(By.id("Form_submitForm_EmailHomePage")).sendKeys("test@gmail.com");
              d1.close();
		  }
	  }
	  
	  d1.switchTo().window(parentid);
	  d1.findElement(By.name("username")).sendKeys("Admin");
	  d1.findElement(By.name("password")).sendKeys("admin123",Keys.ENTER);
	  
	  
	  
  }
}
