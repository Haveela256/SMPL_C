package stepdefinitions;

import com.vassarlabs.projectname.page.SA_AuditReadiness_page;
import io.cucumber.java.en.And;
import com.driver.WebdriverInitializer;
public class SA_AuditReadiness_Steps {
    SA_AuditReadiness_page saAuditReadinessPage=new SA_AuditReadiness_page(WebdriverInitializer.getDriver());
    @And("Validate the CMMC Regulation tab {string}")
    public void validateTheCMMCRegulationTab(String Regulationtabs) throws InterruptedException {
    saAuditReadinessPage.cmmcTab(Regulationtabs);

    }

    @And("Validate the download {string} {string}")
    public void validateTheDownload(String AssessmentName, String Regulationtabs) throws InterruptedException {
        saAuditReadinessPage.download(AssessmentName, Regulationtabs);
    }

    @And("validate the download functionality of uploaded files {string}")
    public void validateTheDownloadFunctionalityOfUploadedFiles(String UploadFile) {
        saAuditReadinessPage.downloadFiles(UploadFile);
    }

    @And("Validate the Card functionality {string} {string} of company")
    public void validateTheCardFunctionalityOfCompany(String Cards, String AssessmentName) throws InterruptedException {
        saAuditReadinessPage.card(Cards,AssessmentName);
    }
}
