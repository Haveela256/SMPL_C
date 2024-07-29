package stepdefinitions;

import com.vassarlabs.projectname.page.User_CompanyDetails_page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import com.driver.WebdriverInitializer;

public class User_CompanyDetails_Steps {
    User_CompanyDetails_page userCompanyDetailsPage=new User_CompanyDetails_page(WebdriverInitializer.getDriver());
    @When("Validate the edit button")
    public void validateTheEditButton() throws InterruptedException {
userCompanyDetailsPage.edit();
    }

    @And("Verify the Company details")
    public void verifyTheCompanyDetails() {
        userCompanyDetailsPage.details();
    }
}
