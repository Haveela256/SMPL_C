package com.vassarlabs.projectname.page;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AuditReadiness_page {
    private WebDriver driver;
    private By regulationCard = By.xpath("//div[contains(text(),'Access Control')]");
    private By implementaionDropdown = By.xpath("//select[@class='form-select ng-pristine ng-valid ng-touched']");
    private By requiredEvidenceText = By.xpath("//div[normalize-space()='Required Evidence']");
    private By uploadRelevantDoc = By.xpath("//select[@class='form-select ng-untouched ng-pristine ng-valid']");
    private By uploadIcon = By.xpath("//body/app-root/div[@class='d-flex']/div[@class='right-container']/app-audit-readiness/app-audit-readiness-details-page/div[@class='main-container']/div[@class='main-content side-nav-hide']/div[@class='middle-content has-sidemenu']/div[@class='content-container']/div[@class='category-inner-body']/div[@class='category-content']/div[@class='card']/div[1]");
    private By browsePath = By.xpath("//body/app-root/div[@class='d-flex']/div[@class='right-container']/app-audit-readiness/app-audit-readiness-details-page/div[@class='main-container']/div[@class='main-content side-nav-hide']/div[@class='middle-content has-sidemenu']/div[@class='content-container']/div[@class='category-inner-body']/div[@class='category-content']/div[@class='card']/div[1]");

    private By justificationPanel = By.xpath("//button[@id='ngb-accordion-item-0-toggle']");
    private By summarize = By.xpath("//button[@class='btn btn-primary btn-sm mr-1']");

    private By probavilityOfPassingCertification = By.xpath("//span[@class='value']");
    private By uploadDocsTable = By.xpath("//div[@class='title mt-2']");

    private By docTypeSort = By.xpath("//i[@class='px-1 bi bi-sort-down']");
    private By FileNameSort = By.xpath("//i[@class='px-1 bi bi-filter']");
    private By downloadIcon = By.xpath("//i[@class='bi bi-download']");
    private By deleteIcon = By.xpath("//i[@class='bi bi-trash3-fill']");

    private By justification = By.xpath("//div[@class='title'][normalize-space()='Justification for the implementation of required controls']");
    private By reuploadButton = By.xpath("//button[@class='btn btn-primary btn-sm']");
    private By ediTicon = By.xpath("//i[@class='bi bi-pencil-square']");
    private By editData = By.xpath("//li[contains(text(),'The document includes sections on Data Classificat')]");
    private By saveIcon = By.xpath("//i[@class='bi bi-floppy']");
    private By justificationToaster = By.xpath("//div[text()=' Justification Saved Successfully ']");
    private By paginationDropdown = By.xpath("//select[@class='form-select form-select-sm small-dd ng-untouched ng-pristine ng-valid']");
    private By popupNoButton = By.xpath("//button[text()='No']");
    private By popupYesButton = By.xpath("//button[text()='Yes']");
    private By filedeletedToaster = By.xpath("//div[@aria-label='File deleted successfully']");
    private By nextIcon = By.xpath("//li[@class='pagination-next ng-star-inserted']//a");
    private By previous = By.xpath("//li[@class='pagination-previous ng-star-inserted']//a");
    private By numberhyperlink = By.xpath("//span[text()='2']");
    private By popup = By.xpath("//span[text()='Are you sure to delete ?']");
    private By auditReadinessPath = By.xpath("//span[text()='Audit Readiness']");
    private By auditReadinessPathTitle = By.xpath("//div[text()='Audit Readiness']");
    //    private By uploadIcon=By.xpath("//i[@class='bi bi-upload cursor']");
    private By replaceFile = By.xpath("//button[text()='Upload Replacement File']");
    private By selectYearPath = By.xpath("//select//option[text()='Select Year']/..");
    private By yearPath = By.xpath("//option[text()='2024']");
    private By popupDeleteButton = By.xpath("//button[text()='Delete']");
    private By status = By.xpath("//span[text()='Status :']/..");
    private By progress = By.xpath("//div[@class='custom-progress-bar']");
    private By remediationReadiness = By.xpath("//span[text()='Certification Readiness :']");
    private By lastLogin = By.xpath("//span[text()='Last Modified :']/..");
    private By copyIcon = By.xpath("//button[@ngbtooltip='Make a copy']");
    private By copyAssessmentTitle = By.xpath("//h4[text()='Copy Assessment']");
    private By closeIcon = By.xpath("//button[@class='btn-close']");
    private By assessmentName = By.xpath("//input[@id='assessment_name']");
    private By copiedToaster = By.xpath("//div[text()=' Assessment Copied Successfully ']");
    private By existingAssessmentError = By.xpath("//div[text()=' Assessment Name Already Exist Please Choose Another Assessment name !!! ']");
    private By collapseChatbot = By.xpath("//button[@class='btn btn-sm d-none d-md-block']//i[@class='bi bi-chevron-down']");
    boolean errorToaster = false;
    private By saveButton = By.xpath("//button[text()='Save']");

    private By sprsTitle = By.xpath("//span[text()='Current SPRS Score']/..");

    public AuditReadiness_page(WebDriver driver) {
        this.driver = driver;
    }

    public void regulationCard() throws InterruptedException {
        driver.findElement(regulationCard).click();
        Thread.sleep(3000);
    }

    public void implementationDropdown() throws InterruptedException {
        driver.findElement(implementaionDropdown).click();
        Thread.sleep(3000);
        WebElement ele = driver.findElement(implementaionDropdown);
        Select dropdown = new Select(ele);
        dropdown.selectByIndex(1);
    }

    public void uploadRelevantDocument() throws InterruptedException {
        driver.findElement(uploadRelevantDoc).click();
        Thread.sleep(3000);
        WebElement ele = driver.findElement(uploadRelevantDoc);
        Select dropdown = new Select(ele);
        dropdown.selectByIndex(1);
    }

    public void uploadIcon(String File) {
        driver.findElement(uploadIcon).click();
        driver.findElement(uploadIcon).sendKeys(File);
        driver.findElement(reuploadButton).isDisplayed();
        driver.findElement(reuploadButton).sendKeys(File);
        for (int i = 0; i < 15; i++) {
            // Find the upload icon and click on it
            WebElement uploadElement = driver.findElement(uploadIcon);
            uploadElement.click();

            // Upload the file
            uploadElement.sendKeys(File);
        }
    }

    public void justification() {
        driver.findElement(justification).isDisplayed();
        String justificationn = driver.findElement(justification).getText();
        System.out.println(justificationn);
    }

    public void uploadedFilesPanel() {
        driver.findElement(uploadIcon).isDisplayed();
        driver.findElement(uploadIcon).click();
    }

    public void editIconOfJustification(String JustificationToaster) {
        driver.findElement(ediTicon).click();
        driver.findElement(editData).sendKeys(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE);
        driver.findElement(saveIcon).click();
        driver.findElement(justificationToaster).isDisplayed();
        String toaster = driver.findElement(justificationToaster).getText();
        System.out.println(toaster);
        Assert.assertEquals(JustificationToaster, toaster);
    }

    public void summarizeButton() {
        driver.findElement(summarize).isDisplayed();
        driver.findElement(summarize).click();
    }

    public void sortIcons() throws InterruptedException {
        Thread.sleep(2000);
        if (driver.findElements(docTypeSort).size() > 0) {
            Thread.sleep(2000);
            driver.findElement(docTypeSort).click();
        }
        Thread.sleep(2000);
        driver.findElement(FileNameSort).isDisplayed();
        driver.findElement(FileNameSort).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.findElement(downloadIcon).click();
        driver.findElement(deleteIcon).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(popup));

    }


    public void pagination() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        List<WebElement> paginationElements = driver.findElements(paginationDropdown);
        if (!paginationElements.isEmpty() && paginationElements.get(0).isDisplayed()) {
            WebElement ele = paginationElements.get(0);
            Select dropdown = new Select(ele);
            dropdown.selectByIndex(1);
            driver.findElement(nextIcon).click();
            driver.findElement(previous).click();
            driver.findElement(numberhyperlink).click();
            // Select options by index
            dropdown.selectByIndex(2);
            dropdown.selectByIndex(3);
            dropdown.selectByIndex(4);
        } else {
            System.out.println("Pagination is not displayed");
        }
    }


    public void download(String AssessmentName) {
        if (driver.findElement(By.xpath("//table//span[text()='" + AssessmentName + "']")).isDisplayed()) {
            driver.findElement(downloadIcon).click();
        }

    }

    public void selectYearDropdown() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.findElement(auditReadinessPath).click();
        Thread.sleep(3000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(auditReadinessPathTitle));
        Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(selectYearPath));
        Thread.sleep(3000);
        driver.findElement(selectYearPath).click();
        driver.findElement(yearPath).click();
        Thread.sleep(3000);
    }

    public void deleteIcon(String DeletedFileToaster, String NewName) throws InterruptedException {
        if (driver.findElement(By.xpath("//table//span[text()='" + NewName + "']")).isDisplayed()) {
            Thread.sleep(3000);
            driver.findElement(deleteIcon).click();
            driver.findElement(popupDeleteButton).click();
            System.out.println("File deleted Successfully");
//            if (driver.findElement(filedeletedToaster).isDisplayed()) {
//                String delete = driver.findElement(filedeletedToaster).getText();
//                System.out.println(delete);
//                Assert.assertEquals(DeletedFileToaster, delete);
//            }

        }
    }
    public void card(String AssessmentName,String Cards) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='" + AssessmentName + "']")));
