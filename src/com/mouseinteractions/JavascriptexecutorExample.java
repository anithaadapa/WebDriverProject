package com.mouseinteractions;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptexecutorExample {

	public static void main(String args[]) throws InterruptedException, AWTException
	{
		
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganitha3\\eclipse-workspace\\WebDriverProject\\chromedriver.exe"); 
	
	 WebDriver driver = new ChromeDriver();
	 
	 driver.get("https://the-internet.herokuapp.com/");
     
     driver.manage().window().maximize();
     WebElement link = driver.findElement(By.xpath("//a[text()='A/B Testing']"));
     
  // java script executor can be used to perform the scroll action. inject it.this is the third option we can use after normal click and actions class
     
     JavascriptExecutor js =(JavascriptExecutor) driver;
     
     //To click on an element
     
     js.executeScript("arguments[0].click()", link);  // to have all teh elements into the array elements we pass the arguments
     
     driver.navigate().back();
     
     Thread.sleep(4000);
     
     //To scroll down the page
     
     js.executeScript("window.scrollBy(0,500)", "");
     
     //To scroll up the page
     
     js.executeScript("window.scrollBy(0,-300)", "");
     
     // to go to a particular link
     WebElement HoverLink = driver.findElement(By.xpath("//a[text()='Hovers']"));
     
     //To scroll to an element
     
     js.executeScript("arguments[0].scrollIntoView()", HoverLink);
     
 }
     
}


