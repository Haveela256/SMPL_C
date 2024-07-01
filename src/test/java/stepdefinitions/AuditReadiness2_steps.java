package stepdefinitions;

import com.vassarlabs.projectname.page.AuditReadiness2_page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import com.driver.WebdriverInitializer;
public class AuditReadiness2_steps {
    AuditReadiness2_page auditReadiness2Page=new AuditReadiness2_page(WebdriverInitializer.getDriver());
    @When("Validate the Upload icon or Browse hyperlink functionality {string}")
    public void validate_the_upload_icon_or_browse_hyperlink_functionality(String UploadFile) {
       auditReadiness2Page.browse(UploadFile);
    }

    @When("Validate the Re-Upload File button functionality {string}")
    public void validate_the_re_upload_file_button_functionality(String ReuploadFile) {
        auditReadiness2Page.reupload(ReuploadFile);
    }

    @When("Verify the Justification for the implementation of required controls text area functionality {string}")
    public void verify_the_justification_for_the_implementation_of_required_controls_text_area_functionality(String Text) {
        auditReadiness2Page.verifyJustification();
    }

    @When("Validate the Edit icon functionality {string}")
    public void validate_the_edit_icon_functionality(String EditText) {
        auditReadiness2Page.editJustification(EditText);
    }

    @When("Validate the Save icon functionality")
    public void validate_the_save_icon_functionality() {
        auditReadiness2Page.saveJustifiaction();
    }

    @When("Validate the Summarize button functionality")
    public void validate_the_summarize_button_functionality() {
        auditReadiness2Page.summraize();
    }

    @When("Verify the Probability of passing certification label")
    public void verify_the_probability_of_passing_certification_label() {
        auditReadiness2Page.probability();
    }


    @When("Verify the Uploaded documents table")
    public void verify_the_uploaded_documents_table() {
     auditReadiness2Page.uploadedDocsTable();
    }

    @When("Validate the Download icon functionality")
    public void validate_the_download_icon_functionality() {
        auditReadiness2Page.downloadIcon();
    }

    @When("Validate the Delete icon functionality")
    public void validate_the_delete_icon_functionality() {
        auditReadiness2Page.deleteIcon();
    }

    @When("Verify the Are you sure to delete  popup")
    public void verify_the_are_you_sure_to_delete_popup() {
      auditReadiness2Page.deletepopup();
    }



    @When("validate the sort icons of Document Type and File Name columns")
    public void validate_the_sort_icons_of_document_type_and_file_name_columns() {
       auditReadiness2Page.sortIcons();
    }

    @When("Validate the pagination of poam table")
    public void validate_the_pagination_of_poam_table() {
        auditReadiness2Page.pagination();
    }

    @And("Validate the Card functionality {string} {string}")
    public void validateTheCardFunctionality(String Cards, String AssessmentName) throws InterruptedException {
        auditReadiness2Page.cards(Cards, AssessmentName);
    }

    @And("Validate the Next icon functionality of the CMMC Regulation tab {string}")
    public void validateTheNextIconFunctionalityOfTheCMMCRegulationTab(String Regulationtabs) {
        auditReadiness2Page.regulationtabs(Regulationtabs);
    }

    @And("Validate the Select implementation Status dropdown functionality by selecting a option")
    public void validateTheSelectImplementationStatusDropdownFunctionalityBySelectingAOption() {
        auditReadiness2Page.implemetationDropdown();
    }

    @And("Validate the Previous icon functionality CMMC Regulation tab {string}")
    public void validateThePreviousIconFunctionalityCMMCRegulationTab(String Regulationtabs) {
        auditReadiness2Page.previousIconOfRegulation(Regulationtabs);
    }

    @And("Validate the Upload Relevant Documentation dropdown functionality by selecting an option {string}")
    public void validateTheUploadRelevantDocumentationDropdownFunctionalityBySelectingAnOption(String UploadFile) {
        auditReadiness2Page.uploadRelevenatDoc(UploadFile);
    }
}
