package com.vassarlabs.projectname.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SA_DataFlow_page {
    private WebDriver driver;
    private By howTodoc=By.xpath("//button[normalize-space()='How To Doc']");
    private By downloadIcon = By.xpath("//button[@class='btn btn-transparent btn-table ps-0']");

    public SA_DataFlow_page(WebDriver driver) {
        this.driver=driver;
    }

    public void download(String DataFlowFileName) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        Thread.sleep(9000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(howTodoc));
        Thread.sleep(9000);
        driver.findElement(howTodoc).click();
        Thread.sleep(9000);
        List<WebElement> downloadicon = driver.findElements(downloadIcon);
        if (!downloadicon.isEmpty() && downloadicon.get(0).isDisplayed()) {
            WebElement ele = downloadicon.get(0);
            wait.until(ExpectedConditions.elementToBeClickable(downloadIcon));
            driver.findElement(downloadIcon).click();
        }else {
            System.out.println("Download icon is not displayed");
        }
    }
    }

