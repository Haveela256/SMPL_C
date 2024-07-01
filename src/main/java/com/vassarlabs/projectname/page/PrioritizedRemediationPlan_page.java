package com.vassarlabs.projectname.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrioritizedRemediationPlan_page {
    private WebDriver driver;
    private By reporting = By.xpath("//span[text()='Reporting']");
    private By reports = By.xpath("//li[text()='Reports']");
    private By selectAssessmentDropdown = By.xpath("//select[@class='form-select ng-untouched ng-pristine ng-valid']");
    private By prioritixedRemediationPlan = By.xpath("//span[text()=' Prioritized Remediation Plan ']");
    private By priotizedTitle = By.xpath("//div[text()=' Prioritized Remediation Plan']");
    private By printButton = By.xpath("//button[text()='Print']");
    private By progress = By.xpath("//div[@class='custom-progress-bar']");
    private By remediationReadiness = By.xpath("//span[text()=' Remediation Readiness: ']/..");
    private By lastLogin = By.xpath("//span[text()='Last Modified :']/..");
    private By sprsTitle = By.xpath("//div[text()=' SPRS Score : ']/..");
    private By reportsTitle = By.xpath("//div[contains(text(),'Reports')]");
    private By implementationgrapsh = By.xpath("//b[normalize-space()='Implementation Status']");
    private By fullyImplementedLegend = By.xpath("//highcharts-chart//*[@class='highcharts-root']//*[text()='Fully Implemented']");
    private By notApplicableLegend = By.xpath("//highcharts-chart//*[@class='highcharts-root']//*[text()='NotApplicable']");
    private By notImplementedLegend = By.xpath("//highcharts-chart//*[@class='highcharts-root']//*[text()='Not Implemented']");
    private By partiallyImplemented = By.xpath("//highcharts-chart//*[@class='highcharts-root']//*[text()='Partially Implemented']");
    private By notAnsweredLegend = By.xpath("//highcharts-chart//*[@class='highcharts-root']//*[text()='Not Answered']");
    private By updatedOnUp = By.xpath("//span[text()='Fully Implemented ']//following::i[@class='px-1 bi bi-sort-down ng-star-inserted']");
    private By updatedOnDown = By.xpath("//span[text()='Fully Implemented ']//following::i[@class='px-1 bi ng-star-inserted bi-sort-up']");
    private By nextIcon = By.xpath("//pagination-controls/pagination-template/nav/ul/li/a/span[text()='page']/parent::a");
    private By previous = By.xpath("//pagination-controls/pagination-template/nav/ul/li[@class='pagination-previous']");
    private By numberhyperlink = By.xpath("//span[text()='2']");
    private By prioritizedGrapgh = By.xpath("//b[text()='Plan of Action & Milestones (POA&M) Status']");
    private By openLegend = By.xpath("//highcharts-chart//*[@class='highcharts-root']//*[text()='Open']");
    private By temporary = By.xpath("//highcharts-chart//*[@class='highcharts-root']//*[text()='Temporary']");
    private By riskAccepted = By.xpath("//highcharts-chart//*[@class='highcharts-root']//*[text()='RiskAccepted']");
    private By closed = By.xpath("//highcharts-chart//*[@class='highcharts-root']//*[text()='Closed']");
    private By paginationDropdown = By.xpath("//select[@class='form-select form-select-sm small-dd ng-untouched ng-pristine ng-valid']");
    private By poam = By.xpath("//b[normalize-space()='Plan of Action & Milestones (POA&M) Status']");

    public PrioritizedRemediationPlan_page(WebDriver driver) {
        this.driver = driver;
    }

    public void report(String AssessmentName) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(reporting).click();
        Thread.sleep(3000);
        driver.findElement(reports).click();
        Thread.sleep(3000);
        if (driver.findElement(reportsTitle).isDisplayed()) {
            WebElement ele = driver.findElement(selectAssessmentDropdown);
            Select dropdown = new Select(ele);
            dropdown.selectByIndex(2);
            driver.findElement(prioritixedRemediationPlan).click();
            Thread.sleep(3000);
        }
    }

    public void print() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(priotizedTitle));
        wait.until(ExpectedConditions.visibilityOfElementLocated(printButton));
        driver.findElement(printButton).click();
        Thread.sleep(3000);
    }


    public void progressBar(String AssessmentName) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        String assessment = driver.findElement(By.xpath("//div[text()=' Assessment Name: ']/..")).getText();
        System.out.println(assessment);
