package handlingexternalelements;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleTabs {
	public static void main(String args[]) throws InterruptedException
	{
		
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganitha3\\eclipse-workspace\\WebDriverProject\\chromedriver.exe"); 
	
	   
	  WebDriver driver = new ChromeDriver();
      
      driver.get("https://www.google.com/intl/en-GB/gmail/about/");
      
      driver.manage().window().maximize();
      
      //driver.findElement(By.xpath("(//div[@class='faq__grid__faqs__faq__button__arrow'])[3]")).click();
      
      WebElement LearnMore = driver.findElement(By.xpath("(//a[text()='Learn more'])[1]"));
      
      LearnMore.click();
      
      //We need to get the number of tabs opened in the browser
      
      ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
      
      //To get the number of browser tabs
      
      System.out.println("The total number of tabs" +tabs.size());
      
      //This is basically to switch the control to newly opened tab, in array indexing always starts with 0
      driver.switchTo().window((String)tabs.get(1));
    
      
      driver.findElement(By.xpath("(//a[text()='Terms of Service'])[1]")).click();
      
      //close method will close your active browser tab
      driver.close();
      
      driver.switchTo().window((String)tabs.get(0));
      
      
      //Browser will be closed
     // driver.quit();

}
}