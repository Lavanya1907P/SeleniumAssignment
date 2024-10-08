package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Xpathgettext {

	public static void main(String[] args) 
	{
		WebDriver d1= new ChromeDriver();
		
		d1.manage().window().maximize();
		
		d1.get("https://www.amazon.in");
		
		d1.findElement(By.xpath("//a[text()='Best Sellers']")).click();
		
		d1.findElement(By.xpath("//span[normalize-space()='Cart']")).click();
		
		//WebElement w1=d1.findElement(By.xpath("//h2[normalize-space()='Your Amazon Cart is empty']"));
		
		//System.out.println(w1.getText());
		
		WebElement w2 =d1.findElement(By.xpath("//h2[contains(text(),'Cart is empty')]"));
		System.out.println(w2.getText());
		
		d1.findElement(By.xpath("//input[contains(@id,'searchtextbox')]")).sendKeys("Watch",Keys.ENTER);
		
		WebElement w3 =d1.findElement(By.xpath("//input[starts-with(@id,'two')]"));
		w3.clear();
		w3.sendKeys("Baby head protector",Keys.ENTER);
		
		
		

	}

}
