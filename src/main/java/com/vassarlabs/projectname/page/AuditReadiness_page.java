package com.vassarlabs.projectname.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.security.PrivateKey;
import java.time.Duration;

public class AuditReadiness_page {
    private WebDriver driver;
    private By regulationCard=By.xpath("//div[contains(text(),'Access Control')]");
    private By implementaionDropdown=By.xpath("//select[@class='form-select ng-pristine ng-valid ng-touched']");
    private By requiredEvidenceText=By.xpath("//div[normalize-space()='Required Evidence']");
    private By uploadRelevantDoc=By.xpath("//select[@class='form-select ng-untouched ng-pristine ng-valid']");
    private By uploadIcon=By.xpath("//body/app-root/div[@class='d-flex']/div[@class='right-container']/app-audit-readiness/app-audit-readiness-details-page/div[@class='main-container']/div[@class='main-content side-nav-hide']/div[@class='middle-content has-sidemenu']/div[@class='content-container']/div[@class='category-inner-body']/div[@class='category-content']/div[@class='card']/div[1]");
    private By browsePath=By.xpath("//body/app-root/div[@class='d-flex']/div[@class='right-container']/app-audit-readiness/app-audit-readiness-details-page/div[@class='main-container']/div[@class='main-content side-nav-hide']/div[@class='middle-content has-sidemenu']/div[@class='content-container']/div[@class='category-inner-body']/div[@class='category-content']/div[@class='card']/div[1]");

private By justificationPanel=By.xpath("//button[@id='ngb-accordion-item-0-toggle']");
private By summarize=By.xpath("//button[@class='btn btn-primary btn-sm mr-1']");

private By probavilityOfPassingCertification=By.xpath("//span[@class='value']");
private By uploadDocsTable=By.xpath("//div[@class='title mt-2']");

private By docTypeSort=By.xpath("//i[@class='px-1 bi bi-sort-down']");
private By FileNameSort=By.xpath("//i[@class='px-1 bi bi-filter']");
private By downloadIcon=By.xpath("//i[@class='bi bi-download']");
private By deleteIcon=By.xpath("//i[@class='bi bi-trash3-fill']");

private By justification=By.xpath("//div[@class='title'][normalize-space()='Justification for the implementation of required controls']");
private By reuploadButton=By.xpath("//button[@class='btn btn-primary btn-sm']");
private By ediTicon=By.xpath("//i[@class='bi bi-pencil-square']");
private By editData=By.xpath("//li[contains(text(),'The document includes sections on Data Classificat')]");
private By saveIcon=By.xpath("//i[@class='bi bi-floppy']");
private By justificationToaster=By.xpath("//div[text()=' Justification Saved Successfully ']");
//    private By downloadIcon = By.xpath("//button[@ngbtooltip='Download File']");
//    private By deleteIcon = By.xpath("//button[@ngbtooltip='Delete File']");
    private By paginationDropdown = By.xpath("//select[@class='form-select form-select-sm small-dd ng-untouched ng-pristine ng-valid']");
    private By popupNoButton = By.xpath("//button[text()='No']");
    private By popupYesButton = By.xpath("//button[text()='Yes']");
    private By filedeletedToaster = By.xpath("//div[@aria-label='File deleted successfully']");
    private By nextIcon = By.xpath("//pagination-controls/pagination-template/nav/ul/li/a/span[text()='page']/parent::a");
    private By previous = By.xpath("//pagination-controls/pagination-template/nav/ul/li[@class='pagination-previous']");
    private By numberhyperlink = By.xpath("//span[text()='2']");
    private By popup = By.xpath("//span[text()='Are you sure to delete ?']");
//    private By uploadIcon=By.xpath("//i[@class='bi bi-upload cursor']");
    private By replaceFile=By.xpath("//button[text()='Upload Replacement File']");
    public AuditReadiness_page(WebDriver driver) {
        this.driver=driver;
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
String justificationn= driver.findElement(justification).getText();
        System.out.println(justificationn);
    }

    public void uploadedFilesPanel() {
driver.findElement(uploadIcon).isDisplayed();
driver.findElement(uploadIcon).click();
    }

    public void editIconOfJustification(String JustificationToaster) {
        driver.findElement(ediTicon).click();
        driver.findElement(editData).sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE);
    driver.findElement(saveIcon).click();
driver.findElement(justificationToaster).isDisplayed();
String toaster=driver.findElement(justificationToaster).getText();
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
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(nextIcon));
        driver.findElement(nextIcon).click();
        wait.until(ExpectedConditions.elementToBeClickable(previous));
        driver.findElement(previous).click();
        wait.until(ExpectedConditions.elementToBeClickable(numberhyperlink));
        driver.findElement(numberhyperlink).click();
        WebElement ele = driver.findElement(paginationDropdown);
        Select dropdown = new Select(ele);
        dropdown.selectByIndex(1);
        dropdown.selectByIndex(2);
        dropdown.selectByIndex(3);
        dropdown.selectByIndex(4);
    }
}
