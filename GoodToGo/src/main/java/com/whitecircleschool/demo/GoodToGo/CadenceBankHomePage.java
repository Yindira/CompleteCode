package com.whitecircleschool.demo.GoodToGo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CadenceBankHomePage {
	
	@FindBy(xpath = "//a[contains(@href,'branches')]")
	@CacheLookup
	private WebElement branches;
	
	@FindBy(linkText = "Customers")
	private WebElement cust;
	
	public CadenceBankHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void branchesLinkSelect() {
		
		branches.click();
	}
	
	public void customersLinkSelect() {
		
		cust.click();
	}

}
