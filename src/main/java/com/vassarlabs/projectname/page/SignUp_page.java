package com.vassarlabs.projectname.page;

import org.openqa.selenium.*;
import org.openqa.selenium.devtools.v85.network.model.DataReceived;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

public class SignUp_page {
    private WebDriver driver;
    private By inviteButton = By.xpath("//button[text()='Invite']");
    private By inviteTitle = By.xpath("//h4[text()='Invite']");
    private By emailFeild = By.xpath("//div[@class='form-custom-label']//input[@id='exampleFormControlInput1']");
    private By subscriptionDropdown = By.xpath("//select[@class='form-select ng-untouched ng-pristine ng-invalid']");
    private By orderNumber = By.xpath("//input[@formcontrolname='orderNumber']");
    private By submit = By.xpath("//button[text()='Submit']");
    private By refresh = By.xpath("//button[@id='refresh']");
    private By registerButton = By.xpath("//tbody//tr//td//div//div//div");
    private By signUptitle = By.xpath("//h3[text()='Sign up for SMPL-C ']");
    private By firstNameTextfield = By.xpath("//input[@formcontrolname='firstName']");
    private By middleNameTextField = By.xpath("//input[@formcontrolname='middleName']");
    private By lastNameTextField = By.xpath("//input[@formcontrolname='lastName']");
    private By uploadResumeButton = By.xpath("//input[@type='file']");
    private By reuploadResume = By.xpath("//span[text()='ReUpload Resume']");
    private By passwordLength = By.xpath("//span[text()='Password must be atleast of 8 characters long']");
    private By passwordError = By.xpath("//span[text()='Password must consist atleast one Uppercase character']");
    private By passwordBlank = By.xpath("//span[text()='Password is required']");

    private By eyeIconPath = By.xpath("//span[@class='input-group-text']");

    private By checkbox = By.xpath("//input[@type='checkbox']");
    private By passwordRequiredPath = By.xpath("//span[text()='Password is Required']");
    private By terms = By.xpath("//a[normalize-space()='Data Processing Addendum (\"DPA\")']");
    private By createButton = By.xpath("//button[text()='Create Account']");
    private By passwordFieldPath = By.xpath("//input[@formcontrolname='password']");
    private By firstInvalid = By.xpath("//span[text()=' First name is Invalid ']");
    private By lastNameInavlid = By.xpath("//span[text()=' Last name is Invalid ']");
    private By emailInavlid = By.xpath("//span[text()=' Email is not Valid ']");
    private By middleNameInvalid = By.xpath("//span[text()=' Middle name is Invalid ']");
    private By firtNameRequired = By.xpath("//span[text()=' First name is Required ']");
    private By lastNameRequired = By.xpath("//span[text()=' Last name is Required ']");
    private By yopmailEmailField=By.xpath("//input[@class='ycptinput']");
    boolean submitCheck = false;

    public SignUp_page(WebDriver driver) {
        this.driver = driver;
    }

