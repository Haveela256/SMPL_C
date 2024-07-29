package com.vassarlabs.projectname.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CE_MyProfile_page {
    private WebDriver driver;
    private By myProfileTitle = By.xpath("//div[text()=' My Profile']");
    private By editButtonPath = By.xpath("//button[@class='btn btn-primary btn-sm']//i");
    private By firstNameField = By.xpath("//input[@placeholder='Enter First Name']");
    private By middleNameField = By.xpath("//input[@placeholder='Enter Middle Name']");
    private By lastNameField = By.xpath("//input[@placeholder='Enter Last Name']");
    private By designation = By.xpath("//input[@placeholder='Enter Designation']");
    private By resumePath= By.xpath("//input[@class='form-control w-100']");

    public CE_MyProfile_page(WebDriver driver) {
        this.driver=driver;
    }

    public void details(String FirstName, String MiddleName, String LastName, String UploadResume, String EmailAddress) throws InterruptedException {
        if (driver.findElement(editButtonPath).isDisplayed()) {
            Thread.sleep(6000);
            driver.findElement(editButtonPath).click();
            Thread.sleep(5000);
            WebElement ele1 = driver.findElement(firstNameField);
            Thread.sleep(5000);
            ele1.click();
            Thread.sleep(5000);
            ele1.sendKeys(Keys.CONTROL + "a" + Keys.DELETE);
            ele1.sendKeys(FirstName);
            Thread.sleep(3000);
            WebElement ele2 = driver.findElement(middleNameField);
            ele2.click();
            ele2.sendKeys(Keys.CONTROL + "a" + Keys.DELETE);
            ele2.sendKeys(MiddleName);
            WebElement ele3 = driver.findElement(lastNameField);
            ele3.click();
            ele3.sendKeys(Keys.CONTROL + "a" + Keys.DELETE);
            ele3.sendKeys(LastName);
            String emailEntered = driver.findElement(By.xpath("//input[@formcontrolname='email']")).getText();
            System.out.println("Email displayed is " + EmailAddress);
            Thread.sleep(3000);
            driver.findElement(resumePath).sendKeys(UploadResume);
        }

}
}

