package com.vassarlabs.projectname.page;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import javax.xml.transform.sax.SAXResult;
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
    private By download = By.xpath("//div[@class='dropdown-menu show']//button[@class='dropdown-item ng-star-inserted'][normalize-space()='Download Details']");
    private By downloadPopup = By.xpath("//span[text()='Are you sure to Download ?']");
    private By downloadYes = By.xpath("//button[@type='submit']");
    private By email = By.xpath("//div[@class='dropdown-menu show']//button[@class='dropdown-item'][normalize-space()='Email']");
    private By emailTitle = By.xpath("//h4[text()='Send Email']");
    private By subject = By.xpath("//input[@id='subject']");
    private By body = By.xpath("//textarea[@id='body']");
    private By bodyError = By.xpath("//span[@class='error-text ng-star-inserted']");
    private By emailSentSuccesfu = By.xpath("//div[text()=' Email Send Successfully ']");
    private By askToAssociate = By.xpath("//div[text()=' Association request successfully sent to superadmin ']");
    private By asociate = By.xpath("//div[@class='dropdown-menu show']//button[@class='dropdown-item ng-star-inserted'][normalize-space()='Ask to Associate']");
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
        driver.findElement(search).sendKeys(ComplianceExpert);
        Thread.sleep(3000);
    }

    public void inviteCompliance() throws InterruptedException {
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

    public void emailFiled(String Email, String ErrorMessage, String ToasterMessage) {
        if (isElementPresent(submit) && driver.findElement(submit).isEnabled()) {
            driver.findElement(submit).click();
            check = false;
            System.out.println("Submit button is enabled and clicked.");
        }
        // Check if the invitation was successful
        else if (isElementPresent(invitedSuccesful) && driver.findElement(invitedSuccesful).isDisplayed()) {
            String invite = driver.findElement(invitedSuccesful).getText();
            Assert.assertEquals(ToasterMessage, invite);
            check = false;
            System.out.println("Invitation was successful.");
        }
        // Check if there is a blank invite error
        else if (isElementPresent(blankInviteError) && driver.findElement(blankInviteError).isDisplayed()) {
            String blankError = driver.findElement(blankInviteError).getText();
            Assert.assertEquals(ErrorMessage, blankError);
            check = false;
            System.out.println("Blank invite error displayed.");
        }
        // Check if there is an invalid invite error
        else if (isElementPresent(invalidInviteError) && driver.findElement(invalidInviteError).isDisplayed()) {
            String invalid = driver.findElement(invalidInviteError).getText();
            Assert.assertEquals(ErrorMessage, invalid);
            check = false;
            System.out.println("Invalid invite error displayed.");
        }
        // If submit button is disabled and no errors are displayed
        else if (check) {
            driver.findElement(close).click();
            System.out.println("Submit button is disabled. Close button clicked.");
            check = false;
        }
        // Default case if none of the above conditions are met
        else {
            System.out.println("Email not sent and no specific error found.");
        }
    }

    // Method to check if an element is present in the DOM
    private boolean isElementPresent(By locator) {
        return !driver.findElements(locator).isEmpty();
    }

    // Method to check if the submit button is displayed
    public void submitButtonOfExpert() {
        if (isElementPresent(submit) && driver.findElement(submit).isDisplayed()) {
            System.out.println("Submit displayed");
        }
    }

    public void ellipsis() throws InterruptedException {
        driver.findElement(verticaEllipsis).click();
        Thread.sleep(3000);
        String options = driver.findElement(menuOptions).getText();
        System.out.println(options + "are displayed");
    }

    public void downloaddetails() throws InterruptedException {
       if( driver.findElement(By.xpath("//h3[normalize-space()='johnson tester']")).isDisplayed()){
        driver.findElement(download).isDisplayed();
        driver.findElement(download).click();}
        if (driver.findElement(downloadPopup).isDisplayed()) {
            driver.findElement(downloadYes).click();
        } else {
            System.out.println("download pop is not displayed");

        }
    }
    public void emailBodyAndSubject(String Email, String ToasterMessage, String ErrorMessage) throws InterruptedException {
        ellipsis();
driver.findElement(subject).sendKeys(Email);
driver.findElement(body).sendKeys(Email);
if(driver.findElement(bodyError).isDisplayed()){
    String bodyerror=driver.findElement(bodyError).getText();
    System.out.println(bodyerror);
    Assert.assertEquals(ErrorMessage, bodyerror);
} else if (driver.findElement(emailSentSuccesfu).isDisplayed()) {
    String sentEmail=driver.findElement(emailSentSuccesfu).getText();
    System.out.println(sentEmail);
    Assert.assertEquals(ToasterMessage,sentEmail);
}
else {
    System.out.println("email not sent");
}
    }


    public void askToassociate(String ToasterMessage) throws InterruptedException {
        ellipsis();
driver.findElement(asociate).click();
if(driver.findElement(askToAssociate).isDisplayed()){
    String associate=driver.findElement(askToAssociate).getText();
    System.out.println(associate);
    Assert.assertEquals(ToasterMessage,associate);
}
else {
    System.out.println("Ask to assoiate button is not clicked");
}
    }


    public void emailPopup() throws InterruptedException {
        driver.findElement(email).click();
        driver.findElement(emailTitle).isDisplayed();
        Thread.sleep(3000);
    }
}
