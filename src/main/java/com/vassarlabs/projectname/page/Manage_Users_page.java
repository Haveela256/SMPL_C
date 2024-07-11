package com.vassarlabs.projectname.page;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.time.chrono.ThaiBuddhistEra;

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
Thread.sleep(3000);
    }

    public void userDetails(String FirstName, String MiddleName, String LastName, String Email, String Designation, String SuccessfulToaster, String ErrorToaste, String ErrorMessage) throws InterruptedException {
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
            if (driver.findElement(addUserPopup).isDisplayed()) {
                driver.findElement(closeIcon).click();
                System.out.println("Popup is displayed");
                Thread.sleep(3000); // Adjust this if necessary
                } else {
                    System.out.println("Close button is not displayed");
                }
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
            if (ErrorToaster.contains("Already Exists")) {
                value = 5;
                System.out.println("Case 5 Will Run");
            }
            switch (value) {
                case 1:
                    wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(firstInvalid));
                    if (driver.findElements(firstInvalid).size() > 0) {
                        String firstnameError = driver.findElement(firstInvalid).getText();
                        System.out.println(firstnameError);
                        Assert.assertEquals(ErrorMessage, firstnameError);
                        submit = true;
                        if (driver.findElement(addUserPopup).isDisplayed()) {
                            System.out.println("Popup is displayed");
                            Thread.sleep(3000); // Adjust this if necessary
                            if (wait.until(ExpectedConditions.visibilityOfElementLocated(closeIcon)).isDisplayed()) {
                                Thread.sleep(10000);
                                if (wait.until(ExpectedConditions.elementToBeClickable(closeIcon)).isDisplayed()) {
                                    System.out.println("Close button is displayed and clickable");
                                    driver.findElement(closeIcon).click();
                                } else {
                                    System.out.println("Close button is not clickable");
                                }
                    }}}
                    break;
                case 2:
                    wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(middleNameInvalid));
                    if (driver.findElements(middleNameInvalid).size() > 0) {
                        String middleNameError = driver.findElement(middleNameInvalid).getText();
                        System.out.println(middleNameError);
                        Assert.assertEquals(ErrorMessage, middleNameError);
                        submit = true;
                        if (driver.findElement(addUserPopup).isDisplayed()) {
                            System.out.println("Popup is displayed");
                            Thread.sleep(3000); // Adjust this if necessary
                            if (wait.until(ExpectedConditions.visibilityOfElementLocated(closeIcon)).isDisplayed()) {
                                Thread.sleep(10000);
                                if (wait.until(ExpectedConditions.elementToBeClickable(closeIcon)).isDisplayed()) {
                                    System.out.println("Close button is displayed and clickable");
                                    driver.findElement(closeIcon).click();
                                } else {
                                    System.out.println("Close button is not clickable");
                                }
                    }}}
                    break;
                case 3:
                    wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(lastNameInavlid));
                    if (driver.findElements(lastNameInavlid).size() > 0) {
                        String lastNameError = driver.findElement(lastNameInavlid).getText();
                        System.out.println(lastNameError);
                        Assert.assertEquals(ErrorMessage, lastNameError);
                        submit = true;
                        if (driver.findElement(addUserPopup).isDisplayed()) {
                            System.out.println("Popup is displayed");
                            Thread.sleep(3000); // Adjust this if necessary
                            if (wait.until(ExpectedConditions.visibilityOfElementLocated(closeIcon)).isDisplayed()) {
                                Thread.sleep(10000);
                                if (wait.until(ExpectedConditions.elementToBeClickable(closeIcon)).isDisplayed()) {
                                    System.out.println("Close button is displayed and clickable");
                                    driver.findElement(closeIcon).click();
                                } else {
                                    System.out.println("Close button is not clickable");
                                }
                    }}}
                    break;
                case 4:
                    wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(designationInvalid));
                    if (driver.findElements(designationInvalid).size() > 0) {
                        String designationError = driver.findElement(designationInvalid).getText();
                        System.out.println(designationError);
                        Assert.assertEquals(ErrorMessage, designationError);
                        submit = true;
                        if (driver.findElement(addUserPopup).isDisplayed()) {
                            System.out.println("Popup is displayed");
                            Thread.sleep(3000); // Adjust this if necessary
                            if (wait.until(ExpectedConditions.visibilityOfElementLocated(closeIcon)).isDisplayed()) {
                                Thread.sleep(10000);
                                if (wait.until(ExpectedConditions.elementToBeClickable(closeIcon)).isDisplayed()) {
                                    System.out.println("Close button is displayed and clickable");
                                    driver.findElement(closeIcon).click();
                                } else {
                                    System.out.println("Close button is not clickable");
                                }
                    }}}
                    break;
                case 5:
                    wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(firstNameRequired));
                    if (driver.findElements(firstNameRequired).size() > 0) {
                        String firstNameRequiredError = driver.findElement(firstNameRequired).getText();
                        System.out.println(firstNameRequiredError);
                        Assert.assertEquals(ErrorMessage, firstNameRequiredError);
                        submit = true;
                        if (driver.findElement(addUserPopup).isDisplayed()) {
                            System.out.println("Popup is displayed");
                            Thread.sleep(3000); // Adjust this if necessary
                            if (wait.until(ExpectedConditions.visibilityOfElementLocated(closeIcon)).isDisplayed()) {
                                Thread.sleep(10000);
                                if (wait.until(ExpectedConditions.elementToBeClickable(closeIcon)).isDisplayed()) {
                                    System.out.println("Close button is displayed and clickable");
                                    driver.findElement(closeIcon).click();
                                } else {
                                    System.out.println("Close button is not clickable");
                                }
                    }}}
                    break;
                case 6:
                    wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(lastNameRequired));
                    if (driver.findElements(lastNameRequired).size() > 0) {
                        String lastNameRequiredError = driver.findElement(lastNameRequired).getText();
                        System.out.println(lastNameRequiredError);
                        Assert.assertEquals(ErrorMessage, lastNameRequiredError);
                        submit = true;
                        if (driver.findElement(addUserPopup).isDisplayed()) {
                            System.out.println("Popup is displayed");
                            Thread.sleep(3000); // Adjust this if necessary
                            if (wait.until(ExpectedConditions.visibilityOfElementLocated(closeIcon)).isDisplayed()) {
                                Thread.sleep(10000);
                                if (wait.until(ExpectedConditions.elementToBeClickable(closeIcon)).isDisplayed()) {
                                    System.out.println("Close button is displayed and clickable");
                                    driver.findElement(closeIcon).click();
                                } else {
                                    System.out.println("Close button is not clickable");
                                }
                    }}}
                    break;
                case 7:
                    wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(errortoaster));
                    if (driver.findElements(errortoaster).size() > 0) {
                        String error = driver.findElement(errortoaster).getText();
                        System.out.println(error);
                        Assert.assertEquals(ErrorToaster, error);
                        if (driver.findElement(addUserPopup).isDisplayed()) {
                            System.out.println("Popup is displayed");
                            Thread.sleep(3000); // Adjust this if necessary
                            if (wait.until(ExpectedConditions.visibilityOfElementLocated(cancelButton)).isDisplayed()) {
                                Thread.sleep(10000);
                                if (wait.until(ExpectedConditions.elementToBeClickable(cancelButton)).isDisplayed()) {
                                    System.out.println("Close button is displayed and clickable");
                                    driver.findElement(cancelButton).click();
                                    submit = false;
                                } else {
                                    System.out.println("Close button is not clickable");
                                }

                    }}}
                    break;
                default:
                    submit = false;
                    System.out.println(useraddedToaster);
            }
            if (driver.findElement(addUserPopup).isDisplayed()){
                Thread.sleep(3000);
                driver.findElement(closeIcon).click();
                Thread.sleep(3000);
            }
        }}
    public void verifyUser(String Email) throws InterruptedException {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        try {
            // Wait until the element is present and visible
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='" + Email + "']")));

            if (element.isDisplayed()) {
                System.out.println("User added successfully");
            }
        } catch (Exception e) {
            System.out.println("User is not added or an error occurred: " + e.getMessage());
        }

    }

    public void lockUserAndUnlock(String FirstName, String LastName, String Email) throws InterruptedException {
        // Check if the email element is displayed
        try {
            if (driver.findElement(By.xpath("//div[@class='card-body']//following::div[text()=' " + Email + " ']/../..")).isDisplayed()) {
                boolean isLocked = driver.findElements(By.xpath("//div[text()=' " + Email + " ']//following::button//i[@class='bi bi-lock-fill']")).size() > 0;
                boolean isUnlocked = driver.findElements(By.xpath("//div[text()=' " + Email + " ']//following::button//i[@class='bi bi-unlock-fill']")).size() > 0;

                try {
                    // Check if the lock icon is displayed
                    if (isLocked) {
                        Thread.sleep(3000);
                        driver.findElement(By.xpath("//div[text()=' " + Email + " ']//following::button//i[@class='bi bi-lock-fill']")).click();
                        Thread.sleep(3000);
                        System.out.println("User is locked");
                    } else if (isUnlocked) {
                        // Check if the unlock icon is displayed
                        Thread.sleep(4000);
                        driver.findElement(By.xpath("//div[text()=' " + Email + " ']//following::button//i[@class='bi bi-unlock-fill']")).click();
                        Thread.sleep(3000);
                        System.out.println("User is unlocked");
                    } else {
                        System.out.println("Neither lock nor unlock icon is found");
                    }
                } catch (Exception e) {
                    System.out.println("Error clicking the lock/unlock icon: " + e.getMessage());
                }
            } else {
                System.out.println("Email element not found");
            }
        } catch (Exception e) {
            System.out.println("Error finding the email element: " + e.getMessage());
        }}

    public void deleteUser(String FirstName, String LastName, String SuccessfulToaster, String ErrorToaster, String ErrorMessage, String Email, String DeleteToaster) throws InterruptedException
        {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

            try {
                // Locate the user element by email
                WebElement userElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()=' " + Email + " ']")));
                Thread.sleep(3000);

                // Check if the delete icon is present
                if (userElement.isDisplayed()) {
                    WebElement deleteIcon = null;
                    try {
                        deleteIcon = wait.until(ExpectedConditions.presenceOfElementLocated(deleteUser));
                    } catch (TimeoutException e) {
                        System.out.println("Delete icon not found for email: " + Email);
                        throw new NoSuchElementException("Delete icon not found");
                    }

                    // Click the delete icon and confirm the deletion
                    if (deleteIcon != null && deleteIcon.isDisplayed()) {
                        deleteIcon.click();
                        driver.findElement(popupYesButton).click();

                        // Wait for and verify the toaster message
                        WebElement toasterElement = wait.until(ExpectedConditions.visibilityOfElementLocated(deleteToaster));
                        String userDeletedMessage = toasterElement.getText();
                        System.out.println("Toaster message: " + userDeletedMessage);

                        Assert.assertEquals(userDeletedMessage,DeleteToaster);
                    } else {
                        System.out.println("Delete icon for email '" + Email + "' is not displayed or clickable");
                        Assert.fail("Delete icon is not displayed or clickable, cannot proceed with deletion");
                    }
                } else {
                    System.out.println("User with email '" + Email + "' is not displayed or deleted");
                    Assert.fail("User is not displayed, cannot proceed with deletion");
                }
            } catch (NoSuchElementException e) {
                System.out.println("Element not found: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
    public void editUserDetails(String FirstName, String MiddleName, String LastName, String Email, String Designation, String NewDetails) throws Throwable {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // Adjust the timeout as needed
            WebElement emailElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='card-body']//following::div[text()=' " + Email + " ']/../..")));

            if (emailElement.isDisplayed()) {
                Thread.sleep(3000);
                WebElement editButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()=' " + Email + " ']//following::div//button//i[@class='bi bi-pencil-square']")));
                editButton.click();

                WebElement lastNameElement = wait.until(ExpectedConditions.elementToBeClickable(lastNameField));
                lastNameElement.click();

                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_A);
                robot.keyRelease(KeyEvent.VK_A);
                robot.keyRelease(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_BACK_SPACE);
                robot.keyRelease(KeyEvent.VK_BACK_SPACE);

                lastNameElement.sendKeys(NewDetails);
                Thread.sleep(3000);

                WebElement submitBtn = wait.until(ExpectedConditions.elementToBeClickable(submitButton));
                submitBtn.click();

                WebElement editedElement = wait.until(ExpectedConditions.visibilityOfElementLocated(useredited));
                String edited = editedElement.getText();
                System.out.println(edited);

                Thread.sleep(3000);
            } else {
                System.out.println("User is not edited");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("An error occurred while editing the user.");
        }
    }
    public void search(String FirstName) throws InterruptedException {
        driver.findElement(searchField).sendKeys(FirstName);
        Thread.sleep(3000);
        driver.findElement(searchField).sendKeys(Keys.CONTROL + "a" + Keys.DELETE);
    }
}


