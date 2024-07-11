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
    @And("Validate the CMMC Regulation tab {string} {string} {string} {string} {string}")
    public void validateTheCMMCRegulationTab(String Cards,String AssessmentName,String Regulationtabs,String UploadFile,String ReuploadFile) throws InterruptedException {
        auditReadinessPage2Page.cmmcRegulation(Cards, AssessmentName,Regulationtabs, UploadFile , ReuploadFile);
    }

    @And("validate panel functionality {string} {string} {string}")
    public void validatePanelFunctionality(String JustificationToaster,String DeletedFileToaster, String EditText) throws InterruptedException {
        auditReadinessPage2Page.panel( JustificationToaster, DeletedFileToaster, EditText);
    }



    @And("Validate the Back icon")
    public void validateTheBackIcon() throws InterruptedException {
        auditReadinessPage2Page.backIconFunctionality();
    }
    @When("Validate the card status {string}")
    public void validate_the_card_status(String Cards) {
 auditReadinessPage2Page.verifyCardStatus(Cards);
    }


    @And("Validate upload policy button {string} {string}")
    public void validateUploadPolicyButton(String UploadPolicy, String PolicyDocToaster) {
        auditReadinessPage2Page.uploadPolicy( UploadPolicy,  PolicyDocToaster);
    }


}
