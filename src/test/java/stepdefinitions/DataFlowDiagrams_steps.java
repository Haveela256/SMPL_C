package stepdefinitions;

import com.vassarlabs.projectname.page.DataFlowDiagrams_page;
import io.cucumber.java.en.When;
import com.driver.WebdriverInitializer;

public class DataFlowDiagrams_steps {
    DataFlowDiagrams_page dataFlowDiagramsPage=new DataFlowDiagrams_page(WebdriverInitializer.getDriver());
    @When("Click on the Data Flow Diagrams tab")
    public void click_on_the_data_flow_diagrams_tab() {
   dataFlowDiagramsPage.dataFlow();
    }
}
