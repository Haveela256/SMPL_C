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




    @And("click on the replace icon and add user profile {}")
    public void clickOnTheReplaceIconAndAddUserProfile(String File, String ReplaceFile) throws InterruptedException {
        myProfilePage.replaceicon(File, ReplaceFile);
    }

    @When("Validate the Cancel button")
    public void validate_the_cancel_button() throws InterruptedException {
  myProfilePage.clickOnCancelButton();
    }






    @And("Add the profile details {} {} {} {}")
    public void addTheProfileDetails(String FirstName,String MiddleName,String LastName, String Designation) throws InterruptedException {
      myProfilePage.addDetails(FirstName,MiddleName, LastName, Designation );
    }

    @Then("Validate the Submit button and verify {} {} {}")
    public void validateTheSubmitButtonAndVerify(String FirstName, String MiddleName, String LastName, String Designation, String ErrorMessage, String DetailsUpdatedToaster,String ErrorToaster) throws InterruptedException {
      myProfilePage.clickOnSubmitButton(FirstName, MiddleName, LastName, Designation, ErrorMessage, DetailsUpdatedToaster, ErrorToaster);
    }



}
