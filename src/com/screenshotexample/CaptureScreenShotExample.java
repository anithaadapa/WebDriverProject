package com.screenshotexample;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenShotExample {
	
	public static void main(String args[]) throws InterruptedException, AWTException, IOException
	{
		
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganitha3\\eclipse-workspace\\WebDriverProject\\chromedriver.exe"); 
	
	 WebDriver driver = new ChromeDriver();
	 
	 driver.get("https://the-internet.herokuapp.com/upload");
	 driver.manage().window().maximize();
	 
	//Capturing your driver object screenshot as a file
     File Screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     
     //Save the file into location
     
     FileUtils.copyFile(Screenshot, new File ("C:\\Users\\ganitha3\\Documents\\Image1.png"));
     
     driver.quit();
     
     
     
 }

}
