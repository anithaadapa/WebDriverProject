package handlingexternalelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectOptionExample {
	
	public static void main(String args[]) throws InterruptedException
	{
		
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganitha3\\eclipse-workspace\\WebDriverProject\\chromedriver.exe"); 
	
	   
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
      
      driver.manage().window().maximize();
      
      driver.switchTo().frame("iframeResult");
      
      WebElement SelectCar = driver.findElement(By.id("cars"));
      
      Select s1 = new Select(SelectCar);
      
      //select the value in the drop 
      
      s1.selectByValue("volvo");
      s1.selectByValue("saab");
      
      //all the values will be deselected
      s1.deselectAll();
      s1.deselectByValue("volvo");
      
}
}