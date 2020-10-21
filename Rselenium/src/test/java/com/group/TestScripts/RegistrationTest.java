package com.group.TestScripts;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.pages.LregistrationForm;



public class RegistrationTest{

	/*
	 * public RegistrationTest(WebDriver driver) { super(driver); // TODO
	 * Auto-generated constructor stub }
	 * 
	 */
	/*
	 * public void launchWebPage() { System.setProperty("webdriver.chrome.driver",
	 * "C:/Users/Rajesh/eclipse-workspace/RajWorkspace/Rselenium/drivers/chromedriver.exe"
	 * ); WebDriver driver = new ChromeDriver();
	 * driver.get("http://www.way2automation.com/demo.html");
	 * 
	 * }
	 */



	@Test
	public void registrationScenario () throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/Rajesh/eclipse-workspace/RajWorkspace/Rselenium/drivers/chromedriver.exe"); WebDriver driver = new ChromeDriver();
		driver.get("http://www.way2automation.com/demo.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		LregistrationForm ip1 = new LregistrationForm(driver);
		ip1.registrationTab().click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		Set<String> childWindows = driver.getWindowHandles();
		Iterator<String> itr = childWindows.iterator();
		while (itr.hasNext()) {
			String childWindow = itr.next();
			
			if(!parentWindow.equals(childWindow)) {
				String cwURL = driver.switchTo().window(childWindow).getCurrentUrl();
				System.out.println(cwURL);
				Thread.sleep(2000);
				//ip1.setFirstName().sendKeys("Rajesh");
							
				
				
			}
		}
		
	
		//driver.findElement(By.name("name")).sendKeys("Rajesh");
		ip1.setFirstName();
		//ip1.setFirstName().sendKeys("Rajesh");
		ip1.setPhone();
		ip1.setEmail();
		ip1.setCountry();
		ip1.setCity();
		ip1.setUserName();
		ip1.setPassword();
		ip1.rsubmit().click();
		//driver.quit();



	}

}
