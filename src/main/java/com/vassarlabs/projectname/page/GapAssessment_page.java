package com.vassarlabs.projectname.page;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GapAssessment_page {
    private WebDriver driver;
    private By selectYearPath = By.xpath("//select//option[text()='Select Year']/..");
    private By yearPath = By.xpath("//option[text()='2024']");
    private By updatedOnUp = By.xpath("//i[@class='px-1 bi ng-star-inserted bi-sort-up']");
    private By updatedOnDown = By.xpath("//i[@class='px-1 bi bi-sort-down ng-star-inserted']");
    private By assessmentDown = By.xpath("//span[text()='Assessment Name ']/parent::div/span/i[contains(@class,'down')]");
    private By assessmentUp = By.xpath("//span[text()='Assessment Name ']/parent::div/span/i[contains(@class,'up')]");
    private By assessmentIcon = By.xpath("//i[@class='px-1 bi bi-filter']");
    private By copyIcon = By.xpath("//button[@ngbtooltip='Make a copy']");
    private By copyAssessmentTitle = By.xpath("//h4[text()='Copy Assessment']");
    private By closeIcon = By.xpath("//button[@class='btn-close']");
    private By assessmentName = By.xpath("//input[@id='assessment_name']");
    private By cacnelButton = By.xpath("//button[text()='Cancel']");
    private By saveButton = By.xpath("//button[text()='Save']");
    private By assessmentCopiedToaster = By.xpath("//div[text()=' Assessment Copied Successfully ']");
    private By download = By.xpath("//tbody/tr[1]/td[3]/div[1]/button[2]/i[1]");
    private By deleteIcon = By.xpath("//tbody/tr[1]/td//button[@ngbtooltip='Delete Assessment']");
    private By paginationDropdown = By.xpath("//select[@class='form-select form-select-sm small-dd ng-untouched ng-pristine ng-valid']");
    private By popupNoButton = By.xpath("//button[text()='No']");
    private By popupDeleteButton = By.xpath("//button[text()='Delete']");
    private By filedeletedToaster = By.xpath("//div[@aria-label='File deleted successfully']");
    private By nextIcon = By.xpath("//li[@class='pagination-next']");
    private By previous = By.xpath("//li[@class='pagination-previous']");
    private By numberhyperlink = By.xpath("//span[text()='2']");
    private By popup = By.xpath("//span[text()='Are you sure to delete ?']");
    private By uploadIcon = By.xpath("//i[@class='bi bi-upload cursor']");
    private By replaceFile = By.xpath("//button[text()='Upload Replacement File']");
    private By status = By.xpath("//span[text()='Status :']/..");
    private By progress = By.xpath("//div[@class='custom-progress-bar']");
    private By remediationReadiness = By.xpath("//span[text()='Remediation Readiness :']/..");
    private By lastLogin = By.xpath("//span[text()='Last Modified :']/..");
    private By sprsTitle = By.xpath("//span[text()=' Current SPRS Score ']/..");
    private By sprsLevel = By.xpath("//div[@class='card-value']");
    private By barsSection = By.xpath("//div[@class='card ng-star-inserted']//div[@class='card-body']");
    private By yaxis = By.xpath("//highcharts-chart//*[@class='highcharts-root']//*[text()='Questions']");
    private By xaxis = By.xpath("//highcharts-chart//*[@class='highcharts-root']//*[text()='Assessments']");
    private By fullyImplementedLegend = By.xpath("//highcharts-chart//*[@class='highcharts-root']//*[text()='Fully Implemented']");
    private By notApplicableLegend = By.xpath("//highcharts-chart//*[@class='highcharts-root']//*[text()='NotApplicable']");
    private By notImplementedLegend = By.xpath("//highcharts-chart//*[@class='highcharts-root']//*[text()='Not Implemented']");
    private By partiallyImplemented = By.xpath("//highcharts-chart//*[@class='highcharts-root']//*[text()='Partially Implemented']");
    private By notAnsweredLegend = By.xpath("//highcharts-chart//*[@class='highcharts-root']//*[text()='Not Answered']");
    private By gapAssesmentPath = By.xpath("//a[@class='nav-link']//span[@class='title'][normalize-space()='Gap Assessment']");
    private By gapAssessmentTitle = By.xpath("//div[contains(text(),'Gap Assessment')]");
    private By renameIcon = By.xpath("//tbody/tr[1]/td//button//i[@class='bi bi-pencil-square']");
    private By renamepopupTitle = By.xpath("//h4[@class='modal-title']");
    private By renamePopupCloseIcon = By.xpath("//button[@aria-label='Close']");
    private By renamePopupCancelButton = By.xpath("//button[normalize-space()='Cancel']");
    private By renamepopuptextField = By.xpath("//input[@id='assessment_name']");
    private By renamepopupSave = By.xpath("//button[text()='Save']");
    private By renameToaster = By.xpath("//div[text()=' Assessment Renamed Successfully ']");
    private By copyToaster = By.xpath("//div[text()=' Assessment Renamed Successfully ']");
    private By existingAssessmentError = By.xpath("//div[text()=' Assessment Name Already Exist Please Choose Another Assessment name !!! ']");
    private By collapseChatbot = By.xpath("//button[@class='btn btn-sm d-none d-md-block']//i[@class='bi bi-chevron-down']");
    boolean errorToaster = false;
    private By assessmentFilter=By.xpath("//i[@class='px-1 bi bi-filter ng-star-inserted']");


    public GapAssessment_page(WebDriver driver) {
        this.driver = driver;
    }

    public void selectYear() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.findElement(gapAssesmentPath).click();
        Thread.sleep(3000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(gapAssessmentTitle));
        Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(selectYearPath));
        Thread.sleep(3000);
        driver.findElement(selectYearPath).click();
        driver.findElement(yearPath).click();
        Thread.sleep(3000);
    }

    public void sortIcons() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        if (driver.findElement(By.xpath("//table")).isDisplayed()) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(updatedOnDown));
            if (driver.findElements(updatedOnDown).size() > 0) {
                wait.until(ExpectedConditions.elementToBeClickable(updatedOnDown));
                driver.findElement(updatedOnDown).click();}
                if (driver.findElements(assessmentFilter).size() > 0) {
                    wait.until(ExpectedConditions.elementToBeClickable(assessmentFilter));
                    driver.findElement(assessmentFilter).click();
            }
        }
    }
    public void copyIcon(String CopyAssessmentToaster, String CopyName, String RenameAssessment, String ErrorToaster) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        Thread.sleep(3000);
