package com.vassarlabs.projectname.page;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.time.chrono.ThaiBuddhistEra;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AuditReadiness_page2_page {
    private WebDriver driver;
    private By regulationCard = By.xpath("//div[contains(text(),'Access Control')]");
    private By implementaionDropdown = By.xpath("//select[@class='form-select ng-pristine ng-valid ng-touched']");
    private By requiredEvidenceText = By.xpath("//div[normalize-space()='Required Evidence']");
    private By uploadRelevantDoc = By.xpath("//label[text()='Upload Relevant Documentation:']//following::select");
    private By uploadIcon = By.xpath("//i[@class='bi bi-upload']//following::input[@type='file']");

    private By justificationPanel = By.xpath("//button[@id='ngb-accordion-item-0-toggle']");
    private By summarize = By.xpath("//button[@class='btn btn-primary btn-sm mr-1']");

    private By probavilityOfPassingCertification = By.xpath("//span[@class='value']");
    private By uploadDocsTable = By.xpath("//div[@class='title mt-2']");

    private By docTypeSort = By.xpath("//i[@class='px-1 bi bi-sort-down']");
    private By FileNameSort = By.xpath("//i[@class='px-1 bi bi-filter']");
    private By downloadIcon = By.xpath("//i[@class='bi bi-download']");
    private By deleteIcon = By.xpath("//i[@class='bi bi-trash3-fill']");

    private By justification = By.xpath("//div[@class='title'][normalize-space()='Justification for the implementation of required controls']");
    private By reuploadButton = By.xpath("//button[@class='btn btn-primary btn-sm']//following::input[@type='file']");
    private By ediTicon = By.xpath("//i[@class='bi bi-pencil-square']");
    private By editData = By.xpath("//li[contains(text(),'The document includes sections on Data Classificat')]");
    private By saveIcon = By.xpath("//i[@class='bi bi-floppy']");
    private By justificationToaster = By.xpath("//div[text()=' Justification Saved Successfully ']");
    //    private By downloadIcon = By.xpath("//button[@ngbtooltip='Download File']");
//    private By deleteIcon = By.xpath("//button[@ngbtooltip='Delete File']");
    private By paginationDropdown = By.xpath("//select[@class='form-select form-select-sm small-dd ng-untouched ng-pristine ng-valid']");
    private By popupNoButton = By.xpath("//button[text()='No']");
    private By popupYesButton = By.xpath("//button[text()='Yes']");
    private By filedeletedToaster = By.xpath("//div[@aria-label='File deleted successfully']");
    private By nextIcon = By.xpath("//a[@class='next cursor-pointer']");
    private By previous = By.xpath("//pagination-controls/pagination-template/nav/ul/li[@class='pagination-previous']");
    private By numberhyperlink = By.xpath("//span[text()='2']");
    private By popup = By.xpath("//span[text()='Are you sure to delete ?']");
    private By yes = By.xpath("//button[text()='Delete']");
    private By previousIcon = By.xpath("//a[@class='previous cursor-pointer']//i[@class='bi bi-chevron-left']");
    private By auditrediness = By.xpath("//span[normalize-space()='Audit Readiness']");
    private By uploadPolicy = By.xpath("//button[normalize-space()='Upload Policy']");
    private By policytoaster = By.xpath("//div[text()=' Assessment Policy Document Save Successfull. ']");
    private By firstTab = By.xpath("//a[text()='AC.L1-3.1.1']");
    private By secondTab = By.xpath("//a[text()='AC.L1-3.1.2']");
    private By thirdTab = By.xpath("//a[text()='AC.L1-3.1.20']");
    private By fourthTab = By.xpath("//a[text()='AC.L1-3.1.22']");
    private By back = By.xpath("//i[@class='bi bi-arrow-left']");


    public AuditReadiness_page2_page(WebDriver driver) {
        this.driver = driver;
    }

    public void cards(String Cards, String AssessmentName) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(auditrediness));
        driver.findElement(auditrediness).click();
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='" + AssessmentName + "']")));
        driver.findElement(By.xpath("//span[text()='" + AssessmentName + "']")).click();
        Thread.sleep(3000);
        String[] dummy = Cards.split(",");
        ArrayList<String> cardNames = new ArrayList<>(Arrays.asList(dummy));
        System.out.println(cardNames);
        for (int i = 0; i < cardNames.size(); i++) {
            Thread.sleep(3000);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()=' " + cardNames.get(i) + " ']")));
            driver.findElement(By.xpath("//div[text()=' " + cardNames.get(i) + " ']")).click();
            System.out.println(cardNames.get(i) + " is clicked");
            Thread.sleep(3000);
        }

    }

    public void cmmcRegulation(String Cards, String AssessmentName, String Regulationtabs, String UploadFile, String ReuploadFile, String JustificationToaster, String DeletedFileToaster, String EditText) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='" + Regulationtabs + "']")));
        driver.findElement(By.xpath("//a[text()='" + Regulationtabs + "']")).click();

        WebElement dropdownElement = driver.findElement(uploadRelevantDoc);
        Select dropdown = new Select(dropdownElement);
        List<WebElement> options = dropdown.getOptions();

        for (int i = 1; i < options.size(); i++) {
            dropdown.selectByIndex(i);
            driver.findElement(uploadIcon).sendKeys(UploadFile);
            Thread.sleep(5000);

            // Add a wait for file upload to complete or table to update
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table")));

            if (isFileUploaded(options.get(i).getText())) {
                System.out.println("File " + options.get(i).getText() + " successfully uploaded and found in the table.");

                if (driver.findElement(By.xpath("//div[text()=' Justification for the implementation of required controls ']//following::button[text()='" + options.get(i).getText() + "']")).isDisplayed()) {
                    Thread.sleep(3000);
                    driver.findElement(By.xpath("//div[text()=' Justification for the implementation of required controls ']//following::button[text()='" + options.get(i).getText() + "']")).click();
                    Thread.sleep(8000);
                    driver.findElement(ediTicon).click();
                    Thread.sleep(3000);
                    driver.findElement(editData).click();
                    driver.findElement(editData).clear();
                    driver.findElement(editData).sendKeys(EditText);
                    Thread.sleep(5000);
                    driver.findElement(saveIcon).click();
                    if (driver.findElement(justificationToaster).isDisplayed()) {
                        String toasterr = driver.findElement(justificationToaster).getText();
                        System.out.println(toasterr);
                        Assert.assertEquals(JustificationToaster, toasterr);
                    }
                } else {
                    System.out.println("Panel is not displayed");
                }
            } else {
                System.out.println("File " + options.get(i).getText() + " was not found in the table.");
            }

        }}

    public void icons(String cards, String assessmentName, String regulationtabs) {
    }

    private boolean isFileUploaded(String optionText) {
        WebElement table = driver.findElement(By.xpath("//table"));
        List<WebElement> rows = table.findElements(By.xpath("//table//tr"));
        boolean fileFound = false;

        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.xpath("//table//td"));
            for (WebElement cell : cells) {
                if (cell.getText().contains(optionText)) {
                    fileFound = true;
                    break;
                }
            }
            if (fileFound) {
                break;
            }
        }

        return fileFound;
    }

    public void panel(String JustificationToaster, String DeletedFileToaster, String EditText) throws InterruptedException {
            if(driver.findElement(summarize).isDisplayed()){
                driver.findElement(summarize).click();
                Thread.sleep(2000);
            }else {
                System.out.println("Justification panel is not displayed");
            }
               if(driver.findElement(summarize).isDisplayed()){
                driver.findElement(summarize).click();
                Thread.sleep(2000);}
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
        driver.findElement(yes).click();
        if (driver.findElement(filedeletedToaster).isDisplayed()) {
            String delete = driver.findElement(filedeletedToaster).getText();
            System.out.println(delete);
            Assert.assertEquals(DeletedFileToaster, delete);

        }
    }



    public void verifyCardStatus(String Cards, String assessmentName) {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        if(driver.findElement(By.xpath("//div[text()=' Evidence Collection Status: ']//following::div[text()='"+Cards+"']")).isDisplayed()){
            WebElement cardStatusElement = driver.findElement(By.xpath("//div[contains(@class, 'title') and contains(text(), 'Situational Awareness')]/parent::div[@class='value']"));
            String statusText = cardStatusElement.getText().trim();
            int statusValue = Integer.parseInt(statusText);

            // Validate that the status value is greater than zero
            if (statusValue > 0) {
                System.out.println("Card status is greater than zero: " + statusValue);
            } else {
                System.out.println("Card status is not greater than zero: " + statusValue);
            }
        }

    }

    public void uploadPolicy(String UploadPolicy, String PolicyDocToaster) {
        driver.findElement(uploadPolicy).sendKeys(UploadPolicy);
        if (driver.findElement(policytoaster).isDisplayed()){
            String policy=driver.findElement(policytoaster).getText();
            System.out.println(policy);
            Assert.assertEquals(PolicyDocToaster, policy);
        }
    }


    public void submitButton() throws InterruptedException {
        driver.findElement(By.xpath("//button[text()='Submit']"));
        Thread.sleep(4000);
    }

    public void reupload(String ReuploadFile) {
//        List<WebElement> reupload = driver.findElements(reuploadButton);
//        if (!reupload.isEmpty() && reupload.get(0).isDisplayed()) {
//            WebElement element = reupload.get(0);
//        driver.findElement(reuploadButton).click();
//    }else {
//            System.out.println("Reupload button is not displayed");
//        }

}

    public void pagiNation() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
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
    }

