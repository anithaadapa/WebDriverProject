package com.autoitexamples;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadExample {
	public static void main(String args[]) throws InterruptedException, AWTException, IOException
	{
		
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganitha3\\eclipse-workspace\\WebDriverProject\\chromedriver.exe"); 
	
	 WebDriver driver = new ChromeDriver();
	 
	 driver.get("https://the-internet.herokuapp.com/upload");
	 driver.manage().window().maximize();
     
     WebElement fileUpload = driver.findElement(By.id("file-upload"));
     
     //fileUpload.click();
     
     Actions a1 = new Actions(driver);
     
     a1.moveToElement(fileUpload).click().build().perform();
     
     Thread.sleep(4000);
     
     //To give the exe file in the selenium command, we use Runtime method in our program
     
     Runtime.getRuntime().exec("C:\\Users\\ganitha3\\Documents\\FileUploadScript.exe");
     
     
     
 }

}
