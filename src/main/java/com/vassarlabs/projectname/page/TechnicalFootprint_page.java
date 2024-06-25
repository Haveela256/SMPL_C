package com.vassarlabs.projectname.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class TechnicalFootprint_page {
    private WebDriver driver;
    private By technicalFootprintModule = By.xpath("//span[text()='Technical Footprint']");

    private By title = By.xpath("//div[text()=' Technical Footprint']");

    private By firstQuestion = By.xpath("//button[text()='1. Is your company fully Remote?']");

    private By secondQuestion = By.xpath("//button[text()='2. Number of privileged users']");

    private By thirdQuestion = By.xpath("//button[text()='3. What are the general descriptions and types of Controlled Unclassified Information (CUI) that are processed, stored, or transmitted by the system, and how are they determined and documented?']");

    private By fourthQuestion = By.xpath("//button[text()='4. Is all hardware and software maintained and owned by the organization?']");

    private By fifthQuestion = By.xpath("//button[text()='5. What is the function/purpose of the system?']");

    private By sixthQuestion = By.xpath("//button[text()='6. What collaboration and productivity tools are you using?']");

    private By seventhQuestion = By.xpath("//button[text()='7. What security systems are you using?']");

    private By eighthQuestion = By.xpath("//button[text()='8. What Project Management Systems do you utilize?']");

    private By ninethQuestion = By.xpath("//button[text()='9. What Financial Management Systems do you utilize?']");

    private By tenthQuestion = By.xpath("//button[text()='10. What Supply Chain Management Systems do you utilize?']");

    private By eleventhQuestion = By.xpath("//button[text()='11. What Human Resources System are you currently using?']");

    private By twelthQuestion = By.xpath("//button[text()='12. Finally, what CMM Systems do you utilize?']");


    private By thirdQuestionTexfield = By.xpath("//button[text()='3. What are the general descriptions and types of Controlled Unclassified Information (CUI) that are processed, stored, or transmitted by the system, and how are they determined and documented?']//following::div[3]//input");

    private By fifthQuestionTextfield = By.xpath("//button[text()='5. What is the function/purpose of the system?']//following::div[3]//input");

    private By seconfQuestionTextfield = By.xpath("//button[text()='2. Number of privileged users']//following::div[3]//input");

    private By cancelButton = By.xpath("//button[text()='Cancel']");

    private By submitButton = By.xpath("//button[text()='Submit']");

    private By detailsUpdatedToaster = By.xpath("//div[text()=' Company security details saved successfully ']");

    private By technicalFootprint = By.xpath("//div[text()=' Technical Footprint']");
    private By gapAssessment = By.xpath("//div[text()='Gap Assessment']");


    public TechnicalFootprint_page(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnmodule() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.findElement(technicalFootprintModule).isDisplayed();
        wait.until(ExpectedConditions.elementToBeClickable(technicalFootprintModule));
        driver.findElement(technicalFootprintModule).click();
        Thread.sleep(3000);
    }


    public void answertheQuestions(String FirstQstn, String SecondQstnNoOfUsers, String ThirdQstnTypeOfCUI, String FourthQstn, String FifthQstnPurposeOfSystem, String SixthQstn, String SeventhQstn, String EighthQstn, String NinethQstn, String TenthQstn, String EleventhQstn, String TwelthQstn, String TextfieldData, String ToasterMessage) throws InterruptedException {
        if (driver.findElement(technicalFootprint).isDisplayed()) {
            driver.findElement(firstQuestion).click();
            Thread.sleep(3000);
            if (driver.findElement(By.xpath("//div[@formarrayname='" + FirstQstn + "']")).isDisplayed()) {
                driver.findElement(By.xpath("//div[@formarrayname='" + FirstQstn + "']")).click();
                Thread.sleep(3000);
            }
            driver.findElement(secondQuestion).click();
            Thread.sleep(3000);
            driver.findElement(seconfQuestionTextfield).sendKeys(SecondQstnNoOfUsers);
            driver.findElement(thirdQuestion).click();
            Thread.sleep(3000);
            driver.findElement(thirdQuestion).sendKeys(ThirdQstnTypeOfCUI);
            driver.findElement(fourthQuestion).click();
            Thread.sleep(3000);
            if (driver.findElement(By.xpath("//div[@formarrayname='" + FourthQstn + "']")).isDisplayed()) {
                driver.findElement(By.xpath("//div[@formarrayname='" + FourthQstn + "']")).click();
                Thread.sleep(3000);
            }
            driver.findElement(fifthQuestion).click();
            Thread.sleep(3000);
            driver.findElement(fifthQuestion).sendKeys(FirstQstn);
            driver.findElement(sixthQuestion).click();
            Thread.sleep(3000);
            if (driver.findElement(By.xpath("//div[@formarrayname='" + SixthQstn + "']")).isDisplayed()) {
                driver.findElement(By.xpath("//div[@formarrayname='" + SixthQstn + "']")).click();
                Thread.sleep(3000);
            }
            driver.findElement(seventhQuestion).click();
            Thread.sleep(3000);
            if (driver.findElement(By.xpath("//div[@formarrayname='" + SeventhQstn + "']")).isDisplayed()) {
                driver.findElement(By.xpath("//div[@formarrayname='" + SeventhQstn + "']")).click();
                Thread.sleep(3000);
            }
            driver.findElement(eighthQuestion).click();
            Thread.sleep(3000);
            if (driver.findElement(By.xpath("//div[@formarrayname='" + EighthQstn + "']")).isDisplayed()) {
                driver.findElement(By.xpath("//div[@formarrayname='" + EighthQstn + "']")).click();
                Thread.sleep(3000);
            }
            driver.findElement(ninethQuestion).click();
            Thread.sleep(3000);
            if (driver.findElement(By.xpath("//div[@formarrayname='" + NinethQstn + "']")).isDisplayed()) {
                driver.findElement(By.xpath("//div[@formarrayname='" + NinethQstn + "']")).click();
                Thread.sleep(3000);
            }
            driver.findElement(tenthQuestion).click();
            Thread.sleep(3000);
            if (driver.findElement(By.xpath("//div[@formarrayname='" + TenthQstn + "']")).isDisplayed()) {
                driver.findElement(By.xpath("//div[@formarrayname='" + TenthQstn + "']")).click();
                Thread.sleep(3000);
            }
            driver.findElement(eleventhQuestion).click();
            Thread.sleep(3000);
            if (driver.findElement(By.xpath("//div[@formarrayname='" + EleventhQstn + "']")).isDisplayed()) {
                driver.findElement(By.xpath("//div[@formarrayname='" + EleventhQstn + "']")).click();
                Thread.sleep(3000);
            }
            driver.findElement(twelthQuestion).click();
            Thread.sleep(3000);
            if (driver.findElement(By.xpath("//div[@formarrayname='" + TwelthQstn + "']")).isDisplayed()) {
                driver.findElement(By.xpath("//div[@formarrayname='" + TwelthQstn + "']")).click();
                Thread.sleep(3000);
            }
        }

    }

    public void cancelbutton() throws InterruptedException {
        driver.findElement(cancelButton).click();
        Thread.sleep(3000);
        driver.findElement(gapAssessment).isDisplayed();
    }

    public void submitButton(String FirstQstn, String SecondQstnNoOfUsers, String ThirdQstnTypeOfCUI, String FourthQstn, String FifthQstnPurposeOfSystem, String SixthQstn, String SeventhQstn, String EighthQstn, String NinethQstn, String TenthQstn, String EleventhQstn, String TwelthQstn, String TextfieldData, String ToasterMessage) throws InterruptedException {
        answertheQuestions(FirstQstn, SecondQstnNoOfUsers, ThirdQstnTypeOfCUI, FourthQstn, FifthQstnPurposeOfSystem, SixthQstn, SeventhQstn, EighthQstn, NinethQstn, TenthQstn, EleventhQstn, TwelthQstn, TextfieldData, ToasterMessage);
        if(driver.findElement(submitButton).isEnabled()){
            Thread.sleep(3000);
            driver.findElement(submitButton).click();
            if (driver.findElement(detailsUpdatedToaster).isDisplayed()){
                Thread.sleep(3000);
                String techFootprintToaster=driver.findElement(detailsUpdatedToaster).getText();
                System.out.println(techFootprintToaster);
                Assert.assertEquals(ToasterMessage, techFootprintToaster);
            }
        }
    }
}
