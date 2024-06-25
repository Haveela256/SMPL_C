package com.vassarlabs.projectname.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class MyProfile_page {
    private WebDriver driver;
    private By userProfileIcon = By.xpath("//img[@class='profile-style']");
    private By myProfileOption = By.xpath("//button[@class='dropdown-item ng-star-inserted']//i[@class='bi bi-person-circle']");
    private By myProfileTitle = By.xpath("//div[text()=' My Profile']");
    private By editButtonPath = By.xpath("//button[@class='btn btn-primary btn-sm']//i");
    private By firstNameField = By.xpath("//input[@placeholder='Enter First Name']");
    private By middleNameField = By.xpath("//input[@placeholder='Enter Middle Name']");
    private By lastNameField = By.xpath("//input[@placeholder='Enter Last Name']");
    private By designation = By.xpath("//input[@placeholder='Enter Designation']");
    private By uploadImage = By.xpath("//div[@class='profile-picture']//span[text()='Browse']");
    private By browse = By.xpath("//div[@class='profile-picture']//span[text()='Browse']");
    private By replaceIcon = By.xpath("//div[@class='profile-picture']//i[@class='bi bi-repeat']");
    private By cancelButton = By.xpath("//button[text()='Cancel']");
    private By submitButton = By.xpath("//button[text()='Submit']");
    private By userDetailsUpdatedToaster = By.xpath("//div[text()=' Profile updated successfully ']");
    private By alpahabetError = By.xpath("//span[text()='Only Alphabets are allowed']");
    private By firstNameRequired = By.xpath("//span[text()='First Name is required']");
    private By lastNameRequired = By.xpath("//span[text()='Last Name is required']");


    public MyProfile_page(WebDriver driver) {
        this.driver = driver;

    }

    public void myProfile() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.findElement(userProfileIcon).click();
        Thread.sleep(3000);
        driver.findElement(myProfileOption).click();
        Thread.sleep(3000);
        driver.findElement(myProfileTitle).isDisplayed();
        Thread.sleep(3000);
    }

    public void editButton() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.findElement(editButtonPath).isDisplayed();
        Thread.sleep(3000);
        driver.findElement(editButtonPath).click();
        Thread.sleep(3000);
    }

    public void replaceicon(String File, String ReplaceFile) throws InterruptedException {
        if (driver.findElement(browse).isDisplayed()) {
            Thread.sleep(3000);
            driver.findElement(browse).sendKeys(File);
        }
        if (driver.findElement(replaceIcon).isDisplayed()) {
            driver.findElement(replaceIcon).isDisplayed();
            Thread.sleep(3000);
            driver.findElement(replaceIcon).sendKeys(ReplaceFile);
        }
    }

    public void clickOnCancelButton() throws InterruptedException {
        driver.findElement(cancelButton).isDisplayed();
        Thread.sleep(3000);
        driver.findElement(cancelButton).click();
        Thread.sleep(3000);
    }

    public void addDetails(String FirstName, String MiddleName, String LastName, String Designation) throws InterruptedException {
        driver.findElement(firstNameField).click();
        Thread.sleep(3000);
        driver.findElement(firstNameRequired).sendKeys(FirstName);
        Thread.sleep(3000);
        driver.findElement(middleNameField).click();
        Thread.sleep(3000);
        driver.findElement(middleNameField).sendKeys(MiddleName);
        Thread.sleep(3000);
        driver.findElement(lastNameField).click();
        Thread.sleep(3000);
        driver.findElement(lastNameField).sendKeys(LastName);
        Thread.sleep(3000);
        driver.findElement(designation).click();
        Thread.sleep(3000);
        driver.findElement(designation).sendKeys(Designation);
    }

    public void clickOnSubmitButton(String FirstName, String MiddleName, String LastName, String Designation, String ErrorMessage, String DetailsUpdatedToaster, String ErrorToaster) throws InterruptedException {
        addDetails(FirstName,  MiddleName, LastName,  Designation);
        if(driver.findElement(submitButton).isEnabled()){
            Thread.sleep(3000);
            driver.findElement(submitButton).click();
            Thread.sleep(3000);
            if (driver.findElement(userDetailsUpdatedToaster).isDisplayed()) {
                String toaster = driver.findElement(userDetailsUpdatedToaster).getText();
                Assert.assertEquals(DetailsUpdatedToaster, toaster);
            }
            else {
                if(!driver.findElement(submitButton).isEnabled()){
                    System.out.println("Submit Button is disabled");
                }
            }
        }
    }
}
