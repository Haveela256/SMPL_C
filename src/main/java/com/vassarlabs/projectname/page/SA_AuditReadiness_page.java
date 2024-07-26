package com.vassarlabs.projectname.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;

public class SA_AuditReadiness_page {
    private WebDriver driver;
    private By downloadIcon = By.xpath("//i[@class='bi bi-download']/..");
    private By auditrediness = By.xpath("//span[normalize-space()='Audit Readiness']");



    public SA_AuditReadiness_page(WebDriver driver) {
        this.driver=driver;
    }

    public void cmmcTab(String Regulationtabs) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='" + Regulationtabs + "']")));
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='" + Regulationtabs + "']")).click();
    }

    public void download(String AssessmentName, String Regulationtabs) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(auditrediness));
        driver.findElement(auditrediness).click();
        if(driver.findElement(By.xpath("//span[text()='"+AssessmentName+"']//following::i[@class='bi bi-download']/..")).isDisplayed()){
        if (driver.findElement(downloadIcon).isDisplayed()) {
            wait.until(ExpectedConditions.elementToBeClickable(downloadIcon));
            Thread.sleep(10000);
            driver.findElements(downloadIcon).get(3).click();
        }
    }else {
            System.out.println("Assessment is not displayed");
        }}

    public void downloadFiles(String UploadFile) {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        if(driver.findElement(By.xpath("//preceding::span[contains(text(),'"+UploadFile+"')]//following::i[@class='bi bi-download']")).isDisplayed()){
        driver.findElement(By.xpath("//preceding::span[contains(text(),'"+UploadFile+"')]//following::i[@class='bi bi-download']")).click();
    }else {
            System.out.println("File is not displayed");
        }
}

    public void card(String Cards, String AssessmentName) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.findElement(By.xpath("//span[text()='" + AssessmentName + "']")).click();
        Thread.sleep(3000);
        String[] dummy = Cards.split(",");
        ArrayList<String> cardNames = new ArrayList<>(Arrays.asList(dummy));
        System.out.println(cardNames);
        for (int i = 0; i < cardNames.size(); i++) {
            Thread.sleep(5000);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()=' " + cardNames.get(i) + " ']")));
            driver.findElement(By.xpath("//div[text()=' " + cardNames.get(i) + " ']")).click();
            System.out.println(cardNames.get(i) + " is clicked");
            Thread.sleep(3000);
        }

    }
    }

