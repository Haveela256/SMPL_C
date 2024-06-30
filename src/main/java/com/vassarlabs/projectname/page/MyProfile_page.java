package com.vassarlabs.projectname.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class MyProfile_page {
    private WebDriver driver;
    private By userProfileIcon = By.xpath("//img[@class='profile-style']");
    private By myProfileOption = By.xpath("//button[normalize-space()='My Profile']");
    private By myProfileTitle = By.xpath("//div[text()=' My Profile']");
    private By editButtonPath = By.xpath("//button[@class='btn btn-primary btn-sm']//i");
    private By firstNameField = By.xpath("//input[@placeholder='Enter First Name']");
    private By middleNameField = By.xpath("//input[@placeholder='Enter Middle Name']");
    private By lastNameField = By.xpath("//input[@placeholder='Enter Last Name']");
    private By designation = By.xpath("//input[@placeholder='Enter Designation']");
    private By uploadImage = By.xpath("//div[@class='profile-picture']//span[text()='Browse']");
    private By replaceIcon = By.xpath("//i[@class='bi bi-repeat']/../../input[@type='file']");
    private By cancelButton = By.xpath("//button[text()='Cancel']");
    private By submitButton = By.xpath("//button[text()='Submit']");
    private By userDetailsUpdatedToaster = By.xpath("//div[text()=' Profile updated successfully ']");
    private By alpahabetError = By.xpath("//span[text()='Only Alphabets are allowed']");
    private By firstNameRequired = By.xpath("//span[text()='First Name is required']");
    private By lastNameRequired = By.xpath("//span[text()='Last Name is required']");
    private By browse = By.xpath("//span[text()='Browse']/../../..//input[@type='file']");
    private By ok = By.xpath("//button[normalize-space()='Ok']");
    private By cropPopup = By.xpath("//h4[text()='Crop Image']");
    private By cropPopupCancel = By.xpath("//button[@type='button'][normalize-space()='Cancel']");
    private By cropPlus = By.xpath("//i[@class='bi bi-plus-lg']");
    private By cropMinus = By.xpath("//div[@class='modal-body']//button[2]");
    private By imageSize = By.xpath("//span[@class='ngx-ic-resize ngx-ic-bottomleft ng-star-inserted']");
    private By fitImage = By.xpath("//button[@id='imageFitting']");
    private By deleteUser = By.xpath("//button[@ngbtooltip='Delete User']");
    private By firstInvalid = By.xpath("//span[text()=' First name is Invalid ']");
    private By lastNameInavlid = By.xpath("//span[text()=' Last name is Invalid ']");
    private By emailInavlid = By.xpath("//span[text()=' Email is not Valid ']");
    private By middleNameInvalid = By.xpath("//span[text()=' Middle name is Invalid ']");
    private By designationInvalid = By.xpath("//span[text()=' Please enter a title with at least 3 characters ']");
    private By cropPopupTitle = By.xpath("//h4[@class='modal-title']");
    boolean submit = false;


    public MyProfile_page(WebDriver driver) {
        this.driver = driver;

    }

    public void myProfile() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.findElement(userProfileIcon).click();
        Thread.sleep(9000);
        driver.findElement(myProfileOption).click();
        Thread.sleep(3000);
        driver.findElement(myProfileTitle).isDisplayed();
        Thread.sleep(3000);
    }

    public void editButton() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(editButtonPath));
        if (driver.findElement(editButtonPath).isDisplayed()) {
            Thread.sleep(3000);
            driver.findElement(editButtonPath).click();
            System.out.println("Edit button clicked");
        } else {
            System.out.println("Edit button is not displayed");
        }
    }


    public void clickOnCancelButton() throws InterruptedException {
        driver.findElement(cancelButton).isDisplayed();
        Thread.sleep(3000);
        driver.findElement(cancelButton).click();
        Thread.sleep(3000);
    }

    public void addDetails(String FirstName, String MiddleName, String LastName, String Designation, String File, String ReplaceFile) throws InterruptedException {
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
            WebElement ele4 = driver.findElement(designation);
            ele4.click();
            ele4.sendKeys(Keys.CONTROL + "a" + Keys.DELETE);
            ele4.sendKeys(Designation);
        }

    }
    public void profile(String File) throws InterruptedException {
        editButton();
        Thread.sleep(5000);
        driver.findElement(browse).isDisplayed();
        Thread.sleep(10000);
            driver.findElement(browse).sendKeys(File);
            Thread.sleep(10000);
            System.out.println("File selected");
            Thread.sleep(7000);
            if (driver.findElement(cropPopup).isDisplayed()) {
                driver.findElement(cropPopupCancel).isDisplayed();
                driver.findElement(cropPopupCancel).click();
            }
            driver.findElement(browse).sendKeys(File);
            System.out.println("File selected");
            Thread.sleep(7000);
            if (driver.findElement(cropPopupTitle).isDisplayed()) {
                driver.findElement(cropMinus).click();
                driver.findElement(cropPlus).click();
                driver.findElement(fitImage).click();
                Thread.sleep(5000);
                driver.findElement(ok).isDisplayed();
                Thread.sleep(5000);
                driver.findElement(ok).click();
                Thread.sleep(4000);
            }

        }


    public void clickOnSubmitButton(String FirstName, String MiddleName, String LastName, String Designation, String ErrorMessage, String DetailsUpdatedToaster, String ErrorToaster) throws InterruptedException {
        if (driver.findElement(editButtonPath).isDisplayed()) {
            Thread.sleep(7000);
            driver.findElement(editButtonPath).click();
            Thread.sleep(5000);
            Thread.sleep(3000);
            System.out.println(ErrorMessage);
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
            if (!submit && !(driver.findElements(By.xpath("//button[text()='Submit'][@disabled]")).size()>0)) {
                Thread.sleep(8000);
                driver.findElement(submitButton).click();
            } else {
                System.out.println("Submit disabled");
            }
            }
        }

    public void replaceIcon(String ReplaceFile) throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(editButtonPath).click();
        System.out.println("Edit button is clicked");
        Thread.sleep(5000);
        System.out.println("Waiting for Replace icon");
        Thread.sleep(5000);
        if (driver.findElement(replaceIcon).isDisplayed()) {
            Thread.sleep(3000);
            driver.findElement(replaceIcon).sendKeys(ReplaceFile);
            Thread.sleep(3000);
           driver.findElement(submitButton).click();
           Thread.sleep(3000);
        }
        else {
            System.out.println("Submission failed");
        }
    }
}
