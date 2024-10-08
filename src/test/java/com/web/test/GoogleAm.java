package com.web.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GoogleAm 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver w1 =new ChromeDriver();
		
		//open Google
        w1.get("https://www.google.com");
        
        String title1= w1.getTitle();
        
        System.out.println("Title of google page:" + title1);
        
        //Then navigate to amazon  --- to(URL) webelement
        w1.navigate().to("https://www.amazon.in");
        
       //capture title of both application
        
        String title2= w1.getTitle();
        
        System.out.println("Title of amazon page:" + title2);
        
        //then navigate back to Google from amazon
        
       w1.navigate().back();
       
      
       //Capture current url of Google
       
       String url1= w1.getCurrentUrl();
        
       System.out.println("Current URL of the browser:" + url1);
        
       //Then navigate forward and get the current url of amazon
       
       w1.navigate().forward();
       
       String url2=w1.getCurrentUrl();
       
       System.out.println("Current URL of the browser:" + url2);
       
       // and validate Title of amazon should contains Online Shopping.
       
       if(title2.equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"))
       {
    	   System.out.println("Title pass");
       }
       else
       {
    	   System.out.println("Title fail");
       }
       
      WebElement ee1= w1.findElement(By.id("twotabsearchtextbox"));
      
      ee1.sendKeys("Clock",Keys.ENTER);
      
       Thread.sleep(5000);
           
    //close the current browser
       
       w1.quit();

    
	}

}
