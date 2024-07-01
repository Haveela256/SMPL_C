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

    @And("click on the download Icons of Plan of Action & Milestones \\(POA&M) Report {string}")
    public void clickOnTheDownloadIconsOfPlanOfActionMilestonesPOAMReport(String PoamDownloadToaster) throws InterruptedException {
        reportingPage.poamDownload(PoamDownloadToaster);
    }

    @When("click on the Initial System Security Plan Report card")
    public void click_on_the_initial_system_security_plan_report_card() throws InterruptedException {
       reportingPage.systemSecurity();
    }


    @And("click on the Download icon of Scope Document {string}")
    public void clickOnTheDownloadIconOfScopeDocument(String TemplateDownloadSuccessful) throws InterruptedException {
        reportingPage.scopeDoc(TemplateDownloadSuccessful);
    }

    @And("click on the Download icon of Data flow diagram {string}")
    public void clickOnTheDownloadIconOfDataFlowDiagram(String TemplateDownloadSuccessful) throws InterruptedException {
        reportingPage.dataFlow(TemplateDownloadSuccessful);
    }

    @And("click on the Download icon of Asset Inventory {string}")
    public void clickOnTheDownloadIconOfAssetInventory(String TemplateDownloadSuccessful) {

        reportingPage.assetInventory(TemplateDownloadSuccessful);
    }



    @And("click on the Download icon of Risk Assessment Overview Template {string}")
    public void clickOnTheDownloadIconOfRiskAssessmentOverviewTemplate(String TemplateDownloadSuccessful) throws InterruptedException {
        reportingPage.riskAssessment(TemplateDownloadSuccessful);
    }

    @And("click on the Download icon of Shared Responsibilities Matrix Template {string}")
    public void clickOnTheDownloadIconOfSharedResponsibilitiesMatrixTemplate(String TemplateDownloadSuccessful) throws InterruptedException {
        reportingPage.responsibilitiesMatrix( TemplateDownloadSuccessful);
    }


    @And("click on the Download icon of GAP Assessment Risk Register Template {string}")
    public void clickOnTheDownloadIconOfGAPAssessmentRiskRegisterTemplate(String TemplateDownloadSuccessful) throws InterruptedException {
        reportingPage.GAPAssessmentRiskRegister(TemplateDownloadSuccessful);
    }

    @And("click on the Templates sub-module")
    public void clickOnTheTemplatesSubModule() throws InterruptedException {
        reportingPage.templates();
    }

    @And("click on the Download icon of Incident Response Plan Template {}")
    public void clickOnTheDownloadIconOfIncidentResponsePlanTemplate(String TemplateDownloadSuccessful) {
      reportingPage.incidentResponsePlanTemplate(TemplateDownloadSuccessful);
    }
}
