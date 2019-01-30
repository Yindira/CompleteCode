package com.whitecircleschool.demo.GoodToGo;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AddressesTest extends BaseTest {

	private LoginPage lp;
	private CallistoHomePage cp;
	private ProjectsPage pp;
	private CadenceBankHomePage cb;
	private BranchesPage bp;

	@Test(priority = 0)

	public void countriesNamesValidate() throws InterruptedException {

		lp = new LoginPage(driver);
		cp = new CallistoHomePage(driver);
		pp = new ProjectsPage(driver);
		cb = new CadenceBankHomePage(driver);
		bp = new BranchesPage(driver);

		lp.applicationLogin();
		cp.workBtnClick();
		pp.projectsA2Select();
		cb.branchesLinkSelect();

		Select select1 = new Select(bp.getRegion());
		List<WebElement> regions = select1.getOptions();

		

		for (WebElement x : regions) {

			x.click();
			if (!(x.getText()).equals("Select")) {
                
				System.out.println("**************");
				System.out.println(x.getText());
				System.out.println("**************");
				
				Select select2 = new Select(bp.getCountry());
				List<WebElement> countries = select2.getOptions();
				for (WebElement y : countries) {
                     
					 y.click();

					String addressText = bp.getAddress().getText();
					boolean addrDispalyedStatus1 = addressText.isEmpty();

					if (!(y.getText()).equals("Select") && (!(addrDispalyedStatus1))) {

						System.out.println(y.getText());
						System.out.println("Address present");
						System.out.println("");

					} else {
						
						if(y.getText().equals("Select")) {
							continue;
						}
						System.out.println(y.getText());
						System.out.println("Address not present");
					}
				}

			}
		}

	}

}
