package stepdefinitions;

import com.vassarlabs.projectname.page.GapAssessmentChatbot_page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import com.driver.WebdriverInitializer;

import java.awt.*;

public class GapAssessmentChatbot_Steps {
    GapAssessmentChatbot_page gapAssessmentChatbotPage=new GapAssessmentChatbot_page(WebdriverInitializer.getDriver());
    @When("click on Gap Assessment Module")
    public void click_on_gap_assessment_module() throws InterruptedException {
      gapAssessmentChatbotPage.gapAssessmentModule();
    }




    @When("Click on the Update Technical Footprint hyperlink {string} {string} {string}")
    public void click_on_the_update_technical_footprint_hyperlink(String AssessmentName, String Level, String Impact ) throws InterruptedException {
             gapAssessmentChatbotPage.updateTechnicalFootprint(AssessmentName, Level, Impact);
    }

    @When("verify the added assessment on the table {string}")
    public void verify_the_added_assessment_on_the_table(String AssessmentName) throws InterruptedException {
     gapAssessmentChatbotPage.verifyAddedAssessment(AssessmentName);
    }





    @And("Verify bars for each level {string} {string} {string}")
    public void verifyBarsForEachLevel(String BarsCount, String BarsNames, String AssessmentName) throws InterruptedException {
        gapAssessmentChatbotPage.barsNamesAndCount(BarsCount,BarsNames,AssessmentName );
    }


    @And("click on the Create new Assessment button and provide {string} {string} {string} {string}")
    public void clickOnTheCreateNewAssessmentButtonAndProvide(String AssessmentName,String Level,String Impact,String AssessmentNameTwo) throws InterruptedException, AWTException {
        gapAssessmentChatbotPage.createNewAssessment(AssessmentName, Level, Impact, AssessmentNameTwo);
    }



}
