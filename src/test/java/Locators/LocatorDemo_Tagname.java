package Locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo_Tagname {

	public static void main(String[] args) 
	{
        WebDriver w1 =new ChromeDriver();
		
		//open Google
        w1.get("https://www.google.com");
        
        w1.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        
        w1.navigate().to("https://tutorialsninja.com/demo/index.php?route=account/register");
        
        List<WebElement> L1= w1.findElements(By.tagName("input"));
        
        System.out.println("Total input boxes:" +L1.size());
        
        List<WebElement> images= w1.findElements(By.tagName("img"));
        
        System.out.println("Total images:" +images.size());
        
        List<WebElement> alllinks= w1.findElements(By.tagName("a"));
        
        System.out.println("Total links:" +alllinks.size());
        
        for(WebElement s:alllinks)
        {
        	System.out.println(s.getAttribute("href"));
        	System.out.println(s.getText());
        }

	}

}
