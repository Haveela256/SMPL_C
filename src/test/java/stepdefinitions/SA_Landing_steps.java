package stepdefinitions;

import com.vassarlabs.projectname.page.SA_Landing_page;
import com.driver.WebdriverInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class SA_Landing_steps {
    SA_Landing_page saLandingPage=new SA_Landing_page(WebdriverInitializer.getDriver());
    @Given("Validate the Hamburger icon")
    public void validate_the_hamburger_icon() {
        saLandingPage.hamburger();
    }

    @Given("Validate the SMPL-C logo")
    public void validate_the_smpl_c_logo() {
      saLandingPage.smplLogo();
    }

    @Given("Validate the Sort dropdown functionality by selecting a option")
    public void validate_the_sort_dropdown_functionality_by_selecting_a_option() {
        saLandingPage.sortDropdown();
    }

    @Given("Validate the Toggle button functionality")
    public void validate_the_toggle_button_functionality() {
        saLandingPage.toggle();
    }

    @Given("Validate the Invite button functionality")
    public void validate_the_invite_button_functionality() {
      saLandingPage.invitepopup();
    }


    @Given("Validate the Email Address text field functionality by entering valid and invalid email addresses {string} {string}")
    public void validate_the_email_address_text_field_functionality_by_entering_valid_and_invalid_email_addresses(String string, String string2) {
       saLandingPage.emailField();
    }

    @Given("Validate the Subscription dropdown functionality by selecting a value {string} {string}")
    public void validate_the_subscription_dropdown_functionality_by_selecting_a_value(String string, String string2) {
        saLandingPage.subscription();
    }

    @Given("Validate the Order Number text field functionality {string} {string}")
    public void validate_the_order_number_text_field_functionality(String string, String string2) {
        saLandingPage.orderNumber();
    }

    @Given("Validate the Submit button functionality by entering and without entering the fields {string}")
    public void validate_the_submit_button_functionality_by_entering_and_without_entering_the_fields(String string) {
        saLandingPage.submitButton();
    }

    @Given("Verify the Company cards")
    public void verify_the_company_cards() {
      saLandingPage.companyCard();
    }

    @Given("Validate the Vertical Ellipsis icon functionality")
    public void validate_the_vertical_ellipsis_icon_functionality() {
       saLandingPage.ellipsis();
    }

    @Given("Validate the Lock option functionality {string} {string}")
    public void validate_the_lock_option_functionality(String string, String string2) {
       saLandingPage.lock();
    }

    @Given("Validate the Unlock option functionality {string} {string}")
    public void validate_the_unlock_option_functionality(String string, String string2) {
        saLandingPage.unlock();
    }

    @Given("Validate the Delete option functionality {string} {string}")
    public void validate_the_delete_option_functionality(String string, String string2) {
      saLandingPage.delete();
    }

    @Given("Verify the Are you sure to delete  popup {string}")
    public void verify_the_are_you_sure_to_delete_popup(String string) {
      saLandingPage.deletePopup();
    }



    @Given("Validate the Send Email popup")
    public void validate_the_send_email_popup() {
        saLandingPage.semailOption();
    }

    @Given("Validate the Renew option functionality {string} {string}")
    public void validate_the_renew_option_functionality(String string, String string2) {
        saLandingPage.renew();
    }

    @Given("Validate the Company card functionality {string} {string}")
    public void validate_the_company_card_functionality(String string, String string2) {
        saLandingPage.company();
    }

    @Given("Verify the Company page")
    public void verify_the_company_page() {
       saLandingPage.companyPage();
    }

    @Given("Validate the Switch Company module functionality")
    public void validate_the_switch_company_module_functionality() {
      saLandingPage.switchModule();
    }

    @Given("Validate the  User Profile icon or Expand icon functionality")
    public void validate_the_user_profile_icon_or_expand_icon_functionality() {
        saLandingPage.userProfile();
    }

}
9