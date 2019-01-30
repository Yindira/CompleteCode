package com.whitecircleschool.demo.GoodToGo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CallistoHomePage {
	
	@FindBy(id ="work")
	@CacheLookup
	private WebElement workBtn;
	
	public CallistoHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void workBtnClick() {
		
		workBtn.click();
	}

}
