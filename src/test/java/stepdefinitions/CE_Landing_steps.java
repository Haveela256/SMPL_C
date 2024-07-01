package stepdefinitions;

import com.vassarlabs.projectname.page.CE_Landing_page;
import com.driver.WebdriverInitializer;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class CE_Landing_steps {
CE_Landing_page ceLandingPage=new CE_Landing_page(WebdriverInitializer.getDriver());
    @When("Validate the card functionality {string}")
    public void validate_the_card_functionality(String CompanyName) {
       ceLandingPage.companyCard(CompanyName);
    }



    @And("validate the signIn to company functionality {string}")
    public void validateTheSignInToCompanyFunctionality(String ToasterMessage) {
        ceLandingPage.signIntoCompany(ToasterMessage);
    }

    @And("Validate the switch company functionality")
    public void validateTheSwitchCompanyFunctionality() {
        ceLandingPage.switchtoCompany();
    }
}
