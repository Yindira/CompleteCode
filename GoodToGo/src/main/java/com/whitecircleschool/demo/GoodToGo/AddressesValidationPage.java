package com.whitecircleschool.demo.GoodToGo;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddressesValidationPage {




	@FindBy(linkText = "Branches")
	private WebElement branchesLink;
	
	
	@FindBy(id = "select1")
	private WebElement region;

	@FindBy(id = "select2")
	private WebElement country;
	
		
	@FindBy(id="address")
	private WebElement addr;

	public AddressesValidationPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	

	public void addressChecking() {
		
		Select select1 = new Select(region);
		List<WebElement> regions = select1.getOptions();
		
		for(WebElement x:regions) {
			
			x.click();
		}
		
	}
	

}
