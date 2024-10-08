package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectDropdown {

	public static void main(String[] args) {
		
		WebDriver w1= new ChromeDriver();
		
		w1.manage().window().maximize();
		
		w1.get("https://www.amazon.in/gp/cart/view.html?ref_=nav_cart");
		
		w1.manage().window().maximize();
		
		WebElement e1= w1.findElement(By.id("searchDropdownBox"));
		
		Utility.ut(e1, "Amazon Devices");
		
		
		
		
	}
		
		
}
