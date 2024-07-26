package com.vassarlabs.projectname.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SA_ControlCenter_page {
    private WebDriver driver;
    private By controlCenterTitle = By.xpath("//div[text()=' Control Center']");
    private By welcome = By.xpath("//div[contains(text(), ' Welcome')]");
    private By productSubscribed = By.xpath("//span[text()=' L-2 Certification Prep ']");
    private By lightBulb = By.xpath("//i[@class='bi bi-lightbulb-fill']");

    public SA_ControlCenter_page(WebDriver driver) {
        this.driver=driver;
    }

    public void home() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.findElement(controlCenterTitle).isDisplayed();
        Thread.sleep(3000);
        String title = driver.findElement(controlCenterTitle).getText();
        System.out.println(title);
        driver.findElement(welcome).isDisplayed();
        Thread.sleep(3000);
        String welcometext = driver.findElement(welcome).getText();
        System.out.println(welcometext);
        driver.findElement(productSubscribed).isDisplayed();
        Thread.sleep(3000);
        String product = driver.findElement(productSubscribed).getText();
        System.out.println(product);
        WebElement ele = driver.findElement(lightBulb);
        Actions act = new Actions(driver);
        act.moveToElement(ele).perform();
        String data = driver.findElement(lightBulb).getText();
        System.out.println(data);
    }
}
