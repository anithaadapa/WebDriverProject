package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
      
      WebDriver driver = new ChromeDriver();
      
      driver.get("https://www.simplilearn.com/");
      driver.close();
	}

}