<<<<<<< HEAD
        Thread.sleep(5000);
=======
        Thread.sleep(6000);
>>>>>>> 39f7f0990eecc162198cf20a681bb85fc78868c2
        driver.findElement(By.xpath("//span[text()='" + AssessmentName + "']")).click();
        Thread.sleep(4000);
        String[] dummy = Cards.split(",");
        ArrayList<String> cardNames = new ArrayList<>(Arrays.asList(dummy));
        System.out.println(cardNames);
        for (int i = 0; i < cardNames.size(); i++) {
            Thread.sleep(3000);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()=' " + cardNames.get(i) + " ']")));
            if(driver.findElement(By.xpath("//div[text()=' " + cardNames.get(i) + " ']")).isDisplayed()){
            System.out.println(cardNames.get(i) + " is displayed");
            Thread.sleep(3000);
        }

    }
    }

    public void progress(String AssessmentName) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        driver.findElement(By.xpath("//table//span[normalize-space()='" + AssessmentName + "']")).click();
        Thread.sleep(3000);
        String progressData = driver.findElement(progress).getText();
        System.out.println(progressData);
        if (driver.findElement(By.xpath("//div[text()=' " + AssessmentName + " ']")).isDisplayed()) {
            driver.findElement(status).isDisplayed();
            Thread.sleep(3000);
            String statuss = driver.findElement(status).getText();
            System.out.println(statuss);
            driver.findElement(progress).isDisplayed();
            Thread.sleep(3000);
            String progresss = driver.findElement(progress).getText();
            System.out.println(progresss);
            driver.findElement(remediationReadiness).isDisplayed();
            Thread.sleep(3000);
            String remediation = driver.findElement(remediationReadiness).getText();
            System.out.println(remediation);
            driver.findElement(lastLogin).isDisplayed();
            Thread.sleep(3000);
            String login = driver.findElement(lastLogin).getText();
            System.out.println(login);
        } else if (driver.findElement(By.xpath("//div[text()=' " + AssessmentName + " ']")).isDisplayed()) {
            driver.findElement(status).isDisplayed();
            Thread.sleep(3000);
            String statuss = driver.findElement(status).getText();
            System.out.println(statuss);
            driver.findElement(progress).isDisplayed();
            Thread.sleep(3000);
            String progresss = driver.findElement(progress).getText();
            System.out.println(progresss);
            driver.findElement(remediationReadiness).isDisplayed();
            Thread.sleep(3000);
            String remediation = driver.findElement(remediationReadiness).getText();
            System.out.println(remediation);
            driver.findElement(lastLogin).isDisplayed();
            Thread.sleep(3000);
            String login = driver.findElement(lastLogin).getText();
            System.out.println(login);
        }
    }

    public void copy(String CopyAssessmentToaster, String NewName, String AssessmentName, String ErrorToaster) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
