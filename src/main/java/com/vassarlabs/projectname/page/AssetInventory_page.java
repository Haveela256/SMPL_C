package com.vassarlabs.projectname.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class AssetInventory_page {
    private WebDriver driver;
    private By assetInventoryTab = By.xpath("//a[text()='Asset Inventory']");
    private By barchartTitle = By.xpath("//div[@id='highcharts-disuoso-37']//*[name()='svg'][1]/*[name()='text'][1]");
    private By previousVersion = By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/app-discovery[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/vl-chart[1]/highcharts-chart[1]/div[1]/*[name()='svg'][1]/*[name()='g'][7]/*[name()='g'][1]/*[name()='g'][1]/*[name()='g'][1]/*[name()='text'][1]");
    private By currentVersion = By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/app-discovery[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/vl-chart[1]/highcharts-chart[1]/div[1]/*[name()='svg'][1]/*[name()='g'][7]/*[name()='g'][1]/*[name()='g'][1]/*[name()='g'][2]/*[name()='text'][1]");
    private By assetTypePieChart = By.xpath("//div[@id='highcharts-61mlgip-13']//*[name()='svg'][1]/*[name()='text'][1]");
    private By technology = By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/app-discovery[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/vl-chart[1]/highcharts-chart[1]/div[1]/*[name()='svg'][1]/*[name()='g'][3]/*[name()='g'][1]/*[name()='g'][1]/*[name()='g'][1]/*[name()='text'][1]");
    private By people = By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/app-discovery[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/vl-chart[1]/highcharts-chart[1]/div[1]/*[name()='svg'][1]/*[name()='g'][3]/*[name()='g'][1]/*[name()='g'][1]/*[name()='g'][2]/*[name()='text'][1]");
    private By facilities = By.xpath("//div[@id='highcharts-61mlgip-13']//*[name()='svg']//*[name()='g'][3]/*[name()='g'][1]/*[name()='g'][1]/*[name()='g'][3]/*[name()='rect'][1]");
    private By none = By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/app-discovery[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/vl-chart[1]/highcharts-chart[1]/div[1]/*[name()='svg'][1]/*[name()='g'][3]/*[name()='g'][1]/*[name()='g'][1]/*[name()='g'][4]/*[name()='text'][1]");
    private By updatedOnUp = By.xpath("//i[@class='px-1 bi ng-star-inserted bi-sort-up']");
    private By updatedOnDown = By.xpath("//span[text()='Updated on ']/parent::div/span/i[contains(@class,'down')]");
    private By fileNameIocn = By.xpath("//i[@class='px-1 bi bi-filter ng-star-inserted']");
    private By fileNameUp = By.xpath("//i[@class='px-1 bi ng-star-inserted bi-sort-up']");
    private By fileNameDown = By.xpath("//i[@class='px-1 bi ng-star-inserted bi-sort-down']");
    private By downloadFile = By.xpath("//select//following::button[text()='Download Template']");
    private By downloadIcon = By.xpath("//tbody/tr//i[@class='bi bi-download']");
    private By deleteIcon = By.xpath("//button[@ngbtooltip='Delete File']");
    private By popup = By.xpath("//span[text()='Are you sure to delete ?']");
    private By popupNoButton = By.xpath("//button[text()='No']");
    private By popupYesButton = By.xpath("//button[text()='Yes']");
    private By filedeletedToaster = By.xpath("//div[@aria-label='File deleted successfully']");

    public AssetInventory_page(WebDriver driver) {
        this.driver = driver;
    }


    public void assetInventoryTab() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.findElement(assetInventoryTab).click();
    }

    public void barChart() throws InterruptedException {
        driver.findElement(previousVersion).click();
        Thread.sleep(3000);
        driver.findElement(currentVersion).click();
        Thread.sleep(3000);
    }

    public void pieChart() throws InterruptedException {
        System.out.println("Asset Pie chart title is displayed");
        Thread.sleep(3000);
        driver.findElement(technology).click();
        Thread.sleep(3000);
        driver.findElement(technology).click();
        Thread.sleep(3000);
        driver.findElement(people).click();
        Thread.sleep(3000);
        driver.findElement(people).click();
        Thread.sleep(3000);
//        driver.findElement(facilities).click();
//        Thread.sleep(3000);
//        driver.findElement(facilities).click();
        Thread.sleep(3000);
        driver.findElement(none).click();
        Thread.sleep(3000);
        driver.findElement(none).click();
        Thread.sleep(3000);
    }
    public void deletePopup(String AssetInventoryFileName) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        Thread.sleep(3000);
        if(driver.findElement(By.xpath("//table//tr//td[2]//span[text()='"+AssetInventoryFileName+"']")).isDisplayed()){

        wait.until(ExpectedConditions.visibilityOfElementLocated(downloadFile));
        Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(downloadIcon));
        driver.findElement(downloadIcon).click();
        Thread.sleep(3000);
        driver.findElement(deleteIcon).click();
        Thread.sleep(3000);
    }}

    public void deleteFunctionality(String DeletedFileToaster) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(popup));
        driver.findElement(popupNoButton).click();
        Thread.sleep(3000);
        deletePopup(DeletedFileToaster);
        driver.findElement(popupYesButton).click();
        Thread.sleep(3000);
        String toaster = wait.until(ExpectedConditions.visibilityOfElementLocated(filedeletedToaster)).getText().trim();
        Thread.sleep(3000);
        System.out.println(toaster);
        Assert.assertEquals(DeletedFileToaster, toaster);
    }
    }

