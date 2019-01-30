package com.whitecircleschool.demo.GoodToGo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProjectsPage {
	
	@FindBy(xpath = "//a[contains(@href,'a2')]")
	@CacheLookup
	private WebElement a2Prj;
	
	public ProjectsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void projectsA2Select() {
		
		a2Prj.click();
	}

}
