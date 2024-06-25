package stepdefinitions;

import com.vassarlabs.projectname.page.TwoFactorAuth_page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.driver.WebdriverInitializer;

public class TwoFactorAuth_Steps {
    TwoFactorAuth_page twoFactorAuthPage=new TwoFactorAuth_page(WebdriverInitializer.getDriver());
    @When("Validate the Sign In button functionality by entering valid and invalid credentials {string} {string}")
    public void validate_the_sign_in_button_functionality_by_entering_valid_and_invalid_credentials(String EmailAddress, String Password) throws InterruptedException {
        twoFactorAuthPage.signInPage(EmailAddress, Password);
    }



    @Then("Validate the Resend code hyperlink and verify the {string}")
    public void validate_the_resend_code_hyperlink_and_verify_the(String ResendCodeToaster) throws InterruptedException {
       twoFactorAuthPage.resendCode(ResendCodeToaster);
    }


    @And("Validate the Submit button functionality by entering valid and invalid OTP {} {} {} {} {} {}")
    public void validateTheSubmitButtonFunctionalityByEnteringValidAndInvalidOTP(String OTPOne, String OTPTwo, String OTPThree, String  OTPFour, String ToasterMessage,  String ResendCodeToaster) throws InterruptedException {
        twoFactorAuthPage.ValidateSubmitButtonByEnteringOtps(OTPOne, OTPTwo, OTPThree, OTPFour, ToasterMessage, ResendCodeToaster);
    }
}
