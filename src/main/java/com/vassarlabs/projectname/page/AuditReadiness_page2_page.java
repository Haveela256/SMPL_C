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
    private By uploadRelevantDoc = By.xpath("//label[text()='Upload Relevant Documentation:']//following::select");
    private By uploadIcon = By.xpath("//i[@class='bi bi-upload']//following::input[@type='file']");
    private By summarize = By.xpath("//button[@class='btn btn-primary btn-sm mr-1']");


    private By docTypeSort = By.xpath("//i[@class='px-1 bi bi-sort-down ng-star-inserted']");
    private By FileNameSort = By.xpath("//i[@class='px-1 bi bi-filter ng-star-inserted']");
    private By downloadIcon = By.xpath("//i[@class='bi bi-download']");
    private By deleteIcon = By.xpath("//i[@class='bi bi-trash3-fill']");

    private By ediTicon = By.xpath("//i[@class='bi bi-pencil-square']");
    private By editData = By.xpath("//li[contains(text(),'The document includes sections on Data Classificat')]");
    private By saveIcon = By.xpath("//i[@class='bi bi-floppy']");
    private By justificationToaster = By.xpath("//div[text()=' Justification Saved Successfully ']");
    private By paginationDropdown = By.xpath("//select[@class='form-select form-select-sm small-dd ng-untouched ng-pristine ng-valid']");
    private By popupNoButton = By.xpath("//button[text()='No']");
    private By popupYesButton = By.xpath("//button[text()='Yes']");
    private By filedeletedToaster = By.xpath("//div[contains(text(),'Deleted Successfully')]");
    private By nextIcon = By.xpath("//a[@class='next cursor-pointer']");
    private By previous = By.xpath("//pagination-controls/pagination-template/nav/ul/li[@class='pagination-previous']");
    private By numberhyperlink = By.xpath("//span[text()='2']");
    private By popup = By.xpath("//span[text()='Are you sure to delete ?']");
    private By yes = By.xpath("//button[text()='Delete']");
    private By previousIcon = By.xpath("//a[@class='previous cursor-pointer']//i[@class='bi bi-chevron-left']");
    private By auditrediness = By.xpath("//span[normalize-space()='Audit Readiness']");
    private By uploadPolicy = By.xpath("//i[@class='bi bi-upload']//preceding::input[@type='file']");
    private By policytoaster = By.xpath("//div[text()=' Assessment Policy Document Save Successfull. ']");
    private By back = By.xpath("//i[@class='bi bi-arrow-left']");


    public AuditReadiness_page2_page(WebDriver driver) {
        this.driver = driver;
    }

    public void cards(String Cards, String AssessmentName) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(auditrediness));
        driver.findElement(auditrediness).click();
        Thread.sleep(40000);
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
//        WebElement dropdownStatus=driver.findElement(By.xpath("//select//option[text()='Select Implementation Status']"));
//        Select select1=new Select(dropdownStatus);
//        select1.selectByIndex(2);
        WebElement dropdownElement = driver.findElement(uploadRelevantDoc);
        Select dropdown = new Select(dropdownElement);
        List<WebElement> options = dropdown.getOptions();

        for (int i = 1; i < options.size(); i++) {
            dropdown.selectByIndex(i);
            driver.findElement(uploadIcon).sendKeys(UploadFile);
            Thread.sleep(5000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table")));
            if (isFileUploaded(options.get(i).getText())) {
                System.out.println("File " + options.get(i).getText() + " successfully uploaded and found in the table.");
                Thread.sleep(10000);
                if (driver.findElement(By.xpath("//div[text()=' Justification for the implementation of required controls ']//following::button[contains(text(),'" + options.get(i).getText() + "')]")).isDisplayed()) {
                    Thread.sleep(3000);
                    driver.findElement(By.xpath("//div[text()=' Justification for the implementation of required controls ']//following::button[contains(text(),'" + options.get(i).getText() + "')]")).click();
                    Thread.sleep(10000);
                    driver.findElement(ediTicon).click();
                    Thread.sleep(3000);
                    WebElement editDataElement = driver.findElement(editData);
                    editDataElement.click();
                    editDataElement.sendKeys(Keys.CONTROL, "a");
                    Thread.sleep(3000);
                    editDataElement.sendKeys(Keys.BACK_SPACE);
                    Thread.sleep(3000);
                    driver.findElement(By.xpath("//div[@class='note-editable']")).sendKeys(EditText);
                    Thread.sleep(3000);
                    driver.findElement(saveIcon).click();
                    if (driver.findElement(justificationToaster).isDisplayed()) {
                        String toasterMessage = driver.findElement(justificationToaster).getText();
                        System.out.println(toasterMessage);
                        Assert.assertEquals(JustificationToaster, toasterMessage);
                        Thread.sleep(3000);
                    }
                } else {
                    System.out.println("Panel is not displayed");
                }
            } else {
                System.out.println("File " + options.get(i).getText() + " was not found in the table.");
            }
        }
    }

    private boolean isFileUploaded(String optionText) {
        WebElement table = driver.findElement(By.xpath("//table"));
        List<WebElement> rows = table.findElements(By.xpath("//tr"));
        boolean fileFound = false;

        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.xpath("//td"));
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

    public void panel(String JustificationToaster, String EditText) throws InterruptedException {
        if (driver.findElement(summarize).isDisplayed()) {
            driver.findElement(summarize).click();
            Thread.sleep(2000);
        } else {
            System.out.println("Justification panel is not displayed");
        }
    }


    public void verifyCardStatus(String Cards, String AssessmentName) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        Thread.sleep(9000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='" + AssessmentName + "']")));
        driver.findElement(By.xpath("//span[text()='" + AssessmentName + "']")).click();
        Thread.sleep(3000);
        if (driver.findElement(By.xpath("//div[text()=' Evidence Collection Status: ']//following::div[text()=' " + Cards + " ']")).isDisplayed()) {
            String cardStatusElement = driver.findElement(By.xpath("//div[text()=' "+Cards+" ']//following::div[@class='value'][1]")).getText();
            System.out.println("The Card Status is: " +cardStatusElement);
            }
    }

    public void uploadPolicy(String UploadPolicy, String PolicyDocToaster) throws InterruptedException {
        Thread.sleep(3000);
        driver.navigate().refresh();
        driver.findElement(uploadPolicy).sendKeys(UploadPolicy);
        if (driver.findElement(policytoaster).isDisplayed()) {
            String policy = driver.findElement(policytoaster).getText();
            System.out.println(policy);
            Assert.assertEquals(PolicyDocToaster, policy);
        }
    }


    public void submitButton() throws InterruptedException {
        driver.findElement(By.xpath("//button[text()='Submit']")).click();
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

    public void icons(String Cards, String AssessmentName, String Regulationtabs, String DeletedFileToaster) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        cards( Cards,  AssessmentName);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='" + Regulationtabs + "']")));
        driver.findElement(By.xpath("//a[text()='" + Regulationtabs + "']")).click();
        Thread.sleep(3000);
        WebElement sort = driver.findElement(docTypeSort);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", sort);
        Thread.sleep(2000);
        if (driver.findElements(docTypeSort).size() > 0) {
            Thread.sleep(2000);
            driver.findElement(docTypeSort).click();
        }
        Thread.sleep(2000);
        driver.findElement(FileNameSort).isDisplayed();
        driver.findElement(FileNameSort).click();
        driver.findElement(downloadIcon).click();
        Thread.sleep(3000);
        WebElement deleteIconElement = driver.findElement(deleteIcon);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", deleteIconElement);
        Thread.sleep(1000);
        driver.findElement(deleteIcon).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(popup));
        driver.findElement(yes).click();
        System.out.println("File deleted successfully");
    }
}


