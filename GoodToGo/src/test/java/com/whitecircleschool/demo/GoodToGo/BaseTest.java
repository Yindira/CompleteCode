package com.whitecircleschool.demo.GoodToGo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	WebDriver driver;
	
	
	@BeforeTest 
	
	public void openBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demo.whitecircleschool.com/");
		
		
		
		
	}
	
	@AfterTest
	
	public void closeBrowser() {
		
		driver.close();
	}

}
