package com.tableexamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablePractice {
	public static void main(String args[]) throws InterruptedException
	{
		
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganitha3\\eclipse-workspace\\WebDriverProject\\chromedriver.exe"); 
	
	 WebDriver driver = new ChromeDriver();
	 
	 driver.get("https://the-internet.herokuapp.com/tables");
     
     driver.manage().window().maximize();
     
     //Always use your xpath with the table name/id reference, don't directly identify with the th or td
     
     List<WebElement> col = driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th"));
     
  
     List <WebElement> rowSize = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr")); 
     
     System.out.println("The number of col:" +col.size());
     
     System.out.println("The number of row:" +rowSize.size());
     
     for(int i=0;i<col.size();i++)
     {
         
         System.out.println(col.get(i).getText());
         
     }
     
	 
}
}
