package webElementsHandlingUsingTestNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Calender {
  @Test
  public void f() 
  {
	  WebDriver driver =new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
	  
	  driver.get("https://www.redbus.in/");
	  
      // client requirement
	  
	  String day ="2";
	  
	  String Month ="Oct";
	  
	  String Year = "2025";
	  
	  
	  //automate the calender - first get the element
	  
	  driver.findElement(By.className("sc-cSHVUG")).click();
	  
	  while(true) {
	  //month selection
	  String CurrentMonth=driver.findElement(By.xpath("(//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'])[2]")).getText();
	  
	  System.out.println("Current date:" +CurrentMonth);
	  
	  String cmonth = CurrentMonth.split(" ")[0];
	  
	  System.out.println("Current month:" +cmonth);
	  
      String cyear = CurrentMonth.split(" ")[1];
	  
	  System.out.println("Current year:" +cyear);
	  
	 
	  if(cmonth.contains(Month) && cyear.contains(Year))
	  {
		  break; 
	  }else
	  {
		  driver.findElement(By.xpath("(//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'])[3]")).click();
	  }
	  
	  }
	   
	   //day selection
	  
	  List<WebElement> L1=driver.findElements(By.xpath("//span[contains(@class,'DayTiles__CalendarDaysSpan')]"));
	  
	  for(WebElement s1:L1)
	  {
		  if(s1.getText().contains(day))
		  {
			  s1.click();
			  break;
		  }
	  }
	  
	
	  
	  
	  
	  
	  
	  
  }
}