//        driver.findElement(By.xpath("//div[text()=' Assessment Name: ']//following::div[text()=' "+AssessmentName+" ']")).click();
//        if (driver.findElement(By.xpath("//span[text()='In Progress']")).isDisplayed()) {
//            String status = driver.findElement(By.xpath("//span[text()='In Progress']")).getText();
//            System.out.println(status);
//            Thread.sleep(3000);
//            System.out.println(status);
//        } else if (driver.findElement(By.xpath("//span[text()='Draft']")).isDisplayed()) {
//            String status1 = driver.findElement(By.xpath("//span[text()='In Progress']")).getText();
//            System.out.println(status1);
//            Thread.sleep(3000);
//        }
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
        System.out.println(login);
    }

    public void sprs() {
        if (driver.findElement(sprsTitle).isDisplayed()) {
            String sprs = driver.findElement(sprsTitle).getText();
            System.out.println(sprs);
//        }
//        else {
//            System.out.println("SPRS Score is not displayed");
        }
    }

    public void regulationCards(String regulationCards) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        ArrayList<String> cards = new ArrayList<>(Arrays.asList(regulationCards.split(",")));
        cards.add(0, regulationCards);
        System.out.println(cards);

        for (String card : cards) {
            List<WebElement> elements = driver.findElements(By.xpath("//div[@class='card-header']//following::div[text()='" + card + "']"));
            if (elements.isEmpty()) {
                System.out.println(card + " is not found");
            } else {
                System.out.println(card + " is found");
                WebElement currentElement = elements.get(0);
                if (currentElement.isDisplayed()) {
                    Actions actions = new Actions(driver);
                    JavascriptExecutor js = (JavascriptExecutor) driver;

                    actions.moveToElement(currentElement).perform();
                    js.executeScript("document.activeElement.previousElementSibling.focus();");

                    WebElement previousElement = driver.switchTo().activeElement();
                    // Perform actions on the previousElement if necessary
                } else {
                    System.out.println("Element not displayed: " + card);
                }
            }
        }
    }

    public void implementationGraph() {
        if (driver.findElement(implementationgrapsh).isDisplayed()) {
            System.out.println("IMplementation grapsh is displayed");
        }
    }

    public void legendsOfImplementatioGrapsh() throws InterruptedException {
        driver.findElement(fullyImplementedLegend).click();
        Thread.sleep(2000);
        driver.findElement(partiallyImplemented).click();
        Thread.sleep(2000);
        driver.findElement(notApplicableLegend).click();
        Thread.sleep(2000);
        driver.findElement(notAnsweredLegend).click();
        Thread.sleep(2000);
        driver.findElement(notImplementedLegend).click();
        Thread.sleep(2000);
    }

    public void implementationStatusTable() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        if (driver.findElement(By.xpath("//table")).isDisplayed()) {
            if (driver.findElements(updatedOnUp).size() > 0) {
                WebElement sortElement = wait.until(ExpectedConditions.elementToBeClickable(updatedOnUp));
                sortElement.click();
                System.out.println("Sort icon clicked.");
            } else if (driver.findElements(updatedOnDown).size() > 0) {
                WebElement unsortElement = wait.until(ExpectedConditions.elementToBeClickable(updatedOnDown));
                unsortElement.click();
                System.out.println("Unsort icon clicked.");
            } else {
                System.out.println("Neither sort nor unsort icons are displayed.");
            }
        } else {
            System.out.println("Table is not displayed.");
        }


    }

    public void paginationOfimplementationStatus() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(nextIcon));
        driver.findElement(nextIcon).click();
        wait.until(ExpectedConditions.elementToBeClickable(previous));
        driver.findElement(previous).click();
        wait.until(ExpectedConditions.elementToBeClickable(numberhyperlink));
        driver.findElement(numberhyperlink).click();
        WebElement ele = driver.findElement(paginationDropdown);
        Select dropdown = new Select(ele);
        dropdown.selectByIndex(1);
        dropdown.selectByIndex(2);
        dropdown.selectByIndex(3);
        dropdown.selectByIndex(4);

    }

    public void poamGraph() {
        if (driver.findElement(poam).isDisplayed()) {
            System.out.println(poam + "is displayed");
        }
    }

    public void legends() throws InterruptedException {
        driver.findElement(openLegend).click();
        Thread.sleep(2000);
        driver.findElement(temporary).click();
        Thread.sleep(2000);
        driver.findElement(riskAccepted).click();
        Thread.sleep(2000);
        driver.findElement(closed).click();
        Thread.sleep(3000);
    }


    public void sortPoam() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        if (driver.findElement(By.xpath("//table")).isDisplayed()) {
            if (driver.findElements(updatedOnUp).size() > 0) {
                WebElement sortElement = wait.until(ExpectedConditions.elementToBeClickable(updatedOnUp));
                sortElement.click();
                System.out.println("Sort icon clicked.");
            } else if (driver.findElements(updatedOnDown).size() > 0) {
                WebElement unsortElement = wait.until(ExpectedConditions.elementToBeClickable(updatedOnDown));
                unsortElement.click();
                System.out.println("Unsort icon clicked.");
            } else {
                System.out.println("Neither sort nor unsort icons are displayed.");
            }
            } else {
                System.out.println("Table is not displayed.");
            }
        }
    }
