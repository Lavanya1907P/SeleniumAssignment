package webElement;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args)
    {
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//Click on proceed
		
		driver.findElement(By.name("proceed")).click();
		
		Alert a1=driver.switchTo().alert();
		
		System.out.println("Alert Text :" +a1.getText());
		
		a1.accept();
		
		
		
		

	}

}
