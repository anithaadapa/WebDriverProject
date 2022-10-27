package com.WebElementMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethodsExample {

	public static void main(String args[]) throws InterruptedException
	{
		
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganitha3\\eclipse-workspace\\WebDriverProject\\chromedriver.exe"); 
	
	 WebDriver driver = new ChromeDriver();
	 
	 driver.get("https://the-internet.herokuapp.com/login");
	 
	 driver.manage().window().maximize();
	 
	 //assigning userName that completely into one webelement
	 
	 WebElement userName = driver.findElement(By.id("username"));
	 
	 userName.sendKeys("tomsmith");
	 
	// to clear the value in the input field
	 
	 userName.clear();
	 
	 // to use submit method
	 
	 WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
	 
	 //Submit button is used on the button types where the input type is submit
	 
	 submitButton.submit();
	 
	 Thread.sleep(3000);
	 
	 WebElement errorMessage =driver.findElement(By.id("flash"));
	 
	 // get text method is used to get the text from the webpage
	// String ErrorMessage = errorMessage.getText();
	 
	 System.out.println(errorMessage.getText());
	 
	 System.out.println(errorMessage);
	 
	 WebElement loginPageText = driver.findElement(By.tagName("h2"));
	 System.out.println(loginPageText.getText());
    
	 //Navigate to will redirect to the url which the user has specified
	  driver.navigate().to("https://register.rediff.com/register/register.php?FormName=user_details");
      
      driver.navigate().back();
      
      driver.navigate().forward();
      
      //Refresh the page
      
      driver.navigate().refresh();
      
      driver.navigate().to("https://the-internet.herokuapp.com/checkboxes");
      
      Thread.sleep(2000);
      WebElement CheckBox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
      
      System.out.println(CheckBox1.isDisplayed());
      System.out.println(CheckBox1.isEnabled());
      System.out.println(CheckBox1.isSelected());
  
      WebElement CheckBox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
      System.out.println(CheckBox2.isDisplayed());
      System.out.println(CheckBox2.isEnabled());
      System.out.println(CheckBox2.isSelected());
     

      WebElement ElemLink = driver.findElement(By.xpath("//a[text()='Elemental Selenium']"));
      
      //to print the dimension of the webelement( height and width)
      
      System.out.println("prniting the height and width of element");
      System.out.println(ElemLink.getSize().getHeight());
      System.out.println(ElemLink.getSize().getWidth());
      System.out.println(ElemLink.getLocation());
      System.out.println(ElemLink.getRect());


      
      System.out.println("The Link for the WebElement:");
      System.out.println(ElemLink.getAttribute("href"));
      
      System.out.println("Print the color of the link");
      System.out.println(ElemLink.getCssValue("color"));
      
      System.out.println("Print the color of the link");
      System.out.println(ElemLink.getCssValue("text-decoration"));
      
      System.out.println("To print the tag Name");
      System.out.println(ElemLink.getTagName());

      driver.navigate().to("https://the-internet.herokuapp.com/");
      
      Thread.sleep(2000);
      
      List <WebElement> allLinks = driver.findElements(By.tagName("a"));
      
      for(int i=0;i<allLinks.size();i++)
      {
          //To get the text of all the links
          System.out.println(allLinks.get(i).getText());
          
          System.out.println(allLinks.get(i).getAttribute("href"));
          
          
          
      }




}
}