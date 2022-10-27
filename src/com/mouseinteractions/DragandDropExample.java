package com.mouseinteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropExample {
	public static void main(String args[]) throws InterruptedException
	{
		
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganitha3\\eclipse-workspace\\WebDriverProject\\chromedriver.exe"); 
	
	 WebDriver driver = new ChromeDriver();
	 

      driver.get("https://jqueryui.com/droppable/");
     
     driver.manage().window().maximize();
     
     
     WebElement iFrameElement = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
     
     //We have to switch to the iframe 
     
     driver.switchTo().frame(iFrameElement);
     
     Thread.sleep(4000);
     
     WebElement DragFrom = driver.findElement(By.id("draggable"));
     
     WebElement DropTo = driver.findElement(By.id("droppable"));
     
     Actions a1 = new Actions(driver);
     
     a1.dragAndDrop(DragFrom, DropTo).build().perform();
     
     
 }
}
