package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TagName {

	public static void main(String[] args) {
		
		
		//W.A.Script to automate https://www.naukri.com/ page 
		//get total count of links Print href value and text of every link into console
         
		WebDriver dd1 = new ChromeDriver();
		
		//get the URL
		
		dd1.get("https://www.naukri.com");
		
		//get total count of links
		
		List<WebElement> e1 = dd1.findElements(By.tagName("a"));
		
		System.out.println("Total count of the Nakuri link" +e1.size());
		
		//text of every link into console
		
	    for(WebElement s1: e1)
	    {
	    	System.out.println("Atribute:" +s1.getAttribute("href"));
	    	
	    	System.out.println("Value:" +s1.getText());
	    }
		
		

	}

}
