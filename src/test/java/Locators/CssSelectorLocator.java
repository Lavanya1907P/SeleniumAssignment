package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CssSelectorLocator {

	public static void main(String[] args)
	{
		WebDriver s2= new ChromeDriver();
		
		s2.get("https://www.saucedemo.com/");
		
		// username  -- css selector tagname with id
		s2.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		
		//password  -- css selector tagname with attribute
		s2.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("secret_sauce");
		
		//login -- css selector tag name with classname
		//s2.findElement(By.cssSelector("input.submit-button")).click();
		
		//login -- css selector tag name with classname,id,attribute
		s2.findElement(By.cssSelector("input.submit-button#login-button[data-test='login-button']")).click();
		
		

	}

}
