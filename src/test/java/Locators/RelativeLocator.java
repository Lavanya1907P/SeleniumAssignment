package Locators;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocator {

	public static void main(String[] args) 	
	{
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/"); 
		
		//WebElement w1=driver.findElement(By.id("twotabsearchtextbox"));
				
		driver.findElement(with(By.id("twotabsearchtextbox")).above(By.xpath("//a[text()='Gift Cards']"))).sendKeys("cars",Keys.ENTER);
		
		//different types of relative locator
		   //1.Above 2.Below 3.Near 4.toRightOf 5.toLeftOf
		
	}
	

}
