package com.locatortypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RealTimeExample {
	public static void main(String args[]) throws InterruptedException
	{
		
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganitha3\\eclipse-workspace\\WebDriverProject\\chromedriver.exe"); 
	
	 WebDriver driver = new ChromeDriver();
	 
	 driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	 
	 driver.manage().window().maximize();
	// driver.findElement(By.name("name66d31004")).sendKeys("anitha");  //this will fail.name value is changing on each refresh. should be careful in writing  xpath
	 
	 //to handle the error
	 
    driver.findElement(By.xpath("//input[starts-with(@name,'name')]")).sendKeys("anitha");
    		

}
}