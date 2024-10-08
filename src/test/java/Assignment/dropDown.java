package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement e1 =driver.findElement(By.xpath("//select"));
		
		Select s1 = new Select(e1);
		
		List<WebElement> e2 = s1.getOptions();
		
		for(WebElement w1:e2)
		{
			System.out.println(w1.getText());
			
			if(w1.getText().contains("American Samoa"))
			{
				w1.click();
				
				break;
			}
		
		}
	
	}

}