    public void sendInviteFromSuperAdmin(String Email, String Subscription, String OrderNumber) throws InterruptedException {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.findElement(inviteButton).click();
        Thread.sleep(3000);
        if (driver.findElement(inviteTitle).isDisplayed()) {
            Thread.sleep(3000);
            driver.findElement(emailFeild).click();
            driver.findElement(emailFeild).sendKeys(Email);
        WebElement subsrciptiondropdown = driver.findElement(subscriptionDropdown);
        Select subscription = new Select(subsrciptiondropdown);
        subscription.selectByVisibleText(Subscription);
        driver.findElement(orderNumber).sendKeys(OrderNumber);
        if (driver.findElement(submit).isEnabled()) {
            driver.findElement(submit).click();

        } else {
            System.out.println("Submit is disabled");
        } }
    }
    public void register(String Email) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.get("https://yopmail.com/wm");
        driver.findElement(yopmailEmailField).sendKeys(Email);
        driver.findElement(yopmailEmailField).sendKeys(Keys.ENTER);
        driver.navigate().refresh();
        Thread.sleep(5000);
        System.out.println("Register button is displayed");
        wait.until(ExpectedConditions.elementToBeClickable(registerButton));
        driver.findElement(registerButton).click();
        Thread.sleep(4000);
        String window1 = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        wait.until(driver -> driver.getWindowHandles().size() > 1);
        Set<String> handles = driver.getWindowHandles();
        for (String window : handles) {
            if (!window.equals(window1)) {
                driver.switchTo().window(window);
                break;
            }


        }}
        public void signUpPage() throws InterruptedException {
        Thread.sleep(3000);
        if (driver.findElement(signUptitle).isDisplayed()) {
            String title = driver.findElement(signUptitle).getText();
            System.out.println(title);
        }}
    public void firstNameField(String FirstName) {
        driver.findElement(firstNameTextfield).sendKeys(FirstName);
    }

    public void middleNameField(String MiddleName) {
        driver.findElement(middleNameTextField).sendKeys(MiddleName);
    }


    public void lastNameField(String LastName) {
        driver.findElement(lastNameTextField).sendKeys(LastName);

    }

    public void verifyEmailField() {
        if (driver.findElement(emailFeild).isDisplayed()) {
            System.out.println("Email field is displayed");
        }
    }


    public void passwordField(String PasswordField) {
        driver.findElement(passwordFieldPath).sendKeys(PasswordField);
        driver.findElement(eyeIconPath).click();
        driver.findElement(eyeIconPath).click();
    }


    public void resumeUpload(String UploadFile) {
        driver.findElement(uploadResumeButton).sendKeys(UploadFile);
    }


    public void reUpload(String ReUploadFile) {
        driver.findElement(refresh).sendKeys(ReUploadFile);
    }


    public void checkBox() {
        driver.findElement(checkbox).click();
    }


    public void terms() {
        driver.findElement(terms).click();
    }


    public void CreateAccountButton(String ErrorMessage, String ToasterMessage) {
        if (driver.findElement(createButton).isEnabled()) {
            driver.findElement(createButton).click();
        } else if (driver.findElement(signUptitle).isDisplayed()) {
            driver.findElement(signUptitle).click();
            int value = 0;
            if (ErrorMessage.contains("First name is Invalid")) {
                value = 1;
                System.out.println("Case 1 Will Run");
            }
            if (ErrorMessage.contains("Middle name is Invalid")) {
                value = 2;
                System.out.println("Case 2 Will Run");
            }
            if (ErrorMessage.contains("Last name is Invalid")) {
                value = 3;
                System.out.println("Case 3 Will Run");
            }
            if (ErrorMessage.contains("atleast of 8 characters")) {
                value = 4;
                System.out.println("Case 4 Will Run");
            }
            if (ErrorMessage.contains("atleast one Uppercase")) {
                value = 5;
                System.out.println("Case 5 Will Run");
            }
            if (ErrorMessage.contains("First name is Required")) {
                value = 6;
                System.out.println("Case 6 Will Run");
            }
            if (ErrorMessage.contains("Last name is Required")) {
                value = 7;
                System.out.println("Case 7 Will Run");
            }
            if (ErrorMessage.contains("Password is Required")) {
                value = 8;
                System.out.println("Case 8 Will Run");
            }

            switch (value) {
                case 1:
                    if (driver.findElement(firstInvalid).isEnabled()) {
                        String firstname = driver.findElement(firstInvalid).getText();
                        System.out.println(firstname);
                        Assert.assertEquals(ErrorMessage, firstname);
                        submitCheck = true;
                    }
                    break;
                case 2:
                    if (driver.findElement(middleNameInvalid).isDisplayed()) {
                        String middlename = driver.findElement(middleNameInvalid).getText();
                        System.out.println(middlename);
                        Assert.assertEquals(ErrorMessage, middlename);
                        submitCheck = true;
                    }
                    break;
                case 3:
                    if (driver.findElement(lastNameInavlid).isDisplayed()) {
                        String lastname = driver.findElement(lastNameInavlid).getText();
                        System.out.println(lastname);
                        Assert.assertEquals(ErrorMessage, lastname);
                        submitCheck = true;
                    }
                    break;
                case 4:
                    if (driver.findElement(passwordError).isDisplayed()) {
                        String passworderror = driver.findElement(passwordError).getText();
                        System.out.println(passworderror);
                        Assert.assertEquals(ErrorMessage, passworderror);
                        submitCheck = true;
                    }
                    break;
                case 5:
                    if (driver.findElement(passwordLength).isDisplayed()) {
                        String passwordlength = driver.findElement(passwordLength).getText();
                        System.out.println(passwordlength);
                        Assert.assertEquals(ErrorMessage, passwordlength);
                        submitCheck = true;
                    }
                    break;
                case 6:
                    if (driver.findElement(firtNameRequired).isDisplayed()) {
                        String firstrequired = driver.findElement(firtNameRequired).getText();
                        System.out.println(firstrequired);
                        Assert.assertEquals(ErrorMessage, firstrequired);
                        submitCheck = true;
                    }
                    break;
                case 7:
                    if (driver.findElement(lastNameRequired).isDisplayed()) {
                        String lastnamerequired = driver.findElement(lastNameRequired).getText();
                        System.out.println(lastnamerequired);
                        Assert.assertEquals(ErrorMessage, lastnamerequired);
                        submitCheck = true;
                    }
                    break;
                case 8:
                    if (driver.findElement(passwordRequiredPath).isDisplayed()) {
                        String passwordrequired = driver.findElement(passwordRequiredPath).getText();
                        System.out.println(passwordrequired);
                        Assert.assertEquals(ErrorMessage, passwordrequired);

                    } else {
                        System.out.println("Error is not displayed");
                    }
            }}}}
