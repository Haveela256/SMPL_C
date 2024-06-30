package com.vassarlabs.projectname.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
//        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='highcharts-61mlgip-13']//*[name()='svg'][1]/*[name()='text'][1]")));
//        driver.findElement(By.xpath("//div[@id='highcharts-61mlgip-13']//*[name()='svg'][1]/*[name()='text'][1]")).isDisplayed();
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
}


