package com.vassarlabs.projectname.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class User_CompanyDetails_page {
    private WebDriver driver;
    private By editButton = By.xpath("//button[@class='btn btn-primary btn-sm']"); // edit_button = driver.find_element(By.XPATH, "//button[contains(@class, 'btn') and contains(@class, 'btn-primary') and contains(@class, 'btn-sm') and .//i[contains(@class, 'bi') and contains(@class, 'bi-pencil-square')]]")
    private By companydetailsModule = By.xpath("//span[text()='Company Details']");
    private By companyDetailsTitle=By.xpath("//div[text()=' Company Details']");


    public User_CompanyDetails_page(WebDriver driver) {
        this.driver=driver;
    }

    public void edit() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.findElement(companydetailsModule).click();
        Thread.sleep(7000);
        if (!driver.findElement(editButton).isEnabled()) {
            System.out.println("Edit button is disabled clicked");

        }

    }

    public void details() {
if(driver.findElement(companyDetailsTitle).isDisplayed()){
    System.out.println("Company details are displayed");
}
    }
}
