package stepdefinitions;

import com.vassarlabs.projectname.page.SA_ScopeDocument_page;
import io.cucumber.java.en.And;
import com.driver.WebdriverInitializer;
public class SA_SCopeDocument_Steps {
    SA_ScopeDocument_page saScopeDocumentPage=new SA_ScopeDocument_page(WebdriverInitializer.getDriver());
    @And("Validate the Download icon functionality {string}")
    public void validateTheDownloadIconFunctionality(String ScopeDocFileName) throws InterruptedException {
        saScopeDocumentPage.download(ScopeDocFileName);
    }

    @And("validate the pagination of scope tab")
    public void validateThePaginationOfScopeTab() throws InterruptedException {
        saScopeDocumentPage.pagination();
    }

    @And("Validate the Company functionality {string} {string}")
    public void validateTheCompanyFunctionality(String CompanyCard, String ToasterMessage) throws InterruptedException {
        saScopeDocumentPage.company(CompanyCard,ToasterMessage);

    }
}
