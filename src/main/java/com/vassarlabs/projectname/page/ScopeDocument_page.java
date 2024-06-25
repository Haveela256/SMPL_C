package com.vassarlabs.projectname.page;

import org.apache.poi.ss.formula.functions.Replace;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ScopeDocument_page {
    private WebDriver driver;

    private By hamburgerPath = By.xpath("//i[@class='bi bi-list']");
    private By discoveryPath = By.xpath("//span[@ngbtooltip='Discovery']");
    private By selectYearPath = By.xpath("//option[text()='Select Year']/..");
    private By yearPath = By.xpath("//option[text()='2024']");
    private By uploadFilePath = By.xpath("//div//button[text()='Upload File']");
    private By downloadFile = By.xpath("//select//following::button[text()='Download Template']");
    private By namePath = By.xpath("//input[@placeholder='Enter File Name']");
    private By browsePath = By.xpath("//span[@class='browse cursor']");
    private By cancelButton = By.xpath("//button[text()='Cancel']");
    private By submitPath = By.xpath("//button[text()='Submit']");
    private By fileSuccessfulToaster = By.xpath("//div[@aria-label='File uploaded successfully']");
    private By updatedOnUp = By.xpath("//i[@class='px-1 bi ng-star-inserted bi-sort-up']");
    private By updatedOnDown = By.xpath("//span[text()='Updated on ']/parent::div/span/i[contains(@class,'down')]");
    private By fileNameUp = By.xpath("//span[text()='Updated on ']/parent::div/span/i[contains(@class,'up')]");
    private By fileNameDown = By.xpath("//i[@class='px-1 bi ng-star-inserted bi-sort-down']");

    private By downloadIcon = By.xpath("//button[@ngbtooltip='Download File']");
    private By deleteIcon = By.xpath("//button[@ngbtooltip='Delete File']");
    private By paginationDropdown = By.xpath("//select[@class='form-select form-select-sm small-dd ng-untouched ng-pristine ng-valid']");
    private By popupNoButton = By.xpath("//button[text()='No']");
    private By popupYesButton = By.xpath("//button[text()='Yes']");
    private By filedeletedToaster = By.xpath("//div[@aria-label='File deleted successfully']");
    private By nextIcon = By.xpath("//pagination-controls/pagination-template/nav/ul/li/a/span[text()='page']/parent::a");
    private By previous = By.xpath("//pagination-controls/pagination-template/nav/ul/li[@class='pagination-previous']");
    private By numberhyperlink = By.xpath("//span[text()='2']");
    private By popup = By.xpath("//span[text()='Are you sure to delete ?']");
    private By uploadIcon=By.xpath("//i[@class='bi bi-upload cursor']");
    private By replaceFile=By.xpath("//button[text()='Upload Replacement File']");


    public ScopeDocument_page(WebDriver driver) {
        this.driver = driver;

    }

    public void discoveryModule() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.findElement(discoveryPath).isDisplayed();
        wait.until(ExpectedConditions.elementToBeClickable(discoveryPath));
        driver.findElement(discoveryPath).click();
        System.out.println("Open Discovery");
    }

    public void uploadFile(String ScopeDocFileName, String File) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.findElement(uploadFilePath).isDisplayed();
        Thread.sleep(5000);
        System.out.println(driver.findElement(uploadFilePath).isDisplayed());
        wait.until(ExpectedConditions.elementToBeClickable(uploadFilePath));
        Thread.sleep(3000);
        driver.findElement(uploadFilePath).click();
        driver.findElement(namePath).sendKeys(ScopeDocFileName);
        System.out.println("Name is Entered");
        Thread.sleep(7000);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(browsePath));
//        wait.until(ExpectedConditions.elementToBeClickable(browsePath));
//        Thread.sleep(7000);
        WebElement fileInputElement = driver.findElement(By.xpath("//input[@type='file']"));
        fileInputElement.sendKeys(File);  // Provide the file path here
        WebElement submitElement = wait.until(ExpectedConditions.elementToBeClickable(submitPath));
        Thread.sleep(3000);
        submitElement.click();
        Thread.sleep(3000);
        String toaster = wait.until(ExpectedConditions.visibilityOfElementLocated(fileSuccessfulToaster)).getText();
        System.out.println(toaster);
        driver.findElement(uploadFilePath).isDisplayed();
        Thread.sleep(5000);
        System.out.println(driver.findElement(uploadFilePath).isDisplayed());
        wait.until(ExpectedConditions.elementToBeClickable(uploadFilePath));
        Thread.sleep(3000);
        driver.findElement(uploadFilePath).click();
        driver.findElement(namePath).sendKeys(ScopeDocFileName);
        System.out.println("Name is Entered");
        Thread.sleep(7000);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(browsePath));
