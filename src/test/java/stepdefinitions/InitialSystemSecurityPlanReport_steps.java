package stepdefinitions;

import com.vassarlabs.projectname.page.InitialSystemSecurityPlanReport_page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import com.driver.WebdriverInitializer;
public class InitialSystemSecurityPlanReport_steps {
    InitialSystemSecurityPlanReport_page initialSystemSecurityPlanReportPage=new InitialSystemSecurityPlanReport_page(WebdriverInitializer.getDriver());

    @And("Click on the Initial System Security Plan Report card {string}")
    public void clickOnTheInitialSystemSecurityPlanReportCard(String AssessmentName) throws InterruptedException {
        initialSystemSecurityPlanReportPage.initialSystemSecurityPlanReportCard(AssessmentName);
    }
    @When("Validate the Back icon functionality")
    public void validate_the_back_icon_functionality() throws InterruptedException {
      initialSystemSecurityPlanReportPage.backIcon();
    }

    @When("Validate the Print button functionality")
    public void validate_the_print_button_functionality() {
        initialSystemSecurityPlanReportPage.print();
    }

    @When("Verify the System Identification section")
    public void verify_the_system_identification_section() {
       initialSystemSecurityPlanReportPage.systemIdentification();
    }

    @When("Verify the System Environment section")
    public void verify_the_system_environment_section() {
       initialSystemSecurityPlanReportPage.systemEnvironment();
    }


    @When("Verify the Software Details panel")
    public void verify_the_software_details_panel() {
      initialSystemSecurityPlanReportPage.softwareDetails();
    }

    @When("Verify the Requirements section {string}")
    public void verify_the_requirements_section(String RequirementsCard) {
       initialSystemSecurityPlanReportPage.requirements(RequirementsCard);
    }


    @When("Verify the Record of changes table")
    public void verify_the_record_of_changes_table() {
        initialSystemSecurityPlanReportPage.recordOfChangesTable();
    }

    @When("validate the pagination of Record of changes table by priting multiple times")
    public void validate_the_pagination_of_record_of_changes_table_by_priting_multiple_times() {
       initialSystemSecurityPlanReportPage.paginationOfRecordOfChanges();
    }

    @And("Validate the Download icon functionality System Environment  section")
    public void validateTheDownloadIconFunctionalitySystemEnvironmentSection() {
        initialSystemSecurityPlanReportPage.downloadIcon();
    }


}
