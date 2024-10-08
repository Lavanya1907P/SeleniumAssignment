package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo4 {

	public static void main(String[] args) 
	{
		WebDriver w1 =new ChromeDriver();
		
		//open Google
        w1.get("https://www.google.com");
        
        w1.navigate().to("https://automationplayground.com/crm/login.html");
        
        // to maximize the size of the browser.
        w1.manage().window().maximize();
        
        // when not able to find the element, can globally use the implicitlywait.

        w1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        w1.findElement(By.name("email-name")).sendKeys("test@gmail.com");   //password : test123

	}

}
