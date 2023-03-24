package vwoapplication_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.UtilsManger;

public class LoginPage {
	
	private UtilsManger utilsManger;
	private WebDriver driver;
	
	public LoginPage(WebDriver driver,UtilsManger utilsManger) {
		
			this.utilsManger =utilsManger;
			this.driver =driver;
			PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='login-username']")
	WebElement username;
	
	@FindBy(xpath = "//input[@id='login-password']")
	WebElement password;
	
	@FindBy(xpath = "//button[@id='js-login-btn']")
	WebElement signButton;
	
	
	
	
	
}
