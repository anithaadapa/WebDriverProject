package com.mouseinteractions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardInteractionsExample {
	

	public static void main(String args[]) throws InterruptedException, AWTException
	{
		
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganitha3\\eclipse-workspace\\WebDriverProject\\chromedriver.exe"); 
	
	 WebDriver driver = new ChromeDriver();
	 
	 driver.get("https://the-internet.herokuapp.com/");
     
     driver.manage().window().maximize();
     
     //To perform keyboard interactions we use a class called as Robot class
     
     Robot r1 = new Robot();
     
     r1.keyPress(KeyEvent.VK_TAB);
     r1.keyRelease(KeyEvent.VK_TAB);
     
     r1.keyPress(KeyEvent.VK_TAB);
     r1.keyRelease(KeyEvent.VK_TAB);
     
     r1.keyPress(KeyEvent.VK_ENTER);
     r1.keyRelease(KeyEvent.VK_ENTER);

     r1.keyPress(KeyEvent.VK_ENTER);
     r1.keyRelease(KeyEvent.VK_ENTER);  // this goes until to broken images
     
 }

}
