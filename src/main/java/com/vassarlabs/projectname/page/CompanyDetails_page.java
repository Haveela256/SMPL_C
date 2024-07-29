package com.vassarlabs.projectname.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

public class CompanyDetails_page {
    private WebDriver driver;
    private By companydetailsModule = By.xpath("//span[text()='Company Details']");
    private By editButton = By.xpath("//button[@class='btn btn-primary btn-sm']"); // edit_button = driver.find_element(By.XPATH, "//button[contains(@class, 'btn') and contains(@class, 'btn-primary') and contains(@class, 'btn-sm') and .//i[contains(@class, 'bi') and contains(@class, 'bi-pencil-square')]]")

    private By replaceIcon = By.xpath("//button[@class='btn upload-btn btn-sm ng-star-inserted']/i[@class='bi bi-repeat']");
    private By companyNameFiled = By.xpath("//input[@placeholder='Enter Company Name']");
    private By fienNo = By.xpath("//input[@formcontrolname='feinNo']");

    private By uRL = By.xpath("//input[@formcontrolname='url']");
    private By dUNSno = By.xpath("//input[@formcontrolname='dunsNo']");
    private By phone = By.xpath("//input[@formcontrolname='phone']");
    private By datepicker = By.xpath("//input[@formcontrolname='date']");
    private By monthPath = By.xpath("//span[text()='May']");
    private By yearPath = By.xpath("//span[text()='2024']");
    private By dayPath = By.xpath("//table//tr//td//span[text()='2']");
    private By address1 = By.xpath("//input[@formcontrolname='address1']");
    private By address2 = By.xpath("//input[@formcontrolname='address2']");
    private By zipCode = By.xpath("//input[@formcontrolname='zipCode']");
    private By cityField = By.xpath("//input[@formcontrolname='city']");
    private By stateDropdown = By.xpath("//select[@formcontrolname='state']");
    private By cancelButton = By.xpath("//button[text()='Cancel']");
    private By submitButton = By.xpath("//button[text()='Submit']");
    private By companyDetailsToaster = By.xpath("//div[text()=' Company details updated Successfully ']");
    private By enterDate = By.xpath("//input[@placeholder='MM/DD/YYYY']");
    private By invalidFein = By.xpath("//span[text()='FEIN No. pattern must be followed 12-1234567']");
    private By invalidDuns = By.xpath("//span[text()='DUNS No should be 9 digit number']");
    private By invalidPhone = By.xpath("//span[text()='Enter a valid phone number 123-123-1234']");
    private By invalidZipCode = By.xpath("//span[text()='Zipcode should contain 5 digits']");
    private By blankCompanyName = By.xpath("//span[text()='Company Name is required']");
    private By blankFien = By.xpath("//span[text()=' FEIN No. is required']");
    private By blankPhone = By.xpath("//span[text()='Phone number is required']");
    private By blankZipcCode = By.xpath("//span[text()=' FEIN No. is required']");
    private By blankCity = By.xpath("//span[text()='City name is required']");
    private By browse = By.xpath("//span[text()='Browse']/parent::div/parent::div/div/input[@type='file']");
    private By ok = By.xpath("//button[normalize-space()='Ok']");
    private By cropPopup = By.xpath("//h4[text()='Crop Image']");
    private By cropPopupCancel = By.xpath("//button[@type='button'][normalize-space()='Cancel']");
    private By cropPlus = By.xpath("//i[@class='bi bi-plus-lg']");
    private By cropMinus = By.xpath("//div[@class='modal-body']//button[2]");
    private By imageSize = By.xpath("//span[@class='ngx-ic-resize ngx-ic-bottomleft ng-star-inserted']");
    private By fitImage = By.xpath("//button[@id='imageFitting']");

    private By cropPopupTitle = By.xpath("//h4[@class='modal-title']");
    boolean submit = false;

    public CompanyDetails_page(WebDriver driver) {
        this.driver = driver;

    }


