package webElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {

	public static void ut(WebElement f1, String value)	
	{
		
		Select s1=new Select(f1);
   		
		System.out.println("is the dropdown is multiple or single : "  +s1.isMultiple());
		
	    //to get the all the options.
	    
	    List <WebElement> d1= s1.getOptions();
	    
	    for(WebElement q1:d1)
	    {
	    
	    System.out.println("option List : " +q1.getText());
	    
	    if(q1.getText().contains(value))
	    {
	    	q1.click();
	    	
	    	break;
	    }
	    }
	}
		
	    
	    
	    public static void pageDown(WebDriver driver)
	    {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
		 
    	//js.executeScript("window.scrollTo(0,5000)");
	  
	    //Scroll to top
	  
	    js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	  
	    }
	    
	    public static void pageUp(WebDriver driver)
	    {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
		 
    	//js.executeScript("window.scrollTo(0,5000)");
	  
	    //Scroll to top
	  
	    js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
	  
	    }
	    
	    public static void pageInbetween(WebDriver driver,WebElement e1)
	    {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
		 
    	//js.executeScript("window.scrollTo(0,5000)");
	  
	    //Scroll to top
	  
	    js.executeScript("arguments[0].scrollIntoView(true);", e1);
	  
	    }
        
	    
	    public static WebElement PresenceofElement (WebDriver w1,By loc)
	    {
	    	WebDriverWait wait1= new WebDriverWait(w1, Duration.ofSeconds(5));
	  	  
	  	    return wait1.until(ExpectedConditions.presenceOfElementLocated(loc));
	  	  
	    }
	  	  
	    public static WebElement visibilityOfElementLocated(WebDriver w1,By loc)
	    {
	  	  WebDriverWait wait1= new WebDriverWait(w1, Duration.ofSeconds(10));
	  	  
	  	  return wait1.until(ExpectedConditions.visibilityOfElementLocated(loc));
	  	  
	  	  
	    }
	    public  static WebElement elementToBeClickable(WebDriver w1,By loc)
	    
	    {
	  	  WebDriverWait wait1= new WebDriverWait(w1, Duration.ofSeconds(10));
	  	  
	  	  return wait1.until(ExpectedConditions.elementToBeClickable(loc));
	    }
	

}
