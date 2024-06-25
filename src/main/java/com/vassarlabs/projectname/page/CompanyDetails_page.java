package com.vassarlabs.projectname.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class CompanyDetails_page {
    private WebDriver driver;
    private By companydetailsModule = By.xpath("//span[text()='Company Details']");
    private By editButton = By.xpath("//button[@class='btn btn-primary btn-sm']"); // edit_button = driver.find_element(By.XPATH, "//button[contains(@class, 'btn') and contains(@class, 'btn-primary') and contains(@class, 'btn-sm') and .//i[contains(@class, 'bi') and contains(@class, 'bi-pencil-square')]]")

    private By replaceIcon = By.xpath("//button[@class='btn upload-btn btn-sm ng-star-inserted']");
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
    private By blankPhone = By.xpath("Phone number is required");
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

    public void addDetails(String CompanyName, String FEINno, String URL, String DUNSno, String Phone, String AddressOne, String AddressTwo, String ZipCode, String City) throws InterruptedException {
        editButton();
        driver.findElement(companyNameFiled).sendKeys(CompanyName);
        driver.findElement(fienNo).sendKeys(FEINno);
        driver.findElement(enterDate).sendKeys("12/12/2020");
        driver.findElement(uRL).sendKeys(URL);
        driver.findElement(dUNSno).sendKeys(DUNSno);
        driver.findElement(phone).sendKeys(Phone);
        driver.findElement(address1).sendKeys(AddressOne);
        driver.findElement(address2).sendKeys(AddressTwo);
        driver.findElement(zipCode).sendKeys(ZipCode);
        driver.findElement(cityField).sendKeys(City);
        WebElement stateDropdownElement = driver.findElement(stateDropdown);
        Select stateSelect = new Select(stateDropdownElement);
        stateSelect.selectByIndex(10);


    }

    public void profile(String File) throws InterruptedException {
        Thread.sleep(11000);
        driver.findElement(browse).sendKeys(File);
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
            driver.findElement(ok).isDisplayed();
            Thread.sleep(3000);
            driver.findElement(ok).click();
        }
    }


    public void cancelButton() throws InterruptedException {
//        driver.findElement(editButton).click();
        Thread.sleep(3000);
        driver.findElement(cancelButton).click();
        Thread.sleep(3000);
    }


    public void submitbutton(String CompanyName, String FEINno, String URL, String DUNSno, String Phone, String AddressOne, String AddressTwo, String ZipCode, String City, String CompanyDetailsUpdatedToaster, String ErrorMessage) throws InterruptedException {
        Thread.sleep(3000);
        System.out.println(driver.findElements(invalidFein).size());
        if (driver.findElements(invalidFein).size()>0) {
            System.out.println("Invalid Fein Found");
            String feinError = driver.findElement(invalidFein).getText();
            System.out.println(feinError);
            Assert.assertEquals(ErrorMessage, feinError);
            submit = true;
        } else if (driver.findElements(invalidDuns).size()>0) {
            String dunsError = driver.findElement(invalidDuns).getText();
            System.out.println(dunsError);
            Assert.assertEquals(ErrorMessage, dunsError);
            submit = true;
        } else if (driver.findElements(invalidPhone).size()>0) {
            String phoneError = driver.findElement(invalidPhone).getText();
            System.out.println(phoneError);
            Assert.assertEquals(ErrorMessage, phoneError);
            submit = true;
        } else if (driver.findElements(invalidZipCode).size()>0) {
            String zipCodeError = driver.findElement(invalidZipCode).getText();
            System.out.println(zipCodeError);
            Assert.assertEquals(ErrorMessage, zipCodeError);
            submit = true;
        } else if (driver.findElements(blankCompanyName).size()>0) {
            String blankCompany = driver.findElement(blankCompanyName).getText();
            System.out.println(blankCompany);
            Assert.assertEquals(ErrorMessage, blankCompany);
            submit = true;
        } else if (driver.findElements(blankFien).size()>0) {
            String blankfein = driver.findElement(blankFien).getText();
            System.out.println(blankfein);
            Assert.assertEquals(blankfein, ErrorMessage);
            submit = true;
        } else if (driver.findElements(blankPhone).size()>0) {
            String blankphone = driver.findElement(blankPhone).getText();
            System.out.println(blankphone);
            Assert.assertEquals(ErrorMessage, blankphone);
            submit = true;
        } else if (driver.findElements(blankZipcCode).size()>0) {
            String blankzip = driver.findElement(blankZipcCode).getText();
            System.out.println(blankzip);
            Assert.assertEquals(ErrorMessage, blankzip);
            submit = true;
        } else if (driver.findElements(blankCity).size()>0 ) {
            submit = true;
            String blankcity = driver.findElement(blankCity).getText();
            System.out.println(blankcity);
            Assert.assertEquals(ErrorMessage, blankcity);
        } else if (!submit) {
            driver.findElement(submitButton).click();
        }

    }


    public void replaceProfile(String File, String ReplaceFile) throws InterruptedException {
        driver.findElement(editButton).click();
        Thread.sleep(3000);
        driver.findElement(replaceIcon).click();
        driver.findElement(replaceIcon).sendKeys(ReplaceFile);
    }


}





