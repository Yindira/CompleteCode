package com.whitecircleschool.demo.GoodToGo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BranchesPage {

	@FindBy(id = "select1")
	private WebElement region;

	@FindBy(id = "select2")
	private WebElement country;

	@FindBy(id = "address")
	private WebElement addr;

	public BranchesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getRegion() {

		return region;

	}

	public WebElement getCountry() {

		return country;

	}

	public WebElement getAddress() {

		return addr;
	}
}
