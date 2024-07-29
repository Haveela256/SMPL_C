package com.vassarlabs.projectname.page;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

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
    private By askToUnAssociate=By.xpath("//div[text()=' Un-Association request successfully sent to superadmin ']");
    private By asociate = By.xpath("//button[text()='Ask to Associate']");
    private By unasociate=By.xpath("//button[text()='Ask to Un-Associate']");
    private By collapse = By.xpath("//i[@class='bi bi-chevron-down']");
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
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
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
        if (driver.findElement(inviteBUtton).isDisplayed()) {
            driver.findElement(inviteBUtton).click();
            Thread.sleep(3000);
            driver.findElement(emailTextField).sendKeys(Email);
            Thread.sleep(2000);
            List<WebElement> submitbutton = driver.findElements(submit);
            if (driver.findElement(submit).isEnabled()) {
                Thread.sleep(3000);
                WebElement ele = submitbutton.get(0);
                Thread.sleep(8000);
                driver.findElement(submit).click();
                System.out.println("Submit button is enabled and clicked.");
            } if(!driver.findElement(submit).isEnabled()) {
                driver.findElement(popupTitle).click();
                System.out.println("Submit button is disabled");
            }
            List<WebElement> inviteSuccess = driver.findElements(invitedSuccesful);
            if (!inviteSuccess.isEmpty() && inviteSuccess.get(0).isDisplayed()) {
                WebElement ele1 = inviteSuccess.get(0);
                String invite = driver.findElement(invitedSuccesful).getText();
                Assert.assertEquals(ToasterMessage, invite);
                System.out.println("Invitation was successful.");
            } else {
                System.out.println("Invite successful toaster is not displayed");
            }
            List<WebElement> blankerror = driver.findElements(blankInviteError);
            if (!blankerror.isEmpty() && blankerror.get(0).isDisplayed()) {
                WebElement ele2 = blankerror.get(0);
                Thread.sleep(5000);
                String blankError = driver.findElement(blankInviteError).getText();
                Assert.assertEquals(ErrorMessage, blankError);
                System.out.println("Waiting for the close button to be clickable.");
                wait.until(ExpectedConditions.elementToBeClickable(close));
                Thread.sleep(3000);
                driver.findElement(close).click();
                System.out.println("Attempting to click the close button.");}
            else {
                System.out.println("Blank error is not displayed");
                List<WebElement> invaliderror = driver.findElements(invalidInviteError);
                if (!invaliderror.isEmpty() && invaliderror.get(0).isDisplayed()) {
                    WebElement ele3 = invaliderror.get(0);
                    String invalid = driver.findElement(invalidInviteError).getText();
                    Assert.assertEquals(ErrorMessage, invalid);
                    wait.until(ExpectedConditions.elementToBeClickable(close));
                    driver.findElement(cancel).click();
                    Thread.sleep(3000);
                    System.out.println("Invalid invite error displayed.");
                } else {
                    System.out.println("Invalid error is not displayed");
                }

            }}}

public void ellipsisFHireExpert(String ExpertName) throws InterruptedException {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    String xpath = "//h3[contains(text(), '" + ExpertName + "')]/parent::div/parent::div//a/i";
    List<WebElement> menu = driver.findElements(menuOptions);
    if (!menu.isEmpty() && menu.get(0).isDisplayed()) {
        WebElement elee = menu.get(0);
        String option=driver.findElement(menuOptions).getText();
        System.out.println(option + " are displayed");
    } else {
        System.out.println("menu options re not displayed");
    }}

