package com.vassarlabs.projectname.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Reporting_page {
    private WebDriver driver;
    private By reportingModule = By.xpath("//span[text()='Reporting']");
    private By reports = By.xpath("//li[@class='active']");
    private By reportingTitle = By.xpath("//div[contains(text(),'Reporting')]");
    private By selectAssessmentDropdown = By.xpath("//select[@class='form-select ng-untouched ng-pristine ng-valid']");
    private By prioritizedRemdiationPlan = By.xpath("//span[normalize-space()='Prioritized Remediation Plan']");
    private By poamCard = By.xpath("//span[normalize-space()='Plan of Action & Milestones (POA&M) Report']");
    private By initialSystemSecuirtyPlan = By.xpath("//span[normalize-space()='Initial System Security Plan Report']");
    private By prioritizedRemediationPlanTitle = By.xpath("//div[contains(text(),'Prioritized Remediation Plan')]");
    private By discoveryTitle = By.xpath("//div[contains(text(),'Discovery')]");
    private By scopedoc = By.xpath("//span[text()='Scope Document']");
    private By assetInventory = By.xpath("//span[text()='Asset Inventory']");
    private By dataFlow = By.xpath("//span[text()='Data flow diagram']");
    private By gapAssessmentTitle = By.xpath("//div[contains(text(),'Gap Assessment')]");
    private By gAPAssessmentRisRegister = By.xpath("//span[text()='GAP Assessment - Risk Register 2.0 Level 2 Template ']");
    private By incidentResponsePlanTemplate = By.xpath("//span[normalize-space()='Incident Response Plan Template']");
    private By riskAssessmentOverviewTemplate = By.xpath("//span[text()='Risk Assessment Overview Template ']");
    private By sharedResponsibilitiesMatrixTemplate = By.xpath("//span[text()='Shared Responsibilities Matrix Template ']");

    private By templates = By.xpath("//li[text()='Templates']");
    private By poamDownloadToaster = By.xpath("//div[text()=' POA&M Report downloaded successfully ']");
    private By intialSystemTitle = By.xpath("//div[text()=' Initial System Security Plan Report ']");
    private By templateDownloadSuccessful = By.xpath("//div[text()=' Template downloaded successfully ']");
    private By reportsTitle = By.xpath("//div[text()='Reports']");
    private By backArrow = By.xpath("//i[@class='bi bi-arrow-left']");
    private By reports1 = By.xpath("//li[text()='Reports']");
    private By templatesTitle = By.xpath("//div[text()=' Templates ']");
    private By incidentTemplate = By.xpath("//span[text()='Incident Response Plan Template ']");

    public Reporting_page(WebDriver driver) {
        this.driver = driver;
    }

    public void reportingModule() throws InterruptedException {
        driver.findElement(reportingModule).isDisplayed();
        Thread.sleep(3000);
        driver.findElement(reportingModule).click();
        driver.findElement(reports1).click();
    }


    public void prioritizedRemediation() throws InterruptedException {
        if (driver.findElement(reportsTitle).isDisplayed()) {
            Thread.sleep(3000);
            driver.findElement(prioritizedRemdiationPlan).isDisplayed();
            Thread.sleep(3000);
            driver.findElement(prioritizedRemdiationPlan).click();
            driver.findElement(prioritizedRemediationPlanTitle).isDisplayed();
            String title = driver.findElement(prioritizedRemediationPlanTitle).getText();
            System.out.println(title);
            Thread.sleep(3000);
            driver.findElement(backArrow).click();
        }
    }

    public void poamDownload(String PoamDownloadToaster) throws InterruptedException {
        if (driver.findElement(reportsTitle).isDisplayed()) {
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
        if (driver.findElement(reports1).isDisplayed()) {
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
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(templates).click();
        Thread.sleep(3000);

    }

    public void scopeDoc(String TemplateDownloadSuccessful) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Wait for the element to be clickable and click it
        wait.until(ExpectedConditions.elementToBeClickable(scopedoc));
        Thread.sleep(3000);
        driver.findElement(scopedoc).click();

        // Wait for the element to be visible and get its text
        wait.until(ExpectedConditions.visibilityOfElementLocated(templateDownloadSuccessful));
        String toaster = driver.findElement(templateDownloadSuccessful).getText();

        // Print the text and assert it
        System.out.println(toaster);
        Assert.assertEquals("Expected is: " + toaster, "But found is: " + toaster);
    }
    public void assetInventory(String TemplateDownloadSuccessful) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(assetInventory));
        driver.findElement(assetInventory).click();
        driver.findElement(templateDownloadSuccessful).isDisplayed();
        wait.until(ExpectedConditions.visibilityOfElementLocated(templateDownloadSuccessful));
        String toaster = driver.findElement(templateDownloadSuccessful).getText();
        System.out.println(toaster);
        Assert.assertEquals(TemplateDownloadSuccessful, toaster);
    }

    public void dataFlow(String TemplateDownloadSuccessful) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(dataFlow).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(templateDownloadSuccessful));
        String toaster = driver.findElement(templateDownloadSuccessful).getText();
        System.out.println(toaster);
        Assert.assertEquals(TemplateDownloadSuccessful, toaster);
    }

    public void riskAssessment(String TemplateDownloadSuccessful) throws InterruptedException {
        driver.findElement(templateDownloadSuccessful).click();
        Thread.sleep(3000);
        String toaster = driver.findElement(templateDownloadSuccessful).getText();
        System.out.println(toaster);
        Assert.assertEquals(TemplateDownloadSuccessful, toaster);
    }

    public void responsibilitiesMatrix(String TemplateDownloadSuccessful) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(sharedResponsibilitiesMatrixTemplate).click();
        Thread.sleep(3000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(templateDownloadSuccessful));
        String toaster = driver.findElement(templateDownloadSuccessful).getText();
        System.out.println(toaster);
        Assert.assertEquals(TemplateDownloadSuccessful, toaster);
    }

    public void GAPAssessmentRiskRegister(String TemplateDownloadSuccessful) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(gAPAssessmentRisRegister).click();
        Thread.sleep(3000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(templateDownloadSuccessful));
        String toaster = driver.findElement(templateDownloadSuccessful).getText();
        System.out.println(toaster);
        Assert.assertEquals(TemplateDownloadSuccessful, toaster);
    }


    public void incidentResponsePlanTemplate(String TemplateDownloadSuccessful) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(incidentTemplate).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(templateDownloadSuccessful));
        String toaster = driver.findElement(templateDownloadSuccessful).getText();
        System.out.println(toaster);
        Assert.assertEquals(TemplateDownloadSuccessful, toaster);
    }
}