<<<<<<< HEAD
//        wait.until(ExpectedConditions.elementToBeClickable(collapseChatbot));
//        driver.findElement(collapseChatbot).click();
//        Thread.sleep(4000);
=======
        wait.until(ExpectedConditions.elementToBeClickable(collapseChatbot));
        driver.findElement(collapseChatbot).click();
        Thread.sleep(4000);
>>>>>>> 39f7f0990eecc162198cf20a681bb85fc78868c2
        List<WebElement> paginationElements = driver.findElements(paginationDropdown);
        if (!paginationElements.isEmpty() && paginationElements.get(0).isDisplayed()) {
            WebElement ele = paginationElements.get(0);
            Select dropdown = new Select(ele);
            dropdown.selectByIndex(4);
            if (driver.findElement(By.xpath("//table//tr//td[2]//span[text()='" + AssessmentName + "']")).isDisplayed()) {
                Thread.sleep(3000);
                wait.until(ExpectedConditions.elementToBeClickable(copyIcon));
                Thread.sleep(3000);
                driver.findElement(copyIcon).click();
                Thread.sleep(3000);
                if (driver.findElement(copyAssessmentTitle).isDisplayed()) {
                    Thread.sleep(3000);
                    WebElement assessmentNameElement = driver.findElement(assessmentName);
                    assessmentNameElement.sendKeys(NewName);
                    Thread.sleep(3000);
                    if (driver.findElement(saveButton).isEnabled()) {
                        driver.findElement(saveButton).click();
                    }
                    if (!driver.findElement(saveButton).isEnabled()) {
                        {
                            driver.findElement(closeIcon).click();
                            Thread.sleep(3000);
                        }
                    }
                }
                int value = 0;
                if (CopyAssessmentToaster.contains("Copy assessment Successfully")) {
                    value = 1;
                    System.out.println("Case 1 Will Run");
                }
                if (ErrorToaster.contains("Assessment Name Already Exist Please Choose Another Assessment name")) {
                    value = 2;
                    System.out.println("Case 2 Will Run");
                }

                switch (value) {
                    case 1:
                        if (driver.findElements(copiedToaster).size() > 0) {
                            String rename = driver.findElement(copiedToaster).getText();
                            System.out.println(rename);
                            Assert.assertEquals(CopyAssessmentToaster, rename);
                            errorToaster = true;
                        }
                        break;
                    case 2:
                        if (driver.findElements(existingAssessmentError).size() > 0) {
                            String error = driver.findElement(existingAssessmentError).getText();
                            System.out.println(error);
                            Assert.assertEquals(ErrorToaster, error);
                            errorToaster = true;
                        }
                        break;
                }
            } else {
                System.out.println("Toaster is not displayed");
            }
        }
    }
    public void sprs() {
            if (driver.findElement(sprsTitle).isDisplayed()) {
                String sprs = driver.findElement(sprsTitle).getText();
                System.out.println(sprs);
            } else {
                System.out.println("SPRS Score is not displayed");
            }
        }}



