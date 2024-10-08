package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatordemo3_Linktext {

	public static void main(String[] args) 
	{
		    WebDriver w1 =new ChromeDriver();
			
			//open Google
	        w1.get("https://www.google.com");
	        
	        w1.navigate().to("https://automationplayground.com/crm/");
	        
	        // to maximize the size of the browser.
	        w1.manage().window().maximize();
	
	        // to find the element using link text.
          //  w1.findElement(By.linkText("Sign In")).click();             <a>     Sign In   </a>
	        
	          w1.findElement(By.partialLinkText("Sign")).click();
	}

}
