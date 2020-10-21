package com.group.TestScripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;
import org.testng.annotations.Test;

public class OrbitTest {

	@Test
	public void myPracticeTest() throws AWTException {

		System.setProperty("webdriver.chrome.driver","C:/Users/Rajesh/eclipse-workspace/RajWorkspace/Rselenium/drivers/chromedriver.exe"); WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");

		//Actions tabs = new Actions(driver);


		String parentWindow = driver.getWindowHandle();

		
		
		Robot tab = new Robot();
		tab.keyPress(KeyEvent.VK_CONTROL);
		tab.keyPress(KeyEvent.VK_T);
		tab.keyRelease(KeyEvent.VK_CONTROL);
		tab.keyRelease(KeyEvent.VK_T);

		 
	
		
		/*
		 * tab.keyPress(KeyEvent.VK_CONTROL); tab.keyPress(KeyEvent.VK_PASTE);
		 * tab.keyRelease(KeyEvent.VK_CONTROL); tab.keyRelease(KeyEvent.VK_PASTE);
		 */

		
		  Set<String> windows = driver.getWindowHandles(); 
		  for(String window1:windows) {
		  
			  driver.switchTo().window(window1); 
		 
			  String childWindow = driver.getWindowHandle();
			  
		  if(parentWindow.equals(childWindow))
		  {
		  driver.get("https://www.facebook.com/");
		  }
	
	
		  }
		  
		  
		 






	}


}
