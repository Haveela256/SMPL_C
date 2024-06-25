package com.vassarlabs.projectname.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class Manage_Users_page {
    private WebDriver driver;
    private By manageUsersModule = By.xpath("//span[text()='Manage Users']");
    private By addUser = By.xpath("//button[contains(@class,'btn plus-btn')]/i");
    private By firstNameField = By.xpath("//input[@formcontrolname='firstName']");
    private By middleNameField = By.xpath("//input[@formcontrolname='middleName']");
    private By lastNameField = By.xpath(" //input[@formcontrolname='lastName']");
    private By designation = By.xpath("//input[@formcontrolname='title']");

    private By emailField = By.xpath("//input[@formcontrolname='email']");
    private By cancelButton = By.xpath("//button[text()='Cancel']");
    private By submitButton = By.xpath("//button[text()='Submit']");
    private By useraddedToaster = By.xpath("//div[text()=' User Added Successfully ']");


    private By searchField = By.xpath("//input[@placeholder='Search']");

    private By deleteUser = By.xpath("//button[@ngbtooltip='Delete User']");
    private By firstInvalid = By.xpath("//span[text()=' First name is Invalid ']");
    private By lastNameInavlid = By.xpath("//span[text()=' Last name is Invalid ']");
    private By emailInavlid = By.xpath("//span[text()=' Email is not Valid ']");
    private By middleNameInvalid = By.xpath("//span[text()=' Middle name is Invalid ']");
    private By designationInvalid = By.xpath("//span[text()=' Please enter a title with at least 3 characters ']");

    private By firtNameRequired = By.xpath("//span[text()=' First name is Required ']");
    private By lastNameRequired = By.xpath("//span[text()=' Last name is Required ']");
    private By emailRequired = By.xpath("//span[text()=' Email is Required ']");
    private By designationRequired = By.xpath("//span[text()=' Title is Required ']");
    private By addUserPopup = By.xpath("//h4[text()='Add User']");
    private By errortoaster = By.xpath("//div[text()=' Email Id Already Exist ']");
    private By deleteIcon = By.xpath("//button[@ngbtooltip='Delete User']");
    private By lockUser = By.xpath("//i[@class='bi bi-lock-fill']");
    private By unlockIcon = By.xpath("//i[@class='bi bi-unlock-fill']");
    private By editIcon = By.xpath("//button[@class='btn btn-transparent']");
    private By editFirstName = By.xpath("//input[@formcontrolname='firstName']");
    private By editMiddleName = By.xpath("//input[@formcontrolname='middleName']");
    private By editLastName = By.xpath("//input[@formcontrolname='lastName']");
    private By editDesignation = By.xpath("//input[@formcontrolname='title']");
    private By deleteToaster = By.xpath("//div[text()=' User Deleted Successfully ']");
    private By closeIcon = By.xpath("//button[@class='btn-close']");


    public Manage_Users_page(WebDriver driver) {
        this.driver = driver;
    }

    public void manageUsersModule() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.findElement(manageUsersModule).click();
    }

    public void clickOnAddUserIcon() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        Thread.sleep(3000);
        driver.findElement(addUser).click();
        System.out.println("Add User button clicked");
        driver.findElement(addUserPopup).isDisplayed();
    }

    public void userDetails(String FirstName, String MiddleName, String LastName, String Email, String Designation, String SuccessfulToaster, String ErrorToaster, String ErrorMessage) throws InterruptedException {
        driver.findElement(firstNameField).sendKeys(FirstName);
        Thread.sleep(3000);
        driver.findElement(middleNameField).click();
        driver.findElement(middleNameField).sendKeys(MiddleName);
        Thread.sleep(3000);
        driver.findElement(lastNameField).click();
        driver.findElement(lastNameField).sendKeys(LastName);
        Thread.sleep(3000);
        driver.findElement(designation).click();
        Thread.sleep(3000);
        driver.findElement(designation).sendKeys(Designation);
        driver.findElement(emailField).click();
        driver.findElement(emailField).sendKeys(Email);
        Thread.sleep(3000);
        submitButton(SuccessfulToaster, ErrorToaster, ErrorMessage);
    }

    public void submitButton(String SuccessfulToaster, String ErrorToaster, String ErrorMessage) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        Thread.sleep(2000);
        if (driver.findElement(submitButton).isEnabled()) {
            System.out.println("sub is enb");
            Thread.sleep(3000);
            driver.findElement(submitButton).click();
            System.out.println("submit button clicked");
            if (driver.findElement(errortoaster).isDisplayed()) {
                Thread.sleep(5000);
                WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
                WebElement toaster = wait1.until(ExpectedConditions.visibilityOfElementLocated(errortoaster));
                String toasterr = toaster.getText().trim();
                System.out.println(toasterr);
                Assert.assertEquals(ErrorToaster, toasterr);
                driver.findElement(closeIcon).click();
                Thread.sleep(3000);
                if (driver.findElement(firstInvalid).isDisplayed()) {
                    String firstnameError = driver.findElement(firstInvalid).getText();
                    System.out.println(firstnameError);
                    Assert.assertEquals(ErrorMessage, firstnameError);
                    if (driver.findElement(middleNameInvalid).isDisplayed()) {
                        String middleNameError = driver.findElement(middleNameInvalid).getText();
                        System.out.println(middleNameError);
                        Assert.assertEquals(ErrorMessage, middleNameError);
                        if (driver.findElement(lastNameInavlid).isDisplayed()) {
                            String lastNameError = driver.findElement(lastNameInavlid).getText();
                            System.out.println(lastNameError);
                            Assert.assertEquals(ErrorMessage, lastNameError);
                            if (driver.findElement(emailInavlid).isDisplayed()) {
                                String emailError = driver.findElement(emailInavlid).getText();
                                System.out.println(emailError);
                                Assert.assertEquals(ErrorMessage, emailError);
                                if (driver.findElement(designationInvalid).isDisplayed()) {
                                    String designationError = driver.findElement(designationInvalid).getText();
                                    System.out.println(designationError);
                                    Assert.assertEquals(ErrorMessage, designationError);
                                    if (driver.findElement(emailRequired).isDisplayed()) {
                                        String emailrequiredError = driver.findElement(emailRequired).getText();
                                        System.out.println(emailrequiredError);
                                        Assert.assertEquals(ErrorMessage, emailrequiredError);
                                        if (driver.findElement(firtNameRequired).isDisplayed()) {
                                            String firstNameRequiredError = driver.findElement(firtNameRequired).getText();
                                            System.out.println(firstNameRequiredError);
                                            Assert.assertEquals(ErrorMessage, firstNameRequiredError);
                                            if (driver.findElement(lastNameRequired).isDisplayed()) {
                                                String lastNameRequiredError = driver.findElement(lastNameRequired).getText();
                                                System.out.println(lastNameRequiredError);
                                                Assert.assertEquals(ErrorMessage, lastNameRequiredError);
                                                if (driver.findElement(designationRequired).isDisplayed()) {
                                                    String designationRequiredError = driver.findElement(designationRequired).getText();
                                                    System.out.println(designationRequiredError);
                                                    Assert.assertEquals(ErrorMessage, designationRequiredError);
//                    if (driver.findElement(errortoaster).isDisplayed()) {
//                        WebElement toaster1 = wait.until(ExpectedConditions.visibilityOfElementLocated(errortoaster));
//                        String toasterr = toaster1.getText();
//                        System.out.println(toasterr);
//                        Assert.assertEquals(ErrorToaster, toasterr);
//                        if (driver.findElement(firstInvalid).isDisplayed()) {
//                            String firstnameError = driver.findElement(firstInvalid).getText();
//                            System.out.println(firstnameError);
//                            Assert.assertEquals(ErrorMessage, firstnameError);
//                            if (driver.findElement(middleNameInvalid).isDisplayed()) {
//                                String middleNameError = driver.findElement(middleNameInvalid).getText();
//                                System.out.println(middleNameError);
//                                Assert.assertEquals(ErrorMessage, middleNameError);
//                                if (driver.findElement(lastNameInavlid).isDisplayed()) {
//                                    String lastNameError = driver.findElement(lastNameInavlid).getText();
//                                    System.out.println(lastNameError);
//                                    Assert.assertEquals(ErrorMessage, lastNameError);
//                                    if (driver.findElement(emailInavlid).isDisplayed()) {
//                                        String emailError = driver.findElement(emailInavlid).getText();
//                                        System.out.println(emailError);
//                                        Assert.assertEquals(ErrorMessage, emailError);
//                                        if (driver.findElement(designationInvalid).isDisplayed()) {
//                                            String designationError = driver.findElement(designationInvalid).getText();
//                                            System.out.println(designationError);
//                                            Assert.assertEquals(ErrorMessage, designationError);
//                                            if (driver.findElement(emailRequired).isDisplayed()) {
//                                                String emailrequiredError = driver.findElement(emailRequired).getText();
//                                                System.out.println(emailrequiredError);
//                                                Assert.assertEquals(ErrorMessage, emailrequiredError);
//                                                if (driver.findElement(firtNameRequired).isDisplayed()) {
//                                                    String firstNameRequiredError = driver.findElement(firtNameRequired).getText();
//                                                    System.out.println(firstNameRequiredError);
//                                                    Assert.assertEquals(ErrorMessage, firstNameRequiredError);
//                                                    if (driver.findElement(lastNameRequired).isDisplayed()) {
//                                                        String lastNameRequiredError = driver.findElement(lastNameRequired).getText();
//                                                        System.out.println(lastNameRequiredError);
//                                                        Assert.assertEquals(ErrorMessage, lastNameRequiredError);
//                                                        if (driver.findElement(designationRequired).isDisplayed()) {
//                                                            String designationRequiredError = driver.findElement(designationRequired).getText();
//                                                            System.out.println(designationRequiredError);
//                                                            Assert.assertEquals(ErrorMessage, designationRequiredError);
//
//                                                        }
//                                                    }
//                                                }
//                                            }
//                                        }
//                                    }
//                                }
//                            }
//                        }
//                    }
//                }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                if (driver.findElement(useraddedToaster).isDisplayed()) {
                    WebElement toaster = wait.until(ExpectedConditions.visibilityOfElementLocated(useraddedToaster));
                    String toasterMessage = toaster.getText();
                    System.out.println(toasterMessage);
                    if (driver.findElement(useraddedToaster).isDisplayed()) {
                        Assert.assertEquals(SuccessfulToaster, toasterMessage);
                    }
                }
            }
        } else {
  Assert.fail("User not added");
        }
    }
    public void verifyUser(String Email) {
        driver.findElement(By.xpath("//div[text()='" + Email + "']")).isDisplayed();
        System.out.println("User added successfully");
    }

    public void lockUserAndUnlock(String FirstName, String LastName, String Email) {
        if (driver.findElement(By.xpath("//div[text()='" + Email + "']")).isDisplayed()) {
            if (driver.findElement(lockUser).isDisplayed()) {
                driver.findElement(lockUser).click();
                if (driver.findElement(unlockIcon).isDisplayed()) {
                    driver.findElement(unlockIcon).click();
                }
            }

        }
    }


    public void deleteUser(String FirstName, String LastName, String SuccessfulToaster, String ErrorToaster, String ErrorMessage, String Email, String DeleteToaster) {
        if (driver.findElement(By.xpath("//div[text()='" + Email + "']")).isDisplayed()) {
            driver.findElement(deleteUser).click();
            String userdeleted = driver.findElement(this.deleteToaster).getText();
            System.out.println(userdeleted);
            Assert.assertEquals(DeleteToaster, userdeleted);
        }

    }

    public void editUserDetails(String FirstName, String LastName, String MiddleName, String Designation, String Email) throws AWTException {
        if (driver.findElement(By.xpath("//div[text()='" + Email + "']")).isDisplayed()) {
            driver.findElement(editIcon).click();
            driver.findElement(lastNameField).click();
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_A);
            robot.keyRelease(KeyEvent.VK_A);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_BACK_SPACE);
            robot.keyRelease(KeyEvent.VK_BACK_SPACE);
            driver.findElement(lastNameField).sendKeys(LastName);
        }
    }
}
