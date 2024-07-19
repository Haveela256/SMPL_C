package com.vassarlabs.projectname.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SA_CompanyDetails_page {
    private WebDriver driver;
    private By companydetailsModule = By.xpath("//span[text()='Company Details']");
    private By editButton = By.xpath("//button[@class='btn btn-primary btn-sm']");

    public SA_CompanyDetails_page(WebDriver driver) {
        this.driver=driver;
    }

    public void module() throws InterruptedException {
        driver.findElement(companydetailsModule).click();
        Thread.sleep(7000);

}

    public void verify() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        List<WebElement> edit = driver.findElements(editButton);
        if (!edit.isEmpty() && edit.get(0).isDisplayed()) {
            WebElement element =edit.get(0);
            driver.findElement(editButton).click();
        } else {
            System.out.println("Edit button is not displayed");
        } System.out.println("Company details are displayed");
    }

}
