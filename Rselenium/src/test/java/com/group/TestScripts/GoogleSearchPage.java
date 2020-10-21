package com.group.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class GoogleSearchPage {
	
	public static void textbox_Gsearch() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Rajesh/eclipse-workspace/RajWorkspace/Rselenium/drivers/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.navigate().to("https://www.google.com");
	    driver.manage().window().maximize();
	    driver.findElement(By.name("q")).sendKeys("Automation Step By Step");
	    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	    driver.getPageSource().contains("Online Courses");
	    boolean onlineCourse =  driver.getPageSource().contains("Online Courses");
	    //Assert.assertEquals(onlineCourse, "Online Courses"); 
	    Assert.assertEquals(onlineCourse, true);
	    driver.close();
	    
	    
	    
	    
	  
	}
	

}
