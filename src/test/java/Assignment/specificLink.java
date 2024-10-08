 // 1.Write a WebDriver script to navigate to a website and click on a specific link.
package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class specificLink {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		//Navigating to website
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		WebElement el1 =driver.findElement(By.xpath("//a[text()='orange HRM']"));
		
		el1.click();
		
		if(driver.getTitle().contains("OrangeHRM"))
		{
			System.out.println("Test Pass");
		}
		else
		{
			System.out.println("Test Fail");
		}
			
		driver.close();
				
	}
}
