package stepdefinitions;

import com.vassarlabs.projectname.page.CA_SignIn_page;
import com.vassarlabs.projectname.page.CE_SignIn_page;
import io.cucumber.java.en.When;
import com.driver.WebdriverInitializer;

public class CE_SignIn_Steps {
    CE_SignIn_page ceSignInPage=new CE_SignIn_page(WebdriverInitializer.getDriver());
    @When("Validate the Sign In button functionality by entering valid,invalid credentials {string} {string} and  Verify the signIn status of Compliance Expert {string}")
    public void validate_the_sign_in_button_functionality_by_entering_valid_invalid_credentials_and_verify_the_sign_in_status_of_compliance_expert(String EmailAddress, String Password, String Toaster) throws InterruptedException {
        ceSignInPage.signInbutton(EmailAddress,  Password,  Toaster);
    }
}
