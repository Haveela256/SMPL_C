package stepdefinitions;

import com.vassarlabs.projectname.page.ResetPassword_page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import com.driver.WebdriverInitializer;

public class ResetPassword_Steps {
    ResetPassword_page resetPasswordPage=new ResetPassword_page(WebdriverInitializer.getDriver());
    @Given("Validate the New Password and Confirm Password field functionality {string} {string} {string}")
    public void validate_the_new_password_and_confirm_password_field_functionality(String NewPassword, String  ConfirmPassword, String ErrorMessage) throws InterruptedException {
        resetPasswordPage.passwordFields(NewPassword, ConfirmPassword, ErrorMessage);
    }



    @And("validate the submit button functionality by entering valid and invalid OTP {string} {string} {string} {string} {string} {string}")
    public void validateTheSubmitButtonFunctionalityByEnteringValidAndInvalidOTP(String OTPOne,String OTPTwo,String OTPThree, String OTPFour,String NewPassword, String ConfirmPassword) {
        resetPasswordPage.clickOnSubmit(OTPOne, OTPTwo, OTPThree,  OTPFour, NewPassword, ConfirmPassword);
    }



    @And("verify errors messages {string} {string} {string} {string} {string} {string}")
    public void verifyErrorsMessages(String PasswordCharacterError,String PasswordUppercaseError,String PasswordsError,String NewPasswordError,String ConfirmPasswordError,String ErrorToaster) {
        resetPasswordPage.veifyError(PasswordCharacterError, PasswordUppercaseError, PasswordsError, NewPasswordError, ConfirmPasswordError, ErrorToaster);
    }
    }

