package com.vassarlabs.projectname.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class SA_SignIn_page {
    private WebDriver driver;
    private By loginPagepath = By.xpath("//span[text()='Sign in to continue']");
    private By emailFieldPath = By.xpath("//input[@formcontrolname='email']");

    private By passwordFieldPath = By.xpath("//input[@formcontrolname='password']");
    private By eyeIconPath = By.xpath("//span[@class='input-group-text']");

    //private By remembermePath = By.xpath("//label[text()=' Remember Me ']");

    private By loginbuttonPath = By.xpath("//button[text()='Sign In ']");

    private By signInWithGooglePath = By.xpath("//button[text()=' Sign in with Google']");

    private By signInWithMicrosoftPath = By.xpath("//button[text()=' Sign in with Microsoft']");

    private By twoFactorPath = By.xpath("//h3[text()='Two-Factor Authentication ']");
    private By emailRequiredPath = By.xpath("//span[@class='error-text ng-star-inserted']");
    private By passwordRequiredPath = By.xpath("//span[text()='Password is Required']");
    private By errorToaster = By.xpath("div[@aria-label='Invalid login attempt.']");
    private By forgetPasswordPath = By.xpath("//a[text()='Forgot Password?']");
    private By backtoSignIn = By.xpath("//a[text()='Back to Sign In']");
    private By otpField1 = By.xpath("//input[@formcontrolname='otp1']");
    private By otpField2 = By.xpath("//input[@formcontrolname='otp2']");
    private By otpField3 = By.xpath("//input[@formcontrolname='otp3']");
    private By otpField4 = By.xpath("//input[@formcontrolname='otp4']");
    private By submitPath = By.xpath("//button[text()='Submit']");

    private By homePath = By.xpath("//div[@class='title']");


    public SA_SignIn_page(WebDriver driver) {
        this.driver=driver;
    }

    public void signInButton(String EmailAddress, String Password, String Toaster) throws InterruptedException {
        driver.findElement(emailFieldPath).sendKeys(EmailAddress);
        driver.findElement(passwordFieldPath).sendKeys(Password);

// Click the login button
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        if (driver.findElement(loginbuttonPath).isEnabled()) {
            Thread.sleep(3000);
            driver.findElement(loginbuttonPath).click();
            Thread.sleep(3000);
// Check for Two Factor Authentication
            List<WebElement> twoFactorElements = driver.findElements(By.xpath("//h3[text()='Two-Factor Authentication ']"));
            if (!twoFactorElements.isEmpty() && twoFactorElements.get(0).isDisplayed()) {
                System.out.println("Two Factor Authentication page is displayed");

                // Fill in the OTP
                driver.findElement(otpField1).sendKeys("1");
                driver.findElement(otpField2).sendKeys("2");
                driver.findElement(otpField3).sendKeys("3");
                driver.findElement(otpField4).sendKeys("4");
                driver.findElement(submitPath).click();

                // Wait for home page to be visible
                WebElement homePage = wait.until(ExpectedConditions.visibilityOfElementLocated(homePath));
                if (homePage.isDisplayed()) {
                    System.out.println("Login Successful");
                } else {
                    // Check for error toaster if home page is not displayed
                    List<WebElement> errorToasterElements = driver.findElements(errorToaster);
                    if (!errorToasterElements.isEmpty() && errorToasterElements.get(0).isDisplayed()) {
                        Thread.sleep(3000);
                        String errortoaster = errorToasterElements.get(0).getText();
                        System.out.println(errortoaster);
                        Assert.assertEquals(Toaster, errortoaster);
                    } else {
                        System.out.println("Login failed. Home page is not displayed.");
                    }
                }
            } else {
                System.out.println("Login failed. Two Factor Authentication page is not displayed.");
            }
        }
    }

}
