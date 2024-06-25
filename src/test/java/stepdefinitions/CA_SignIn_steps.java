package stepdefinitions;

import com.vassarlabs.projectname.page.CA_SignIn_page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import com.driver.WebdriverInitializer;

public class CA_SignIn_steps {
    CA_SignIn_page caSignInPage=new CA_SignIn_page(WebdriverInitializer.getDriver());
    @Given("Verify the Sign In page")
    public void verify_the_sign_in_page() {
        caSignInPage.SignInPage();
    }

    @When("Validate the {string} text field using both valid and invalid email addresses and verify the {string}")
    public void validate_the_text_field_using_both_valid_and_invalid_email_addresses_and_verify_the(String EmailAddress, String ErrorMessage) {
        caSignInPage.emailField( EmailAddress, ErrorMessage);
    }

    @When("Validate the {string} text field functionality with valid and invalid passwords and verify the {string}")
    public void validate_the_text_field_functionality_with_valid_and_invalid_passwords_and_verify_the(String Password, String ErrorMessage) {
caSignInPage.passwordField( Password, ErrorMessage);
    }

    @When("Validate the Eye icon functionality on the Password text field")
    public void validate_the_eye_icon_functionality_on_the_password_text_field() {
       caSignInPage.eyeIcon();
    }

    @When("Validate the Forget Password? hyperlink functionality")
    public void validate_the_forget_password_hyperlink_functionality() {
caSignInPage.forgetPassword();
    }

    @When("Validate the Sign In button functionality by entering valid and invalid credentials {string} {string}  Verify the signIn status {string}")
    public void validate_the_sign_in_button_functionality_by_entering_valid_and_invalid_credentials_verify_the_sign_in_status(String EmailAddress, String Password, String Toaster) throws InterruptedException {
        caSignInPage.signInButton( EmailAddress, Password, Toaster);
    }
}
