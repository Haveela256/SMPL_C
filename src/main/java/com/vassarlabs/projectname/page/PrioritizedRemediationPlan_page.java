package com.vassarlabs.projectname.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;

public class PrioritizedRemediationPlan_page {
    private WebDriver driver;
    private By reporting=By.xpath("//span[text()='Reporting']");
    private By reports=By.xpath("//ul//li[text()='Reports']");
    private By selectAssessmentDropdown=By.xpath("//select[@class='form-select ng-pristine ng-valid ng-touched']");
    private By prioritixedRemediationPlan=By.xpath("//span[text()=' Prioritized Remediation Plan ']");
    private By priotizedTitle=By.xpath("//div[text()=' Prioritized Remediation Plan']");
    private By printButton=By.xpath("//button[text()='Print']");
    private By status = By.xpath("//span[text()='Status :']/..");
    private By progress = By.xpath("//div[@class='custom-progress-bar']");
    private By remediationReadiness = By.xpath("//span[text()='Remediation Readiness :']/..");
    private By lastLogin = By.xpath("//span[text()='Last Modified :']/..");
    private By sprsTitle = By.xpath("//span[text()=' Current SPRS Score ']/..");
    private By reportsTitle

    public PrioritizedRemediationPlan_page(WebDriver driver) {
        this.driver=driver;
    }

    public void reportingModule(String AssessmentName) throws InterruptedException {
        driver.findElement(reporting).click();
        driver.findElement(reports).click();
        Thread.sleep(3000);
        if(driver.findElement(reportsTitle).isDisplayed()){
        WebElement ele=driver.findElement(selectAssessmentDropdown);
        Select dropdown = new Select(ele);
        dropdown.selectByIndex(2);
       driver.findElement(prioritixedRemediationPlan).click();
    }

    public void print() {
        if(driver.findElement(priotizedTitle).isDisplayed()){
            driver.findElement(printButton).click();
        }
    }

    public void progressBar(String AssessmentName) throws InterruptedException {
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        driver.findElement(By.xpath("//table//span[normalize-space()='"+AssessmentName+"']")).click();
        if(driver.findElement(By.xpath("//div[text()='"+AssessmentName+"']")).isDisplayed())
        {driver.findElement(status).isDisplayed();
            Thread.sleep(3000);
            String statuss = driver.findElement(status).getText();
            System.out.println(statuss);
            driver.findElement(progress).isDisplayed();
            Thread.sleep(3000);
            String progresss = driver.findElement(progress).getText();
            System.out.println(progresss);
            driver.findElement(remediationReadiness).isDisplayed();
            Thread.sleep(3000);
            String remediation = driver.findElement(remediationReadiness).getText();
            System.out.println(remediation);
            driver.findElement(lastLogin).isDisplayed();
            Thread.sleep(3000);
            String login = driver.findElement(lastLogin).getText();
            System.out.println(login);}

    }

    public void sprs() {
        if (driver.findElement(sprsTitle).isDisplayed()) {
            String sprs = driver.findElement(sprsTitle).getText();
            System.out.println(sprs);
        }
        else {
            System.out.println("SPRS Score is not displayed");
        }
    }

    public void regulationCards(String regulationCards) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        ArrayList<String> cards = new ArrayList<>();
        cards.add(regulationCards);
        String[] splitB = regulationCards.split(",");
        cards.addAll(Arrays.asList(splitB));
        System.out.println(cards);
        for (int i = 0; i < cards.size(); i++) {
            if (driver.findElements(By.xpath("//div[@class='card-header']//following::div[text()='" + cards.get(i) + "']")).isEmpty()) {
                System.out.println(cards.get(i) + " is not found");
                if (driver.findElement(By.xpath("//div[@class='card-header']//following::div[text()='" + cards.get(i) + "']")).isDisplayed()) {
                    Actions actions = new Actions(driver);
                    JavascriptExecutor js = (JavascriptExecutor) driver;
                    // Locate the current element using XPath
                    String graphName = cards.get(i);  // Assuming graphNames is a list of graph names
                    WebElement currentElement = driver.findElement(By.xpath("//div[@class='card-header']//following::div[text()='" + cards.get(i) + "']"));

                    // Check if the current element is displayed
                    if (currentElement.isDisplayed()) {
                        // Move to the current element
                        actions.moveToElement(currentElement).perform();

                        // Use JavaScript to focus on the previous element
                        js.executeScript("document.activeElement.previousElementSibling.focus();");
                    } else {
                        System.out.println("Element not found or not displayed: " + graphName);
                    }

                    // You can then perform actions on the new focused element, if necessary
                    WebElement previousElement = driver.switchTo().activeElement();

                }
            } else {
                System.out.println(cards.get(i) + " is found ");
            }
            Thread.sleep(1000);
        }
    }
    public void implementationGraph() {

    }

    public void legendsOfImplementatioGrapsh() {
    }

    public void implementationStatusTable() {
    }

    public void sortIconsOfimplementationStatus() {
    }

    public void paginationOfimplementationStatus() {
    }

    public void poamGraph() {
    }

    public void legends() {
    }

    public void poamTable() {
    }

    public void sortPoam() {
    }
}
