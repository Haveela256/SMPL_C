package stepdefinitions;

import com.vassarlabs.projectname.page.GapAssessment_page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.driver.WebdriverInitializer;

public class GapAssessment_Steps {
    GapAssessment_page gapAssessmentPage = new GapAssessment_page(WebdriverInitializer.getDriver());

    @Given("Validate Select year dropdown")
    public void validateSelectYearDropdown() throws InterruptedException {
        gapAssessmentPage.selectYear();
    }

    @When("validate sort icon of updated on and assessment name columns")
    public void validate_sort_icon_of_updated_on_and_assessment_name_columns() throws InterruptedException {
        gapAssessmentPage.sortIcons();
    }
    @Given("Validate the copy icon functionality {string} {string} {string} {string}")
    public void validate_the_copy_icon_functionality(String CopyAssessmentToaster, String NewName, String RenameAssessment, String ErrorToaster) throws InterruptedException {
        gapAssessmentPage.copyIcon(CopyAssessmentToaster,  NewName,  RenameAssessment, ErrorToaster);
    }

    @Given("Validate the Rename icon functionality {string} {string} {string} {string}")
    public void validate_the_rename_icon_functionality(String RenameSuccessfulToaster, String RenameAssessment, String AssessmentName, String ErrorToaster) throws InterruptedException {
gapAssessmentPage.renameAssessment(RenameSuccessfulToaster, RenameAssessment, AssessmentName, ErrorToaster);
    }


    @And("validate the delete icon functionality {string} {string} {string}")
    public void validateTheDeleteIconFunctionality(String DeletedFileToaster, String AssessmentName, String RenameAssessment) throws InterruptedException {
        gapAssessmentPage.deleteIcon(DeletedFileToaster,AssessmentName, RenameAssessment);
    }
    @Given("validate the pagination")
    public void validate_the_pagination() throws InterruptedException {
gapAssessmentPage.pagination();
    }

    @Given("verify progress bar {string}")
    public void verify_progress_bar(String RenameAssessment) throws InterruptedException {
gapAssessmentPage.progressBar(RenameAssessment);
    }

    @Given("verify current Sprs score {string}")
    public void verify_current_sprs_score(String RenameAssessment) {
gapAssessmentPage.sPRSScore(RenameAssessment);
    }

    @Given("verify the bar chart {string}")
    public void verify_the_bar_chart(String RenameAssessment) throws InterruptedException {
 gapAssessmentPage.barChart(RenameAssessment);
    }






    @And("validate the bars functionality {string} {string} {string}")
    public void validateTheBarsFunctionality(String RenameAssessment, String BarsCount, String BarsNames) throws InterruptedException {
        gapAssessmentPage.barsFunctionality(RenameAssessment, BarsCount, BarsNames);
    }


    @And("validate the legends functionality of bar chart {string}")
    public void validateTheLegendsFunctionalityOfBarChart(String RenameAssessment) throws InterruptedException {
        gapAssessmentPage.legendsOfBarChart(RenameAssessment);
    }


}