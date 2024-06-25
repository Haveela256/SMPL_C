package stepdefinitions;

import com.vassarlabs.projectname.page.GapAssessmentChatbot_page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import com.driver.WebdriverInitializer;

public class GapAssessmentChatbot_Steps {
    GapAssessmentChatbot_page gapAssessmentPage=new GapAssessmentChatbot_page(WebdriverInitializer.getDriver());
    @When("click on the Create new Assessment button and provide {string} {string} {string}")
    public void click_on_the_create_new_assessment_button_and_provide(String AssessmentName, String Level, String Impact) throws Throwable {
       gapAssessmentPage.createAssessment(AssessmentName, Level, Impact);
    }

    @And("Click on the Update Technical Footprint hyperlink {} {} {}")
    public void clickOnTheUpdateTechnicalFootprintHyperlink(String AssessmentName, String Level, String Impact) throws Throwable {
        gapAssessmentPage.technicalFootprint(AssessmentName,Level,  Impact);
    }

    @When("verify the added assessment on the table {string}")
    public void verify_the_added_assessment_on_the_table(String AssessmentName) throws InterruptedException {
       gapAssessmentPage.verifyTable(AssessmentName);
    }


    @And("click on Gap Assessment Module")
    public void clickOnGapAssessmentModule() throws InterruptedException {
        gapAssessmentPage.gapAsessmentmodule();
    }
}
