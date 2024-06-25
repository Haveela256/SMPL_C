package com.vassarlabs.projectname.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ResetPassword_page {
    private WebDriver driver;
    private By resetPasswordTitle = By.xpath("//h3[text()='Reset Password']");
    private By newPassword = By.xpath("//input[@formcontrolname='newPassword']");
    private By confirmPassword = By.xpath("//input[@formcontrolname='confirmPassword']");
    private By resetPassword = By.xpath("//button[text()='Reset Password']");
    private By back = By.xpath("//a[text()='Back']");
    private By charactersError = By.xpath("//span[text()='Password must be atleast of 8 characters long']");
    private By formatError = By.xpath("//span[text()='Password must contain atleast one Uppercase character']");
    private By confirmFieldError = By.xpath("//span[@class='error-text']");
    private By otpInvalidToaster = By.xpath("//div[text()=' OTP is wrong or Expired! ']");
    private By otpField1 = By.xpath("//input[@formcontrolname='otp1']");
    private By otpField2 = By.xpath("//input[@formcontrolname='otp2']");
    private By otpField3 = By.xpath("//input[@formcontrolname='otp3']");
    private By otpField4 = By.xpath("//input[@formcontrolname='otp4']");
    private By resetPasswordButton = By.xpath("//button[text()='Reset Password']");


    public ResetPassword_page(WebDriver driver) {
        this.driver = driver;
    }

    public void passwordFields(String NewPassword, String ConfirmPassword, String ErrorMessage) throws InterruptedException {
        if (driver.findElement(resetPasswordTitle).isDisplayed()) {
            Thread.sleep(3000);
            driver.findElement(newPassword).click();
            Thread.sleep(3000);
            driver.findElement(newPassword).sendKeys(NewPassword);
            Thread.sleep(3000);
            if (driver.findElement(charactersError).isDisplayed()) {
                String error = driver.findElement(charactersError).getText();
                System.out.println(error);
                Assert.assertEquals(ErrorMessage, error);
            } else {
                if (driver.findElement(formatError).isDisplayed()) {
                    String error2 = driver.findElement(formatError).getText();
                    System.out.println(error2);
                    Assert.assertEquals(ErrorMessage, error2);
                } else {
                    System.out.println("New Password not entered");
                }
            }
            driver.findElement(confirmPassword).sendKeys(ConfirmPassword);
            Thread.sleep(3000);
            if (driver.findElement(confirmFieldError).isDisplayed()) {
                String error2 = driver.findElement(confirmFieldError).getText();
                System.out.println(error2);
                Assert.assertEquals(ErrorMessage, error2);
            } else {
                System.out.println("Confirm Password not entered");
            }
        }
    }

    public void clickOnSubmit(String OTPOne, String OTPTwo, String OTPThree, String OTPFour, String NewPassword, String ConfirmPassword, String ErrorMessage, String ErrorToaster) throws InterruptedException {
        if (driver.findElement(resetPasswordTitle).isDisplayed()) {
            Thread.sleep(3000);
            System.out.println("Two Factor Authentication page is displayed");
            driver.findElement(otpField1).click();
            driver.findElement(otpField1).sendKeys(OTPOne);
            Thread.sleep(3000);
            driver.findElement(otpField2).click();
            driver.findElement(otpField2).sendKeys(OTPTwo);
            Thread.sleep(3000);
            driver.findElement(otpField3).click();
            driver.findElement(otpField3).sendKeys(OTPThree);
            Thread.sleep(3000);
            driver.findElement(otpField4).click();
            driver.findElement(otpField4).sendKeys(OTPFour);
            Thread.sleep(3000);
            if (driver.findElement(resetPasswordButton).isEnabled()) {
                driver.findElement(resetPasswordButton).click();
                Thread.sleep(3000);
            } else {
                if (driver.findElement(otpInvalidToaster).isDisplayed()) {
                    String errorToaster = driver.findElement(otpInvalidToaster).getText();
                    System.out.println(errorToaster);
                    Assert.assertEquals(ErrorMessage, errorToaster);
                } else {
                    System.out.println("Otp not entered");
                }
            }
        }
    }
}