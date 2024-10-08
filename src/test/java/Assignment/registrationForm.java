 //4.Implement a test case using WebDriver to validate the functionality of a registration form.

package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class registrationForm {
  @Test
  public void registerformTest() 
  {
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
	  
	  //Gender
	  
	  driver.findElement(By.id("gender-female")).click();
	  
	  //FirstName
	  
	  driver.findElement(By.name("FirstName")).sendKeys("Lavanya");
	  
	  //LastName
	  
	  driver.findElement(By.id("LastName")).sendKeys("Thomas");
	  
	  //date of birth
	  
	  WebElement e1=driver.findElement(By.cssSelector("select[name='DateOfBirthDay']"));
	  
	  e1.click();
	  
	  e1.sendKeys("17",Keys.ENTER);
	  
      WebElement e2=driver.findElement(By.cssSelector("select[name='DateOfBirthMonth']"));
	  
	  e2.click();
	  
	  e2.sendKeys("April",Keys.ENTER);

	  WebElement e3=driver.findElement(By.cssSelector("select[name='DateOfBirthYear']"));
	  
	  e3.click();
	  
	  e3.sendKeys("1997",Keys.ENTER);
	  
	  driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("abitest@gmail.com");
	  
	  //company
	  
	  driver.findElement(By.id("Company")).sendKeys("KG INFORMATION TECHNOLOGY");
	  
	  //Your Password

	  
	 driver.findElement(By.id("Password")).sendKeys("Test@123");
	 
	 driver.findElement(By.id("ConfirmPassword")).sendKeys("Test@123");
	 
	 //Submit button
	 
	 driver.findElement(By.xpath("//button[text()='Register']")).click();
		  
  }
}
