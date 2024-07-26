package stepdefinitions;

import com.vassarlabs.projectname.page.SA_Landing_page;
import com.driver.WebdriverInitializer;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class SA_Landing_steps {
    SA_Landing_page saLandingPage=new SA_Landing_page(WebdriverInitializer.getDriver());
    @Given("Validate the Hamburger icon")
    public void validate_the_hamburger_icon() throws InterruptedException {
        saLandingPage.hamburger();
    }

    @Given("Validate the SMPL-C logo")
    public void validate_the_smpl_c_logo() throws InterruptedException {
//      saLandingPage.smplLogo();
    }

    @Given("Validate the Sort dropdown functionality by selecting a option")
    public void validate_the_sort_dropdown_functionality_by_selecting_a_option() throws InterruptedException {
//        saLandingPage.sortDropdown();
    }

    @Given("Validate the Toggle button functionality")
    public void validate_the_toggle_button_functionality() {

//        saLandingPage.toggle();
    }

    @Given("Validate the Invite button functionality")
    public void validate_the_invite_button_functionality() throws InterruptedException{
//      saLandingPage.invitepopup();
    }


    @Given("Validate the Email Address text field functionality by entering valid and invalid email addresses {string} {string}")
    public void validate_the_email_address_text_field_functionality_by_entering_valid_and_invalid_email_addresses(String Email, String ErrorMessage) throws InterruptedException{
//       saLandingPage.emailField(Email,ErrorMessage);
    }

    @Given("Validate the Subscription dropdown functionality by selecting a value {string} {string}")
    public void validate_the_subscription_dropdown_functionality_by_selecting_a_value(String Type, String ErrorMessage) {
//        saLandingPage.subscription(Type,ErrorMessage);
    }

    @Given("Validate the Order Number text field functionality {string} {string}")
    public void validate_the_order_number_text_field_functionality(String OrderNumber, String ErrorMessage) {
//        saLandingPage.orderNumber(OrderNumber,ErrorMessage);
    }

    @And("Validate the Submit button functionality by entering and without entering the fields {string} {string}")
    public void validateTheSubmitButtonFunctionalityByEnteringAndWithoutEnteringTheFields(String ToasterMessage, String ErrorMessage) throws InterruptedException{
//        saLandingPage.submitButton(ToasterMessage,ErrorMessage);
    }
    @Given("Verify the Company cards")
    public void verify_the_company_cards() {

        saLandingPage.companyCard();
    }

    @Given("Validate the Vertical Ellipsis icon functionality")
    public void validate_the_vertical_ellipsis_icon_functionality()throws InterruptedException {
       saLandingPage.ellipsis();
    }

    @Given("Validate the Lock option functionality {string} {string}")
    public void validate_the_lock_option_functionality(String CompanyCard, String ToasterMessage) throws InterruptedException {
        saLandingPage.lock(CompanyCard, ToasterMessage);
    }

    @Given("Validate the Unlock option functionality {string} {string}")
    public void validate_the_unlock_option_functionality(String CompanyCard, String ToasterMessage)throws InterruptedException {
        saLandingPage.unlock(CompanyCard,ToasterMessage );
    }

    @Given("Validate the Delete option functionality {string} {string}")
    public void validate_the_delete_option_functionality(String DeleteCard, String ToasterMessage) throws InterruptedException{
      saLandingPage.delete(DeleteCard,ToasterMessage);
    }

    @Given("Verify the Are you sure to delete  popup {string}")
    public void verify_the_are_you_sure_to_delete_popup(String ToasterMessage) throws InterruptedException{
//        saLandingPage.deletePopup(ToasterMessage);
    }
    @And("Validate the Send Email popup {string} {string} {string} {string}")
    public void validateTheSendEmailPopup(String CompanyCard, String Subject, String Body, String EmailSentToaster) throws InterruptedException{
        saLandingPage.emailOption(CompanyCard, Subject, Body,EmailSentToaster);
    }



    @Given("Validate the Renew option functionality {string} {string}")
    public void validate_the_renew_option_functionality(String CompanyCard, String ToasterMessage) throws InterruptedException{
        saLandingPage.renew(CompanyCard,ToasterMessage);
    }

    @Given("Validate the Company card functionality {string} {string}")
    public void validate_the_company_card_functionality(String CompanyCard, String ToasterMessage) throws InterruptedException{
        saLandingPage.company(CompanyCard,ToasterMessage);
    }

    @Given("Verify the Company page")
    public void verify_the_company_page() {
       saLandingPage.companyPage();
    }

    @Given("Validate the Switch Company module functionality")
    public void validate_the_switch_company_module_functionality() throws InterruptedException{
      saLandingPage.switchModule();
    }

    @Given("Validate the  User Profile icon or Expand icon functionality")
    public void validate_the_user_profile_icon_or_expand_icon_functionality() throws InterruptedException {
        saLandingPage.userProfile();
    }

    @And("validate the sort functionality of unsigned Companies")
    public void validateTheSortFunctionalityOfUnsignedCompanies() throws InterruptedException {
        saLandingPage.dateCreated();
    }


    @And("Validate the logout option functionality")
    public void validateTheLogoutOptionFunctionality()throws InterruptedException {
      saLandingPage.userProfile();
}}
