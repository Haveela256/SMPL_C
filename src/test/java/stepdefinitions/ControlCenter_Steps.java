package stepdefinitions;

import com.vassarlabs.projectname.page.ControlCenter_page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.driver.WebdriverInitializer;

public class ControlCenter_Steps {
    ControlCenter_page controlCenterPage = new ControlCenter_page(WebdriverInitializer.getDriver());

    @When("Verify title of the page")
    public void verify_title_of_the_page() throws InterruptedException {
        controlCenterPage.title();
    }

    @When("Validate the Hamburger icon functionality")
    public void validate_the_hamburger_icon_functionality() throws InterruptedException {
        controlCenterPage.hamburger();
    }

    @When("Validate the SMPL-C logo functionality")
    public void validate_the_smpl_c_logo_functionality() throws InterruptedException {
        controlCenterPage.smplcLogo();
    }






    @When("Validate the i icon of the Remediation card")
    public void validate_the_i_icon_of_the_remediation_card() {
        controlCenterPage.iIcon();
    }



    @When("Validate  icon of the Engage C3PAO card")
    public void validate_icon_of_the_engage_c3pao_card() {
        controlCenterPage.iIconOfC3pao();
    }


    @And("Validate the User Profile icon or Expand icon functionality")
    public void validateTheUserProfileIconOrExpandIconFunctionality() throws InterruptedException {
        controlCenterPage.userProfileIcon();
    }

    @Then("Validate the Logout option functionality")
    public void validate_the_logout_option_functionality() throws InterruptedException {
       controlCenterPage.logout();
    }


    @And("Validate homepage and lightBulb")
    public void validateHomepageAndLightBulb() throws InterruptedException {
        controlCenterPage.homePage();
    }

    @And("Verify the chatbot")
    public void verifyTheChatbot() throws InterruptedException {
        controlCenterPage.chatbot();
    }

    @And("Verify the Discovery card {string} {string} {string}")
    public void verifyTheDiscoveryCard(String DiscoveryScope, String DiscoveryAsset, String DiscoveryDatFlow) throws InterruptedException {
        controlCenterPage.discoveryCard(DiscoveryScope, DiscoveryAsset, DiscoveryDatFlow);

    }


    @When("Verify the Gap Assessment card {string}    {string}    {string}    {string}    {string}    {string}    {string}")
    public void verify_the_gap_assessment_card(String GapAssessmentBaseline, String GapAssessmentPoam, String GapAssessmentPiee, String GapAssessmentPrioritized, String  GapAssessmentRisk, String GapAssessmentIncident, String GapAssessmentMSP) throws InterruptedException {
       controlCenterPage.gapAssessmentCard(GapAssessmentBaseline,GapAssessmentPoam,GapAssessmentPiee,  GapAssessmentPrioritized,  GapAssessmentRisk,  GapAssessmentIncident, GapAssessmentMSP);
    }

    @When("Verify the Audit Readiness card {string}    {string}    {string}    {string}    {string}")
    public void verify_the_audit_readiness_card(String AuditReadinessSSP, String AuditReadinessPolicies, String AuditReadinessSupport, String AuditReadinessPiee, String AuditReadinessChecklist) throws InterruptedException {
        controlCenterPage.auditReadinessCard( AuditReadinessSSP, AuditReadinessPolicies, AuditReadinessSupport, AuditReadinessPiee, AuditReadinessChecklist);
    }


    @And("Verify cmmc Journey {string}")
    public void verifyCmmcJourney(String CMMCJourney) throws InterruptedException {
        controlCenterPage.cmmcjourney(CMMCJourney);
    }

    @And("Validate the i icon of the Remediation card {string}")
    public void validateTheIIconOfTheRemediationCard(String Remediation) throws InterruptedException {
        controlCenterPage.remediation(Remediation);
    }





    @And("Validate  icon of the Engage CPAO card {string}")
    public void validateIconOfTheEngageCPAOCard(String EngageCPAO) throws InterruptedException {
        controlCenterPage.engage(EngageCPAO);
    }






    @And("Validate the Expand icon functionality of Side panel")
    public void validateTheExpandIconFunctionalityOfSidePanel() throws InterruptedException {
        controlCenterPage.rightNav();
    }
}