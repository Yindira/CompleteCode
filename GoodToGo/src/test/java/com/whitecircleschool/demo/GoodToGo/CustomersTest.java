package com.whitecircleschool.demo.GoodToGo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CustomersTest extends BaseTest {

	private LoginPage lp;
	private CallistoHomePage chp;
	private ProjectsPage pp;
	private CadenceBankHomePage cb;
	private CustomersPage cp;
	

	@Test
	public void CustomersNameValidate() {

		lp = new LoginPage(driver);
		chp = new CallistoHomePage(driver);
		pp = new ProjectsPage(driver);
		cb = new CadenceBankHomePage(driver);
		cp = new CustomersPage(driver);

		lp.applicationLogin();
		chp.workBtnClick();
		pp.projectsA2Select();
		cb.customersLinkSelect();

		

		boolean notFound = true;

		int i = 1;

		while (notFound) {

			List<WebElement> customers = cp.getCustTable().findElements(By.tagName("td"));

			for (WebElement x : customers) {

				//System.out.println(x.getText());

				if (x.getText().equals("Oprah Winfrey")) {

					notFound = false;
					 
					String paymentMethod = driver.findElement(By.cssSelector("body > div.elementor.elementor-207 > div > div > section.elementor-element.elementor-element-157b4b6.elementor-section-boxed.elementor-section-height-default.elementor-section-height-default.elementor-section.elementor-top-section > div > div > div > div > div > div > div > div.main > table > tbody > tr:nth-child(7) > td:nth-child(5)")).getText();
					System.out.println("**************************************************");
					System.out.println("Oprah Winfrey's payment method is " +paymentMethod); 
					System.out.println("**************************************************");
					break;

				}

				//System.out.println(notFound);

			}

			if (notFound) {

				i = i + 1;

				driver.findElement(By.linkText(Integer.toString(i))).click();

			}
		}

	}
}
