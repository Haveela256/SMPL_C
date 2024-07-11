package stepdefinitions;

import com.vassarlabs.projectname.page.My_Profile_page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import com.driver.WebdriverInitializer;

public class My_Profile_Steps {
    My_Profile_page myProfilePage=new My_Profile_page(WebdriverInitializer.getDriver());
    @When("click on the My Profile option")
    public void click_on_the_my_profile_option() throws InterruptedException {
        myProfilePage.myProfile();
    }

    @When("click on the edit button")
    public void click_on_the_edit_button() throws InterruptedException {
        myProfilePage.edit();
    }

    @When("validate the cancel button")
    public void validate_the_cancel_button() throws InterruptedException {
       myProfilePage.cancel();
    }
    @And("Add the profile details or edit {string} {string} {string} {string} {string}")
    public void addTheProfileDetailsOrEdit(String FirstName,String MiddleName,String LastName,String Designation,String EmailAddress) throws InterruptedException {
        myProfilePage.addDetails(FirstName,MiddleName,LastName,Designation,EmailAddress);
    }


    @When("Add profile image and Verify crop popup {string}")
    public void add_profile_image_and_verify_crop_popup(String File) throws InterruptedException {
        myProfilePage.addProfileImage(File);
    }

    @Then("validate replace icon {string}")
    public void validate_replace_icon(String ReplaceFile) throws InterruptedException {
        myProfilePage.replaceProfile(ReplaceFile);
    }



    @Then("validate the Submit button {string} {string}")
    public void validateTheSubmitButton(String ErrorMessage,String DetailsUpdatedToaster) throws InterruptedException {
        myProfilePage.submitOfMyProfile(ErrorMessage, DetailsUpdatedToaster);
    }


}