    public void editButton() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.findElement(companydetailsModule).click();
        Thread.sleep(7000);
        wait.until(ExpectedConditions.elementToBeClickable(editButton));
        if (driver.findElement(editButton).isDisplayed()) {
            Thread.sleep(3000);
            driver.findElement(editButton).click();
            System.out.println("Edit button clicked");
        } else {
            System.out.println("Edit button is not displayed");
        }
    }


    public void addDetails(String CompanyName, String FEINno, String URL, String DUNSno, String Phone, String AddressOne, String AddressTwo, String ZipCode, String City) throws InterruptedException, AWTException {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        editButton();
        wait.until(ExpectedConditions.elementToBeClickable(companyNameFiled)).clear();
        driver.findElement(companyNameFiled).sendKeys(CompanyName);

        wait.until(ExpectedConditions.elementToBeClickable(fienNo)).clear();
        driver.findElement(fienNo).sendKeys(FEINno);

        wait.until(ExpectedConditions.elementToBeClickable(enterDate)).clear();
        driver.findElement(enterDate).sendKeys("12/12/2020");

        wait.until(ExpectedConditions.elementToBeClickable(uRL)).clear();
        driver.findElement(uRL).sendKeys(URL);

        wait.until(ExpectedConditions.elementToBeClickable(dUNSno)).clear();
        driver.findElement(dUNSno).sendKeys(DUNSno);

        Robot robot = new Robot();
        WebElement phoneElement = wait.until(ExpectedConditions.elementToBeClickable(phone));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value='';", phoneElement);
        phoneElement.sendKeys(Phone);

        wait.until(ExpectedConditions.elementToBeClickable(address1)).clear();
        driver.findElement(address1).sendKeys(AddressOne);

        wait.until(ExpectedConditions.elementToBeClickable(address2)).clear();
        driver.findElement(address2).sendKeys(AddressTwo);

        wait.until(ExpectedConditions.elementToBeClickable(zipCode)).clear();
        driver.findElement(zipCode).sendKeys(ZipCode);

        wait.until(ExpectedConditions.elementToBeClickable(cityField)).clear();
        driver.findElement(cityField).sendKeys(City);

// Select a value from the state dropdown
        WebElement stateDropdownElement = wait.until(ExpectedConditions.elementToBeClickable(stateDropdown));
        Select stateSelect = new Select(stateDropdownElement);
        stateSelect.selectByIndex(10);


    }

    public void profile(String File, String ReplaceFile) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        List<WebElement> browseLink = driver.findElements(browse);
        List<WebElement> replaceButton = driver.findElements(replaceIcon);

        if (!browseLink.isEmpty() && browseLink.get(0).isDisplayed()) {
            WebElement ele = browseLink.get(0);
            ele.sendKeys(File);
            System.out.println("File selected");

            wait.until(ExpectedConditions.visibilityOfElementLocated(cropPopupTitle));
            if (driver.findElement(cropPopupTitle).isDisplayed()) {
                performCropActions(wait);
            }
        } else if (!replaceButton.isEmpty() && replaceButton.get(0).isDisplayed()) {
            WebElement ele1 = replaceButton.get(0);
            System.out.println("Replace icon is displayed");
            ele1.sendKeys(ReplaceFile);
            System.out.println("File uploaded");

            wait.until(ExpectedConditions.visibilityOfElementLocated(cropPopupTitle));
            if (driver.findElement(cropPopupTitle).isDisplayed()) {
                performCropActions(wait);
            }
        } else {
            System.out.println("Neither Browse hyperlink nor Replace icon is displayed");
        }
    }

    private void performCropActions(WebDriverWait wait) {
        driver.findElement(cropMinus).click();
        driver.findElement(cropPlus).click();
        driver.findElement(fitImage).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(ok));
        driver.findElement(ok).click();
    }



    public void cancelButton() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(cancelButton).click();
        Thread.sleep(3000);
    }


    public void submitbutton(String CompanyName, String FEINno, String URL, String DUNSno, String Phone, String AddressOne, String AddressTwo, String ZipCode, String City, String ErrorMessage, String CompanyDetailsUpdatedToaster,String ReplaceFile, String File) throws InterruptedException {
        Thread.sleep(3000);

// Initialize variables
        System.out.println(ErrorMessage);
        int value = 0;
        boolean submit = false; // Make sure 'submit' is initialized

// Determine the value based on the error message
        if (ErrorMessage.contains("Company Name")) {
            value = 1;
            System.out.println("Case 1 Will Run");
        } else if (ErrorMessage.contains("FEIN No")) {
            value = 2;
            System.out.println("Case 2 Will Run");
        } else if (ErrorMessage.contains("DUNS No")) {
            value = 3;
            System.out.println("Case 3 Will Run");
        } else if (ErrorMessage.contains("Phone number")) {
            value = 4;
            System.out.println("Case 4 Will Run");
        } else if (ErrorMessage.contains("Zipcode")) {
            value = 5;
            System.out.println("Case 5 Will Run");
        } else if (ErrorMessage.contains("City")) {
            value = 6;
            System.out.println("Case 6 Will Run");
        }

// Handle each case based on the value
        switch (value) {
            case 1:
                if (driver.findElements(blankCompanyName).size() > 0) {
                    String blankCompany = driver.findElement(blankCompanyName).getText();
                    System.out.println(blankCompany);
                    Assert.assertEquals(ErrorMessage, blankCompany);
                    submit = true;
                }
                break;
            case 2:
                if (driver.findElements(invalidFein).size() > 0) {
                    String feinError = driver.findElement(invalidFein).getText();
                    System.out.println("Invalid Fein Found");
                    System.out.println(feinError);
                    Assert.assertEquals(ErrorMessage, feinError);
                    submit = true;
                } else if (driver.findElements(blankFien).size() > 0) {
                    String blankfein = driver.findElement(blankFien).getText();
                    System.out.println(blankfein);
                    Assert.assertEquals(ErrorMessage, blankfein);
                    submit = true;
                }
                break;
            case 3:
                if (driver.findElements(invalidDuns).size() > 0) {
                    String dunsError = driver.findElement(invalidDuns).getText();
                    System.out.println(dunsError);
                    Assert.assertEquals(ErrorMessage, dunsError);
                    submit = true;
                }
                break;
            case 4:
                if (driver.findElements(invalidPhone).size() > 0) {
                    String phoneError = driver.findElement(invalidPhone).getText();
                    System.out.println(phoneError);
                    Assert.assertEquals(ErrorMessage, phoneError);
                    submit = true;
                } else if (driver.findElements(blankPhone).size() > 0) {
                    String blankphone = driver.findElement(blankPhone).getText();
                    System.out.println(blankphone);
                    Assert.assertEquals(ErrorMessage, blankphone);
                    submit = true;
                }
                break;
            case 5:
                if (driver.findElements(blankZipcCode).size() > 0) {
                    String blankzip = driver.findElement(blankZipcCode).getText();
                    System.out.println(blankzip);
                    Assert.assertEquals(ErrorMessage, blankzip);
                    submit = true;
                } else if (driver.findElements(invalidZipCode).size() > 0) {
                    String zipCodeError = driver.findElement(invalidZipCode).getText();
                    System.out.println(zipCodeError);
                    Assert.assertEquals(ErrorMessage, zipCodeError);
                    submit = true;
                }
                break;
            case 6:
                if (driver.findElements(blankCity).size() > 0) {
                    String blankcity = driver.findElement(blankCity).getText();
                    System.out.println(blankcity);
                    Assert.assertEquals(ErrorMessage, blankcity);
                    submit = true;
                }
                break;
            default:
                submit = false;
        }

// Check if the submit button should be clicked
        if (submit) {
            WebElement submitBtn = driver.findElement(submitButton);
            if (submitBtn.isEnabled()) {
                submitBtn.click();
            } else {
                System.out.println("Submit button is disabled.");
            }
        } else {
            System.out.println("No valid case matched. Submit button will not be clicked.");
        }}



    public void replaceProfile(String File, String ReplaceFile) throws InterruptedException {
//        if (!submit) {
//            driver.findElement(editButton).click();
//        } else if (driver.findElement(replaceIcon).isDisplayed()){
//            Thread.sleep(9000);
//            driver.findElement(replaceIcon).sendKeys(ReplaceFile);
//        }
}
    }









