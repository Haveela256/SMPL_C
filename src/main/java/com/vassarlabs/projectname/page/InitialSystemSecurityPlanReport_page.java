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

public class InitialSystemSecurityPlanReport_page {
    private WebDriver driver;
    private By reporting = By.xpath("//span[text()='Reporting']");
    private By selectAssessmentDropdown = By.xpath("//select[@class='form-select ng-untouched ng-pristine ng-valid']");
    private By initialSystemSecurityCard = By.xpath("//span[text()='Initial System Security Plan Report']");
    private By printButton = By.xpath("//button[text()='Print']");
    private By reportsTitle = By.xpath("//div[contains(text(),'Reports')]");
    private By reports = By.xpath("//li[text()='Reports']");
    private By backIcon = By.xpath("//button[@class='btn bg-transparent border-0']");
    private By systemIdentificationTitle = By.xpath("//div[text()=' 1. System Identification ']");
    private By systemTitle = By.xpath("//div[text()=' 1.1. System Name/Title : ']/..");
    private By systemCategorization = By.xpath("//div[text()=' 1.1.1. System Categorization : ']/..");
    private By systemUniqueIdentifier = By.xpath("//div[text()=' 1.1.2. System Unique Identifier : ']/..");
    private By responsibleOrganization = By.xpath("//div[text()=' 1.2. Responsible Organization: ']");
    private By responsibleOrganizationtable = By.xpath("//td[text()=' Phone : ']/../..");
    private By informationOwner = By.xpath("//div[text()=' 1.2.1 Information Owner (Government point of contact responsible for providing and/or receiving CUI): ']");
    private By informationOwnerDetails = By.xpath("//div[@id='tableData1']//div[3]//div[@class='inner-body-content']");
    private By systemOnwer = By.xpath("//div[text()=' 1.2.1.1 System Owner (assignment of security responsibility): ']");
    private By systemsecuirty = By.xpath("//div[@class='initial-content'][5]");
    private By purposeOfSyetm = By.xpath("//div[text()=' 1.3 General Description/Purpose of System: What is the function/purpose of the system? ']//following::div[1]");
    private By noOfUsers = By.xpath("//div[text()=' 1.3.1 Number of end users and privileged users: ']//following::div[1]");
    private By cuiInformation = By.xpath("//div[text()=' 1.4 General Description of Information: CUI information types processed, stored, or transmitted by the system are determined and documented. For more information, see the CUI Registry at https://www.archives.gov/cui/registry/category-list. [[Document the CUI information types processed, stored, or transmitted by the system below] ']//following::div[1]");
    private By systemEnvironment = By.xpath("//div[text()=' 2. System Environment ']");
    private By softwareDetails = By.xpath("//span[text()=' Software Details ']");
    private By hardware = By.xpath("//div[@class='label-form']");
    private By requiremetns = By.xpath("//div[text()=' 3. Requirements ']");
    private By recordOfChangesTable = By.xpath("//div[text()=' 4. Record of changes: ']");
    private By nextIcon = By.xpath("//pagination-controls/pagination-template/nav/ul/li/a/span[text()='page']/parent::a");
    private By previous = By.xpath("//pagination-controls/pagination-template/nav/ul/li[@class='pagination-previous']");
    private By numberhyperlink = By.xpath("//span[text()='2']");
    private By paginationDropdown = By.xpath("//select[@class='form-select form-select-sm small-dd ng-untouched ng-pristine ng-valid']");


