package stepdefinitions;

import com.vassarlabs.projectname.page.ChangePassword_page;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.driver.WebdriverInitializer;

public class ChangePassword_Steps {
    ChangePassword_page changePasswordPage=new ChangePassword_page(WebdriverInitializer.getDriver());
    @When("Click on the Change Password option")
    public void click_on_the_change_password_option() throws InterruptedException {
   changePasswordPage.clickOnChangePasssword();
    }

    @When("Validate the Old Password text field by entering valid and invalid data {string} {string}")
    public void validate_the_old_password_text_field_by_entering_valid_and_invalid_data(String OldPassword, String ErrorMessage) throws InterruptedException {
       changePasswordPage.oldPassword(OldPassword, ErrorMessage);
    }

    @When("Validate the New Password text field with valid Password and Invalid password {string} {string}")
    public void validate_the_new_password_text_field_with_valid_password_and_invalid_password(String NewPassword, String ErrorMessage) throws InterruptedException {
changePasswordPage.newPassword(NewPassword, ErrorMessage);
    }

    @When("Validate the Confirm Password text field by entering valid and invalid data {string} {string}")
    public void validate_the_confirm_password_text_field_by_entering_valid_and_invalid_data(String ConfirmPassword, String ErrorMessage) throws InterruptedException {
changePasswordPage.confirmPassword(ConfirmPassword,  ErrorMessage);
    }

    @When("Validate the Reset Password button functionality {string} {string} {string} {string} {string}")
    public void validate_the_reset_password_button_functionality(String OldPassword, String NewPassword, String ConfirmPassword, String ErrorMessage, String ErrorToaster) throws InterruptedException {
changePasswordPage.resetButton(OldPassword, NewPassword,  ConfirmPassword,  ErrorMessage, ErrorToaster);
    }

    @Then("Validate the Back hyperlink functionality")
    public void validate_the_back_hyperlink_functionality() throws InterruptedException {
    changePasswordPage.backHyperlink();
    }

}
