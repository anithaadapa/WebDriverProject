package com.sikuliexamples;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliClassExample {
	public static void main(String args[]) throws InterruptedException, AWTException, FindFailed
	{
		
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganitha3\\eclipse-workspace\\WebDriverProject\\chromedriver.exe"); 
	
	 WebDriver driver = new ChromeDriver();
	 
	  driver.get("https://www.google.com/");
      
      driver.manage().window().maximize();
      
      Thread.sleep(4000);
      
      //Step 1:Precondtion is capturing the screenshot of the section in the webpage
      
      //Step 2: Create an object for Screen class
      
      Screen s1 = new Screen();
      
      //Step 3: Define the patter for the image section which is captured
      
      Pattern GmailLogin = new Pattern("C:\\Users\\ganitha3\\Pictures\\GmailLogin.png");
      
      Thread.sleep(3000);
      
      s1.click(GmailLogin);
  }
}
