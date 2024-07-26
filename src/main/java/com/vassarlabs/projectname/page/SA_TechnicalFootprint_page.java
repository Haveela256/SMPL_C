package com.vassarlabs.projectname.page;

import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SA_TechnicalFootprint_page {
    private WebDriver driver;
    private By firstQuestion = By.xpath("//button[text()='1. Is your company fully Remote?']");

    private By secondQuestion = By.xpath("//button[text()='2. Number of privileged users']");
    private By thirdQuestion=By.xpath("//button[text()='3. What are the general descriptions and types of Controlled Unclassified Information (CUI) that are processed, stored, or transmitted by the system, and how are they determined and documented?']");

    private By thirdQuestionText = By.xpath("//textarea[@placeholder='Enter here']");

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

    private By fifthQuestionTextfield = By.xpath("//button[text()='5. What is the function/purpose of the system?']//following::div//textarea[@placeholder='Enter here']");

    private By seconfQuestionTextfield = By.xpath("//button[text()='2. Number of privileged users']//following::input");


    public SA_TechnicalFootprint_page(WebDriver driver) {
        this.driver=driver;
    }

    public void panels() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        if (driver.findElement(firstQuestion).isDisplayed()) {
            driver.findElement(firstQuestion).click();

        }

        driver.findElement(thirdQuestion).click();
        if (driver.findElement(fourthQuestion).isDisplayed()) {
            driver.findElement(fourthQuestion).click();}
        if (driver.findElement(fifthQuestion).isDisplayed()) {
            Thread.sleep(3000);
            driver.findElement(fifthQuestion).click();
        }
        if (driver.findElement(sixthQuestion).isDisplayed()) {
            driver.findElement(sixthQuestion).click();
        }
        if (driver.findElement(seventhQuestion).isDisplayed()) {
            driver.findElement(seventhQuestion).click();
        }
        if (driver.findElement(eighthQuestion).isDisplayed()) {
            driver.findElement(eighthQuestion).click();}
        if (driver.findElement(ninethQuestion).isDisplayed()) {
            driver.findElement(ninethQuestion).click();
           }
        if (driver.findElement(tenthQuestion).isDisplayed()) {
            driver.findElement(tenthQuestion).click();
        }
        if (driver.findElement(eleventhQuestion).isDisplayed()) {
            driver.findElement(eleventhQuestion).click();
             }
        if (driver.findElement(twelthQuestion).isDisplayed()) {
            driver.findElement(twelthQuestion).click();
            }
}}
