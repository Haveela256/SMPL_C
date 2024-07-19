package stepdefinitions;

import com.vassarlabs.projectname.page.DataFlowDiagrams_page;
import com.vassarlabs.projectname.page.SA_DataFlow_page;
import io.cucumber.java.en.And;
import com.driver.WebdriverInitializer;

public class SA_DataFlow_Steps {
    SA_DataFlow_page saDataFlowPage=new SA_DataFlow_page(WebdriverInitializer.getDriver());
    @And("Validate the Download icon functionality {string} of data flow tab")
    public void validateTheDownloadIconFunctionalityOfDataFlowTab(String DataFlowFileName) throws InterruptedException {
        saDataFlowPage.download(DataFlowFileName);

    }
}
