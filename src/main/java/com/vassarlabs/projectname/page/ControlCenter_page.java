package com.vassarlabs.projectname.page;

import org.apache.poi.ss.formula.functions.T;
import org.knowm.xchart.style.theme.Theme;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class ControlCenter_page {
    private WebDriver driver;
    private By controlCenterTitle = By.xpath("//div[text()=' Control Center']");
    private By welcome = By.xpath("//div[contains(text(), ' Welcome')]");
    private By productSubscribed = By.xpath("//span[text()=' L-2 Certification Prep ']");
    private By lightBulb = By.xpath("//i[@class='bi bi-lightbulb-fill']");
    private By lastLogin = By.xpath("//span[contains(text(), '2024')]");
    private By expandIcon = By.xpath("//button[@class='btn btn-secondary btn-sm']");




    private By remediationIicon = By.xpath("//div[@class='assessment-item third-pary-items remediation']//i[@class='bi bi-info-circle-fill']");

    private By chatbot = By.xpath("//p[normalize-space()='GenAI Control Center']");


    private By hamburgerPath = By.xpath("//button[@class='btn btn-side-nav']//i[@class='bi bi-list']");
    private By discoveryPath = By.xpath("//a[@routerlink='/home/compliance/discovery']");
    private By discoveryTitle = By.xpath("//div[contains(text(),'Discovery')]");
    private By gapAssesmentPath = By.xpath("//a[@class='nav-link']//span[@class='title'][normalize-space()='Gap Assessment']");
    private By gapAssessmentTitle = By.xpath("//div[contains(text(),'Gap Assessment')]");
    private By auditReadinessPath = By.xpath("//span[normalize-space()='Audit Readiness']");
    private By auditReadinessCard=By.xpath("//h5[@class='heading']//span[@class='title'][normalize-space()='Audit Readiness']");
    private By auditReadinessTitle = By.xpath("//div[contains(text(),'Audit Readiness')]");
    private By reportingPath = By.xpath("//span[normalize-space()='Reporting']");
    private By reportsPath = By.xpath("//li[normalize-space()='Reports']");
    private By reportsTitle = By.xpath("//div[text()='Reports']");
    private By templatesPath = By.xpath("//li[normalize-space()='Templates']");
    private By templatesTitle = By.xpath("//div[contains(text(),'Templates')]");
    private By companyDetailsPath = By.xpath("//span[normalize-space()='Company Details']");

    private By companyDetailsTitle = By.xpath("//div[@class='title']");
    private By technicalFootprintPath = By.xpath("//a[@class='nav-link active']");
    private By technicalFootprintTitle = By.xpath("//div[@class='middle-content-page-header']");
    private By manageUsersPath = By.xpath("//a[@routerlink='/home/manageuser']");
    private By managerUsersTitle = By.xpath("//div[contains(text(),'Manage Users')]");
    private By userProfileIcons = By.xpath("//img[@class='profile-style']");
    private By myProfile = By.xpath("//button[normalize-space()='My Profile']");

    private By myProfileTitle = By.xpath("//div[@class='title']");
    private By changePasswordPath = By.xpath("//button[normalize-space()='Change Password']");
    private By changePasswordTitle = By.xpath("//h3[@class='title']");
    private By logoutPath = By.xpath("//button[normalize-space()='Logout']");
    private By signInPage = By.xpath("//span[@class='sub-title']");
    private By smplcLogo = By.xpath("//img[@alt='SMPL logo']");
    private By updatesSection = By.xpath("//div[contains(text(),'Updates')]");
    private By taskAssignmentsSection = By.xpath("//div[contains(text(),'Task Assignments')]");
    private By messagesSection = By.xpath("//div[contains(text(),'Messages')]");
    private By c3paoIicon = By.xpath("//div[@class='assessment-item third-pary-items engage']//i[@class='bi bi-info-circle-fill']");
private By changePasswordBackLink= By.xpath("//a[text()='Back']");
    public ControlCenter_page(WebDriver driver) {
        this.driver = driver;
    }

    public void hamburger() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        // Click on hamburger menu
        driver.findElement(hamburgerPath).isDisplayed();
        Thread.sleep(3000);
        driver.findElement(hamburgerPath).click();
        wait.until(ExpectedConditions.elementToBeClickable(hamburgerPath));
        Thread.sleep(3000);
        driver.findElement(hamburgerPath).click();
        Thread.sleep(3000);

        // Discovery Module
        driver.findElement(discoveryPath).click();
        Thread.sleep(3000);
        driver.findElement(discoveryTitle).isDisplayed();
        String discoveryTitleText = driver.findElement(discoveryTitle).getText();
        System.out.println(discoveryTitleText);

        // Gap Assessment Module
        driver.findElement(gapAssesmentPath).click();
//        wait.until(ExpectedConditions.elementToBeClickable(gapAssesmentPath));
        Thread.sleep(3000);
        driver.findElement(gapAssessmentTitle).isDisplayed();
        String gapAssessmentTitleText = driver.findElement(gapAssessmentTitle).getText();
        System.out.println(gapAssessmentTitleText);

        // Audit Readiness Module
        driver.findElement(auditReadinessPath).click();
        wait.until(ExpectedConditions.elementToBeClickable(auditReadinessPath));
        Thread.sleep(3000);
        driver.findElement(auditReadinessTitle).isDisplayed();
        String auditReadinessTitleText = driver.findElement(auditReadinessTitle).getText();
        System.out.println(auditReadinessTitleText);

        // Reporting Module
        driver.findElement(reportingPath).click();
        wait.until(ExpectedConditions.elementToBeClickable(reportingPath));
        Thread.sleep(3000);
        driver.findElement(reportsPath).click();
        wait.until(ExpectedConditions.elementToBeClickable(reportsPath));
        Thread.sleep(3000);
        driver.findElement(reportsTitle).isDisplayed();
        String reportsTitleText = driver.findElement(reportsTitle).getText();
        System.out.println(reportsTitleText);

        // Templates Module
        driver.findElement(templatesPath).click();
        wait.until(ExpectedConditions.elementToBeClickable(templatesPath));
        Thread.sleep(3000);
        driver.findElement(templatesTitle).isDisplayed();
        String templatesTitleText = driver.findElement(templatesTitle).getText();
        System.out.println(templatesTitleText);

        // Company Details Module
        driver.findElement(companyDetailsPath).click();
        wait.until(ExpectedConditions.elementToBeClickable(companyDetailsPath));
        Thread.sleep(3000);
        driver.findElement(companyDetailsTitle).isDisplayed();
        String companyDetailsTitleText = driver.findElement(companyDetailsTitle).getText();
        System.out.println(companyDetailsTitleText);

        // Technical Footprint Module
        driver.findElement(technicalFootprintPath).click();
        wait.until(ExpectedConditions.elementToBeClickable(technicalFootprintPath));
        Thread.sleep(3000);
        driver.findElement(technicalFootprintTitle).isDisplayed();
        String technicalFootprintTitleText = driver.findElement(technicalFootprintTitle).getText();
        System.out.println(technicalFootprintTitleText);

        // Manage Users Module
        driver.findElement(manageUsersPath).click();
        wait.until(ExpectedConditions.elementToBeClickable(manageUsersPath));
        Thread.sleep(3000);
        driver.findElement(managerUsersTitle).isDisplayed();
        String manageUsersTitleText = driver.findElement(managerUsersTitle).getText();
        System.out.println(manageUsersTitleText);

        // My Profile

        System.out.println("All modules verified");
    }


    public void smplcLogo() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.findElement(smplcLogo).isDisplayed();
        Thread.sleep(3000);
        driver.findElement(smplcLogo).click();
        Thread.sleep(3000);
        System.out.println("SMPL-C Logo clicked");
    }

    public void discoveryCard(String DiscoveryScope, String DiscoveryAsset, String DiscoveryDatFlow) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        String DiscoveryScopeELE = driver.findElement(By.xpath("//label[text()=' " + DiscoveryScope + " ']")).getText().trim();
        Thread.sleep(5000);
        Assert.assertEquals(DiscoveryScope, DiscoveryScopeELE);
        String DiscoveryAssetELE = driver.findElement(By.xpath("//label[text()=' " + DiscoveryAsset + " ']")).getText().trim();
        Thread.sleep(5000);
        Assert.assertEquals(DiscoveryAsset, DiscoveryAssetELE);
        String DiscoveryDataFlowELE = driver.findElement(By.xpath("//label[text()=' " + DiscoveryDatFlow + " ']")).getText().trim();
        Thread.sleep(5000);
        Assert.assertEquals(DiscoveryDatFlow, DiscoveryDataFlowELE);
        System.out.println("Discovery Card verified");
    }


    public void auditReadinessCard(String AuditReadinessSSP, String AuditReadinessPolicies, String AuditReadinessSupport, String AuditReadinessPiee, String AuditReadinessChecklist) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        if (driver.findElement(auditReadinessCard).isDisplayed()) ;
        {
            String ssp = driver.findElement(By.xpath("//label[text()=' Final System Security Plan (SSP) ']")).getText().trim();
            Thread.sleep(5000);
            Assert.assertEquals(AuditReadinessSSP, ssp);
            String policies = driver.findElement(By.xpath("//label[text()=' Final Policies and Procedures ']")).getText().trim();
            Thread.sleep(5000);
            Assert.assertEquals(AuditReadinessPolicies, policies);
            String support = driver.findElement(By.xpath("//label[text()=' Supporting Evidence & Artifacts ']")).getText().trim();
            Thread.sleep(5000);
            Assert.assertEquals(AuditReadinessSupport, support);
            String piee = driver.findElement(By.xpath("//label[text()=' Final ']")).getText().trim();
            Thread.sleep(5000);
            Assert.assertEquals(AuditReadinessPiee, piee);
            String checkList = driver.findElement(By.xpath("//label[text()=' Readiness Checklist for C3PAO ']")).getText().trim();
            Thread.sleep(5000);
            Assert.assertEquals(AuditReadinessChecklist, checkList);
        }
    }

    public void rightNav() throws InterruptedException {
        String updates = driver.findElement(By.xpath("//div[contains(text(),'Updates')]")).getText();
        Thread.sleep(5000);
        String tasks= driver.findElement(By.xpath("//div[contains(text(),'Task Assignments')]")).getText().trim();
        Thread.sleep(5000);
        String messages = driver.findElement(By.xpath("//div[contains(text(),'Messages')]")).getText().trim();
        Thread.sleep(5000);
        System.out.println(tasks);
        System.out.println(updates);
        System.out.println(messages);
    }

    public void homePage() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.findElement(controlCenterTitle).isDisplayed();
        Thread.sleep(3000);
        String title = driver.findElement(controlCenterTitle).getText();
        System.out.println(title);
        driver.findElement(welcome).isDisplayed();
        Thread.sleep(3000);
        String welcometext = driver.findElement(welcome).getText();
        System.out.println(welcometext);
        driver.findElement(productSubscribed).isDisplayed();
        Thread.sleep(3000);
        String product = driver.findElement(productSubscribed).getText();
        System.out.println(product);
        WebElement ele = driver.findElement(lightBulb);
        Actions act = new Actions(driver);
        act.moveToElement(ele).perform();
        String data = driver.findElement(lightBulb).getText();
        System.out.println(data);
        driver.findElement(lastLogin).isDisplayed();
        Thread.sleep(3000);
        String lastLoginTime = driver.findElement(lastLogin).getText();
        System.out.println(lastLoginTime);
    }


    public void chatbot() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.findElement(chatbot).isDisplayed();
        Thread.sleep(3000);
        System.out.println("Chatbot is displayed");
    }

    public void title() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        if (driver.findElement(controlCenterTitle).isDisplayed()) {
            Thread.sleep(3000);
            String title = driver.findElement(controlCenterTitle).getText();
            System.out.println(title);
        }
    }


    public void iIcon() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement iconElement = driver.findElement(remediationIicon);
        Actions action = new Actions(driver);
        action.moveToElement(iconElement).perform();
        WebElement tooltipElement = driver.findElement(By.xpath("//div[@class='assessment-item third-pary-items remediation']//i[@class='bi bi-info-circle-fill']"));
        String tooltipText = tooltipElement.getText();
        System.out.println("Tooltip text: " + tooltipText);
    }

    public void iIconOfC3pao() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement iconElement = driver.findElement(c3paoIicon);
        Actions action = new Actions(driver);
        action.moveToElement(iconElement).perform();
        WebElement tooltipElement = driver.findElement(c3paoIicon);
        String tooltipText = tooltipElement.getText();
        System.out.println("Tooltip text: " + tooltipText);
    }

    public void userProfileIcon() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.findElement(userProfileIcons).click();
        wait.until(ExpectedConditions.elementToBeClickable(userProfileIcons));
        Thread.sleep(3000);
        driver.findElement(myProfile).isDisplayed();
        Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(myProfile));
        driver.findElement(myProfile).click();
        Thread.sleep(3000);
        driver.findElement(myProfileTitle).isDisplayed();
        String myProfileTitleText = driver.findElement(myProfileTitle).getText();
        System.out.println(myProfileTitleText);

        // Change Password
        driver.findElement(userProfileIcons).click();
        wait.until(ExpectedConditions.elementToBeClickable(userProfileIcons));
        Thread.sleep(3000);
        driver.findElement(changePasswordPath).isDisplayed();
        Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(changePasswordPath));
        driver.findElement(changePasswordPath).click();
        driver.findElement(changePasswordTitle).isDisplayed();
        String changePasswordTitleText = driver.findElement(changePasswordTitle).getText();
        System.out.println(changePasswordTitleText);
        System.out.println("All modules verified");
        driver.findElement(changePasswordBackLink).isDisplayed();
        driver.findElement(changePasswordBackLink).click();
        Thread.sleep(5000);
    }

    public void logout() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.findElement(userProfileIcons).click();
        wait.until(ExpectedConditions.elementToBeClickable(userProfileIcons));
        Thread.sleep(3000);
        driver.findElement(logoutPath).isDisplayed();
        Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(logoutPath));
        driver.findElement(logoutPath).click();
        driver.findElement(signInPage).isDisplayed();
        String signInPageTitleText = driver.findElement(signInPage).getText();
        System.out.println(signInPageTitleText);

    }

    public void gapAssessmentCard(String GapAssessmentBaseline, String GapAssessmentPoam, String GapAssessmentPiee, String GapAssessmentPrioritized, String GapAssessmentRisk, String GapAssessmentIncident, String GapAssessmentMSP) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        // Baseline
        WebElement baselineElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=' " + GapAssessmentBaseline + " ']")));
        Thread.sleep(3000);
        String baseline = baselineElement.getText().trim();
        Assert.assertEquals(GapAssessmentBaseline, baseline);

        // Poam
        WebElement poamElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=' " + GapAssessmentPoam + " ']")));
        Thread.sleep(3000);
        String poam = poamElement.getText().trim();
        Assert.assertEquals(GapAssessmentPoam, poam);

        // Gappiee
        WebElement gappieeElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@class='form-check-label'][text()=' Assessment ']")));
        Thread.sleep(3000);
        String Gappiee = gappieeElement.getText().trim();
        Assert.assertEquals(GapAssessmentPiee, Gappiee);

        // Prioritized
        WebElement prioritizedElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()=' Prioritized Remediation Plan ']")));
        Thread.sleep(3000);
        String prioritized = prioritizedElement.getText().trim();
        Assert.assertEquals(GapAssessmentPrioritized, prioritized);

        // Risk
        WebElement riskElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Risk Assessment Plan']")));
        Thread.sleep(3000);
        String risk = riskElement.getText().trim();
        Assert.assertEquals(GapAssessmentRisk, risk);

        // Incident
        WebElement incidentElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=' Incident Response Plan ']")));
        Thread.sleep(3000);
        String incident = incidentElement.getText().trim();
        Assert.assertEquals(GapAssessmentIncident, incident);

        // MSP
        WebElement mspElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=' MSP Shared Responsibility Matrix ']")));
        Thread.sleep(3000);
        String msp = mspElement.getText().trim();
        Assert.assertEquals(GapAssessmentMSP, msp);
    }

    public void cmmcjourney(String CMMCJourney) throws InterruptedException {
        String journey = driver.findElement(By.xpath("//div[text()=' Start CMMC Journey ']")).getText();
        Thread.sleep(5000);
        Assert.assertEquals(CMMCJourney, journey);
    }

    public void remediation(String Remediation) throws InterruptedException {
        String remdiationCard = driver.findElement(By.xpath("//span[text()='Remediation']")).getText();
        Thread.sleep(5000);
        Assert.assertEquals(Remediation, remdiationCard);
    }

    public void engage(String EngageCPAO) throws InterruptedException {
        String c3pao = driver.findElement(By.xpath("//span[text()=' Engage C3PAO ']")).getText();
        Thread.sleep(5000);
        Assert.assertEquals(EngageCPAO, c3pao);
    }
}
