package com.group.TestScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.LregistrationForm;

public class SeleniumPracticeTest {
	
	WebDriver driver=null;
	
	@Test
	public void alterTest() throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:/Users/Rajesh/eclipse-workspace/RajWorkspace/Rselenium/drivers/chromedriver.exe");	
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.way2automation.com/demo.html");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Alert")).click();
	Thread.sleep(3000);
	
	
	LregistrationForm ip1 = new LregistrationForm(driver);
	
	Set<String> windows = driver.getWindowHandles();
	String currentWindow1 = null;
	for (String window: windows) {
		driver.switchTo().window(window);
		currentWindow1=driver.getCurrentUrl();
		if(currentWindow1.equalsIgnoreCase("http://way2automation.com/way2auto_jquery/index.php")) {
			System.out.println(currentWindow1);
			break;
		}
		
	}
	
	System.out.println(currentWindow1);
	  Thread.sleep(3000);
	  ip1.rSignIn().click();
	  Thread.sleep(2000);
	  ip1.setSIuserName();
	  ip1.setSIpassWord(); 
	  ip1.clickSIsubmit();
	  Thread.sleep(3000);
	  driver.findElement(By.linkText("Alert")).click();
	  Thread.sleep(4000); 
		/*
		 * String pt1
		 * =driver.findElement(By.xpath("//a[contains(text(),'Simple Alert')]")).getText
		 * (); if (pt1.equals("Simple Alert")) { System.out.println("PASS"); }
		 */
	  
	  driver.switchTo().frame(0);
	  driver.findElement(By.xpath("//button[contains(text(),'Click the button to display an alert box:')]")).click();
	  //driver.findElement(By.xpath("//button[contains(text(),'Click the button to display an alert box:')]")).click();
	  String at1 = driver.switchTo().alert().getText();
	  System.out.println(at1);
	  driver.switchTo().alert().accept();
	  Thread.sleep(1000);
	  driver.switchTo().defaultContent();
	  driver.findElement(By.xpath("//a[contains(text(),'Input Alert')]")).click();
	  Thread.sleep(2000);
	  driver.switchTo().frame(1);
	  driver.findElement(By.xpath("//button[contains(text(),'Click the button to demonstrate the Input box.')]")).click();
	  driver.switchTo().alert().sendKeys("rajesh");
	  Thread.sleep(2000);
	  driver.switchTo().alert().accept();
	  driver.switchTo().defaultContent();
	 
	}
	


}
