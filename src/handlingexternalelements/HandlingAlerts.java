package handlingexternalelements;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {
	
	public static void main(String args[]) throws InterruptedException
	{
		
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganitha3\\eclipse-workspace\\WebDriverProject\\chromedriver.exe"); 
	
	   
     WebDriver driver = new ChromeDriver();
     
     driver.get("https://the-internet.herokuapp.com/javascript_alerts");
     
     driver.manage().window().maximize();
     
     WebElement JSAlert = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
     
     JSAlert.click();
     
     Alert a1 = driver.switchTo().alert();
     
     a1.accept();
     
     WebElement CofirmAlert = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
     
     CofirmAlert.click();
     
     System.out.println(a1.getText());
     
     a1.dismiss();
     
}
}