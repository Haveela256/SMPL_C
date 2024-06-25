package stepdefinitions;

import com.vassarlabs.projectname.page.AuditReadiness_page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.driver.WebdriverInitializer;

public class AuditReadiness_Steps {
AuditReadiness_page auditReadinessPage=new AuditReadiness_page(WebdriverInitializer.getDriver());
    @When("validate the regulation functionality")
    public void validate_the_regulation_functionality() throws InterruptedException {
       auditReadinessPage.regulationCard();
    }

    @When("Validate the Select implementation dropdown")
    public void validate_the_select_implementation_dropdown() throws InterruptedException {
        auditReadinessPage.implementationDropdown();
    }

    @When("Validate the Upload Relevant Documentation dropdown")
    public void validate_the_upload_relevant_documentation_dropdown() throws InterruptedException {
       auditReadinessPage.uploadRelevantDocument();
    }



    @When("Validate the Justification for the implementation of required controls' feild functionality after uploading a file")
    public void validate_the_justification_for_the_implementation_of_required_controls_feild_functionality_after_uploading_a_file() {
      auditReadinessPage.justification();
    }

    @When("Validate the uploaded file panel")
    public void validate_the_uploaded_file_panel() {
        auditReadinessPage.uploadedFilesPanel();
    }

    @And("Validate the edit icon of justification {}")
    public void validateTheEditIconOfJustification(String JustificationToaster) {

        auditReadinessPage.editIconOfJustification( JustificationToaster);
    }

    @When("Validate Summarize button")
    public void validate_summarize_button() {
        auditReadinessPage.summarizeButton();
    }

    @When("Validate the sort icons of the Uploaded Documents table")
    public void validate_the_sort_icons_of_the_uploaded_documents_table() throws InterruptedException {
       auditReadinessPage.sortIcons();
    }


    @And("Upload or Browse hyperlink functionality {}")
    public void uploadOrBrowseHyperlinkFunctionality(String File) {
        auditReadinessPage.uploadIcon(File);
    }


    @And("Validate the pagination of uploaded doc table")
    public void validateThePaginationOfUploadedDocTable() {
        auditReadinessPage.pagination();
    }
}
