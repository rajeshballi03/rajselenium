package com.group.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SpiceJetTest {
	
	
	@Test
	public void spiceJetAirWay() throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:/Users/Rajesh/eclipse-workspace/RajWorkspace/Rselenium/drivers/chromedriver.exe"); WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/default.aspx");
		driver.manage().window().maximize();
		Thread.sleep(8000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='HYD']")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='GOI']")).click();
		driver.findElement(By.cssSelector("a[class='ui-datepicker-next ui-corner-all']")).click();
		String test1 = driver.findElement(By.cssSelector("[class='ui-datepicker-title'] [class='ui-datepicker-month']")).getText();
		System.out.println(test1);
		System.out.println(test1);
		/*int sdate=23;
		int count = driver.findElements(By.cssSelector(".ui-state-default")).size();
		for (int i=1; i<count; i++) {
			
			String selectDate = driver.findElements(By.cssSelector(".ui-state-default")).get(i).getText();
			if(selectDate.equals()) {
				System.out.println(sdate);
				driver.findElements(By.cssSelector(".ui-state-default")).get(i).click();
				
				break;
			}
			}
			
		}
*/

	}
}
		
		

		
	


