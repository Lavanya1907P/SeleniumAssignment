package com.web.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTitle {

	public static void main(String[] args)
	{
		//create a new driver with reference.
		WebDriver d1= new ChromeDriver();
		
		//to launch the browser.
		d1.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		
		d1.manage().window().maximize();
		
		String s1=d1.getTitle();
		
		System.out.println("Title :" +s1);
		
		if(s1.equals(s1))
		{
			System.out.println("Test Pass");
		}
		else
		{
			System.out.println("Test fail");
		}
		
		System.out.println("URL"+d1.getCurrentUrl());
		
		System.out.println("URL"+d1.getPageSource());
		
		d1.close();
		

	}

}
