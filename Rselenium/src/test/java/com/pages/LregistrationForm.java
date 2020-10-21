package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class LregistrationForm {

	WebDriver driver;
	@FindBy(xpath="//a[contains(text(),'Registration')]")
	private WebElement registrationTab;

	@FindBy(name="name")
	private WebElement rfName;

	@FindBy(name="phone")
	private WebElement rfPhone;

	@FindBy(name="email")
	private WebElement rfEmail;

	@FindBy(name="country")
	private WebElement rfCountry;

	@FindBy(name="city")
	private WebElement rfCity;

	@FindBy(xpath="//fieldset[6]//input[@name='username']")
	private WebElement rfUserName;

	@FindBy(xpath="//fieldset[7]//input[@name='password']")
	private WebElement rfPassWord;

	@FindBy(xpath= "//input[@value='Submit']")
	private WebElement rfSubmit;
	
	@FindBy(linkText="Signin")
	private WebElement rfSignIn;
	
	@FindBy(xpath="//fieldset[1]//input[@name='username']")
	private WebElement siUserName;
	
	@FindBy(xpath="//fieldset[2]//input[@name='password']")
	private WebElement siPassword;
	
	@FindBy(xpath="//body[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/input[1]")
	private WebElement siSubmit;
	

	public LregistrationForm(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);


	}

	public WebElement registrationTab() {
		return registrationTab;

	}	
	/*
	 * public WebElement FirstName() {
	 * 
	 * return rfName; }
	 */
	
	public void setFirstName() {
	 rfName.sendKeys("Rajesh");
	 //System.out.println("Test FN method");
	}
	
	public void setPhone() {
		 rfPhone.sendKeys("8909878909");
		 //System.out.println("Test FN method");
		}
	
	public void setEmail() {
		 rfEmail.sendKeys("rajeshtest@mail.com");
		 //System.out.println("Test FN method");
		}
	
	public void setCountry() {
		 Select scountry = new Select(rfCountry);
		 scountry.selectByValue("India");
		 
		 //System.out.println("Test FN method");
		}
	
	public void setCity() {
		 rfCity.sendKeys("Hyderabad");
		 //System.out.println("Test FN method");
		}
	
	public void setUserName() {
		rfUserName.sendKeys("rajeshone");
		 //System.out.println("Test FN method");
		}
	
	public void setPassword() {
		 rfPassWord.sendKeys("admin");
		 //System.out.println("Test FN method");
		}
	
	public WebElement rsubmit() {
		return rfSubmit ;
	}
	
	public WebElement rSignIn() {
		return rfSignIn;
	}
	
	public void setSIuserName() {
		siUserName.sendKeys("rajone");
	}
	
	public void setSIpassWord() {
		siPassword.sendKeys("admin");
	}
	
	public void clickSIsubmit() {
		siSubmit.click();
	}

}