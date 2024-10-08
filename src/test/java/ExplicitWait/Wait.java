package ExplicitWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import webElement.Utility;

public class Wait {
  @Test
  public void eWait() 
  {
	  WebDriver w1= new ChromeDriver();
	  
	  w1.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	  
	  By email = By.id("input-email");
	  
	  By pass = By.id("input-password");
	  
	  By submit = By.xpath("//input[@value='Login']");
	  
	  WebDriverWait wait1= new WebDriverWait(w1, Duration.ofSeconds(5));
	  
	  wait1.until(ExpectedConditions.presenceOfElementLocated(email)).sendKeys("test@gmail.com");
	  
	  WebDriverWait wait2= new WebDriverWait(w1, Duration.ofSeconds(5));
	  
	  WebElement Pasele= wait2.until(ExpectedConditions.visibilityOfElementLocated(pass));
	  
	  Pasele.click();
	  
	  Pasele.sendKeys("test123");
	  
	  
	 /* 
	  * WebDriverWait wait3= new WebDriverWait(w1, Duration.ofSeconds(5));
	  
	    wait3.until(ExpectedConditions.elementToBeClickable(submit)).click();
	 */ 
	  
	  
	  Utility.elementToBeClickable(w1, submit).click();
	  
	  
	  
	  
	  
	  
	  
  }
}