//        wait.until(ExpectedConditions.elementToBeClickable(browsePath));
//        Thread.sleep(7000);
        WebElement fileInputElement1 = driver.findElement(By.xpath("//input[@type='file']"));
        fileInputElement1.sendKeys(File);
        WebElement fileInputElement2 = driver.findElement(By.xpath("//button[text()='Upload Replacement File']"));
        fileInputElement2.sendKeys(File);
        WebElement submitElement1 = wait.until(ExpectedConditions.elementToBeClickable(submitPath));
        submitElement1.click();
    }



    public void cancelbutton() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.findElement(uploadFilePath).isDisplayed();
        Thread.sleep(5000);
        System.out.println(driver.findElement(uploadFilePath).isDisplayed());
        wait.until(ExpectedConditions.elementToBeClickable(uploadFilePath));
        Thread.sleep(3000);
        driver.findElement(uploadFilePath).click();
       Thread.sleep(3000);
        driver.findElement(cancelButton).click();
    }


    public void submitbutton(String FileUploadToaster, String ScopeDocFileName, String File) throws InterruptedException {
//        uploadFile(ScopeDocFileName, File);
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        //uploadFile(ScopeDocFileName);
//        driver.findElement(submitPath).click();
//        String toaster = wait.until(ExpectedConditions.visibilityOfElementLocated(fileSuccessfulToaster)).getText();
//        System.out.println(toaster);
//        Assert.assertEquals(toaster, FileUploadToaster);
    }


    public void verifyUploadedFile(String ScopeDocFileName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement uploadedFile = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table//tr//td[2]//span[text()='" + ScopeDocFileName + "']")));
        System.out.println(uploadedFile);
        Assert.assertEquals(ScopeDocFileName, ScopeDocFileName);

    }

    public void icons() throws Throwable {

        Thread.sleep(2000);
        if (driver.findElements(updatedOnDown).size() > 0) {
            Thread.sleep(2000);
            driver.findElement(updatedOnDown).click();
        }
        Thread.sleep(2000);
        driver.findElement(updatedOnUp).isDisplayed();
        driver.findElement(updatedOnUp).click();

    }


    public void deletePopup() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.findElement(downloadIcon).click();
        Thread.sleep(3000);
        driver.findElement(deleteIcon).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(popup));

    }

    public void deletedFile(String DeletedFileToaster) throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.findElement(popupNoButton).click();
        deletePopup();
        driver.findElement(popupYesButton).click();
        String toaster = wait.until(ExpectedConditions.visibilityOfElementLocated(filedeletedToaster)).getText().trim();
        System.out.println(toaster);
        Assert.assertEquals(DeletedFileToaster, toaster);

    }

    public void pagination(String ScopeDocFileName, String uploadCount, String File) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        uploadCount = uploadCount.replace("\"", "");
        for (int i = 1; i < Integer.parseInt(uploadCount); i++) {
            Thread.sleep(2000);
            driver.findElement(uploadFilePath).isDisplayed();
            Thread.sleep(5000);
            System.out.println(driver.findElement(uploadFilePath).isDisplayed());
            wait.until(ExpectedConditions.elementToBeClickable(uploadFilePath));
            Thread.sleep(3000);
            driver.findElement(uploadFilePath).click();
            driver.findElement(namePath).sendKeys(ScopeDocFileName);
            System.out.println("Name is Entered");
            Thread.sleep(7000);
            WebElement fileInputElement = driver.findElement(By.xpath("//input[@type='file']"));
            fileInputElement.sendKeys(File);
            Thread.sleep(3000);
            WebElement submitElement = wait.until(ExpectedConditions.elementToBeClickable(submitPath));
            submitElement.click();
  Thread.sleep(3000);

        }
        //Pagination
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

    public void selectYear() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(selectYearPath));
        driver.findElement(selectYearPath).click();
        Thread.sleep(3000);
        driver.findElement(yearPath).click();
    }


}