    public InitialSystemSecurityPlanReport_page(WebDriver driver) {
        this.driver = driver;
    }
    public void backIcon() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(reporting));
        driver.findElement(reporting).click();

        wait.until(ExpectedConditions.elementToBeClickable(reports));
        driver.findElement(reports).click();

        wait.until(ExpectedConditions.elementToBeClickable(initialSystemSecurityCard));
        Thread.sleep(3000); // Consider replacing this with a more reliable wait condition
        driver.findElement(initialSystemSecurityCard).click();

        Thread.sleep(3000); // Consider replacing this with a more reliable wait condition

        WebElement backIconElement = driver.findElement(backIcon);
        if (backIconElement.isDisplayed()) {
            backIconElement.click();
        } else {
            System.out.println("Back Icon is not displayed");
        }}
    public void initialSystemSecurityPlanReportCard(String AssessmentName) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(reporting).click();
        Thread.sleep(3000);
        driver.findElement(reports).click();
        Thread.sleep(3000);
        if (driver.findElement(reportsTitle).isDisplayed()) {
            WebElement ele = driver.findElement(selectAssessmentDropdown);
            Select dropdown = new Select(ele);
            dropdown.selectByValue(AssessmentName);
            driver.findElement(initialSystemSecurityCard).click();
            Thread.sleep(3000);
        }

}

public void print() {
    for (int i = 0; i < 10; i++) {
        driver.findElement(printButton).click();
    }
}

public void systemIdentification() {
    if (driver.findElement(systemIdentificationTitle).isDisplayed()) {
        String systemtitle = driver.findElement(systemTitle).getText();
        System.out.println(systemtitle);
        String systemcategory = driver.findElement(systemCategorization).getText();
        System.out.println(systemcategory);
        String uniqueIdentifier = driver.findElement(systemUniqueIdentifier).getText();
        System.out.println(uniqueIdentifier);
        String responsibleorganization = driver.findElement(responsibleOrganization).getText();
        System.out.println(responsibleorganization);
        String informationowner = driver.findElement(informationOwnerDetails).getText();
        System.out.println(informationowner);
        String systemonwer = driver.findElement(systemOnwer).getText();
        System.out.println(systemonwer);
        String systemsecirtyOfficer = driver.findElement(systemsecuirty).getText();
        System.out.println(systemsecirtyOfficer);
        String purpose = driver.findElement(purposeOfSyetm).getText();
        System.out.println(purpose);
        String users = driver.findElement(noOfUsers).getText();
        System.out.println(users);
        String cui = driver.findElement(cuiInformation).getText();
        System.out.println(cui);
    }
}

public void systemEnvironment() {
    if (driver.findElement(systemEnvironment).isDisplayed()) {
        System.out.println("System Enviorment section is displayed");
    }
}

public void softwareDetails() {
    driver.findElement(softwareDetails).click();
    String hardwareAndSoftware = driver.findElement(hardware).getText();
    System.out.println(hardwareAndSoftware);
}

public void requirements(String RequirementsCard) {
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    ArrayList<String> cards = new ArrayList<>(Arrays.asList(RequirementsCard.split(",")));
    cards.add(0, RequirementsCard);
    System.out.println(cards);
    for (String card : cards) {
        List<WebElement> elements = driver.findElements(By.xpath("//button[@aria-controls='ngb-accordion-item-2-collapse']//span[text()='" + RequirementsCard + "']"));
        if (elements.isEmpty()) {
            System.out.println(cards + " is not found");
        } else {
            System.out.println(cards + " is found");
            WebElement currentElement = elements.get(0);
            if (currentElement.isDisplayed()) {
                Actions actions = new Actions(driver);
                JavascriptExecutor js = (JavascriptExecutor) driver;

                actions.moveToElement(currentElement).perform();
                js.executeScript("document.activeElement.previousElementSibling.focus();");

                WebElement previousElement = driver.switchTo().activeElement();
                // Perform actions on the previousElement if necessary
            } else {
                System.out.println("Element not displayed: " + cards);
            }
        }

    }
}


public void recordOfChangesTable() {
    String tableName = driver.findElement(recordOfChangesTable).getText();
    System.out.println(tableName + "is displayed");
}

public void paginationOfRecordOfChanges() {
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

public void downloadIcon() {
    Actions actions = new Actions(driver);
    WebElement ele = driver.findElement(By.xpath("//div//img[@class='pdf-img']"));
    actions.moveToElement(ele).perform();
    ele.click();
}


}
