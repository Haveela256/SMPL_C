package stepdefinitions;

import com.vassarlabs.projectname.page.SA_GapAssessment_page;
import io.cucumber.java.en.And;
import com.driver.WebdriverInitializer;

public class SA_GapAssessment_Steps {
    SA_GapAssessment_page saGapAssessmentPage=new SA_GapAssessment_page(WebdriverInitializer.getDriver());
    @And("Verify the quiz options and POAM Notes")
    public void verifyTheQuizOptionsAndPOAMNotes() {
        saGapAssessmentPage.quizOptions();
    }


}
