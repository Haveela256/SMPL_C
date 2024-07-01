package stepdefinitions;

import com.vassarlabs.projectname.page.MyProfile_page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.driver.WebdriverInitializer;

public class MyProfile_Steps {
    MyProfile_page myProfilePage=new MyProfile_page(WebdriverInitializer.getDriver());
    @When("Click on the My Profile option")
    public void click_on_the_my_profile_option() throws InterruptedException {
  myProfilePage.myProfile();
    }

    @When("Click on the edit button")
    public void click_on_the_edit_button() throws InterruptedException {
         myProfilePage.editButton();
    }





    @When("Validate the Cancel button")
    public void validate_the_cancel_button() throws InterruptedException {
  myProfilePage.clickOnCancelButton();
    }

  @And("Add the profile details {string} {string} {string} {string} {string} {string}")
  public void addTheProfileDetails(String FirstName,String MiddleName,String LastName, String Designation,String File, String ReplaceFile) throws InterruptedException {
    myProfilePage.addDetails(FirstName,MiddleName, LastName, Designation, File, ReplaceFile );
  }


  @Then("Validate the Submit button and verify {string} {string} {string} {string} {string} {string} {string}")
  public void validateTheSubmitButtonAndVerify(String FirstName, String MiddleName, String LastName, String Designation, String ErrorMessage, String DetailsUpdatedToaster,String ErrorToaster) throws InterruptedException {
    myProfilePage.clickOnSubmitButton(FirstName, MiddleName, LastName, Designation, ErrorMessage, DetailsUpdatedToaster, ErrorToaster);
  }


  @And("Add profile and verify crop popup {string}")
  public void addProfileAndVerifyCropPopup(String File) throws InterruptedException {
    myProfilePage.profile(File);
  }


  @Then("Validate replace icon {string}")
  public void validateReplaceIcon(String ReplaceFile) throws InterruptedException {
    myProfilePage.replaceIcon(ReplaceFile);
  }


}
