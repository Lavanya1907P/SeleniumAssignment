package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatortagname {

	public static void main(String[] args) 
	{
		// Write a automation script to automate Orangehrm application Login an logout functionality
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		
		// invoking the url
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//username
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		//password
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		//login button
		
		driver.findElement(By.className("orangehrm-login-button")).click();
		
		//Logout //dropdown
		
		driver.findElement(By.className("oxd-userdropdown-icon")).click();
		
	    driver.findElement(By.linkText("Cerrar sesión")).click();
	    
	    // close the browser.
	    
	    driver.quit();
		
		
		
		


	}

}
