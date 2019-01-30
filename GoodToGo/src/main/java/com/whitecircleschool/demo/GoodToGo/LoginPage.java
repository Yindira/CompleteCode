package com.whitecircleschool.demo.GoodToGo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id = "username-8")
	@CacheLookup
	private WebElement username;

	@FindBy(id = "user_password-8")
	@CacheLookup
	private WebElement password;

	@FindBy(id = "um-submit-btn")
	@CacheLookup
	private WebElement loginBtn;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void applicationLogin() {

		username.sendKeys("Indu");
		password.sendKeys("Drushru1");
		loginBtn.click();

	}

}
