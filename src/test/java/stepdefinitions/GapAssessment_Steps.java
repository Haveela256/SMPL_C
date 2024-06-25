package stepdefinitions;

import com.vassarlabs.projectname.page.GapAssessment_page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.driver.WebdriverInitializer;

public class GapAssessment_Steps {
    GapAssessment_page gapAssessmentPage=new GapAssessment_page(WebdriverInitializer.getDriver());
    @When("Validate select year dropdown")
    public void validate_select_year_dropdown() throws InterruptedException {
      gapAssessmentPage.selectYear();
    }

    @When("validate sort icon of updated on and assessment name columns")
    public void validate_sort_icon_of_updated_on_and_assessment_name_columns() throws InterruptedException {
gapAssessmentPage.sortIcons();
    }


    @When("validate the download icon functionality")
    public void validate_the_download_icon_functionality() throws InterruptedException {
gapAssessmentPage.downloadIcon();
    }

    @When("validate the delete icon functionality")
    public void validate_the_delete_icon_functionality(String DeletedFileToaster) {
gapAssessmentPage.deleteIcon(DeletedFileToaster);
    }

    @When("validate the pagination")
    public void validate_the_pagination() {
gapAssessmentPage.pagination();
    }

    @When("verify progress bar")
    public void verify_progress_bar(String AssessmentName) throws InterruptedException {
 gapAssessmentPage.progressBar(AssessmentName);
    }

    @When("verify current Sprs score")
    public void verify_current_sprs_score() {
gapAssessmentPage.sPRSScore();
    }

    @When("verify the bar chart")
    public void verify_the_bar_chart() throws InterruptedException {
 gapAssessmentPage.barChart();
    }

    @When("validate the legends functionality of bar chart")
    public void validate_the_legends_functionality_of_bar_chart() {
gapAssessmentPage.legendsOfBarChart();
    }

    @When("validate the bars functionality")
    public void validate_the_bars_functionality() throws InterruptedException {
gapAssessmentPage.bars();
    }

    @When("validate the next and previous icon of the regulation tabs")
    public void validate_the_next_and_previous_icon_of_the_regulation_tabs() throws InterruptedException {
 gapAssessmentPage.regulationTabIcons();
    }

    @When("validate the regulation panel functionality")
    public void validate_the_regulation_panel_functionality() throws InterruptedException {
       gapAssessmentPage.regulationPanel();
    }

    @And("Verify the kayla's quiz section {}")
    public void verifyTheKaylaSQuizSection(String QuizOne) throws InterruptedException {

gapAssessmentPage.kavylaQuiz(QuizOne);
    }

    @When("validate the radio buttons, previous and next icons of the quiz")
    public void validate_the_radio_buttons_previous_and_next_icons_of_the_quiz() throws InterruptedException {
gapAssessmentPage.quizButtonsAndIcons();
    }

    @And("Answer all the quiz answers {} {}	{}	{} {} and validate the retake icon functionality")
    public void answerAllTheQuizAnswersAndValidateTheRetakeIconFunctionality(String QuizOne, String QuizTwo, String QuizThree,String QuizFour, String QuizFive) throws InterruptedException {
    gapAssessmentPage.retakeButton(QuizOne,  QuizTwo,  QuizThree, QuizFour,  QuizFive);
    }

    @When("verify the quiz result")
    public void verify_the_quiz_result() throws InterruptedException {
gapAssessmentPage.quizResult();
    }

    @When("validate the legends of quiz result")
    public void validate_the_legends_of_quiz_result() throws InterruptedException {
gapAssessmentPage.quizLegends();
    }

    @When("validate the implementation dropdown")
    public void validate_the_implementation_dropdown() throws InterruptedException {
gapAssessmentPage.implementationDropdown();
    }

    @When("verify the next steps by selecting some quiz options as No")
    public void verify_the_next_steps_by_selecting_some_quiz_options_as_no() throws InterruptedException {
gapAssessmentPage.verifyNextSteps();
    }

    @When("Validate the Poam drpdown")
    public void validate_the_poam_drpdown() throws Throwable {
gapAssessmentPage.poamDropdown();
    }

    @When("validate the cancel button")
    public void validate_the_cancel_button() throws InterruptedException {
gapAssessmentPage.cancelButton();
    }

    @Then("validate the submit button")
    public void validate_the_submit_button() throws InterruptedException {
gapAssessmentPage.submitButton();
    }

    @Then("validate justification button of chatbot after clicking some options as Not applicable")
    public void validate_justification_button_of_chatbot_after_clicking_some_options_as_not_applicable() throws InterruptedException {
gapAssessmentPage.justification();
    }

    @Then("validate the cancel button of justification")
    public void validate_the_cancel_button_of_justification() throws InterruptedException {
gapAssessmentPage.cancelJustification();
    }

    @Then("validate the previous and next icons of justification")
    public void validate_the_previous_and_next_icons_of_justification() throws InterruptedException {
gapAssessmentPage.iconsOfJustification();
    }


    @And("validate the copy icon functionality {}")
    public void validateTheCopyIconFunctionality(String AssessmenttName, String CopyAssessmentToaster) throws InterruptedException {
        gapAssessmentPage.copyIcon(AssessmenttName, CopyAssessmentToaster);
    }


    @And("validate the delete icon functionality {}")
    public void validateTheDeleteIconFunctionality(String DeletedFileToaster) {
    }


}
