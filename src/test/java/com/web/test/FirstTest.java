package com.web.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

	public static void main(String[] args) {
		WebDriver d1= new ChromeDriver();
			
		d1.get("https://www.google.com");
		d1.close();
	

	}

}
