package com.waitexamples;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;


public class ImplicitWaitExample {
	
	public static void main(String args[]) throws InterruptedException
	{
		
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganitha3\\eclipse-workspace\\WebDriverProject\\chromedriver.exe"); 
	
	 WebDriver driver = new ChromeDriver();
	 
	 driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
	 
	 driver.manage().window().maximize();
	 
	 WebElement button = driver.findElement(By.xpath("//div[@id='start']/button"));
     
     button.click();
     //Implicit wait
     
     //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
     
    // WebElement message = driver.findElement(By.xpath("//div[@id='finish']/h4"));
     
    // System.out.println(message.getText());
     
     //Explicit Wait
     
     driver.navigate().to("https://the-internet.herokuapp.com/");
     //Step 1
     WebDriverWait wait = new WebDriverWait(driver,10);
     
     //Step 2
     WebElement link = driver.findElement(By.xpath("//a[text()='A/B Testing']"));
     wait.until(ExpectedConditions.visibilityOf(link));


     link.click();
    
  //   WebElement message = driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3")); my code
  //   System.out.println(message.getText()); my code
     
     Thread.sleep(2000);
     
     FluentWait wait1 = new FluentWait<WebDriver>(driver).withTimeout(30,TimeUnit.SECONDS).pollingEvery(5,TimeUnit.SECONDS)
             .ignoring(NoSuchElementException.class);
     
     WebElement link1 = (WebElement) wait1.until(new Function<WebDriver, WebElement>()
     {
         public WebElement apply(WebDriver driver)
         {
             return driver.findElement(By.xpath("//a[text()='A/B Testing']"));
         }
     });
     
     link1.click();
     
}
}