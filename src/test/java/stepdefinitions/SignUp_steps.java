package stepdefinitions;

import com.vassarlabs.projectname.page.SignUp_page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import com.driver.WebdriverInitializer;

public class SignUp_steps {
    SignUp_page signUpPage=new SignUp_page(WebdriverInitializer.getDriver());
    @And("Send invite to customer admin {string} {string} {string}")
    public void sendInviteToCustomerAdmin(String Email, String Subscription, String OrderNumber) {
        signUpPage.sendInviteFromSuperAdmin(Email,Subscription,OrderNumber);
    }

    @Given("Click on Register button")
    public void click_on_register_button() throws InterruptedException {
  signUpPage.register();
    }

    @Given("Verify the Sign Up page")
    public void verify_the_sign_up_page() {
signUpPage.signUpPage();
    }

    @Given("Validate the First Name text field functionality {string}")
    public void validate_the_first_name_text_field_functionality(String FirstName) {
       signUpPage.firstNameField(FirstName);
    }

    @Given("Validate the Middle Name text field functionality {string}")
    public void validate_the_middle_name_text_field_functionality(String MiddleName) {
signUpPage.middleNameField(MiddleName);
    }

    @Given("Validate the Last Name text field functionality {string}")
    public void validate_the_last_name_text_field_functionality(String LastName) {
signUpPage.lastNameField(LastName);
    }

    @Given("Verify the Email text field")
    public void verify_the_email_text_field() {
signUpPage.verifyEmailField();
    }

    @Given("Validate the Password text field functionality {string}")
    public void validate_the_password_text_field_functionality(String PasswordField) {
signUpPage.passwordField(PasswordField);
    }



    @Given("Validate the Upload Resume button functionality by uploading a file {string}")
    public void validate_the_upload_resume_button_functionality_by_uploading_a_file(String UploadFile) {
signUpPage.resumeUpload(UploadFile);
    }

    @Given("Validate the Re-Upload Resume button functionality {string}")
    public void validate_the_re_upload_resume_button_functionality(String ReUploadFile) {
signUpPage.reUpload(ReUploadFile);
    }

    @Given("Validate the I agree with Smpl-cs Checkbox functionality")
    public void validate_the_i_agree_with_smpl_cs_checkbox_functionality() {
     signUpPage.checkBox();
    }

    @Given("Validate the Terms of Service, Privacy Policy hyperlink")
    public void validate_the_terms_of_service_privacy_policy_hyperlink() {
signUpPage.terms();
    }

    @Given("Validate the Create Account button functionality {string} {string}")
    public void validate_the_create_account_button_functionality(String ErrorMessage, String ToasterMessage) {
signUpPage.CreateAccountButton(ErrorMessage,ToasterMessage);
    }



}
