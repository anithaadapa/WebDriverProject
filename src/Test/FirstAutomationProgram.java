package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstAutomationProgram {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		 //This step is to set the location of our Browser executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganitha3\\eclipse-workspace\\WebDriverProject\\chromedriver.exe");    
        
        //Create an object for WebDriver with reference to ChromeDriver
        
        WebDriver driver = new ChromeDriver();
        
        // To open any URL WE USE A METHOD CALLED AS GET
        
 driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        
        //Need to maximize the browser window
        
        driver.manage().window().maximize();
        
   String title = driver.getTitle();
        
        System.out.println(title);
        
        //To get the page url
        
        String url = driver.getCurrentUrl();
        
        System.out.println(url);
        
        //To close the browser instance
        
        driver.close();
        
	}

}
