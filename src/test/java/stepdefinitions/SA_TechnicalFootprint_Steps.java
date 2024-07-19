package stepdefinitions;

import com.vassarlabs.projectname.page.SA_TechnicalFootprint_page;
import io.cucumber.java.en.And;
import com.driver.WebdriverInitializer;

public class SA_TechnicalFootprint_Steps {
    SA_TechnicalFootprint_page saTechnicalFootprintPage=new SA_TechnicalFootprint_page(WebdriverInitializer.getDriver());
    @And("Click on the panels and verify the options")
    public void clickOnThePanelsAndVerifyTheOptions() throws InterruptedException {
        saTechnicalFootprintPage.panels();
    }
}
