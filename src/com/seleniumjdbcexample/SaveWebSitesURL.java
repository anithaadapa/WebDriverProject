package com.seleniumjdbcexample;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SaveWebSitesURL {
	
	public static void main(String args[]) throws InterruptedException, AWTException, IOException
	{
		
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganitha3\\eclipse-workspace\\WebDriverProject\\chromedriver.exe"); 
	
	 WebDriver driver = new ChromeDriver();
	 
	 driver.get("https://the-internet.herokuapp.com/");
	 driver.manage().window().maximize();
	 
	 String pageURL = driver.getCurrentUrl();
	 
	 System.out.println(pageURL);
	 
  DBConnect.DatabaseInsert(pageURL);
}
}