package com.group.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyGoogleSearch {
	
	WebDriver driver = null;
	
	@Test
	public void googleSearchTest()
	{
	  
		System.setProperty("webdriver.chrome.driver", "C:/Users/Rajesh/eclipse-workspace/RajWorkspace/Rselenium/drivers/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.navigate().to("https://www.google.com");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).click();
//	    driver.findElement(By.name("q")).sendKeys("Automation Step By Step");
//	    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//	    driver.getPageSource().contains("Online Courses");
//	    boolean onlineCourse =  driver.getPageSource().contains("Online Courses");
//	    //Assert.assertEquals(onlineCourse, "Online Courses"); 
//	    Assert.assertEquals(onlineCourse, true);
//	    driver.close();
//	   // driver.findElement(By.xpath("//))
	   
	    driver.close();
		
	}

}
