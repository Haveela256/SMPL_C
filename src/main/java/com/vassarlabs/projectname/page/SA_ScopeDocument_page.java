package com.vassarlabs.projectname.page;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class SA_ScopeDocument_page {
    private WebDriver driver;
    private By downloadFile = By.xpath("//select//following::button[text()='Download Template']");
    private By downloadIcon = By.xpath("//button[@class='btn btn-transparent btn-table ps-0']");
    private By nextIcon = By.xpath("//pagination-controls/pagination-template/nav/ul/li/a/span[text()='page']/parent::a");
    private By previous = By.xpath("//pagination-controls/pagination-template/nav/ul/li[@class='pagination-previous ng-star-inserted']");
    private By numberhyperlink = By.xpath("//span[text()='2']");
    private By paginationDropdown = By.xpath("//select[@class='form-select form-select-sm small-dd ng-untouched ng-pristine ng-valid']");
    private By signIntoCompany = By.xpath("//div[text()=' Sign In Into Company Successfull ']");


    public SA_ScopeDocument_page(WebDriver driver) {
        this.driver=driver;
    }

    public void download(String ScopeDocFileName) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        Thread.sleep(3000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(downloadFile));
        Thread.sleep(3000);
        driver.findElement(downloadFile).click();
        Thread.sleep(3000);
        List<WebElement> downloadicon = driver.findElements(downloadIcon);
        if (!downloadicon.isEmpty() && downloadicon.get(0).isDisplayed()) {
            WebElement ele = downloadicon.get(0);
            wait.until(ExpectedConditions.elementToBeClickable(downloadIcon));
            driver.findElement(downloadIcon).click();
        }else {
            System.out.println("Download icon is not displayed");
        }
    }
    public void pagination() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        List<WebElement> paginationElements = driver.findElements(paginationDropdown);
        if (!paginationElements.isEmpty() && paginationElements.get(0).isDisplayed()) {
            WebElement ele = paginationElements.get(0);
            driver.findElement(nextIcon).click();
            driver.findElement(previous).click();
            driver.findElement(numberhyperlink).click();
            // Select options by index
            Select dropdown = new Select(ele);
            dropdown.selectByIndex(1);
            dropdown.selectByIndex(2);
            dropdown.selectByIndex(3);
            dropdown.selectByIndex(4);
        } else {
            System.out.println("Pagination is not displayed");
        }
    }
    public void company(String CompanyCard, String ToasterMessage) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='"+CompanyCard+"']/../../../..")));
        driver.findElement(By.xpath("//span[text()='"+CompanyCard+"']/../../../..")).click();
        Thread.sleep(3000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(signIntoCompany));
        if (driver.findElement(signIntoCompany).isDisplayed()) {
            String switchcompany = driver.findElement(signIntoCompany).getText();
            System.out.println(switchcompany);
            Assert.assertEquals(ToasterMessage, switchcompany);
        } else {
            System.out.println("Switch company failed");
        }
    }
    }

