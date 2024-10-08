package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;


public class XpathAxies {

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://automationplayground.com/crm/login.html");
		
		driver.findElement(By.id("email-id")).sendKeys("test@gmail.com",Keys.ENTER);
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("test123",Keys.ENTER);
		
	    String str1=driver.findElement(By.xpath("//td[text()='John'] // ancestor :: tbody")).getTagName();
	    
	    System.out.println("Ancestor of John : " +str1);
	    
	    String str2=driver.findElement(By.xpath("//td[text()='John'] // parent :: tr")).getTagName();
	    
	    System.out.println("Parent of John: " +str2);
	    
	    int c1= driver.findElements(By.xpath("//tbody//tr[4]//child::td")).size();
	    
	    System.out.println("Child of john : "+c1);
	    
	    int c2= driver.findElements(By.xpath("//tbody//tr[4]//following ::tr")).size();

	    System.out.println("following of john : " +c2);
	    
	    int c3= driver.findElements(By.xpath("//td[text()='John']//preceding::tr")).size();

	    System.out.println("Preceding of john : " +c3);
	    
	    int cc4= driver.findElements(By.xpath("//td[text()='John']//following-sibling::td")).size();

	    System.out.println("following-sibiling of john : " +cc4);
	    
	    int cc5= driver.findElements(By.xpath("//td[text()='John']//preceding-sibling::td")).size();

	    System.out.println("preceding-sibiling of john : " +cc5);
	    
	    List<WebElement> l2= driver.findElements(By.xpath("//tbody//tr//td[2]"));
	    
	    for(WebElement s: l2)
	    {
	    	
	        System.out.println(s.getText());
	   
	    }
	    
	   
	    
	  
	    
	   
		
		

	}

}