//        wait.until(ExpectedConditions.elementToBeClickable(collapseChatbot));
//        driver.findElement(collapseChatbot).click();
//        Thread.sleep(4000);
        List<WebElement> paginationElements = driver.findElements(paginationDropdown);
        if (!paginationElements.isEmpty() && paginationElements.get(0).isDisplayed()) {
            WebElement ele = paginationElements.get(0);
            Select dropdown = new Select(ele);
            dropdown.selectByIndex(4);
        if (driver.findElement(By.xpath("//table//tr//td[2]//span[text()='" + RenameAssessment + "']")).isDisplayed()) {
            wait.until(ExpectedConditions.elementToBeClickable(copyIcon));
            Thread.sleep(3000);
            driver.findElement(copyIcon).click();
            Thread.sleep(3000);
            if (driver.findElement(copyAssessmentTitle).isDisplayed()) {
                Thread.sleep(3000);
                WebElement assessmentNameElement = driver.findElement(assessmentName);
                assessmentNameElement.sendKeys(CopyName);
                Thread.sleep(3000);
                if (driver.findElement(saveButton).isEnabled()) {
                    driver.findElement(saveButton).click();
                }}

                    if(!driver.findElement(saveButton).isEnabled()){
                 {
                    driver.findElement(renamePopupCloseIcon).click();
                    Thread.sleep(3000);
                }}}


                int value = 0;
                if (CopyAssessmentToaster.contains("Copy assessment Successfully")) {
                    value = 1;
                    System.out.println("Case 1 Will Run");
                }
                if (ErrorToaster.contains("Assessment Name Already Exist Please Choose Another Assessment name")) {
                    value = 2;
                    System.out.println("Case 2 Will Run");
                }

                switch (value) {
                    case 1:
                        if (driver.findElements(copyToaster).size() > 0) {
                            String rename = driver.findElement(copyToaster).getText();
                            System.out.println(rename);
                            Assert.assertEquals(CopyAssessmentToaster, rename);
                            errorToaster = true;
                        }
                        break;
                    case 2:
                        if (driver.findElements(existingAssessmentError).size() > 0) {
                            String error = driver.findElement(existingAssessmentError).getText();
                            System.out.println(error);
                            Assert.assertEquals(ErrorToaster, error);
                            errorToaster = true;
                        }
                        break;
                }
            } else {
                System.out.println("Toaster is not displayed");
            }
        }
    public void renameAssessment(String RenameSuccessfulToaster, String RenameAssessment, String AssessmentName, String ErrorToaster) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        if (driver.findElement(By.xpath("//table//tr//td[2]//span[text()='" + AssessmentName + "']")).isDisplayed()) {
            wait.until(ExpectedConditions.elementToBeClickable(renameIcon));
            driver.findElement(renameIcon).click();
            Thread.sleep(3000);
            if (driver.findElement(renamepopupTitle).isDisplayed()) {
                Thread.sleep(3000);
                WebElement assessmentNameElement = driver.findElement(assessmentName);
                assessmentNameElement.sendKeys(RenameAssessment);
                Thread.sleep(3000);
                if (driver.findElement(saveButton).isEnabled()) {
                    driver.findElement(saveButton).click();
                }
                if (!driver.findElement(saveButton).isEnabled()) {
                    driver.findElement(renamePopupCloseIcon).click();
                    Thread.sleep(3000);
                }

                int value = 0;
                if (RenameSuccessfulToaster.contains("Assessment Renamed Successfully")) {
                    value = 1;
                    System.out.println("Case 1 Will Run");
                }
                if (ErrorToaster.contains("Assessment Name Already Exist Please Choose Another Assessment name")) {
                    value = 2;
                    System.out.println("Case 2 Will Run");
                }

                switch (value) {
                    case 1:
                        if (driver.findElements(renameToaster).size() > 0) {
                            String rename = driver.findElement(renameToaster).getText();
                            System.out.println(rename);
                            Assert.assertEquals(RenameSuccessfulToaster, rename);
                            errorToaster = true;
                        }
                        break;
                    case 2:
                        if (driver.findElements(existingAssessmentError).size() > 0) {
                            String error = driver.findElement(existingAssessmentError).getText();
                            System.out.println(error);
                            Assert.assertEquals(ErrorToaster, error);
                            errorToaster = true;
                        }
                        break;
                }
            } else {
                System.out.println("Toaster is not displayed");
            }
        }
    }

    public void deleteIcon(String DeletedFileToaster, String AssessmentName, String RenameAssessment) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        boolean isAssessmentDisplayed = !driver.findElements(By.xpath("//table//tr//td[2]//span[text()='" + RenameAssessment + "']")).isEmpty();
        if (isAssessmentDisplayed) {
            // Click the delete icon
            WebElement deleteIconElement = wait.until(ExpectedConditions.elementToBeClickable(deleteIcon));
            Thread.sleep(3000);
            deleteIconElement.click();
            Thread.sleep(3000);
          wait.until(ExpectedConditions.elementToBeClickable(popupDeleteButton));
         driver.findElement(popupDeleteButton).click();
//            wait.until(ExpectedConditions.visibilityOfElementLocated(filedeletedToaster));
//           String deleteToaster=driver.findElement(filedeletedToaster).getText();
//            System.out.println(deleteToaster);
            System.out.println("File is deleted");
//            Assert.assertEquals(deleteToaster, DeletedFileToaster);
        } else {
            if (!isAssessmentDisplayed) {
                System.out.println("Assessment is not displayed");
            }
        }
    }

    public void pagination() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.navigate().refresh();
        List<WebElement> paginationElements = driver.findElements(paginationDropdown);
        if (!paginationElements.isEmpty() && paginationElements.get(0).isDisplayed()) {
            WebElement ele = paginationElements.get(0);
            Select dropdown = new Select(ele);
            dropdown.selectByIndex(0);
            Thread.sleep(9000);
            wait.until(ExpectedConditions.elementToBeClickable(nextIcon));
            driver.findElement(nextIcon).click();
            Thread.sleep(3000);
            driver.findElement(previous).click();
            Thread.sleep(3000);
            driver.findElement(numberhyperlink).click();
            // Select options by index
            dropdown.selectByIndex(2);
            dropdown.selectByIndex(3);
            dropdown.selectByIndex(4);
        } else {
            System.out.println("Pagination is not displayed");
        }
}

    public void progressBar(String RenameAssessment) throws InterruptedException {
        driver.navigate().refresh();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(8000);
        driver.findElement(By.xpath("//table//span[normalize-space()='" + RenameAssessment + "']")).click();
        Thread.sleep(3000);
        String progressData = driver.findElement(progress).getText();
        System.out.println(progressData);
        if (driver.findElement(By.xpath("//div[text()=' " + RenameAssessment + " ']")).isDisplayed()) {
            driver.findElement(status).isDisplayed();
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
            System.out.println(login);
        } else if (driver.findElement(By.xpath("//div[text()=' " + RenameAssessment + " ']")).isDisplayed()) {
            driver.findElement(status).isDisplayed();
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
            System.out.println(login);
        }
    }


    public void sPRSScore() {
        if (driver.findElement(sprsTitle).isDisplayed()) {
            String sprs = driver.findElement(sprsTitle).getText();
            System.out.println(sprs);
        } else {
            System.out.println("SPRS Score is not displayed");
        }
    }

    public void barChart(String AssessmentName) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        if (driver.findElement(By.xpath("//highcharts-chart//*[@class='highcharts-root']//*[text()='" + AssessmentName + "']")).isDisplayed()) {
            Thread.sleep(3000);
            driver.findElement(xaxis).isDisplayed();
            Thread.sleep(3000);
            String xAxis = driver.findElement(xaxis).getText();
            System.out.println(xAxis);
            driver.findElement(yaxis).isDisplayed();
            Thread.sleep(3000);
            String yAxis = driver.findElement(yaxis).getText();
            System.out.println(yAxis);
            driver.findElement(fullyImplementedLegend).isDisplayed();
            Thread.sleep(4000);
            driver.findElement(fullyImplementedLegend).click();
            Thread.sleep(3000);
            driver.findElement(notApplicableLegend).isDisplayed();
            Thread.sleep(3000);
            driver.findElement(notApplicableLegend).click();
            Thread.sleep(3000);
            driver.findElement(notImplementedLegend).isDisplayed();
            Thread.sleep(3000);
            driver.findElement(notImplementedLegend).click();
            driver.findElement(partiallyImplemented).isDisplayed();
            Thread.sleep(3000);
            driver.findElement(partiallyImplemented).click();
            Thread.sleep(3000);
            driver.findElement(notAnsweredLegend).isDisplayed();
            Thread.sleep(3000);
        } else {
            System.out.println("Assessment's graph is not displayed");
        }
    }


    public void legendsOfBarChart(String RenameAssessment) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        if (driver.findElement(By.xpath("//highcharts-chart//*[@class='highcharts-root']//*[text()='" + RenameAssessment + "']")).isDisplayed()) {
            driver.findElement(fullyImplementedLegend).isDisplayed();
            Thread.sleep(3000);
            driver.findElement(fullyImplementedLegend).click();
            Thread.sleep(3000);
            driver.findElement(notApplicableLegend).isDisplayed();
            Thread.sleep(3000);
            driver.findElement(notApplicableLegend).click();
            Thread.sleep(3000);
            driver.findElement(notImplementedLegend).isDisplayed();
            Thread.sleep(3000);
            driver.findElement(notImplementedLegend).click();
            driver.findElement(partiallyImplemented).isDisplayed();
            Thread.sleep(3000);
            driver.findElement(partiallyImplemented).click();
            Thread.sleep(4000);
            driver.findElement(notAnsweredLegend).isDisplayed();
            Thread.sleep(6000);
            wait.until(ExpectedConditions.elementToBeClickable(notAnsweredLegend));
            Thread.sleep(9000);
            driver.findElement(notAnsweredLegend).click();
            Thread.sleep(4000);

        } else {
            System.out.println("Assessment is not created");
        }
    }

    public void barsFunctionality(String RenameAssessment, String BarsCount, String BarsNames) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        ArrayList<String> graphNames = new ArrayList<>();
        graphNames.add(RenameAssessment);
        String[] splitB = BarsNames.split(",");
        graphNames.addAll(Arrays.asList(splitB));
        System.out.println(graphNames);
        for (int i = 0; i < graphNames.size(); i++) {
            if (driver.findElements(By.xpath("//highcharts-chart//*[@class='highcharts-root']//*[text()='" + graphNames.get(i) + "']")).isEmpty()) {
                System.out.println(graphNames.get(i) + " is not found in graph");
                if (driver.findElement(By.xpath("//highcharts-chart//*[@class='highcharts-root']//*[text()='" + graphNames.get(i) + "']")).isDisplayed()) {
                    Actions actions = new Actions(driver);
                    JavascriptExecutor js = (JavascriptExecutor) driver;
                    // Locate the current element using XPath
                    String graphName = graphNames.get(i);  // Assuming graphNames is a list of graph names
                    WebElement currentElement = driver.findElement(By.xpath("//highcharts-chart//*[@class='highcharts-root']//*[text()='" + graphNames + "']"));

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
                System.out.println(graphNames.get(i) + " is found in the graph");
            }
            Thread.sleep(1000);
        }
    }
}
