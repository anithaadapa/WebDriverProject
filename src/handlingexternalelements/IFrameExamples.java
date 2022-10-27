package handlingexternalelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameExamples {
	
	public static void main(String args[]) throws InterruptedException
	{
		
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganitha3\\eclipse-workspace\\WebDriverProject\\chromedriver.exe"); 
	
	   
	  WebDriver driver = new ChromeDriver();
	  
	 
       
       driver.get("https://the-internet.herokuapp.com/iframe");
       
       driver.manage().window().maximize();
       
       //Switch our control to the iFrame
       
       driver.switchTo().frame("mce_0_ifr");
       
       String ParagraphText = driver.findElement(By.xpath("//p[text()='Your content goes here.']")).getText();
       
       System.out.println(ParagraphText);
       
       //This is used to switch the control back to the default parent browser
       driver.switchTo().defaultContent();
       
       driver.findElement(By.xpath("//span[text()='File']")).click();

}
}