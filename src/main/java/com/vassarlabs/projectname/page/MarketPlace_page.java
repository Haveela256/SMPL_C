package com.vassarlabs.projectname.page;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class MarketPlace_page {
    private WebDriver driver;
    private By module = By.xpath("//span[normalize-space()='Hire an Expert']");
    private By marketPlaceTitle = By.xpath("//div[@class='title']");
    private By search = By.xpath("//input[@placeholder='Search']");
    private By inviteBUtton = By.xpath("//button[normalize-space()='Invite your compliance expert']");
    private By popupTitle = By.xpath("//h4[@class='modal-title']");
    private By close = By.xpath("//button[@aria-label='Close']");
    private By cancel = By.xpath("//button[normalize-space()='Cancel']");
    private By emailTextField = By.xpath("//input[@id='email']");
    private By invitedSuccesful = By.xpath("//div[text()=' Invited Successfully ']");
    private By submit = By.xpath("//button[text()='Submit']");
    private By invalidInviteError = By.xpath("//span[text()=' Email is Invalid ']");
    private By blankInviteError = By.xpath("//span[text()=' Email is Required ']");
    private By verticaEllipsis = By.xpath("//i[@class='bi bi-three-dots-vertical']");
    private By menuOptions = By.xpath("//div[@class='dropdown-menu show']");
    private By download = By.xpath("//button[text()='Download Details']");
    private By downloadPopup = By.xpath("//span[text()='Are you sure to Download ?']");
    private By downloadYes = By.xpath("//button[@type='submit']");
    private By email = By.xpath("//div[@class='dropdown-menu show']//button[@class='dropdown-item'][normalize-space()='Email']");
    private By emailTitle = By.xpath("//h4[text()='Send Email']");
    private By subject = By.xpath("//input[@id='subject']");
    private By body = By.xpath("//textarea[@id='body']");
    private By bodyError = By.xpath("//span[@class='error-text ng-star-inserted']");
    private By emailSentSuccesfu = By.xpath("//div[text()=' Email Send Successfully ']");
    private By askToAssociate = By.xpath("//div[text()=' Association request successfully sent to superadmin ']");
    private By asociate = By.xpath("//button[text()='Ask to Associate']");
    private By collapse=By.xpath("//i[@class='bi bi-chevron-down']");
    boolean check = false;

    public MarketPlace_page(WebDriver driver) {
        this.driver = driver;
    }


    public void clickONMarketPlace() {
        driver.findElement(module).click();
        driver.findElement(marketPlaceTitle).isDisplayed();
    }

    public void searchExpert(String ComplianceExpert) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Thread.sleep(5000);
        driver.findElement(search).sendKeys(ComplianceExpert);
        driver.findElement(search).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
    }

    public void inviteCompliance() throws InterruptedException {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(inviteBUtton));
        driver.findElement(inviteBUtton).click();
        Thread.sleep(3000);
    }

    public void inviteEXpertPopup() {
        if (driver.findElement(popupTitle).isDisplayed()) {
            driver.findElement(close).click();
        }
    }

    public void cancelButton() {
        if (driver.findElement(popupTitle).isDisplayed()) {
            driver.findElement(cancel).click();

            }
}
    public void emailFiled(String Email, String ErrorMessage, String ToasterMessage) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        boolean check = true;  // Initialize check variable

        try {
            driver.findElement(inviteBUtton).click();
            Thread.sleep(3000);
            driver.findElement(emailTextField).sendKeys(Email);
            Thread.sleep(2000);
            if (driver.findElement(submit).isEnabled()) {
                Thread.sleep(3000);
                wait.until(ExpectedConditions.elementToBeClickable(submit));
                driver.findElement(submit).click();
                Thread.sleep(3000);
                check = false;
                System.out.println("Submit button is enabled and clicked.");
            } else if (!driver.findElement(submit).isEnabled()) {
                driver.findElement(popupTitle).click();
                Thread.sleep(3000);
                try {
                    if (driver.findElement(invitedSuccesful).isDisplayed()) {
                        String invite = driver.findElement(invitedSuccesful).getText();
                        Assert.assertEquals(ToasterMessage, invite);
                        check = false;
                        System.out.println("Invitation was successful.");
                    }
                } catch (NoSuchElementException e) {
                    // Handle case where invitedSuccesful element is not found
                }

                try {
                    if (driver.findElement(blankInviteError).isDisplayed()) {
                        Thread.sleep(5000);
                        String blankError = driver.findElement(blankInviteError).getText();
                        Assert.assertEquals(ErrorMessage, blankError);
                        check = false;

                        // Log and ensure the element is clickable
                        System.out.println("Waiting for the close button to be clickable.");
                        wait.until(ExpectedConditions.elementToBeClickable(close));

                        // Extra wait to ensure element is ready
                        Thread.sleep(3000);

                        // Try clicking with JavaScript if normal click doesn't work
                        WebElement closeButton = driver.findElement(close);
                        System.out.println("Attempting to click the close button.");
                        try {
                            closeButton.click();
                        } catch (Exception e) {
                            System.out.println("Normal click didn't work, trying JavaScript click.");
                            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", closeButton);
                        }

                    }}catch (NoSuchElementException e) {
                    // Handle case where blankInviteError element is not found
                }

                try {
                    if (driver.findElement(invalidInviteError).isDisplayed()) {
                        Thread.sleep(4000);
                        String invalid = driver.findElement(invalidInviteError).getText();
                        Assert.assertEquals(ErrorMessage, invalid);
                        check = false;
                        wait.until(ExpectedConditions.elementToBeClickable(close));
                        driver.findElement(close).click();
                        Thread.sleep(3000);
                        System.out.println("Invalid invite error displayed.");
                    }
                } catch (NoSuchElementException e) {
                    // Handle case where invalidInviteError element is not found
                }

                if (check) {
                    driver.findElement(close).click();
                    System.out.println("Submit button is disabled. Close button clicked.");
                    check = false;
                } else {
                    System.out.println("Email not sent and no specific error found.");
                }
            }
        } catch (NoSuchElementException e) {
            System.out.println("An expected element was not found: " + e.getMessage());
        } catch (InterruptedException e) {
            System.out.println("Thread sleep was interrupted: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }}
    // Method to check if the submit button is displayed

    public void ellipsisFHireExpert(String ExpertName) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        String xpath = "//h3[contains(text(), '" + ExpertName + "')]/parent::div/parent::div//a/i";

        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            wait.until(ExpectedConditions.elementToBeClickable(element));
            Thread.sleep(5000);
            element.click();

            // Wait for menu options to be displayed
            WebElement menuOptionsElement = wait.until(ExpectedConditions.visibilityOfElementLocated(menuOptions));
            String options = menuOptionsElement.getText();
            System.out.println(options + " are displayed");
        } catch (TimeoutException e) {
            System.err.println("Timeout waiting for element with xpath: " + xpath);
        }
        catch (NoSuchElementException e) {
            System.out.println("An expected element was not found: " + e.getMessage());}
    }

    public void downloaddetails(String ExpertName) throws InterruptedException {
        try {
        if (driver.findElement(By.xpath("//h3[contains(text(),'"+ExpertName+"')]/parent::div/parent::div//a/i")).isDisplayed()) {
            Thread.sleep(3000);
            if (driver.findElement(download).isDisplayed()) {
                Thread.sleep(3000);
                driver.findElement(download).click();
                if (driver.findElement(downloadPopup).isDisplayed()) {
                    driver.findElement(downloadYes).click();
                }
            } else {
                System.out.println("download popup is not displayed");

            }
        }}
    catch (NoSuchElementException e) {
                System.out.println("An expected element was not found: " + e.getMessage());}}

    public void emailBodyAndSubject(String Email, String ToasterMessage, String ErrorMessage, String Subject, String Body) throws InterruptedException {
        try{
        if (driver.findElement(emailTitle).isDisplayed()){
            driver.findElement(subject).sendKeys(Subject);
            Thread.sleep(3000);
            driver.findElement(body).sendKeys(Body);
            if (driver.findElement(submit).isEnabled()){
                Thread.sleep(3000);
                driver.findElement(submit).click();} else if (!driver.findElement(submit).isEnabled()) {
                driver.findElement(emailTitle).click();
              if (driver.findElement(bodyError).isDisplayed()) {
                Thread.sleep(3000);
                String bodyerror = driver.findElement(bodyError).getText();
                System.out.println(bodyerror);
                Assert.assertEquals(ErrorMessage, bodyerror);
                driver.findElement(close).click();
            } else if (driver.findElement(emailSentSuccesfu).isDisplayed()) {
                Thread.sleep(3000);
                String sentEmail = driver.findElement(emailSentSuccesfu).getText();
                System.out.println(sentEmail);
                Assert.assertEquals(ToasterMessage, sentEmail);
            }  else {
                System.out.println("email not sent");

            }
        }}}catch (NoSuchElementException e) {
            System.out.println("An expected element was not found: " + e.getMessage());}}

    public void askToassociate(String ToasterMessage, String ExpertName) throws InterruptedException {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        try {
        if (driver.findElement(By.xpath("//h3[contains(text(),'"+ExpertName+"')]/parent::div/parent::div//a/i")).isDisplayed()) {
//            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath(" //div[@class='market-wraper']//h3[text()='"+ExpertName+"']")));
//
//// Click using JavaScript
//            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath(" //div[@class='market-wraper']//h3[text()='"+ExpertName+"']")));
            wait.until(ExpectedConditions.presenceOfElementLocated(verticaEllipsis));
            wait.until(ExpectedConditions.visibilityOfElementLocated(verticaEllipsis));
            wait.until(ExpectedConditions.elementToBeClickable(verticaEllipsis));

// Scroll the element into view
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(verticaEllipsis));

// Click using JavaScript
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(verticaEllipsis));

            Thread.sleep(5000);
            String options = driver.findElement(menuOptions).getText();
            System.out.println(options + " are displayed");
            Thread.sleep(3000);
            if (driver.findElement(asociate).isDisplayed()) {
                Thread.sleep(3000);
                driver.findElement(asociate).click();

                if (driver.findElement(askToAssociate).isDisplayed()) {
                    String associate = driver.findElement(askToAssociate).getText();
                    System.out.println(associate);
                    Assert.assertEquals(ToasterMessage, associate);
                } else {
                    System.out.println("Ask to associate option is not displayed after clicking.");
                }
            } else {
                System.out.println("Associate button is not displayed.");
            }} }catch (NoSuchElementException e) {
                System.out.println("An expected element was not found: " + e.getMessage());

            }}
    public void emailOption(String ExpertName) throws InterruptedException {
        try{
        if (driver.findElement(By.xpath("//h3[contains(text(),'"+ExpertName+"')]/parent::div/parent::div//a/i")).isDisplayed()) {
            driver.findElement(verticaEllipsis).click();
            Thread.sleep(3000);
            driver.findElement(email).click();
            Thread.sleep(3000);
        }
    }catch (NoSuchElementException e) {
            System.out.println("An expected element was not found: " + e.getMessage());
        }}}