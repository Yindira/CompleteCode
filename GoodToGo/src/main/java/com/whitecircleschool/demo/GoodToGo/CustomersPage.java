package com.whitecircleschool.demo.GoodToGo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomersPage {

	

	@FindBy(tagName = "Table")
	private WebElement custTable;

	@FindBy(linkText="2")
	private WebElement pagination2;

	public CustomersPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public WebElement getCustTable() {

		return custTable;
	}

	public WebElement getPagination() {

		return pagination2;
	}

}
