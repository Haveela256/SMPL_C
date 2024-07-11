package stepdefinitions;

import com.vassarlabs.projectname.page.ChangePassword_page;
import com.vassarlabs.projectname.page.ChangePassword_pagee;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.driver.WebdriverInitializer;

public class ChangePassword_Steps {
   ChangePassword_page changePasswordPagee=new ChangePassword_page(WebdriverInitializer.getDriver());

    public ChangePassword_Steps() throws InterruptedException {
    }

    @When("Click on the Change Password option")
    public void click_on_the_change_password_option() throws InterruptedException {
   changePasswordPagee.clickOnChangePasssword();
    }

    @When("Validate the Old Password text field by entering valid and invalid data {string}")
    public void validate_the_old_password_text_field_by_entering_valid_and_invalid_data(String OldPassword) throws InterruptedException {
       changePasswordPagee.oldPassword(OldPassword);
    }

    @When("Validate the New Password text field with valid Password and Invalid password {string}")
    public void validate_the_new_password_text_field_with_valid_password_and_invalid_password(String NewPassword) throws InterruptedException {
changePasswordPagee.newPassword(NewPassword);
    }

    @When("Validate the Confirm Password text field by entering valid and invalid data {string}")
    public void validate_the_confirm_password_text_field_by_entering_valid_and_invalid_data(String ConfirmPassword) throws InterruptedException {
changePasswordPagee.confirmPassword(ConfirmPassword);
    }





    @And("Validate the Reset Password button functionality {string} {string} {string}")
    public void validateTheResetPasswordButtonFunctionality(String OldPassword,String NewPassword,String ConfirmPassword) throws InterruptedException {
    changePasswordPagee.resetButton(OldPassword,NewPassword, ConfirmPassword);
    }


    @Then("Validate the Back hyperlink functionality")
    public void validate_the_back_hyperlink_functionality() throws InterruptedException {
        changePasswordPagee.backHyperlink();
    }

    @And("verify errors messages {string} {string} {string} {string} {string} {string} {string}")
    public void verifyErrorsMessages(String OldPasswordError, String PasswordCharacterError,String PasswordUppercaseError,String PasswordsError,String NewPasswordError,String ConfirmPasswordError,String ErrorToaster) {
        changePasswordPagee.errors(OldPasswordError,PasswordCharacterError,PasswordUppercaseError, PasswordsError, NewPasswordError, ConfirmPasswordError, ErrorToaster);

    }
}
