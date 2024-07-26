package stepdefinitions;

import com.vassarlabs.projectname.page.AuditReadiness_page2_page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import com.driver.WebdriverInitializer;

public class AuditReadiness_page2_Steps {
    AuditReadiness_page2_page auditReadinessPage2Page=new AuditReadiness_page2_page(WebdriverInitializer.getDriver());
    @And("Validate the Card functionality {string} {string}")
    public void validateTheCardFunctionality(String Cards, String AssessmentName) throws InterruptedException {
        auditReadinessPage2Page.cards(Cards, AssessmentName);

    }
    @And("Validate the CMMC Regulation tab {string} {string} {string} {string} {string} {string} {string} {string}")
    public void validateTheCMMCRegulationTab(String Cards,String AssessmentName,String Regulationtabs,String UploadFile,String ReuploadFile, String JustificationToaster,String DeletedFileToaster,String EditText) throws InterruptedException {
        auditReadinessPage2Page.cmmcRegulation(Cards, AssessmentName,Regulationtabs, UploadFile , ReuploadFile,JustificationToaster, DeletedFileToaster, EditText);
    }

    @And("validate panel functionality {string} {string}")
    public void validatePanelFunctionality(String JustificationToaster, String EditText) throws InterruptedException {
        auditReadinessPage2Page.panel( JustificationToaster, EditText);
    }




    @When("Validate the card status {string} {string}")
    public void validate_the_card_status(String Cards,String AssessmentName) throws InterruptedException {
 auditReadinessPage2Page.verifyCardStatus(Cards,AssessmentName);
    }


    @And("Validate upload policy button {string} {string}")
    public void validateUploadPolicyButton(String UploadPolicy, String PolicyDocToaster) throws InterruptedException {
        auditReadinessPage2Page.uploadPolicy( UploadPolicy,  PolicyDocToaster);
    }


    @And("Reupload a file {string}")
    public void reuploadAFile(String ReuploadFile) {
        auditReadinessPage2Page.reupload(ReuploadFile);
    }

    @And("Validate the pagination of uploaded files table")
    public void validateThePaginationOfUploadedFilesTable() {
        auditReadinessPage2Page.pagiNation();
    }



    @And("Validate the download and delete icons {string} {string} {string} {string}")
    public void validateTheDownloadAndDeleteIcons(String Cards,String AssessmentName,String Regulationtabs, String DeletedFileToaster) throws InterruptedException {
        auditReadinessPage2Page.icons(Cards,AssessmentName,Regulationtabs, DeletedFileToaster);
    }

    @And("Validate the submit button")
    public void validateTheSubmitButton() throws InterruptedException {
        auditReadinessPage2Page.submitButton();
    }

}
