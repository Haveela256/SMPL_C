package com.vassarlabs.projectname.page;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
    boolean submitButton=false;


    public ForgetPassword_page(WebDriver driver) {
        this.driver = driver;
    }


    public void submitButton(String Email, String Toaster, String ErrorMessage) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.findElement(forgetPasswordlink).click();
        if (driver.findElement(forgetPasswordTitle).isDisplayed()) {
            Thread.sleep(3000);
            // Check if the email field is displayed and interact with it
            if (driver.findElement(emailfield).isDisplayed()) {
                driver.findElement(emailfield).click();
                driver.findElement(emailfield).sendKeys(Email);
                Thread.sleep(3000);
                if (driver.findElement(submit).isEnabled()) {
                    Thread.sleep(3000);
                    wait.until(ExpectedConditions.elementToBeClickable(submit));
                    driver.findElement(submit).click();
                    Thread.sleep(3000);
                } else if (driver.findElement(forgetPasswordTitle).isDisplayed()) {
                    driver.findElement(forgetPasswordTitle).click();
                    int value = 0;
                    if (ErrorMessage.contains("doesn't exist")) {
                        value = 1;
                        System.out.println("Case 1 Will Run");
                    }
                    if (ErrorMessage.contains("Email is invalid")) {
                        value = 2;
                        System.out.println("Case 2 Will Run");
                    }
                    if (ErrorMessage.contains("Email is Required")) {
                        value = 3;
                        System.out.println("Case 3 Will Run");
                    }
                    switch (value) {
                        case 1:
                            if (driver.findElement(invalidToaster).isDisplayed()) {
                                String toaster = driver.findElement(invalidToaster).getText();
                                System.out.println(toaster);
                                Assert.assertEquals(Toaster, toaster);
                                submitButton = true;
                            }
                            break;
                        case 2:
                            if (driver.findElement(invalidEmail).isDisplayed()) {
                                String error = driver.findElement(invalidEmail).getText();
                                System.out.println(error);
                                Assert.assertEquals(ErrorMessage, error);
                                submitButton = true;
                            }
                            break;
                        case 3:
                            if (driver.findElement(blankfieldError).isDisplayed()) {
                                String error1 = driver.findElement(blankfieldError).getText();
                                System.out.println(error1);
                                Assert.assertEquals(ErrorMessage, error1);
                                submitButton = true;


                            } else if (driver.findElement(resetPasswordPage).isDisplayed()) {
                                String resetPassword = driver.findElement(resetPasswordPage).getText();
                                System.out.println(resetPassword);
                            } else {
                                System.out.println("Email field is not displayed");
                            }
                    }
                }
            }
        }
    }

        public void backtoSignIn () throws InterruptedException {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        try {
            if (driver.findElement(backToSIgnIn).isDisplayed()) {
                wait.until(ExpectedConditions.elementToBeClickable(backToSIgnIn)).click();
                Thread.sleep(3000); // Optionally wait after clicking
            } else {
                // Handle case where backToSignIn is not displayed
                System.out.println("Back hyperlink is not displayed");
            }
        } catch (NoSuchElementException | TimeoutException e) {
            // Handle exceptions if element is not found or timeout occurs
            System.out.println("Element backToSignIn not found or clickable within 20 seconds");
        } catch (InterruptedException e) {
            // Handle interruption exception if needed
            e.printStackTrace();
        }
}}




