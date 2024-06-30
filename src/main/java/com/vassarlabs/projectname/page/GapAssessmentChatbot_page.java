package com.vassarlabs.projectname.page;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.awt.*;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GapAssessmentChatbot_page {
    private WebDriver driver;
    private By gapAssessmentModule = By.xpath("//span[text()='Gap Assessment']");
    private By genAichatbot = By.xpath("//div[@class='chat-box']");
    private By newAssessment = By.xpath("//button[normalize-space()='Create New Assessment']");
    private By textfield = By.xpath("//input[@placeholder='Enter your Message']");
    private By sendicon = By.xpath("//i[@class='bi bi-send-fill']");
    private By chatbotAskingForName = By.xpath("//p[contains(text(),'Welcome! Could you please provide the title or nam')]");
    private By chatbotaskingforLevel = By.xpath("//div[5]//div[2]//markdown[1]//p[1]");
    private By chatbotaskingforlevel=By.xpath("//li[normalize-space()='Level 1']");
    private By chatbotAskingforImpact = By.xpath("//li[normalize-space()='High Impact for Confidentiality']");
    private By impact=By.xpath("//p[contains(text(),'Noted. Next, please specify the system categorizat')]");
    private By technicalFootprintHyperlink = By.xpath("//a[@class='redirect-to']");
    private By technicalFootprintTitle = By.xpath("//div[@class='title']");
    private By maximize = By.xpath("//div[@class='wraper']//button[1]");
    //    private By uploadedFile=By.xpath("//table//tr//td[2]//span[text()='jhkfd']");
    private By gapAssesmentPath = By.xpath("//a[@class='nav-link']//span[@class='title'][normalize-space()='Gap Assessment']");
    private By gapAssessmentTitle = By.xpath("//div[contains(text(),'Gap Assessment')]");
    private By chatbotAskingforConfirmation = By.xpath("//div[9]//div[2]//markdown[1]//p[1]");
    private By alreadyExisting = By.xpath("//p[contains(text(),'I apologize for the inconvenience. It seems that t')]");
    private By updateAssessment = By.xpath("//div[13]//div[2]//markdown[1]//p[1]");
    private By controlCenterTitle = By.xpath("//div[contains(text(),'Control Center')]");
    private By invalidAssessment = By.xpath("//p[contains(text(),'already taken.')]");
    private By table = By.xpath("//table");
    private By collapseChatbot = By.xpath("//button[@class='btn btn-sm d-none d-md-block']//i[@class='bi bi-chevron-down']");
    private By invalidLevel = By.xpath("//p[text()='Please select the correct level from the provided options:']");
    private By nextIcon = By.xpath("//pagination-controls/pagination-template/nav/ul/li/a/span[text()='page']/parent::a");
private By numberInTable=By.xpath("//table//td[2]//span");
    private By paginationDropdown = By.xpath("//select[@class='form-select form-select-sm small-dd ng-untouched ng-pristine ng-valid']");
    boolean assessmentFound = false;
    boolean levelError = false;
    boolean impactError = false;

    public GapAssessmentChatbot_page(WebDriver driver) {
        this.driver = driver;
    }


    public void gapAssessmentModule() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        Thread.sleep(3000);
        if (driver.findElement(controlCenterTitle).isDisplayed()) {
            Thread.sleep(3000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(gapAssessmentModule));
            Thread.sleep(3000);
            wait.until(ExpectedConditions.elementToBeClickable(gapAssessmentModule));
            driver.findElement(gapAssessmentModule).click();
            Thread.sleep(3000);
        }
    }

    public void createNewAssessment(String AssessmentName, String Level, String Impact, String AssessmentNameTwo) throws InterruptedException, AWTException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        if (driver.findElement(genAichatbot).isDisplayed()) {
            Thread.sleep(5000);

            // Click on new assessment
            wait.until(ExpectedConditions.visibilityOfElementLocated(newAssessment));
            wait.until(ExpectedConditions.elementToBeClickable(newAssessment));
            Thread.sleep(3000);
            driver.findElement(newAssessment).click();
            Thread.sleep(3000);
            // Provide assessment name
            wait.until(ExpectedConditions.visibilityOfElementLocated(chatbotAskingForName));
            wait.until(ExpectedConditions.visibilityOfElementLocated(textfield));
            driver.findElement(textfield).sendKeys(AssessmentName);
            driver.findElement(sendicon).click();
        }
        Thread.sleep(3000);
        // Provide level
        wait.until(ExpectedConditions.visibilityOfElementLocated(chatbotaskingforLevel));
        Thread.sleep(3000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(textfield));
        Thread.sleep(3000);
        driver.findElement(textfield).sendKeys(Level);
        driver.findElement(sendicon).click();
        Thread.sleep(3000);
        if (driver.findElement(chatbotAskingforImpact).isDisplayed()) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(chatbotAskingforImpact));
            wait.until(ExpectedConditions.visibilityOfElementLocated(textfield));
            driver.findElement(textfield).sendKeys(Impact);
            driver.findElement(sendicon).click();
        }
        Thread.sleep(3000);
        // Confirm creation
        if (driver.findElement(chatbotAskingforConfirmation).isDisplayed()) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(chatbotAskingforConfirmation));
            wait.until(ExpectedConditions.visibilityOfElementLocated(textfield));
            driver.findElement(textfield).sendKeys("Yes");
            driver.findElement(sendicon).click();
        } else {
            System.out.println("Assessment Creation failed");
        }
    }

    public void updateTechnicalFootprint(String AssessmentName, String Level, String Impact) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        boolean assessmentCreated = false;
        if (assessmentCreated) {
            Thread.sleep(3000);
            WebElement successful = wait.until(ExpectedConditions.visibilityOfElementLocated(technicalFootprintHyperlink));
            Thread.sleep(3000);
            if (successful.isDisplayed()) {
                Thread.sleep(3000);
                successful.click();
                WebElement titleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(technicalFootprintTitle));
                Thread.sleep(3000);
                if (titleElement.isDisplayed()) {
                    System.out.println("Technical Footprint title is displayed");
                } else {
                    System.out.println("Technical Footprint title is not displayed");
                }
            } else {
                System.out.println("Technical Footprint hyperlink is not displayed");
            }
        } else {
            System.out.println("Assessment not created. Cannot update Technical Footprint.");
        }
        Thread.sleep(3000);
        driver.findElement(collapseChatbot).click();
    }

    public void verifyAddedAssessment(String AssessmentName) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement ele = driver.findElement(paginationDropdown);
        Select dropdown = new Select(ele);
        dropdown.selectByIndex(1);
        dropdown.selectByIndex(2);
        dropdown.selectByIndex(3);
        dropdown.selectByIndex(4);
        Thread.sleep(3000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(gapAssessmentModule));
        Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(gapAssessmentModule));
        driver.findElement(gapAssessmentModule).click();
        Thread.sleep(8000);
        WebElement uploadedFile = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//tbody/tr/td//span[text()='"+AssessmentName+"']")));
        if (uploadedFile.isDisplayed()) {
            List<WebElement> files = driver.findElements(table);
            int size = files.size();
            System.out.println("Number of assessments found: " + size);
            boolean assessmentFound = false;
            for (WebElement file : files) {
                String addedFile = file.getText();
                System.out.println("Assessment name found: " + addedFile);
                Thread.sleep(5000);
                if (AssessmentName.equals(addedFile)) {
                    Assert.assertEquals(AssessmentName, addedFile);
                    assessmentFound = true;
                    break;
                }
            }
            if (!assessmentFound) {
                System.out.println("Assessment name '" + AssessmentName + "' not found");
            }
        } else {
            System.out.println("No assessments found");
        }

    }
    public void checkNamesInGraph(String AssessmentName, String BarNames) throws InterruptedException {
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        ArrayList<String> graphNames = new ArrayList<>();
//        graphNames.add(AssessmentName);
//        String[] splitB = BarNames.split(",");
//        graphNames.addAll(Arrays.asList(splitB));
//
//        System.out.println(graphNames);
//
//        for(int i=0;i<graphNames.size();i++){
//            if(driver.findElements(By.xpath("//highcharts-chart//*[@class='highcharts-root']//*[text()='"+graphNames.get(i)+"']")).isEmpty()){
//                Assert.fail(graphNames.get(i) +" is not found in graph");
//            }else{
//                System.out.println(graphNames.get(i) +" is found in the graph ");
//            }
//            Thread.sleep(1000);
        //}
    }


    public void barsNamesAndCount(String BarsCount, String BarsNames, String AssessmentName) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        ArrayList<String> graphNames = new ArrayList<>();
        graphNames.add(AssessmentName);
        String[] splitB = BarsNames.split(",");
        graphNames.addAll(Arrays.asList(splitB));
        System.out.println(graphNames);
        for (int i = 0; i < graphNames.size(); i++) {
            if (driver.findElements(By.xpath("//highcharts-chart//*[@class='highcharts-root']//*[text()='" + graphNames.get(i) + "']")).isEmpty()) {
                System.out.println(graphNames.get(i) + " is not found in graph");
            } else {
                System.out.println(graphNames.get(i) + " is found in the graph");
            }
            Thread.sleep(1000);
        }
    }

    }






