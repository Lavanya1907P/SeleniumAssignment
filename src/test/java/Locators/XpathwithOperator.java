package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class XpathwithOperator {

	public static void main(String[] args) 
	{
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		
		driver.findElement(By.xpath("//input[@class='form-control' and @name='firstname']")).sendKeys("bunny");
		
		driver.findElement(By.xpath("//input[@class='form-contrl' or @name='lastname']")).sendKeys("avuala");
		
		driver.findElement(By.xpath("(//input[@class='form-control'])[3]")).sendKeys("test@gmail.com");
		
		driver.findElement(By.xpath("(//input[@class='form-control'])[position() = 4]")).sendKeys("2345678765");
		
	}

}
