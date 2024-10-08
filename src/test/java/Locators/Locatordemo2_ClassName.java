package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatordemo2_ClassName {

	public static void main(String[] args) 
	{
		 WebDriver w1 =new ChromeDriver();
		 
		//open Google
        w1.get("https://www.google.com");
       
        /*
        w1.navigate().to("https://tutorialsninja.com/demo/index.php?route=account/login");
        
        // to maximize the size of the browser.
        w1.manage().window().maximize();
        
        //emailid
        
        w1.findElement(By.name("email")).sendKeys("test@gmail.com");

        //password
        
        w1.findElement(By.name("password")).sendKeys("test123");
        
        //submit:
        
        w1.findElement(By.cssSelector("input.btn.btn-primary")).click();
        
        */
        
        w1.navigate().to("https://automationplayground.com/crm/login.html");
        
        // to maximize the size of the browser.
        w1.manage().window().maximize();
        
        //email
        w1.findElement(By.id("email-id")).sendKeys("test@gmail.com");
        
        //password
        
        w1.findElement(By.name("password-name")).sendKeys("test123");
                
        //check
        
        w1.findElement(By.id("remember")).click();
              
        //submit
        
        w1.findElement(By.className("btn-primary")).click();
        
	}

}
