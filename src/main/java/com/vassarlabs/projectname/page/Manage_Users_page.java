package com.vassarlabs.projectname.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
    private By lastNameField = By.xpath("//input[@formcontrolname='lastName']");
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
    private By lockUser = By.xpath("//i[@class='bi bi-lock-fill']/..");
    private By unlockIcon = By.xpath("//i[@class='bi bi-unlock-fill']/..");
    private By editFirstName = By.xpath("//input[@formcontrolname='firstName']");
    private By editMiddleName = By.xpath("//input[@formcontrolname='middleName']");
    private By editLastName = By.xpath("//input[@formcontrolname='lastName']");
    private By editDesignation = By.xpath("//input[@formcontrolname='title']");
    private By deleteToaster = By.xpath("//div[text()=' User Deleted Successfully ']");
    private By closeIcon = By.xpath("//button[@class='btn-close']");
    private By firstNameRequired = By.xpath("//span[text()='First Name is required']");
    private By popupYesButton = By.xpath("//button[text()='Yes']");
    private By useredited=By.xpath("//div[text()=' User Edited Successfully ']");


    boolean submit = false;


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
    }

    public void submitButton(String SuccessfulToaster, String ErrorToaster, String ErrorMessage) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        if (driver.findElement(submitButton).isEnabled()) {
            driver.findElement(submitButton).click();
        }
        if (driver.findElement(addUserPopup).isDisplayed()) {
            driver.findElement(closeIcon).click();
        } else {
            int value = 0;
            if (ErrorMessage.contains("First Name")) {
                value = 1;
                System.out.println("Case 1 Will Run");
            }
            if (ErrorMessage.contains("Middle Name")) {
                value = 2;
                System.out.println("Case 2 Will Run");
            }
            if (ErrorMessage.contains("Last Name")) {
                value = 3;
                System.out.println("Case 3 Will Run");
            }
            if (ErrorMessage.contains("Designation")) {
                value = 4;
                System.out.println("Case 4 Will Run");
            }
            switch (value) {
                case 1:
                    if (driver.findElements(firstInvalid).size() > 0) {
                        String firstnameError = driver.findElement(firstInvalid).getText();
                        System.out.println(firstnameError);
                        Assert.assertEquals(ErrorMessage, firstnameError);
                        submit = true;
                    }
                    break;
                case 2:
                    if (driver.findElements(middleNameInvalid).size() > 0) {
                        String middleNameError = driver.findElement(middleNameInvalid).getText();
                        System.out.println(middleNameError);
                        Assert.assertEquals(ErrorMessage, middleNameError);
                        submit = true;
                    }
                    break;
                case 3:
                    if (driver.findElements(lastNameInavlid).size() > 0) {
                        String lastNameError = driver.findElement(lastNameInavlid).getText();
                        System.out.println(lastNameError);
                        Assert.assertEquals(ErrorMessage, lastNameError);
                        submit = true;
                    }
                    break;
                case 4:
                    if (driver.findElements(designationInvalid).size() > 0) {
                        String designationError = driver.findElement(designationInvalid).getText();
                        System.out.println(designationError);
                        Assert.assertEquals(ErrorMessage, designationError);
                        submit = true;
                    }
                    break;
                case 5:
                    if (driver.findElements(firstNameRequired).size() > 0) {
                        String firstNameRequiredError = driver.findElement(firstNameRequired).getText();
                        System.out.println(firstNameRequiredError);
                        Assert.assertEquals(ErrorMessage, firstNameRequiredError);
                        submit = true;
                    }
                    break;
                case 6:
                    if (driver.findElements(lastNameRequired).size() > 0) {
                        String lastNameRequiredError = driver.findElement(lastNameRequired).getText();
                        System.out.println(lastNameRequiredError);
                        Assert.assertEquals(ErrorMessage, lastNameRequiredError);
                        submit = true;
                    }
                    break;
                default:
                    submit = false;
            }
//        if (!submit && !(driver.findElements(By.xpath("//button[text()='Submit']")).size()>0)) {
//            Thread.sleep(8000);
//            driver.findElement(submitButton).click();
//        } else {
//            System.out.println("Submit disabled");
        }
    }


    public void verifyUser(String Email) {
        if (driver.findElement(By.xpath("//div[text()='" + Email + "']")).isDisplayed()) {
            System.out.println("User added successfully");
        } else {
            System.out.println("User is not added");
        }
    }

    public void lockUserAndUnlock(String FirstName, String LastName, String Email) {
        if (driver.findElement(By.xpath("//div[@class='card-body']//following::div[text()='" + Email + "']/../..")).isDisplayed()) {
            if (driver.findElement(By.xpath("//div[text()='" + Email + "']//following::div//button//i[@class='bi bi-unlock-fill']")).isDisplayed()) {
                driver.findElement(By.xpath("//div[text()='" + Email + "']//following::div//button//i[@class='bi bi-unlock-fill']")).click();
                System.out.println("user is locked");
            } else if (!driver.findElement(By.xpath("//div[text()='" + Email + "']//following::div//button//i[@class='bi bi-unlock-fill']")).isDisplayed()) {
                    driver.findElement(By.xpath("//div[text()='" + Email + "']//following::div//button//i[@class='bi bi-lock-fill']")).click();
                    System.out.println("user is unlocked");
            }}
//            driver.findElement(By.xpath("//div[text()='" + Email + "']//following::div//button//i[@class='bi bi-lock-fill']")).click();
//                System.out.println("user is unlocked");
//            }
//        } else if (driver.findElement(By.xpath("//div[text()='" + Email + "']//following::div//button//i[@class='bi bi-lock-fill']")).isDisplayed()) {
//            driver.findElement(By.xpath("//div[text()='" + Email + "']//following::div//button//i[@class='bi bi-lock-fill']")).click();
//            System.out.println("User is unlocked");
//
//        } else {
//            driver.findElement(By.xpath("//div[text()='" + Email + "']//following::div//button//i[@class='bi bi-unlock-fill']")).click();
//            System.out.println("user is locked");
//        }
    }
    public void deleteUser(String FirstName, String LastName, String SuccessfulToaster, String ErrorToaster, String ErrorMessage, String Email, String DeleteToaster) {
        if (driver.findElement(By.xpath("//div[text()='" + Email + "']")).isDisplayed()) {
            driver.findElement(deleteUser).click();
            driver.findElement(popupYesButton).click();
            String userdeleted = driver.findElement(this.deleteToaster).getText();
            System.out.println(userdeleted);
            Assert.assertEquals(DeleteToaster, userdeleted);
        }else {
            System.out.println("User is not deleted");
        }

    }


    public void editUserDetails(String FirstName, String MiddleName, String LastName, String Email, String Designation, String NewDetails) throws Throwable {
        if (driver.findElement(By.xpath("//div[@class='card-body']//following::div[text()='"+Email+"']/../..")).isDisplayed()) {
            driver.findElement(By.xpath("//div[text()='"+Email+"']//following::div//button//i[@class='bi bi-pencil-square']")).click();
            driver.findElement(lastNameField).click();
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_A);
            robot.keyRelease(KeyEvent.VK_A);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_BACK_SPACE);
            robot.keyRelease(KeyEvent.VK_BACK_SPACE);
            driver.findElement(lastNameField).sendKeys(NewDetails);
            Thread.sleep(3000);
            driver.findElement(submitButton).click();
           String edited= driver.findElement(useredited).getText();
            System.out.println(edited);
        } else {
            System.out.println("User is not edited");
        }}

    }


