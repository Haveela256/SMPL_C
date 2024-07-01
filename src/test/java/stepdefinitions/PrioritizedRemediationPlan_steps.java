package stepdefinitions;

import com.vassarlabs.projectname.page.PrioritizedRemediationPlan_page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import com.driver.WebdriverInitializer;

public class PrioritizedRemediationPlan_steps {
    PrioritizedRemediationPlan_page prioritizedRemediationPlanPage=new PrioritizedRemediationPlan_page(WebdriverInitializer.getDriver());
    @And("click on the Prioritized Remeditaion Plan card  {string}")
    public void clickOnThePrioritizedRemeditaionPlanCard(String AssessmentName) throws InterruptedException {
        prioritizedRemediationPlanPage.report(AssessmentName);
    }

    @When("validate the print button")
    public void validate_the_print_button() throws InterruptedException {
        prioritizedRemediationPlanPage.print();
    }

    @When("verify the progress bar {string}")
    public void verify_the_progress_bar(String AssessmentName) throws InterruptedException {
        prioritizedRemediationPlanPage.progressBar(AssessmentName);
    }

    @When("verify the sprs score")
    public void verify_the_sprs_score() {
       prioritizedRemediationPlanPage.sprs();
    }
    @And("verify the the regulation cards {string}")
    public void verifyTheTheRegulationCards(String RegulationCards) throws InterruptedException {
            prioritizedRemediationPlanPage.regulationCards(RegulationCards);
    }

    @When("verify the Implementation Status graph")
    public void verify_the_implementation_status_graph() {
       prioritizedRemediationPlanPage.implementationGraph();
    }

    @When("validate the legends of Implementation Status graph")
    public void validate_the_legends_of_implementation_status_graph() throws InterruptedException {
       prioritizedRemediationPlanPage.legendsOfImplementatioGrapsh();
    }

    @When("verify the Implementation Status table")
    public void verify_the_implementation_status_table() {
       prioritizedRemediationPlanPage.implementationStatusTable();
    }


    @When("Validate the pagination of Implementation Status table")
    public void validate_the_pagination_of_implementation_status_table() {
        prioritizedRemediationPlanPage.paginationOfimplementationStatus();
    }

    @When("verify the poam graph")
    public void verify_the_poam_graph() {
       prioritizedRemediationPlanPage.poamGraph();
    }

    @When("validate the legends of poam graph")
    public void validate_the_legends_of_poam_graph() throws InterruptedException {
prioritizedRemediationPlanPage.legends();
    }


    @When("Validate the sort icons of poam table")
    public void validate_the_sort_icons_of_poam_table() {
prioritizedRemediationPlanPage.sortPoam();
    }



}
