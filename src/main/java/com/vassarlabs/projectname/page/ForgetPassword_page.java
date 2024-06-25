package com.vassarlabs.projectname.page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ForgetPassword_page {
    private WebDriver driver;
    private By forgetPasswordlink = By.xpath("//a[text()='Forgot Password?']");
    private By forgetPasswordTitle = By.xpath("//h3[text()='Forgot Password ']");
    private By emailfield = By.xpath("//input[@formcontrolname='email']");
    private By submit = By.xpath("//button[text()='Submit']");
    private By backToSIgnIn = By.xpath("//a[text()='Back to Sign In']");
    private By blankfieldError = By.xpath("//span[text()='Email is required']");
    private By invalidEmail = By.xpath("//span[text()='Email is invalid']");
    private By invalidToaster = By.xpath("//div[@aria-label='Email-Id does not exist in the system!']");
    private By loginPagepath = By.xpath("//span[text()='Sign in to continue']");
    private By resetPasswordPage = By.xpath("//h3[text()='Reset Password']");


    public ForgetPassword_page(WebDriver driver) {
        this.driver = driver;
    }


    public void submitButton(String Email, String Toaster, String ErrorMessage) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.findElement(forgetPasswordlink).click();
        Thread.sleep(3000);
        driver.findElement(forgetPasswordTitle).isDisplayed();
        Thread.sleep(3000);
        driver.findElement(emailfield).isDisplayed();
        Thread.sleep(3000);
        driver.findElement(emailfield).click();
        Thread.sleep(3000);
        driver.findElement(emailfield).sendKeys(Email);
        if (driver.findElement(submit).isEnabled()) {
            Thread.sleep(3000);
            driver.findElement(submit).click();
        } else if (driver.findElement(invalidToaster).isDisplayed()) {
            Thread.sleep(3000);
            String toaster = driver.findElement(invalidToaster).getText();
            System.out.println(toaster);
            Assert.assertEquals(Toaster, toaster);
        } else if ((driver.findElement(invalidEmail).isDisplayed())) {
            Thread.sleep(3000);
            String error = driver.findElement(invalidEmail).getText();
            System.out.println(error);
            Assert.assertEquals(ErrorMessage, error); }

        else if (driver.findElement(blankfieldError).isDisplayed()) {
            Thread.sleep(3000);
            String error1 = driver.findElement(blankfieldError).getText();
            System.out.println(error1);
            Assert.assertEquals(ErrorMessage, error1);
        }
        else if(driver.findElement(resetPasswordPage).isDisplayed()) {
            Thread.sleep(3000);
            String resetPassword = driver.findElement(resetPasswordPage).getText();
            System.out.println(resetPassword);

        }
        else{
            System.out.println("Cannot reset new password");
        }

    }
    public void backtoSignIn () throws InterruptedException {
        driver.findElement(backToSIgnIn).click();
        Thread.sleep(3000);
        driver.findElement(loginPagepath).isDisplayed();
        Thread.sleep(3000);

    }
}




