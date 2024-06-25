package com.vassarlabs.projectname.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class GapAssessment_page {
    private WebDriver driver;
    private By selectYear = By.xpath("//select[@class='form-select form-select-sm ng-untouched ng-pristine ng-valid']");
    private By year = By.xpath("//option[text()='2024']");
    private By updatedOnUp = By.xpath("//i[@class='px-1 bi ng-star-inserted bi-sort-up']");
    private By updatedOnDown = By.xpath("//span[text()='Updated on ']/parent::div/span/i[contains(@class,'down')]");
    private By assessmentDown = By.xpath("//span[text()='Assessment Name ']/parent::div/span/i[contains(@class,'down')]");
    private By assessmentUp = By.xpath("//span[text()='Assessment Name ']/parent::div/span/i[contains(@class,'up')]");
    private By assessmentIcon = By.xpath("//i[@class='px-1 bi bi-sort-down']");
    private By copyIcon = By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/app-intial-gap-assesment[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/lib-data-table[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/button[1]/i[1]");
    private By copyAssessmentTitle = By.xpath("//h4[text()='Copy Assessment']");
    private By closeIcon = By.xpath("//button[@class='btn-close']");
    private By assessmentName = By.xpath("//input[@id='assessment_name']");
    private By cacnelButton = By.xpath("//button[text()='Cancel']");
    private By saveButton = By.xpath("//button[text()='Save']");
    private By assessmentCopiedToaster = By.xpath("//div[text()=' Assessment Copied Successfully ']");
    private By download = By.xpath("//tbody/tr[1]/td[3]/div[1]/button[2]/i[1]");
    private By deleteIcon = By.xpath("//button[@ngbtooltip='Delete File']");
    private By paginationDropdown = By.xpath("//select[@class='form-select form-select-sm small-dd ng-untouched ng-pristine ng-valid']");
    private By popupNoButton = By.xpath("//button[text()='No']");
    private By popupYesButton = By.xpath("//button[text()='Yes']");
    private By filedeletedToaster = By.xpath("//div[@aria-label='File deleted successfully']");
    private By nextIcon = By.xpath("//pagination-controls/pagination-template/nav/ul/li/a/span[text()='page']/parent::a");
    private By previous = By.xpath("//pagination-controls/pagination-template/nav/ul/li[@class='pagination-previous']");
    private By numberhyperlink = By.xpath("//span[text()='2']");
    private By popup = By.xpath("//span[text()='Are you sure to delete ?']");
    private By uploadIcon = By.xpath("//i[@class='bi bi-upload cursor']");
    private By replaceFile = By.xpath("//button[text()='Upload Replacement File']");
    private By status = By.xpath("//span[text()='Draft']");
    private By progress = By.xpath("//div[@class='custom-progress-bar']");
    private By remediationReadiness = By.xpath("//div[@class='status']");
    private By lastLogin = By.xpath("//div[@class='status d-flex justify-content-end']");
    private By sprsTitle = By.xpath("//span[text()=' Current SPRS Score ']");
    private By sprsLevel = By.xpath("//div[@class='card-value']");
    private By barsSection = By.xpath("//div[@class='card ng-star-inserted']//div[@class='card-body']");
    private By barsTitle = By.xpath("//div[@id='highcharts-cqaq02m-73']//*[name()='svg'][1]/*[name()='text'][1]");
    private By xaxis = By.xpath("//div[@id='highcharts-cqaq02m-73']//*[name()='svg'][1]/*[name()='g'][4]/*[name()='text'][1]");
    private By yaxis = By.xpath("//div[@id='highcharts-cqaq02m-73']//*[name()='svg'][1]/*[name()='g'][5]/*[name()='text'][1]");
    private By fullyImplementedLegend = By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/app-intial-gap-assesment[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/vl-chart[1]/highcharts-chart[1]/div[1]/*[name()='svg'][1]/*[name()='g'][7]/*[name()='g'][1]/*[name()='g'][1]/*[name()='g'][1]/*[name()='text'][1]");
    private By notApplicableLegend = By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/app-intial-gap-assesment[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/vl-chart[1]/highcharts-chart[1]/div[1]/*[name()='svg'][1]/*[name()='g'][7]/*[name()='g'][1]/*[name()='g'][1]/*[name()='g'][2]/*[name()='text'][1]");
    private By notImplementedLegend = By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/app-intial-gap-assesment[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/vl-chart[1]/highcharts-chart[1]/div[1]/*[name()='svg'][1]/*[name()='g'][7]/*[name()='g'][1]/*[name()='g'][1]/*[name()='g'][3]/*[name()='text'][1]");
    private By partiallyImplementedLegend = By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/app-intial-gap-assesment[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/vl-chart[1]/highcharts-chart[1]/div[1]/*[name()='svg'][1]/*[name()='g'][7]/*[name()='g'][1]/*[name()='g'][1]/*[name()='g'][4]/*[name()='text'][1]");
    private By notAnsweredLegend = By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/app-intial-gap-assesment[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/vl-chart[1]/highcharts-chart[1]/div[1]/*[name()='svg'][1]/*[name()='g'][7]/*[name()='g'][1]/*[name()='g'][1]/*[name()='g'][5]/*[name()='text'][1]");
    private By bar = By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/app-intial-gap-assesment[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/vl-chart[1]/highcharts-chart[1]/div[1]/*[name()='svg'][1]/*[name()='g'][6]/*[name()='g'][9]/*[name()='path'][1]");

    private By regulations = By.xpath("//ul[@class='nav nav-underline']");
    private By regulationPreviousIcon = By.xpath("//a[@class='previous cursor-pointer']//i[@class='bi bi-chevron-left']");
    private By regulationNextIcon = By.xpath("//a[@class='next cursor-pointer']//i[@class='bi bi-chevron-right']");
    private By regulationTab = By.xpath("");
    private By regulationPanel = By.xpath("//button[@id='ngb-accordion-item-0-toggle']");
    private By quizNextIcon = By.xpath("//div[@class='card-body ng-star-inserted']//div//i[@class='bi bi-chevron-right']");
    private By firstQuestion = By.xpath("//li[contains(text(),'Have you identified authorized users and limited s')]");
    private By retakeButton = By.xpath("//button[normalize-space()='Retake']");
    private By quizResult = By.xpath("//div[@class='values']");
    private By yes = By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/app-intial-gap-assesment[1]/app-gap-assessment-details[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/vl-chart[1]/highcharts-chart[1]/div[1]/*[name()='svg'][1]/*[name()='g'][3]/*[name()='g'][1]/*[name()='g'][1]/*[name()='g'][1]/*[name()='rect'][1]");
    private By no = By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/app-intial-gap-assesment[1]/app-gap-assessment-details[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/vl-chart[1]/highcharts-chart[1]/div[1]/*[name()='svg'][1]/*[name()='g'][3]/*[name()='g'][1]/*[name()='g'][1]/*[name()='g'][2]/*[name()='rect'][1]");
    private By notSure = By.xpath("//div[@id='highcharts-bgncptm-37']//*[name()='svg']//*[name()='g'][3]/*[name()='g'][1]/*[name()='g'][1]/*[name()='g'][3]/*[name()='rect'][1]");
    private By notAppliable = By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/app-intial-gap-assesment[1]/app-gap-assessment-details[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/vl-chart[1]/highcharts-chart[1]/div[1]/*[name()='svg'][1]/*[name()='g'][3]/*[name()='g'][1]/*[name()='g'][1]/*[name()='g'][4]/*[name()='rect'][1]");

    private By pieChart = By.xpath("//div[@id='highcharts-bgncptm-37']//*[name()='svg']//*[name()='g' and contains(@class,'highcharts')]//*[name()='g' and contains(@class,'highcharts')]//*[name()='path'][2]");
    private By implementationDropdown = By.xpath("//div[3]//div[1]//div[1]//select[1]");
    private By implementationDropdownValue = By.xpath("//option[text()='Partially Implemented']");
    private By nextSteps = By.xpath("//div[text()=' Next steps ']");
    private By nextStepsSection = By.xpath("//div[@class='card initial-gap-inner-card']//div[@class='card-body']");
    private By poamDropdown = By.xpath("//select[@class='form-select ng-pristine ng-valid ng-touched']");
    private By cancelButtonn = By.xpath("//button[text()='Cancel']");
    private By submitButtonn = By.xpath("//button[text()='Submit']");
    private By controlCenter = By.xpath("//p[text()='GenAI Control Center']");
    private By justify = By.xpath("//button[text()='Justify']");
    private By justificationsection = By.xpath("//div[@class='carousel']");
    private By justificationCancel = By.xpath("//div[@class='carousel']//button[text()='Cancel']");
    private By justificationNextIcon = By.xpath("//div[@class='carousel']//i[@class='bi bi-chevron-right']");
    private By justificationPeviousIcon = By.xpath("//button[@class='btn btn-sm carosuel-btns']//i[@class='bi bi-chevron-left']");
    private By justificationSubmitButton = By.xpath("//div[@class='carousel-controls']");
    private By justificationTextfield = By.xpath("//textarea[@class='carousel-textarea ng-pristine ng-valid ng-touched']");


    public GapAssessment_page(WebDriver driver) {
        this.driver = driver;
    }

    public void selectYear() throws InterruptedException {
        driver.findElement(selectYear).isDisplayed();
        Thread.sleep(3000);
        driver.findElement(selectYear).click();
        driver.findElement(year).isDisplayed();
        Thread.sleep(3000);
        driver.findElement(year).click();
    }

    public void sortIcons() throws InterruptedException {
        Thread.sleep(2000);
        if (driver.findElements(updatedOnDown).size() > 0) {
            Thread.sleep(2000);
            driver.findElement(updatedOnDown).click();
        }
        Thread.sleep(2000);
        driver.findElement(assessmentIcon).isDisplayed();
        driver.findElement(assessmentIcon).click();
        List<WebElement> elements = driver.findElements(updatedOnDown);
        if (elements.size() > 0) {
            Thread.sleep(2000);
            elements.get(0).click();
        }
        Thread.sleep(2000);
        driver.findElement(updatedOnUp).isDisplayed();
        driver.findElement(updatedOnUp).click();
    }

    public void copyIcon(String AssessmenttName, String CopyAssessmentToaster) throws InterruptedException {
        if (driver.findElement(By.xpath("//table//tr//td[2]//span[text()='fgfdgfdgfd']")).isDisplayed()) {
            driver.findElement(copyIcon).isDisplayed();
            Thread.sleep(3000);
            driver.findElement(copyIcon).click();
            Thread.sleep(3000);
            if (driver.findElement(copyAssessmentTitle).isDisplayed()) {
                Thread.sleep(3000);
                driver.findElement(assessmentName).sendKeys(AssessmenttName);
                Thread.sleep(3000);
                String assessName = driver.findElement(assessmentName).getText();
                System.out.println(assessName);
                Assert.assertEquals(AssessmenttName, assessName);
                if (driver.findElement(assessmentCopiedToaster).isDisplayed()) {
                    Thread.sleep(3000);
                    String toaster = driver.findElement(assessmentCopiedToaster).getText();
                    System.out.println(toaster);
                    Assert.assertEquals(CopyAssessmentToaster, toaster);
                }
            }
        }
    }


    public void downloadIcon() throws InterruptedException {
        driver.findElement(download).isDisplayed();
        Thread.sleep(3000);
        driver.findElement(download).click();
        Thread.sleep(3000);
    }

    public void deleteIcon(String DeletedFileToaster) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.findElement(deleteIcon).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(popup));
        driver.findElement(popupNoButton).click();
        driver.findElement(popupYesButton).click();
        String toaster = wait.until(ExpectedConditions.visibilityOfElementLocated(filedeletedToaster)).getText().trim();
        System.out.println(toaster);
        Assert.assertEquals(DeletedFileToaster, toaster);
    }

    public void pagination() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        //Pagination
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

    public void progressBar(String AssessmentName) throws InterruptedException {
        if (driver.findElement(By.xpath("//div[@class='row ng-star-inserted']//div[text()='" + AssessmentName + "']")).isDisplayed())
            ;
        {
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
            driver.findElement(sprsLevel).isDisplayed();
            String sprs = driver.findElement(sprsLevel).getText();
            System.out.println(sprs);
        }
    }

    public void barChart() throws InterruptedException {
        if (driver.findElement(barsSection).isDisplayed()) {
            Thread.sleep(3000);
            driver.findElement(barsTitle).isDisplayed();
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
            driver.findElement(partiallyImplementedLegend).isDisplayed();
            Thread.sleep(3000);
            driver.findElement(partiallyImplementedLegend).click();
            Thread.sleep(3000);
            driver.findElement(notAnsweredLegend).isDisplayed();
            Thread.sleep(3000);
            driver.findElement(notAnsweredLegend).click();
            Thread.sleep(3000);

        }

    }

    public void legendsOfBarChart() {

    }

    public void bars() throws InterruptedException {
        if (driver.findElement(barsSection).isDisplayed()) {
            Thread.sleep(3000);
            driver.findElement(bar).isDisplayed();
            driver.findElement(bar).click();
        }
    }

    public void regulationTabIcons() throws InterruptedException {
        if (driver.findElement(barsSection).isDisplayed()) {
            Thread.sleep(3000);
            driver.findElement(bar).isDisplayed();
            driver.findElement(bar).click();
            if (driver.findElement(regulations).isDisplayed()) {
                Thread.sleep(3000);
                driver.findElement(regulationNextIcon).isDisplayed();
                Thread.sleep(3000);
                driver.findElement(regulationNextIcon).click();
                driver.findElement(regulationPreviousIcon).isDisplayed();
                Thread.sleep(3000);
                driver.findElement(regulationPreviousIcon).click();
                Thread.sleep(3000);
            }
        }
    }

    public void regulationPanel() throws InterruptedException {
        regulationTabIcons();
        driver.findElement(regulationPanel).isDisplayed();
        Thread.sleep(3000);
        driver.findElement(regulationPanel).click();
    }

    public void kavylaQuiz(String QuizOne) throws InterruptedException {
        regulationTabIcons();
        if (driver.findElement(firstQuestion).isDisplayed()) {
            Thread.sleep(3000);
            driver.findElement(By.xpath("//form[@class='ng-untouched ng-pristine ng-invalid ng-star-inserted']//label[text()=' Yes ']")).isDisplayed();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//form[@class='ng-untouched ng-pristine ng-invalid ng-star-inserted']//label[text()=' Yes ']")).click();
            Thread.sleep(3000);
        }

    }

    public void quizButtonsAndIcons() throws InterruptedException {
        regulationTabIcons();
        if (driver.findElement(firstQuestion).isDisplayed()) {
            Thread.sleep(3000);
            driver.findElement(quizNextIcon).isDisplayed();
            Thread.sleep(3000);
            driver.findElement(quizNextIcon).click();
        }
    }

    public void retakeButton(String quizOne, String quizTwo, String quizThree, String quizFour, String quizFive) throws InterruptedException {
        regulationTabIcons();
        if (driver.findElement(firstQuestion).isDisplayed()) {
            Thread.sleep(3000);
            driver.findElement(By.xpath("//form[@class='ng-untouched ng-pristine ng-invalid ng-star-inserted']//label[text()='" + quizOne + "']")).click();
            Thread.sleep(3000);
            if (!driver.findElement(firstQuestion).isDisplayed()) {
                Thread.sleep(3000);
                driver.findElement(By.xpath("//form[@class='ng-untouched ng-pristine ng-invalid ng-star-inserted']//label[text()='" + quizOne + "']")).click();
                Thread.sleep(3000);
                if (!driver.findElement(firstQuestion).isDisplayed()) {
                    Thread.sleep(3000);
                    driver.findElement(By.xpath("//form[@class='ng-untouched ng-pristine ng-invalid ng-star-inserted']//label[text()='" + quizThree + "']")).click();
                    Thread.sleep(3000);
                    if (!driver.findElement(firstQuestion).isDisplayed()) {
                        Thread.sleep(3000);
                        driver.findElement(By.xpath("//form[@class='ng-untouched ng-pristine ng-invalid ng-star-inserted']//label[text()='" + quizFour + "']")).click();
                        Thread.sleep(3000);
                        if (!driver.findElement(firstQuestion).isDisplayed()) {
                            Thread.sleep(3000);
                            Thread.sleep(3000);
                            driver.findElement(By.xpath("//form[@class='ng-untouched ng-pristine ng-invalid ng-star-inserted']//label[text()='" + quizFive + "']")).click();
                            Thread.sleep(3000);
                        }
                    }
                }
            }
        }
        if (driver.findElement(retakeButton).isDisplayed()) {
            Thread.sleep(3000);
            driver.findElement(retakeButton).click();
            Thread.sleep(3000);

        }
    }

    public void quizResult() throws InterruptedException {
        driver.findElement(quizResult).isDisplayed();
        Thread.sleep(3000);
        String result = driver.findElement(quizResult).getText();
        System.out.println(result);
    }

    public void quizLegends() throws InterruptedException {
        if (driver.findElement(pieChart).isDisplayed()) {
            driver.findElement(yes).isDisplayed();
            Thread.sleep(3000);
            driver.findElement(yes).click();
            Thread.sleep(3000);
            driver.findElement(no).isDisplayed();
            Thread.sleep(3000);
            driver.findElement(no).click();
            Thread.sleep(3000);
            driver.findElement(notSure).isDisplayed();
            Thread.sleep(3000);
            driver.findElement(notSure).click();
            Thread.sleep(3000);
            driver.findElement(notAppliable).isDisplayed();
            Thread.sleep(3000);
            driver.findElement(notAppliable).click();
            Thread.sleep(3000);
        }
    }

    public void implementationDropdown() throws InterruptedException {
        driver.findElement(implementationDropdown).isDisplayed();
        Thread.sleep(3000);
        driver.findElement(implementationDropdown).click();
        driver.findElement(implementationDropdownValue).click();
        Thread.sleep(3000);

    }

    public void verifyNextSteps() throws InterruptedException {
        if (driver.findElement(nextSteps).isDisplayed()) {
            Thread.sleep(3000);
            WebElement stepsElement = driver.findElement(nextStepsSection);
            int stepsSize = stepsElement.findElements(By.xpath("//div[@class='card initial-gap-inner-card']//div[@class='card-body']")).size();
            if (stepsSize > 0) {
                String data = stepsElement.getText();
                System.out.println(data);
            }
        }
    }

        public void poamDropdown() throws Throwable {
//driver.findElement(poamDropdown).isDisplayed();
//Thread.sleep(3000);
//WebElement ele=driver.findElement(poamDropdown);
//ele.click();
//Select s= new Select(ele);
//s.selectByIndex(3);
        }


    public void cancelButton() throws InterruptedException {
        driver.findElement(cacnelButton).isDisplayed();
        Thread.sleep(3000);
        driver.findElement(cacnelButton).click();
        Thread.sleep(3000);

    }

    public void submitButton() throws InterruptedException {
        driver.findElement(submitButtonn).isEnabled();
        Thread.sleep(3000);
        driver.findElement(submitButtonn).click();
        Thread.sleep(3000);
    }

    public void justification() throws InterruptedException {
        driver.findElement(justify).isDisplayed();
        Thread.sleep(3000);
        driver.findElement(justify).click();
        driver.findElement(justificationsection).isDisplayed();
        Thread.sleep(3000);
        driver.findElement(justificationsection).sendKeys("Utilize log management tools to automate the generation, transmission, storage, analysis, and disposal of security log data Ensure logs are stored in sufficient detail for an appropriate period of time to support auditing and forensic analysis. Provide Audit Record Reduction and Report GenerationImplement tools for audit record reduction and report generation to support on-demand analysis and reporting Ensure these tools are integrated with the system audit logs and records.");
    }

    public void cancelJustification() throws InterruptedException {
        driver.findElement(justificationCancel).isDisplayed();
        Thread.sleep(3000);
        driver.findElement(justificationCancel).click();
        Thread.sleep(3000);
    }

    public void iconsOfJustification() throws InterruptedException {
             driver.findElement(justificationSubmitButton).isDisplayed();
        Thread.sleep(3000);
        driver.findElement(justificationSubmitButton).click();
        Thread.sleep(3000);
    }



}
