package com.vassarlabs.projectname.page;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Chatbot_page {
    private WebDriver driver;
    private By maximise=By.xpath("//i[@class='bi bi-fullscreen']");
    private By minimize=By.xpath( "//i[@class='bi bi-fullscreen-exit']");
    private By micIcon=By.xpath("//i[@class='bi bi-mic-mute-fill']");
    private By micicon=By.xpath("bi bi-mic-fill");
    private By history=By.xpath("//i[@class='bi bi-envelope-at-fill']");
    private By historyToaster=By.xpath("//div[text()=' No chat history found ']");
    private By collpase=By.xpath("//span[@class='arrow-icon']");
    private By textfield=By.xpath("//input[@placeholder='Enter your Message']");
    private By sendIcon=By.xpath("//i[@class='bi bi-send-fill']");
    private By userProfileButton=By.xpath("//button[text()='User Profile']");
    private By companyDetails=By.xpath("//button[text()='Company Details']");
    private By manageUsers=By.xpath("//button[text()='Manage Users']");
    private By myProfileTitle=By.xpath("//div[text()=' My Profile']");
    private By companyDeatilsTitle=By.xpath("//div[text()=' Company Details']");
    private By manageUsersTitle=By.xpath("//div[text()=' Manage Users']");
    private By genAichatbot = By.xpath("//div[@class='chat-box']");

    public Chatbot_page(WebDriver driver) {
        this.driver=driver;
    }

    public void genAiChatbot() throws InterruptedException {
        if(driver.findElement(genAichatbot).isDisplayed()){
            String chatbot=driver.findElement(genAichatbot).getText();
            System.out.println(chatbot);
            Thread.sleep(3000);
        }
    }

    public void maximize() throws InterruptedException {
        driver.findElement(maximise).click();
        Thread.sleep(3000);
        driver.findElement(minimize).click();
    }

    public void mic() throws InterruptedException {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(micIcon));
        driver.findElement(micIcon).click();
        Thread.sleep(3000);
        driver.findElement(micicon).click();
    }

    public void collpase() {
        driver.findElement(collpase).click();
    }

    public void textfield(String TextfieldData) {
        driver.findElement(textfield).sendKeys(TextfieldData);
    }

    public void send() {
        driver.findElement(sendIcon).click();
    }

    public void userProfile() {
        driver.findElement(userProfileButton).click();
          if(driver.findElement(myProfileTitle).isDisplayed()){
              System.out.println("My Profile page is displayed");
          }
    }

    public void manageUser() throws InterruptedException {
        driver.findElement(manageUsers).click();
        if(driver.findElement(manageUsersTitle).isDisplayed()){
            System.out.println("Manage users page is displayed");
            Thread.sleep(3000);
        }
    }

    public void companyDetails() {
        driver.findElement(companyDetails).click();
        if(driver.findElement(companyDeatilsTitle).isDisplayed()){
            System.out.println("Company details page is displayed");
        }
    }
}
