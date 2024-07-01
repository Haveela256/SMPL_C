package com.vassarlabs.projectname.page;

import org.apache.poi.hssf.record.TableRecord;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;

public class AuditReadiness2_page {
    public Object uploadedDocsTable;
    private WebDriver driver;

    public AuditReadiness2_page(WebDriver driver) {
        this.driver=driver;
    }

    public void verifyJustification() {
    }

    public void cards(String Cards, String AssessmentName) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//span[normalize-space()='Audit Readiness']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[contains(text(),'Audit Readiness')]")).isDisplayed();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='"+AssessmentName+"']")).click();
        Thread.sleep(3000);
        ArrayList<String> cardNames = new ArrayList<>();
        cardNames.add(AssessmentName);
        String[] splitB = Cards.split(",");
        cardNames.addAll(Arrays.asList(splitB));
        System.out.println(cardNames);
        for (int i = 0; i < cardNames.size(); i++) {
            if (driver.findElements(By.xpath("//div[@class='question-item']//div[text()='"+cardNames+"']")).isEmpty()) {
                System.out.println(cardNames.get(i) + " is not found");
                if(driver.findElement(By.xpath("//div[@class='question-item']//div[text()='"+cardNames+"']")).isDisplayed()){
                    Actions actions = new Actions(driver);
                    JavascriptExecutor js1 = (JavascriptExecutor) driver;

                    // Locate the current element using XPath
                    String graphName = cardNames.get(i);  // Assuming graphNames is a list of graph names
                    WebElement currentElement = driver.findElement(By.xpath("//div[@class='question-item']//div[text()='"+cardNames+"']"));

                    // Check if the current element is displayed
                    if (currentElement.isDisplayed()) {
                        // Move to the current element
                        actions.moveToElement(currentElement).perform();

                        // Use JavaScript to focus on the previous element
                        js1.executeScript("document.activeElement.previousElementSibling.focus();");
                    } else {
                        System.out.println("Element not found or not displayed: " + cardNames);
                    }

                    // You can then perform actions on the new focused element, if necessary
                    WebElement previousElement = driver.switchTo().activeElement();

                }
            } else {
                System.out.println(cardNames.get(i) + " is found");
            }
            Thread.sleep(1000);
        }}


    public void browse(String uploadFile) {
        
    }

    public void reupload(String reuploadFile) {
    }

    public void editJustification(String editText) {
    }

    public void saveJustifiaction() {
    }

    public void summraize() {
    }

    public void probability() {
    }

    public void downloadIcon() {
    }

    public void deleteIcon() {
    }

    public void deletepopup() {
    }

    public void sortIcons() {
    }

    public void pagination() {
    }

    public void regulationtabs(String regulationtabs) {
    }

    public void implemetationDropdown() {
    }

    public void previousIconOfRegulation(String regulationtabs) {
    }

    public void uploadRelevenatDoc(String uploadFile) {
    }

    public void uploadedDocsTable() {
    }
}
