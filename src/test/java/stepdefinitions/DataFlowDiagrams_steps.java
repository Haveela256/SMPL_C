package stepdefinitions;

import com.vassarlabs.projectname.page.DataFlowDiagrams_page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import com.driver.WebdriverInitializer;

public class DataFlowDiagrams_steps {
    DataFlowDiagrams_page dataFlowDiagramsPage=new DataFlowDiagrams_page(WebdriverInitializer.getDriver());
    @When("Click on the Data Flow Diagrams tab")
    public void click_on_the_data_flow_diagrams_tab() throws InterruptedException {
   dataFlowDiagramsPage.dataFlow();
    }


    @And("Click on the Submit button by entering all fields and without entering all fields and verify {string} {string} {string}")
    public void clickOnTheSubmitButtonByEnteringAllFieldsAndWithoutEnteringAllFieldsAndVerify(String FileUploadToaster, String DataFlowFileName, String File) throws InterruptedException {
    dataFlowDiagramsPage.submit(FileUploadToaster, DataFlowFileName, File);
    }

    @And("verify delete popup of dataflow")
    public void verifyDeletePopupOfDataflow() throws InterruptedException {
        dataFlowDiagramsPage.deleteIcon();
    }

    @And("Validate the delete functionality of data flow {string}")
    public void validateTheDeleteFunctionalityOfDataFlow(String  DeletedFileToaster) throws InterruptedException {
        dataFlowDiagramsPage.deleteToaster( DeletedFileToaster);
    }
}
