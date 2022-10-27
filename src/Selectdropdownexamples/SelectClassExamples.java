package Selectdropdownexamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassExamples {
	
	public static void main(String args[]) throws InterruptedException
	{
		
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganitha3\\eclipse-workspace\\WebDriverProject\\chromedriver.exe"); 
	
	 WebDriver driver = new ChromeDriver();
	 
	 driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	 
	 driver.manage().window().maximize();
     WebElement DOB = driver.findElement(By.xpath("//select[starts-with(@name,'DOB_Day')]"));
     
     Select dateofBirth = new Select(DOB);
     
     
     //Selecting by Index
     //dateofBirth.selectByIndex(1);
     
     //Select by value
     dateofBirth.selectByValue("10");
     
     //Select by visibile text
     
     dateofBirth.selectByVisibleText("17");
     
     dateofBirth.deselectByValue("17");
     
     
}
}