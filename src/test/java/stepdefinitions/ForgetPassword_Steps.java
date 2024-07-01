package stepdefinitions;
import com.vassarlabs.projectname.page.ForgetPassword_page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import com.driver.WebdriverInitializer;

public class ForgetPassword_Steps {
    ForgetPassword_page forgetPasswordPage=new ForgetPassword_page(WebdriverInitializer.getDriver());

    @And("Validate Submit button functionality by entering valid and invalid {string} {string} {string}")
    public void validateSubmitButtonFunctionalityByEnteringValidAndInvalid(String Email, String Toaster, String ErrorMessage) throws InterruptedException {
        forgetPasswordPage.submitButton(Email, Toaster, ErrorMessage);
    }
    @Then("Validate Back hyperlink functionality")
    public void validate_back_hyperlink_functionality() throws InterruptedException {
        forgetPasswordPage.backtoSignIn();
    }



}
