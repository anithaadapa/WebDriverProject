package com.screenshotexample;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class FullScreenShotExample {
	public static void main(String args[]) throws InterruptedException, AWTException, IOException
	{
		
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganitha3\\eclipse-workspace\\WebDriverProject\\chromedriver.exe"); 
	
	 WebDriver driver = new ChromeDriver();
	 
	 driver.get("https://the-internet.herokuapp.com/");
	 driver.manage().window().maximize();
	 
     
     String title = driver.getTitle();
     
     Screenshot fp = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
     
     ImageIO.write(fp.getImage(),"PNG", new File ("./Screenshots/"+title+".png"));
     
     
 }

}
