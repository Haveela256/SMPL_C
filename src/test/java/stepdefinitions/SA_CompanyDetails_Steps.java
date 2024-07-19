package stepdefinitions;

import com.vassarlabs.projectname.page.SA_CompanyDetails_page;
import com.driver.WebdriverInitializer;
import io.cucumber.java.en.And;

public class SA_CompanyDetails_Steps {
    SA_CompanyDetails_page saCompanyDetailsPage=new SA_CompanyDetails_page(WebdriverInitializer.getDriver());

@And("Click on the company details module")
public void clickOnTheCompanyDetailsModule() throws InterruptedException {
    saCompanyDetailsPage.module();
}
    @And("Verify the company details page")
    public void verifyTheCompanyDetailsPage() throws InterruptedException {
    saCompanyDetailsPage.verify();
    }}