package stepdefinitions;

import com.vassarlabs.projectname.page.Reporting_page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import com.driver.WebdriverInitializer;

public class Reporting_Steps {
    Reporting_page reportingPage=new Reporting_page(WebdriverInitializer.getDriver());
    @When("Click on the Reporting module and click on the Reports sub-module")
    public void click_on_the_reporting_module_and_click_on_the_reports_sub_module() throws InterruptedException {
       reportingPage.reportingModule();
    }

    @When("click on the Prioritized Remeditaion Plan card")
    public void click_on_the_prioritized_remeditaion_plan_card() throws InterruptedException {
       reportingPage.prioritizedRemediation();
    }

    @And("click on the download Icons of Plan of Action & Milestones \\(POA&M) Report {}")
    public void clickOnTheDownloadIconsOfPlanOfActionMilestonesPOAMReport(String PoamDownloadToaster) throws InterruptedException {
        reportingPage.poamDownload(PoamDownloadToaster);
    }

    @When("click on the Initial System Security Plan Report card")
    public void click_on_the_initial_system_security_plan_report_card() throws InterruptedException {
       reportingPage.systemSecurity();
    }


    @And("click on the Download icon of Scope Document {}")
    public void clickOnTheDownloadIconOfScopeDocument(String TemplateDownloadSuccessful) {
        reportingPage.scopeDoc(TemplateDownloadSuccessful);
    }

    @And("click on the Download icon of Data flow diagram {}")
    public void clickOnTheDownloadIconOfDataFlowDiagram(String TemplateDownloadSuccessful) {
        reportingPage.dataFlow( TemplateDownloadSuccessful);
    }

    @And("click on the Download icon of Asset Inventory {}")
    public void clickOnTheDownloadIconOfAssetInventory(String TemplateDownloadSuccessful) {

        reportingPage.assetInventory(TemplateDownloadSuccessful);
    }



    @And("click on the Download icon of Risk Assessment Overview Template {}")
    public void clickOnTheDownloadIconOfRiskAssessmentOverviewTemplate(String TemplateDownloadSuccessful) {
        reportingPage.riskAssessment(TemplateDownloadSuccessful);
    }

    @And("click on the Download icon of Shared Responsibilities Matrix Template {}")
    public void clickOnTheDownloadIconOfSharedResponsibilitiesMatrixTemplate(String TemplateDownloadSuccessful) {
        reportingPage.responsibilitiesMatrix( TemplateDownloadSuccessful);
    }


    @And("click on the Download icon of GAP Assessment Risk Register Template {}")
    public void clickOnTheDownloadIconOfGAPAssessmentRiskRegisterTemplate(String TemplateDownloadSuccessful) {
        reportingPage.GAPAssessmentRiskRegister(TemplateDownloadSuccessful);
    }

    @And("click on the Templates sub-module")
    public void clickOnTheTemplatesSubModule() throws InterruptedException {
        reportingPage.templates();
    }
}
