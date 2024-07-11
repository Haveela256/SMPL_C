package com.vassarlabs.projectname.page;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

 public class SA_Landing_page {
    private WebDriver driver;
    private By controlCenterTitle = By.xpath("//div[text()=' Control Center']");
    private By hamburgerPath = By.xpath("//button[@class='btn btn-side-nav']//i[@class='bi bi-list']");
    private By smplcLogo = By.xpath("//img[@alt='SMPL logo']");
    private By sortDropdown = By.xpath("//select[@aria-label='Default select example']");

    private By toggle = By.xpath("//span[@class='switch']");
    private By dateCreatedOn = By.xpath("//select[@aria-label='Default select example']");
    private By inviteButton = By.xpath("//button[text()='Invite']");
    private By inviteTitle = By.xpath("//h4[text()='Invite']");
    private By InviteCloseButton = By.xpath("//button[@aria-label='Close']");
    private By emailFeild = By.xpath("//input[@formcontrolname='email']");
    private By emailError = By.xpath("//span[text()=' Email is Required ']");
    private By subsrcriptionError = By.xpath("//span[text()='Subscription is Required']");
    private By orderNumerError = By.xpath("//span[text()='Order number is Required']");
    private By emailInvalid = By.xpath("//span[text()=' Email is Invalid ']");
    private By subscriptionDropdown = By.xpath("//select[@formcontrolname='subscription']");
    private By orderNumber = By.xpath("//input[@formcontrolname='orderNumber']");
    private By submit = By.xpath("//button[text()='Submit']");
    private By subscriptionCard = By.xpath("//span[text()='Subscription :']");
    private By ellipsis = By.xpath("//i[@class='bi bi-three-dots-vertical']");
    private By invitedSuccessfully = By.xpath("//div[text()=' Invited successfully ']");
    private By lock = By.xpath("//div[@class='dropdown-menu show']//button[@class='dropdown-item'][normalize-space()='Lock']");
    private By lockToaster = By.xpath("Locked successfully");
    private By unlock = By.xpath("//div[@class='dropdown-menu show']//button[@class='dropdown-item'][normalize-space()='Unlock']");
    private By unlockToaster = By.xpath("//div[text()=' Unlocked successfully ']");
    private By delete = By.xpath("//div[@class='dropdown-menu show']//button[@class='dropdown-item'][normalize-space()='Delete']");
    private By deletePopup = By.xpath("//span[@class='delete-text-title']");
    private By deletYes = By.xpath("//button[@type='submit']");
    private By renew = By.xpath("//div[@class='dropdown-menu show']//button[@class='dropdown-item'][normalize-space()='Renew']");
    private By emailButton = By.xpath("//div[@class='dropdown-menu show']//button[@class='dropdown-item'][normalize-space()='Email']");
    private By emailPopupTitle = By.xpath("//h4[text()='Send Email']");
    private By subjectTextfield = By.xpath("//input[@id='subject']");
    private By body = By.xpath("//textarea[@id='body']");
    private By bodyError = By.xpath("//span[text()=' Email Body is Required ']");
    private By sendEmailSubmitButton = By.xpath("//button[text()='Submit']");
    private By emailSentToaster = By.xpath("//div[text()=' Email Send Successfully ']");
    private By deletToaster = By.xpath("//div[text()=' Deleted successfully ']");
private By renewToaster=By.xpath("//div[text()=' Account has been renewed ']");
private By companyCard=By.xpath("//div[@class='card-body']//following::span[text()='litetest3@yopmail.com']/../../../..");
private By controlCenter=By.xpath("//div[contains(text(),'Control Center')]");
private By switchmodule=By.xpath("//span[normalize-space()='Switch Company']");
     private By userProfileIcons = By.xpath("//img[@class='profile-style']");
     private By logoutPath = By.xpath("//button[normalize-space()='Logout']");
     private By signInPage = By.xpath("//span[@class='sub-title']");
     private By signIntoCompany=By.xpath("//div[text()=' Sign In Into Company Successfull ']");
    public SA_Landing_page(WebDriver driver) {
        this.driver = driver;
    }

    public void hamburger() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        // Click on hamburger menu
        driver.findElement(hamburgerPath).isDisplayed();
        Thread.sleep(3000);
        driver.findElement(hamburgerPath).click();
        wait.until(ExpectedConditions.elementToBeClickable(hamburgerPath));
        Thread.sleep(3000);
        driver.findElement(hamburgerPath).click();
        Thread.sleep(3000);
    }

    public void smplLogo() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.findElement(smplcLogo).isDisplayed();
        Thread.sleep(3000);
        driver.findElement(smplcLogo).click();
        Thread.sleep(3000);
        System.out.println("SMPL-C Logo clicked");
    }

    public void sortDropdown() throws InterruptedException {
        WebElement webElement = driver.findElement(sortDropdown);
        Select select = new Select(webElement);
        select.selectByIndex(1);
        Thread.sleep(3000);
        select.selectByIndex(2);
        Thread.sleep(3000);
        select.selectByIndex(3);
        Thread.sleep(3000);
    }

    public void toggle() {
        driver.findElement(toggle).click();
        driver.findElement(dateCreatedOn).isDisplayed();
        System.out.println("Unsigned companies are displayed");
    }

    public void dateCreated() throws InterruptedException {
        WebElement date = driver.findElement(dateCreatedOn);
        Select s = new Select(date);
        s.selectByIndex(1);
        Thread.sleep(3000);
        s.selectByIndex(2);
        Thread.sleep(3000);
    }

    public void invitepopup() throws InterruptedException {
        driver.findElement(toggle).click();
        Thread.sleep(3000);
        driver.findElement(inviteButton).click();
        Thread.sleep(3000);
    }

    public void emailField(String Email, String ErrorMessage) throws InterruptedException {
        if (driver.findElement(inviteTitle).isDisplayed()) {
            Thread.sleep(3000);
            driver.findElement(emailFeild).click();
                    driver.findElement(emailFeild).sendKeys(Email);
        }
    }

    public void subscription(String Type, String ErrorMessage) {
        WebElement subsrciptiondropdown = driver.findElement(subscriptionDropdown);
        Select subscription = new Select(subsrciptiondropdown);

        subscription.selectByVisibleText(Type);
    }

    public void orderNumber(String OrderNumber, String ErrorMessage) {
        driver.findElement(orderNumber).sendKeys(OrderNumber);
    }

    public void submitButton(String ToasterMessage, String ErrorMessage) throws InterruptedException {
        if (driver.findElement(submit).isEnabled()) {
            driver.findElement(submit).click();
            Thread.sleep(3000);
        } else if (driver.findElement(emailError).isDisplayed()) {
            String emailErrorMessage = driver.findElement(emailError).getText();
            System.out.println(emailErrorMessage);
            Assert.assertEquals(ErrorMessage, emailErrorMessage);
        } else if (driver.findElement(emailInvalid).isDisplayed()) {
            String emailBlank = driver.findElement(emailInvalid).getText();
            System.out.println(emailBlank);
            Assert.assertEquals(ErrorMessage, emailBlank);
        } else if (driver.findElement(subsrcriptionError).isDisplayed()) {
            String subscriptionErrorText = driver.findElement(subsrcriptionError).getText();
            System.out.println(subscriptionErrorText);
            Assert.assertEquals(ErrorMessage, subscriptionErrorText);
        } else if (driver.findElement(orderNumerError).isDisplayed()) {
            String orderError = driver.findElement(orderNumerError).getText();
            System.out.println(orderError);
            Assert.assertEquals(ErrorMessage, orderError);
        } else if (driver.findElement(invitedSuccessfully).isDisplayed()) {
            String invited = driver.findElement(invitedSuccessfully).getText();
            System.out.println(invited);
            Assert.assertEquals(ToasterMessage, invited);
        } else {
            System.out.println("Submit is clicked");
        }
    }

    public void companyCard() {
        String card = driver.findElement(subscriptionCard).getText();
        System.out.println(card + "is displayed");
    }

    public void ellipsis() throws InterruptedException {
        driver.findElement(ellipsis).click();
        Thread.sleep(3000);
    }

    public void lock(String CompanyCard, String ToasterMessage) throws InterruptedException {
        ellipsis();
        try {
        if (driver.findElement(By.xpath("//h5[text()='" + CompanyCard + "']")).isDisplayed()) {
            driver.findElement(lock).click();
            Thread.sleep(3000);
            if(driver.findElement(lockToaster).isDisplayed()){
                Thread.sleep(3000);
            String locktoaster = driver.findElement(lockToaster).getText();
            System.out.println(locktoaster);
            Assert.assertEquals(ToasterMessage, locktoaster);
        }}

    } catch (InvalidSelectorException e) {
         System.out.println("Invalid selector error: " + e.getMessage());}}

    public void unlock(String CompanyCard, String ToasterMessage) throws InterruptedException {
        ellipsis();
        try {
        if (driver.findElement(By.xpath("//h5[text()='" + CompanyCard + "']")).isDisplayed()) {
            driver.findElement(unlock).click();
            String unlockatoaster = driver.findElement(unlockToaster).getText();
            System.out.println(unlockatoaster);
            Assert.assertEquals(ToasterMessage, unlockatoaster);
        }
    } catch (InvalidSelectorException e) {
         System.out.println("Invalid selector error: " + e.getMessage());}}

    public void delete(String DeleteCard, String ToasterMessage) throws InterruptedException {
        ellipsis();
        try {
            if (driver.findElement(By.xpath("//h5[text()='" + DeleteCard + "']")).isDisplayed()) {
                driver.findElement(delete).click();
            }
        } catch (NoSuchElementException e) {
            System.out.println("Element not found: " + e.getMessage());
        }
    }
    public void deletePopup(String ToasterMessage) throws InterruptedException {
        try {
        if (driver.findElement(deletePopup).isDisplayed()) {
            driver.findElement(deletYes).click();
            if (driver.findElement(deletToaster).isDisplayed()) {
                String toaster = driver.findElement(deletToaster).getText();
                System.out.println(toaster);
                Assert.assertEquals(ToasterMessage, toaster);
            }}}
    catch (NoSuchElementException e) {
                System.out.println("Element not found: " + e.getMessage());
            }}

    public void emailOption(String CompanyCard, String Subject, String Body, String EmailSentToaster) throws InterruptedException {
        ellipsis();
        if (driver.findElement(By.xpath("//h5[text()='" + CompanyCard + "']")).isDisplayed()) {
            driver.findElement(emailButton).click();
            if (driver.findElement(emailPopupTitle).isDisplayed()) {
                driver.findElement(subjectTextfield).sendKeys(Subject);
                driver.findElement(body).sendKeys(Body);
                if(driver.findElement(sendEmailSubmitButton).isEnabled()){
                    driver.findElement(sendEmailSubmitButton).click();
                }
                if(driver.findElement(emailSentToaster).isDisplayed()){
                    String emailsuccessful=driver.findElement(emailSentToaster).getText();
                    System.out.println(emailsuccessful);
                    Assert.assertEquals(EmailSentToaster, emailsuccessful);
                }
                        else if (driver.findElement(bodyError).isDisplayed()) {
                    String bodyerror = driver.findElement(bodyError).getText();
                    System.out.println(bodyerror);
                }else {
                    System.out.println("Submit button is clicked");

                }
    }}}


    public void renew(String CompanyCard, String ToasterMessage) throws InterruptedException {
        ellipsis();
        if (driver.findElement(By.xpath("//h5[text()='" + CompanyCard + "']")).isDisplayed()) {
            driver.findElement(renew).click();
            if(driver.findElement(renewToaster).isDisplayed()){
                String renew=driver.findElement(renewToaster).getText();
                System.out.println(renew);
                Assert.assertEquals(ToasterMessage,renew);
            }
        }
    }

    public void company(String CompanyCard, String ToasterMessage) throws InterruptedException {
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h5[text()='"+CompanyCard+"']/../../..")));
    driver.findElement(By.xpath("//h5[text()='"+CompanyCard+"']/../../..")).click();
    Thread.sleep(3000);
        if(driver.findElement(signIntoCompany).isDisplayed()){
            Thread.sleep(3000);
            String switchcompany=driver.findElement(signInPage).getText();
            System.out.println(switchcompany);
            Assert.assertEquals(ToasterMessage, switchcompany);
    }
else {
            System.out.println("Switch company failed");
        }}
    public void companyPage() {
    driver.findElement(controlCenter).isDisplayed();
        System.out.println("Control Center is displayed");
    }

    public void switchModule() throws InterruptedException {
driver.findElement(switchmodule).click();
Thread.sleep(3000);
    }

    public void userProfile() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.findElement(userProfileIcons).click();
        wait.until(ExpectedConditions.elementToBeClickable(userProfileIcons));
        Thread.sleep(3000);
        driver.findElement(logoutPath).isDisplayed();
        Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(logoutPath));
        driver.findElement(logoutPath).click();
        driver.findElement(signInPage).isDisplayed();
        String signInPageTitleText = driver.findElement(signInPage).getText();
        System.out.println(signInPageTitleText);
    }


}