public void downloaddetails(String ExpertName) throws InterruptedException {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
    List<WebElement> complExpert = driver.findElements(By.xpath("//h3[contains(text(),'" + ExpertName + "')]/parent::div/parent::div//a/i"));
    if (!complExpert.isEmpty() && complExpert.get(0).isDisplayed()) {
        WebElement element = complExpert.get(0);
        List<WebElement> dOwnload = driver.findElements(download);
        if (!dOwnload.isEmpty() && dOwnload.get(0).isDisplayed()) {
            WebElement elee2 = dOwnload.get(0);
            driver.findElement(download).click();
            if (driver.findElement(downloadPopup).isDisplayed()) {
                driver.findElement(downloadYes).click();
            } else {
                System.out.println("download popup is not displayed");
            }
        }else {
            System.out.println("Expert is not displayed");

        }
    }
}

public void emailBodyAndSubject(String Email, String ToasterMessage, String ErrorMessage, String Subject, String Body) throws InterruptedException {
    List<WebElement> emailHeading = driver.findElements(emailTitle);
    if (!emailHeading.isEmpty() && emailHeading.get(0).isDisplayed()) {
        WebElement element = emailHeading.get(0);
            Thread.sleep(3000);
            driver.findElement(body).sendKeys(Body);
            if (driver.findElement(submit).isEnabled()) {
                Thread.sleep(5000);
                driver.findElement(submit).click();
            } else if (!driver.findElement(submit).isEnabled()) {
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
                }

                }}
    else {
        System.out.println("email not sent");
}}

public void askToassociate(String ToasterMessagee, String ExpertName, String ToasterMessageee) throws InterruptedException {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    List<WebElement> exPert = driver.findElements(By.xpath("//h3[contains(text(),'" + ExpertName + "')]/parent::div/parent::div//a/i"));
    if (!exPert.isEmpty() && exPert.get(0).isDisplayed()) {
        WebElement element = exPert.get(0);
            wait.until(ExpectedConditions.presenceOfElementLocated(verticaEllipsis));
            wait.until(ExpectedConditions.visibilityOfElementLocated(verticaEllipsis));
            wait.until(ExpectedConditions.elementToBeClickable(verticaEllipsis));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(verticaEllipsis));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(verticaEllipsis));
            Thread.sleep(5000);
            String options = driver.findElement(menuOptions).getText();
            System.out.println(options + " is displayed");
            Thread.sleep(3000);
        List<WebElement> asSociate = driver.findElements(asociate);
        if (!asSociate.isEmpty() && asSociate.get(0).isDisplayed()) {
            WebElement element1 = asSociate.get(0);
            if (driver.findElement(asociate).isDisplayed()) {
                Thread.sleep(7000);
                driver.findElement(asociate).click();
                if (driver.findElement(askToAssociate).isDisplayed()) {
                    String associate = driver.findElement(askToAssociate).getText();
                    System.out.println(associate);
                    Assert.assertEquals(ToasterMessagee, associate);
                } else {
                    List<WebElement> unasSociate = driver.findElements(unasociate);
                    if (!unasSociate.isEmpty() && unasSociate.get(0).isDisplayed()) {
                        WebElement element2 = asSociate.get(0);
                        driver.findElement(unasociate).click();
                        if (driver.findElement(askToUnAssociate).isDisplayed()) {
                            String associate1 = driver.findElement(askToUnAssociate).getText();
                            System.out.println(associate1);
                            Assert.assertEquals(ToasterMessageee, associate1);
                        }
                    } else {
                        System.out.println("Associate button is not displayed.");
                    }
                }
            } else {
                System.out.println("Expert is not displayed");
            }}}

}

public void emailOption(String ExpertName) throws InterruptedException {
    List<WebElement> eXpert = driver.findElements(By.xpath("//h3[contains(text(),'" + ExpertName + "')]/parent::div/parent::div//a/i"));
    if (!eXpert.isEmpty() && eXpert.get(0).isDisplayed()) {
        WebElement element = eXpert.get(0);
            driver.findElement(verticaEllipsis).click();
            Thread.sleep(3000);
            driver.findElement(email).click();
            Thread.sleep(3000);
        }else {
        System.out.println("Expert is not displayed");
    }
    }
}