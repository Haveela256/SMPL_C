package stepdefinitions;

import com.vassarlabs.projectname.page.SA_SignIn_page;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.driver.WebdriverInitializer;

public class SA_SignIn_Steps {
    SA_SignIn_page saSignInPage=new SA_SignIn_page(WebdriverInitializer.getDriver());
    @When("Validate the Sign In button functionality by entering valid,invalid credentials {string} {string} and  Verify the signIn status {string}")
    public void validate_the_sign_in_button_functionality_by_entering_valid_invalid_credentials_and_verify_the_sign_in_status(String EmailAddress, String Password, String Toaster) throws InterruptedException {
       saSignInPage.signInButton(EmailAddress, Password, Toaster);
    }


}
