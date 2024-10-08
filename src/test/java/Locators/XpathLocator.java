package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class XpathLocator {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver e1 =new ChromeDriver();
		
		e1.manage().window().maximize();
		
		e1.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		e1.findElement(By.xpath("//input[@name='email']")).sendKeys("testmay2024@gmail.com");
		
		Thread.sleep(5);
		
		e1.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("test123");
		
		e1.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		
		e1.quit();
		
		

	}

}
