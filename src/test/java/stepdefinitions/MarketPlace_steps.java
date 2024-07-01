package stepdefinitions;

import com.vassarlabs.projectname.page.MarketPlace_page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import com.driver.WebdriverInitializer;

public class MarketPlace_steps {
    MarketPlace_page marketPlacePage=new MarketPlace_page(WebdriverInitializer.getDriver());
    @When("Click on the MarketPlace module")
    public void click_on_the_market_place_module() {
        marketPlacePage.clickONMarketPlace();
    }

    @When("validate the search icon functionality {string}")
    public void validate_the_search_icon_functionality(String ComplianceExpert) throws InterruptedException {
       marketPlacePage.searchExpert(ComplianceExpert);
    }

    @When("validate the Invite compliance expert button functionality")
    public void validate_the_invite_compliance_expert_button_functionality() throws InterruptedException {
        marketPlacePage.inviteCompliance();
    }

    @When("validate the invite compliance expert popup")
    public void validate_the_invite_compliance_expert_popup() {
       marketPlacePage.inviteEXpertPopup();
    }

    @When("validate the cancel button of invite compliance expert popup")
    public void validate_the_cancel_button_of_invite_compliance_expert_popup() {
        marketPlacePage.cancelButton();
    }
    @And("validate the email textfield of invite complianceexpert popup {string} {string} {string}")
    public void validateTheEmailTextfieldOfInviteComplianceexpertPopup(String Email, String ErrorMessage, String ToasterMessage) {
        marketPlacePage.emailFiled(Email, ErrorMessage,ToasterMessage);
    }


    @When("validate the submit button of invite compliance expert popup")
    public void validate_the_submit_button_of_invite_compliance_expert_popup() {
       marketPlacePage.submitButtonOfExpert();
    }

    @When("validate the ellipsis")
    public void validate_the_ellipsis() throws InterruptedException {
       marketPlacePage.ellipsis();
    }

    @When("validate the Download details option")
    public void validate_the_download_details_option() throws InterruptedException {
      marketPlacePage.downloaddetails();
    }

    @When("validate the Email option")
    public void validate_the_email_option() throws InterruptedException {
       marketPlacePage.emailPopup();
    }

    @And("validate the send email popup functionality {string} {string} {string}")
    public void validateTheSendEmailPopupFunctionality(String Email, String ToasterMessage, String ErrorMessage) throws InterruptedException {
        marketPlacePage.emailBodyAndSubject(Email,  ToasterMessage, ErrorMessage);
    }

    @When("validate the ask to associate {string}")
    public void validate_the_ask_to_associate(String ToasterMessage) throws InterruptedException {
        marketPlacePage.askToassociate(ToasterMessage);
    }


}
