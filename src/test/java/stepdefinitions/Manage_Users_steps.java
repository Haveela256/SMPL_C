package stepdefinitions;

import com.vassarlabs.projectname.page.Manage_Users_page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import com.driver.WebdriverInitializer;

import java.awt.*;

public class Manage_Users_steps {
    Manage_Users_page manageUsersPage = new Manage_Users_page(WebdriverInitializer.getDriver());

    @When("Click n the Manage Users module")
    public void click_n_the_manage_users_module() {
        manageUsersPage.manageUsersModule();
    }

    @When("Click on the Add user icon and verify the Add User popup")
    public void click_on_the_add_user_icon_and_verify_the_add_user_popup() throws InterruptedException {
        manageUsersPage.clickOnAddUserIcon();
    }

    @When("Add users by providing the {string} {string} {string} {string} {string} {string} {string} {string}")
    public void add_users_by_providing_the(String FirstName, String MiddleName, String LastName, String Email, String Designation, String SuccessfulToaster, String ErrorToaster, String ErrorMessage) throws InterruptedException {
        manageUsersPage.userDetails(FirstName, MiddleName, LastName, Email, Designation, SuccessfulToaster, ErrorToaster, ErrorMessage);
    }

    @When("Click on the Submit button with and without entering all fields and verify {string} {string} {string}")
    public void click_on_the_submit_button_with_and_without_entering_all_fields_and_verify(String SuccessfulToaster, String ErrorToaster, String ErrorMessage) throws InterruptedException {
        manageUsersPage.submitButton(SuccessfulToaster, ErrorToaster, ErrorMessage);
    }

    @And("Verify the added user {string}")
    public void verifyTheAddedUser(String Email) {
        manageUsersPage.verifyUser(Email);
    }

    @And("Click on the Unlock and Lock icon of {string} {string} {string}")
    public void clickOnTheUnlockAndLockIconOf(String FirstName, String LastName, String Email) {
        manageUsersPage.lockUserAndUnlock( FirstName,  LastName,  Email);
    }



    @And("Edit the details of by changing {string} {string} {string} {string} or {string}")
    public void editTheDetailsOfByChangingOr(String FirstName, String LastName, String MiddleName, String Designation, String Email) throws AWTException {
        manageUsersPage.editUserDetails(FirstName, MiddleName, LastName, Designation, Email);
    }

    @And("Delete the user by providing {string} {string} {string} {string} {string} {string} {string}")
    public void deleteTheUserByProviding(String FirstName, String LastName, String SuccessfulToaster, String ErrorToaster, String ErrorMessage, String Email, String DeleteToaster) {
        manageUsersPage.deleteUser(FirstName, LastName, SuccessfulToaster, ErrorToaster, ErrorMessage, Email, DeleteToaster);
    }



}

