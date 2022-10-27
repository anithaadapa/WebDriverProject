package com.mouseinteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseInteractionExample {
	
	public static void main(String args[]) throws InterruptedException
	{
		
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganitha3\\eclipse-workspace\\WebDriverProject\\chromedriver.exe"); 
	
	 WebDriver driver = new ChromeDriver();
	 
	 driver.get("https://the-internet.herokuapp.com/");
     
     driver.manage().window().maximize();
  
       WebElement link = driver.findElement(By.xpath("//a[text()='A/B Testing']"));
     
     //Step 1 is to create an objection for Action class with respect to the webdriver
     
     Actions a1 = new Actions(driver);
     
     //Step 2 is to perform the action on the webelement
     
     a1.moveToElement(link).click().perform();
     
     driver.navigate().back();
     
     Thread.sleep(4000);
     
     //To perform hover action
     
     a1.moveToElement(link).build().perform();
     
     //To perform right click
     
     a1.moveToElement(link).contextClick().build().perform();

}
}