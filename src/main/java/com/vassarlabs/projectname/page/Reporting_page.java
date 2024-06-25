package com.vassarlabs.projectname.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Reporting_page {
    private WebDriver driver;
private By reportingModule=By.xpath("//li[6]//a[1]");
private By reports=By.xpath("//li[@class='active']");
    private By reportingTitle=By.xpath("//div[contains(text(),'Reporting')]");
    private By selectAssessmentDropdown=By.xpath("//select[@class='form-select ng-untouched ng-pristine ng-valid']");
    private By prioritizedRemdiationPlan=By.xpath("//span[normalize-space()='Prioritized Remediation Plan']");
    private By poamCard=By.xpath("//span[normalize-space()='Plan of Action & Milestones (POA&M) Report']");
    private By initialSystemSecuirtyPlan=By.xpath("//span[normalize-space()='Initial System Security Plan Report']");
    private By prioritizedRemediationPlanTitle=By.xpath("//div[contains(text(),'Prioritized Remediation Plan')]");
    private By discoveryTitle=By.xpath("//div[contains(text(),'Discovery')]");
    private By scopedoc=By.xpath("//span[normalize-space()='Scope Document']");
    private By assetInventory=By.xpath("//span[normalize-space()='Asset Inventory']");
    private By dataFlow=By.xpath("//span[normalize-space()='Data flow diagram']");
    private By gapAssessmentTitle=By.xpath("//div[contains(text(),'Gap Assessment')]");
    private By gAPAssessmentRisRegister=By.xpath("//span[contains(text(),'GAP Assessment - Risk Register 2.0 Level 2 Templat')]");
    private By incidentResponsePlanTemplate=By.xpath("//span[normalize-space()='Incident Response Plan Template']");
    private By riskAssessmentOverviewTemplate=By.xpath("//div[3]//div[2]//div[3]//div[1]");
    private By sharedResponsibilitiesMatrixTemplate=By.xpath("//span[normalize-space()='Shared Responsibilities Matrix Template']");

private By templates=By.xpath("//li[@class='active']");
private By poamDownloadToaster=By.xpath("//div[text()=' POA&M Report downloaded successfully ']");
private By intialSystemTitle=By.xpath("//div[text()=' Initial System Security Plan Report ']");
    private By templateDownloadSuccessful=By.xpath("//div[text()=' Template downloaded successfully ']");
public Reporting_page(WebDriver driver) {
        this.driver=driver;
    }

    public void reportingModule() throws InterruptedException {
  driver.findElement(reportingModule).isDisplayed();
  Thread.sleep(3000);
  driver.findElement(reportingModule).click();
        Thread.sleep(3000);
        driver.findElement(reportingTitle).isDisplayed();
        Thread.sleep(3000);
        }


    public void prioritizedRemediation() throws InterruptedException {
        if (driver.findElement(reportingTitle).isDisplayed()) {
            Thread.sleep(3000);
            driver.findElement(prioritizedRemdiationPlan).isDisplayed();
            Thread.sleep(3000);
            driver.findElement(prioritizedRemdiationPlan).click();
            driver.findElement(prioritizedRemediationPlanTitle).isDisplayed();
            String title = driver.findElement(prioritizedRemediationPlanTitle).getText();
            System.out.println(title);
        }
    }

    public void poamDownload( String PoamDownloadToaster) throws InterruptedException {
        if (driver.findElement(reportingTitle).isDisplayed()) {
            Thread.sleep(3000);
            driver.findElement(poamCard).isDisplayed();
            Thread.sleep(3000);
            driver.findElement(poamCard).click();
            if (driver.findElement(this.poamDownloadToaster).isDisplayed()) {
                String poamToaster = driver.findElement(this.poamDownloadToaster).getText();
                System.out.println(poamToaster);
                Assert.assertEquals(PoamDownloadToaster, poamToaster);
            }
        }
    }


    public void systemSecurity() throws InterruptedException {
        if (driver.findElement(reportingTitle).isDisplayed()) {
            Thread.sleep(3000);
            driver.findElement(initialSystemSecuirtyPlan).isDisplayed();
            Thread.sleep(3000);
            driver.findElement(initialSystemSecuirtyPlan).click();
            driver.findElement(intialSystemTitle).isDisplayed();
            String title2 = driver.findElement(intialSystemTitle).getText();
            System.out.println(title2);
        }
    }
    public void templates() throws InterruptedException {
        driver.findElement(reportingModule).isDisplayed();
        Thread.sleep(3000);
        driver.findElement(reportingModule).click();
        Thread.sleep(3000);
        driver.findElement(templates).isDisplayed();
        Thread.sleep(3000);

    }
    public void scopeDoc(String TemplateDownloadSuccessful) {
        driver.findElement(scopedoc).isDisplayed();
        driver.findElement(scopedoc).click();
        driver.findElement(templateDownloadSuccessful).isDisplayed();
        String toaster=driver.findElement(templateDownloadSuccessful).getText();
        System.out.println(toaster);
        Assert.assertEquals(TemplateDownloadSuccessful, toaster);
    }

    public void assetInventory(String TemplateDownloadSuccessful) {
        driver.findElement(assetInventory).isDisplayed();
        driver.findElement(assetInventory).click();
        driver.findElement(templateDownloadSuccessful).isDisplayed();
        String toaster=driver.findElement(templateDownloadSuccessful).getText();
        System.out.println(toaster);
        Assert.assertEquals(TemplateDownloadSuccessful, toaster);
    }

    public void dataFlow(String TemplateDownloadSuccessful) {
        driver.findElement(dataFlow).isDisplayed();
        driver.findElement(dataFlow).click();
        driver.findElement(templateDownloadSuccessful).isDisplayed();
        String toaster=driver.findElement(templateDownloadSuccessful).getText();
        System.out.println(toaster);
        Assert.assertEquals(TemplateDownloadSuccessful, toaster);
    }

    public void riskAssessment(String TemplateDownloadSuccessful) {
        driver.findElement(riskAssessmentOverviewTemplate).isDisplayed();
        driver.findElement(riskAssessmentOverviewTemplate).click();
        driver.findElement(templateDownloadSuccessful).isDisplayed();
        String toaster=driver.findElement(templateDownloadSuccessful).getText();
        System.out.println(toaster);
        Assert.assertEquals(TemplateDownloadSuccessful, toaster);
    }

    public void responsibilitiesMatrix(String TemplateDownloadSuccessful) {
        driver.findElement(sharedResponsibilitiesMatrixTemplate).isDisplayed();
        driver.findElement(sharedResponsibilitiesMatrixTemplate).click();
        driver.findElement(templateDownloadSuccessful).isDisplayed();
        String toaster=driver.findElement(templateDownloadSuccessful).getText();
        System.out.println(toaster);
        Assert.assertEquals(TemplateDownloadSuccessful, toaster);
    }

    public void GAPAssessmentRiskRegister(String TemplateDownloadSuccessful) {
        driver.findElement(gAPAssessmentRisRegister).isDisplayed();
        driver.findElement(gAPAssessmentRisRegister).click();
        driver.findElement(templateDownloadSuccessful).isDisplayed();
        String toaster=driver.findElement(templateDownloadSuccessful).getText();
        System.out.println(toaster);
        Assert.assertEquals(TemplateDownloadSuccessful, toaster);
    }


}
