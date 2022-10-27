package com.locatortypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorTypeExamples {
	public static void main(String args[]) throws InterruptedException
	{
		
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganitha3\\eclipse-workspace\\WebDriverProject\\chromedriver.exe"); 
	
	 WebDriver driver = new ChromeDriver();
	 
	 driver.get("https://the-internet.herokuapp.com/login");
	 
	 driver.manage().window().maximize();
	 
	 //to use ID selector to access/perform action
	 
	 driver.findElement(By.id("username")).sendKeys("tomsmith");
	 
	 //using name selector
	 driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
	 
	 //using Class name selector
	 
	 driver.findElement(By.className("radius")).click();
	// driver.findElement(By.linkText("logout")).click();
	 
	 //using tag name. html tag is used only once. like website link. 
	 
	// driver.findElement(By.tagName("a")).click();
	 
	 //using link Text
	//  driver.findElement(By.linkText("A/B Testing")).click();
      
      //Using partial link text. just give partial link name
      
     // driver.findElement(By.partialLinkText("A/B")).click();
	 
	 //using xpath
	// driver.wait();
	 
	 driver.findElement(By.xpath("//*[@id=\"content\"]/div/a")).click();
	 
	 //driver.findElement(By.cssSelector("button.radius")).click();
	 
}

}
