package com.vassarlabs.projectname.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ResetPassword_page {
    private static WebDriver driver;
    private By resetPasswordTitle = By.xpath("//h3[text()='Reset Password']");
    private By newPassword = By.xpath("//input[@formcontrolname='newPassword']");
    private By confirmPassword = By.xpath("//input[@formcontrolname='confirmPassword']");
    private By resetPassword = By.xpath("//button[text()='Reset Password']");
    private By back = By.xpath("//a[text()='Back']");
    private By charactersError = By.xpath("//span[text()='Password must be atleast of 8 characters long']");
    private By formatError = By.xpath("//span[text()='Password must contain atleast one Uppercase character']");
    private By confirmFieldError = By.xpath("//span[@class='error-text'][text()=\"Passwords doesn't match\"]");
    private By otpInvalidToaster = By.xpath("//div[text()=' OTP is wrong or Expired! ']");
    private By otpField1 = By.xpath("//input[@formcontrolname='otp1']");
    private By otpField2 = By.xpath("//input[@formcontrolname='otp2']");
    private By otpField3 = By.xpath("//input[@formcontrolname='otp3']");
    private By otpField4 = By.xpath("//input[@formcontrolname='otp4']");
    private By resetPasswordButton = By.xpath("//button[text()='Reset Password']");
    private By newPassworderror = By.xpath("//span[contains(text(),'New Password is required')]");
    private By confirmPasswordError = By.xpath("//span[contains(text(),'Confirm Password is required')]");
    boolean submit = false;

    public ResetPassword_page(WebDriver driver) {
        this.driver = driver;
    }

    public void passwordFields(String NewPassword, String ConfirmPassword, String ErrorMessage) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(resetPasswordTitle)).isDisplayed(), "Reset Password page is not displayed");
        Thread.sleep(3000);
        System.out.println("Reset Password page is displayed");
    }

    public void clickOnSubmit(String OTPOne, String OTPTwo, String OTPThree, String OTPFour, String NewPassword, String ConfirmPassword) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(resetPasswordTitle)).isDisplayed(), "Two Factor Authentication page is not displayed");
        System.out.println("Two Factor Authentication page is displayed");

        driver.findElement(otpField1).sendKeys(OTPOne);
        driver.findElement(otpField2).sendKeys(OTPTwo);
        driver.findElement(otpField3).sendKeys(OTPThree);
        driver.findElement(otpField4).sendKeys(OTPFour);
        driver.findElement(newPassword).sendKeys(NewPassword);
        driver.findElement(confirmPassword).sendKeys(ConfirmPassword);
    }

    public void veifyError(String PasswordCharacterError, String PasswordUppercaseError, String PasswordsError, String NewPasswordError, String ConfirmPasswordError, String ErrorToaster) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        if (driver.findElement(resetPasswordButton).isEnabled()) {
            driver.findElement(resetPasswordButton).click();
        } else if (wait.until(ExpectedConditions.visibilityOfElementLocated(resetPasswordTitle)).isDisplayed()) {
            driver.findElement(resetPasswordTitle).click();
            int value = 0;
            if (ErrorToaster.contains("OTP is wrong")) {
                value = 1;
                System.out.println("Case 1 Will Run");
            }
            if (PasswordUppercaseError.contains("atleast one Uppercase")) {
                value = 2;
                System.out.println("Case 2 Will Run");
            }
            if (PasswordCharacterError.contains("atleast of 8 characters")) {
                value = 3;
                System.out.println("Case 3 Will Run");
            }
            if (PasswordsError.contains("Passwords doesn't match")) {
                value = 4;
                System.out.println("Case 4 Will Run");
            }
            if (NewPasswordError.contains("New Password is Required")) {
                value = 5;
                System.out.println("Case 5 Will Run");
            }
            if (ConfirmPasswordError.contains("Confirm Password is Required")) {
                value = 6;
                System.out.println("Case 6 Will Run");
            }

            switch (value) {
                case 1:
                    Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(otpInvalidToaster)).isDisplayed(), "OTP Invalid toaster not displayed");
                    String errorToaster = driver.findElement(otpInvalidToaster).getText();
                    System.out.println(errorToaster);
                    Assert.assertEquals(ErrorToaster, errorToaster);
                    submit = true;
                    break;
                case 2:
                    Assert.assertTrue(driver.findElement(charactersError).isDisplayed(), "Characters error not displayed");
                    String error = driver.findElement(charactersError).getText();
                    System.out.println(error);
                    Assert.assertEquals(PasswordCharacterError, error);
                    submit = true;
                    break;
                case 3:
                    Assert.assertTrue(driver.findElement(formatError).isDisplayed(), "Format error not displayed");
                    String error2 = driver.findElement(formatError).getText();
                    System.out.println(error2);
                    Assert.assertEquals(PasswordUppercaseError, error2);
                    submit = true;
                    break;
                case 4:
                    Assert.assertTrue(driver.findElement(confirmFieldError).isDisplayed(), "Confirm field error not displayed");
                    String error3 = driver.findElement(confirmFieldError).getText();
                    System.out.println(error3);
                    Assert.assertEquals(PasswordsError, error3);
                    submit = true;
                    break;
                case 5:
                    Assert.assertTrue(driver.findElement(newPassworderror).isDisplayed(), "New password error not displayed");
                    String newPassword = driver.findElement(newPassworderror).getText();
                    System.out.println(newPassword);
                    Assert.assertEquals(NewPasswordError, newPassword);
                    submit = true;
                    break;
                case 6:
                    Assert.assertTrue(driver.findElement(confirmPasswordError).isDisplayed(), "Confirm password error not displayed");
                    String confirmPassword = driver.findElement(confirmPasswordError).getText();
                    System.out.println(confirmPassword);
                    Assert.assertEquals(ConfirmPasswordError, confirmPassword);
                    submit = true;
                    break;
                default:
                    System.out.println("No case matched.");
                    break;
            }
        } else {
            System.out.println("Error message is not displayed");
        }
    }
}