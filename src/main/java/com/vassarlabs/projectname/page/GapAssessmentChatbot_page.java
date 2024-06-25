package com.vassarlabs.projectname.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class GapAssessmentChatbot_page {
    private WebDriver driver;
    private By gapAssessmentModule=By.xpath("//a[@class='nav-link active']");
    private By genAichatbot=By.xpath("//div[@class='chat-box']");
    private By newAssessment=By.xpath("//button[normalize-space()='Create New Assessment']");
    private By textfield=By.xpath("//input[@placeholder='Enter your Message']");
    private By sendicon=By.xpath("//i[@class='bi bi-send-fill']");
    private By chatbotAskingForName=By.xpath("//p[contains(text(),'Welcome! Could you please provide the title or nam')]");
    private By chatbotaskingforLevel=By.xpath("//li[normalize-space()='Level 1']");
    private By chatbotAskingforImpact=By.xpath("//li[normalize-space()='High Impact for Confidentiality']");
    private By technicalFootprintHyperlink=By.xpath("//a[@class='redirect-to']");
    private By technicalFootprintTitle=By.xpath("//div[@class='title']");
    private By maximize=By.xpath("//div[@class='wraper']//button[1]");
//    private By uploadedFile=By.xpath("//table//tr//td[2]//span[text()='jhkfd']");


    public GapAssessmentChatbot_page(WebDriver driver) {
        this.driver=driver;
    }
    public void gapAsessmentmodule() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(gapAssessmentModule));
        wait.until(ExpectedConditions.elementToBeClickable(gapAssessmentModule)).click();
        driver.findElement(gapAssessmentModule).click();
        Thread.sleep(3000);
    }
    public void createAssessment(String AssessmentName, String Level, String Impact) throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(gapAssessmentModule));
        wait.until(ExpectedConditions.elementToBeClickable(gapAssessmentModule)).click();
        driver.findElement(gapAssessmentModule).click();
        Thread.sleep(3000);
        if (driver.findElement(genAichatbot).isDisplayed()) {
            Thread.sleep(7000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(newAssessment));
            Thread.sleep(10000);
            wait.until(ExpectedConditions.elementToBeClickable(newAssessment));
            Thread.sleep(3000);
            driver.findElement(newAssessment).click();
            Thread.sleep(3000);

            WebElement textField = wait.until(ExpectedConditions.visibilityOfElementLocated(textfield));
            textField.sendKeys(AssessmentName);

            WebElement sendIcon = wait.until(ExpectedConditions.elementToBeClickable(sendicon));
            sendIcon.click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(chatbotaskingforLevel));
            textField = wait.until(ExpectedConditions.visibilityOfElementLocated(textfield));
            textField.sendKeys(Level);

            sendIcon = wait.until(ExpectedConditions.elementToBeClickable(sendicon));
            sendIcon.click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(chatbotAskingforImpact));
            textField = wait.until(ExpectedConditions.visibilityOfElementLocated(textfield));
            textField.sendKeys(Impact);

            sendIcon = wait.until(ExpectedConditions.elementToBeClickable(sendicon));
            sendIcon.click();

            System.out.println("Assessment added Successfully");
        } else {
            System.out.println("Gap Assessment button is not displayed");
        }
    }

    public void technicalFootprint(String AssessmentName, String Level, String Impact) throws Throwable {
        createAssessment( AssessmentName, Level, Impact);
        driver.findElement(technicalFootprintHyperlink).isDisplayed();
        Thread.sleep(3000);
        driver.findElement(technicalFootprintHyperlink).click();
        Thread.sleep(3000);
        driver.findElement(technicalFootprintTitle).isDisplayed();
        Thread.sleep(3000);
    }


    public void verifyTable(String AssessmentName) throws InterruptedException {
        driver.findElement(gapAssessmentModule).isDisplayed();
        Thread.sleep(3000);
        driver.findElement(gapAssessmentModule).click();
        Thread.sleep(3000);
        WebElement ele= driver.findElement(By.xpath("//table//tr//td[2]//span[text()='"+AssessmentName+"']"));
        ele.click();
        Thread.sleep(3000);
       String data=driver.findElement(By.xpath("//table//tr//td[2]//span[text()='"+AssessmentName+"']")).getText();
        System.out.println(data);
        Assert.assertEquals(AssessmentName, data);
    }


}
