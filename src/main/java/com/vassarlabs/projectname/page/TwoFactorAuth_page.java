package com.vassarlabs.projectname.page;

import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class TwoFactorAuth_page {
    private WebDriver driver;
    private By loginPagepath = By.xpath("//span[text()='Sign in to continue']");
    private By emailFieldPath = By.xpath("//input[@formcontrolname='email']");

    private By passwordFieldPath = By.xpath("//input[@formcontrolname='password']");
    private By loginbuttonPath = By.xpath("//button[text()='Sign In ']");
    private By twoFactorPath = By.xpath("//h3[text()='Two-Factor Authentication ']");
    private By otpField1 = By.xpath("//input[@formcontrolname='otp1']");
    private By otpField2 = By.xpath("//input[@formcontrolname='otp2']");
    private By otpField3 = By.xpath("//input[@formcontrolname='otp3']");
    private By otpField4 = By.xpath("//input[@formcontrolname='otp4']");
    private By submitPath = By.xpath("//button[text()='Submit']");
    private By homePath = By.xpath("//div[text()=' Control Center']");
    private By otpInvalidToaster = By.xpath("//div[@aria-label='OTP is invalid or expired !']");
    private By resendCode = By.xpath("//u[text()='Resend code']");
    private By resendToaster = By.xpath("//div[text()=' OTP has been resend! ']");


    public TwoFactorAuth_page(WebDriver driver) {
        this.driver = driver;
    }

    public void signInPage(String EmailAddress, String Password) throws InterruptedException {
        Boolean data = driver.findElement(loginPagepath).isDisplayed();
        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        System.out.println(loginPagepath);
        driver.findElement(emailFieldPath).sendKeys(EmailAddress);
        Thread.sleep(3000);
        driver.findElement(passwordFieldPath).sendKeys(Password);
        Thread.sleep(3000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(loginbuttonPath));
        loginButton.click();
        Thread.sleep(3000);
    }

    public void ValidateSubmitButtonByEnteringOtps(String OTPOne, String OTPTwo, String OTPThree, String OTPFour, String ToasterMessage, String ResendCodeToaster) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement twoFactorPage = wait.until(ExpectedConditions.visibilityOfElementLocated(twoFactorPath));
        if (twoFactorPage.isDisplayed()) {
            Thread.sleep(3000);
            System.out.println("Two Factor Authentication page is displayed");
            driver.findElement(otpField1).sendKeys(OTPOne);
            Thread.sleep(3000);
            driver.findElement(otpField2).sendKeys(OTPTwo);
            Thread.sleep(3000);
            driver.findElement(otpField3).sendKeys(OTPThree);
            Thread.sleep(3000);
            driver.findElement(otpField4).sendKeys(OTPFour);
            Thread.sleep(3000);
            if (driver.findElement(submitPath).isEnabled()) {
                driver.findElement(submitPath).click();
                Thread.sleep(3000);
            } else {
                System.out.println("Otp not entered");
            }
            WebElement homePage = wait.until(ExpectedConditions.visibilityOfElementLocated(homePath));
            if (homePage.isDisplayed()) {
                Thread.sleep(3000);
                System.out.println("Login Successful");
            } else {
                if (driver.findElement(otpInvalidToaster).isDisplayed()) {
                    Thread.sleep(3000);
                    String toaster = driver.findElement(otpInvalidToaster).getText();
                    System.out.println(toaster);
                    Assert.assertEquals(ToasterMessage, toaster);
                }
            }

        }

    }

    public void resendCode(String ResendCodeToaster) throws InterruptedException {
        if (driver.findElement(resendCode).isDisplayed()) {
            Thread.sleep(3000);
            driver.findElement(resendCode).click();
            Thread.sleep(3000);
            if (driver.findElement(resendToaster).isDisplayed()) {
                Thread.sleep(3000);
                String toaster = driver.findElement(resendToaster).getText().trim();
                System.out.println(toaster);
                Assert.assertEquals(ResendCodeToaster, toaster);
            }
            if (!driver.findElement(resendCode).isDisplayed()) {

                System.out.println("Resend code not displayed");
            }
        }

    }
}
