package com.vassarlabs.projectname.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class DataFlowDiagrams_page {
    private WebDriver driver;
    private By dataFlowTab= By.xpath("//a[text()='Data Flow Diagrams']");
    private By uploadFilePath = By.xpath("//div//button[text()='Upload File']");
    private By namePath = By.xpath("//input[@placeholder='Enter File Name']");
    private By browsePath = By.xpath("//span[@class='browse cursor']");
    private By cancelButton = By.xpath("//button[text()='Cancel']");
    private By submitPath = By.xpath("//button[text()='Submit']");
    private By fileSuccessfulToaster = By.xpath("//div[@aria-label='File uploaded successfully']");
    private By deleteIcon = By.xpath("//button[@ngbtooltip='Delete File']");
    private By howTodoc=By.xpath("//button[normalize-space()='How To Doc']");
    private By popup = By.xpath("//span[text()='Are you sure to delete ?']");
    private By popupNoButton = By.xpath("//button[text()='No']");
    private By popupYesButton = By.xpath("//button[text()='Yes']");
    private By filedeletedToaster = By.xpath("//div[@aria-label='File deleted successfully']");
    public DataFlowDiagrams_page(WebDriver driver) {
        this.driver=driver;
    }

    public void dataFlow() throws InterruptedException {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.findElement(dataFlowTab).click();
        Thread.sleep(3000);
    }

    public void submit(String FileUploadToaster, String DataFlowFileName, String File) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.findElement(uploadFilePath).isDisplayed();
        Thread.sleep(5000);
        System.out.println(driver.findElement(uploadFilePath).isDisplayed());
        wait.until(ExpectedConditions.elementToBeClickable(uploadFilePath));
        Thread.sleep(3000);
        driver.findElement(uploadFilePath).click();
        driver.findElement(namePath).sendKeys(DataFlowFileName);
        System.out.println("Name is Entered");
        Thread.sleep(7000);
        WebElement fileInputElement = driver.findElement(By.xpath("//input[@type='file']"));
        fileInputElement.sendKeys(File);  // Provide the file path here
        WebElement submitElement = wait.until(ExpectedConditions.elementToBeClickable(submitPath));
        Thread.sleep(15000);
        submitElement.click();
        Thread.sleep(5000);
        String toaster = wait.until(ExpectedConditions.visibilityOfElementLocated(fileSuccessfulToaster)).getText();
        Thread.sleep(20000);
        System.out.println(toaster);
        driver.findElement(uploadFilePath).isDisplayed();
        Thread.sleep(5000);
        System.out.println(driver.findElement(uploadFilePath).isDisplayed());
        wait.until(ExpectedConditions.elementToBeClickable(uploadFilePath));
        Thread.sleep(3000);
        driver.findElement(uploadFilePath).click();
        Thread.sleep(8000);
        driver.findElement(namePath).sendKeys(DataFlowFileName);
        System.out.println("Name is Entered");
        Thread.sleep(7000);
        WebElement fileInputElement1 = driver.findElement(By.xpath("//input[@type='file']"));
        fileInputElement1.sendKeys(File);
        WebElement fileInputElement2 = driver.findElement(By.xpath("//button[text()='Upload Replacement File']"));
        fileInputElement2.sendKeys(File);
        WebElement submitElement1 = wait.until(ExpectedConditions.elementToBeClickable(submitPath));
        submitElement1.click();
//        //uploadFile(ScopeDocFileName);
//        driver.findElement(submitPath).click();
//        Thread.sleep(8000);
        String toaster2 = wait.until(ExpectedConditions.visibilityOfElementLocated(fileSuccessfulToaster)).getText();
        Thread.sleep(5000);
        System.out.println(toaster2);
        Assert.assertEquals(toaster2, FileUploadToaster);
    }

    public void deleteIcon() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        Thread.sleep(9000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(howTodoc));
        Thread.sleep(9000);
        driver.findElement(howTodoc).click();
        Thread.sleep(9000);
//        driver.findElement(deleteIcon).click();
//        Thread.sleep(7000);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(popup));
//        Thread.sleep(3000);
    }

    public void deleteToaster(String DeletedFileToaster) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.findElement(deleteIcon).click();
        Thread.sleep(7000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(popup));
        Thread.sleep(3000);
        driver.findElement(popupNoButton).click();
        Thread.sleep(5000);
        driver.findElement(deleteIcon).click();
        Thread.sleep(7000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(popup));
        Thread.sleep(3000);
        driver.findElement(popupYesButton).click();
        Thread.sleep(5000);
        String toaster = wait.until(ExpectedConditions.visibilityOfElementLocated(filedeletedToaster)).getText().trim();
        Thread.sleep(4000);
        System.out.println(toaster);
        Assert.assertEquals(DeletedFileToaster, toaster);
    }
}
