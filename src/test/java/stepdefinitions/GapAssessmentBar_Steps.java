package stepdefinitions;import com.vassarlabs.projectname.page.GapAssessmentBar_page;
import io.cucumber.java.en.And;
import com.driver.WebdriverInitializer;

public class GapAssessmentBar_Steps {
    GapAssessmentBar_page quiz = new GapAssessmentBar_page(WebdriverInitializer.getDriver());


        @And("click on the {string} and verify Bar {string}")
        public void clickOnTheBarAndVerifyBarModules(String Bar, String Modules) throws Throwable {
            quiz.clickOnTheBarGraph(Bar, Modules);
        }


        @And("Answer Quiz {string} and Verify Quiz Output {string} {string} {string}")
        public void answerQuizOptionsAndVerifyQuizOutput(String options, String Modules, String Implementation_Status, String POAM_Status) throws Throwable {
            quiz.AttendQuiz(options, Modules, Implementation_Status, POAM_Status);
        }


        @And("Verify Progress Bar after quiz Submitted")
        public void verifyProgressBarAfterQuizSubmitted()throws Throwable {
            quiz.validateProgressBar();
        }
    }

