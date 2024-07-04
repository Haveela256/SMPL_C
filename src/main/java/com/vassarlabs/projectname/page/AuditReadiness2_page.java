package com.vassarlabs.projectname.page;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AuditReadiness2_page {

    private WebDriver driver;
    private By regulationCard = By.xpath("//div[contains(text(),'Access Control')]");
    private By implementaionDropdown = By.xpath("//select[@class='form-select ng-pristine ng-valid ng-touched']");
    private By requiredEvidenceText = By.xpath("//div[normalize-space()='Required Evidence']");
    private By uploadRelevantDoc = By.xpath("//select[@class='form-select ng-untouched ng-pristine ng-valid']");
    private By uploadIcon = By.xpath("//body/app-root/div[@class='d-flex']/div[@class='right-container']/app-audit-readiness/app-audit-readiness-details-page/div[@class='main-container']/div[@class='main-content side-nav-hide']/div[@class='middle-content has-sidemenu']/div[@class='content-container']/div[@class='category-inner-body']/div[@class='category-content']/div[@class='card']/div[1]");
    private By browsePath = By.xpath("//body/app-root/div[@class='d-flex']/div[@class='right-container']/app-audit-readiness/app-audit-readiness-details-page/div[@class='main-container']/div[@class='main-content side-nav-hide']/div[@class='middle-content has-sidemenu']/div[@class='content-container']/div[@class='category-inner-body']/div[@class='category-content']/div[@class='card']/div[1]");

    private By justificationPanel = By.xpath("//button[@id='ngb-accordion-item-0-toggle']");
    private By summarize = By.xpath("//button[@class='btn btn-primary btn-sm mr-1']");

    private By probavilityOfPassingCertification = By.xpath("//span[@class='value']");
    private By uploadDocsTable = By.xpath("//div[@class='title mt-2']");

    private By docTypeSort = By.xpath("//i[@class='px-1 bi bi-sort-down']");
    private By FileNameSort = By.xpath("//i[@class='px-1 bi bi-filter']");
    private By downloadIcon = By.xpath("//i[@class='bi bi-download']");
    private By deleteIcon = By.xpath("//i[@class='bi bi-trash3-fill']");

    private By justification = By.xpath("//div[@class='title'][normalize-space()='Justification for the implementation of required controls']");
    private By reuploadButton = By.xpath("//button[@class='btn btn-primary btn-sm']");
    private By ediTicon = By.xpath("//i[@class='bi bi-pencil-square']");
    private By editData = By.xpath("//li[contains(text(),'The document includes sections on Data Classificat')]");
    private By saveIcon = By.xpath("//i[@class='bi bi-floppy']");
    private By justificationToaster = By.xpath("//div[text()=' Justification Saved Successfully ']");
    //    private By downloadIcon = By.xpath("//button[@ngbtooltip='Download File']");
//    private By deleteIcon = By.xpath("//button[@ngbtooltip='Delete File']");
    private By paginationDropdown = By.xpath("//select[@class='form-select form-select-sm small-dd ng-untouched ng-pristine ng-valid']");
    private By popupNoButton = By.xpath("//button[text()='No']");
    private By popupYesButton = By.xpath("//button[text()='Yes']");
    private By filedeletedToaster = By.xpath("//div[@aria-label='File deleted successfully']");
    private By nextIcon = By.xpath("//pagination-controls/pagination-template/nav/ul/li/a/span[text()='page']/parent::a");
    private By previous = By.xpath("//pagination-controls/pagination-template/nav/ul/li[@class='pagination-previous']");
    private By numberhyperlink = By.xpath("//span[text()='2']");
    private By popup = By.xpath("//span[text()='Are you sure to delete ?']");
    private By yes = By.xpath("//button[text()='Delete']");
    private By previousIcon = By.xpath("//a[@class='previous cursor-pointer']//i[@class='bi bi-chevron-left']");
    private By auditrediness = By.xpath("//span[normalize-space()='Audit Readiness']");
    private By uploadPolicy=By.xpath("//button[normalize-space()='Upload Policy']");
    private By policytoaster=By.xpath("//div[text()=' Assessment Policy Document Save Successfull. ']");



    public AuditReadiness2_page(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyJustification() {
        ArrayList<String> dropdownOptions = new ArrayList<>();
        // Fetch all options from the dropdown
        List<WebElement> options = driver.findElements(By.xpath("//select[contains(@class,'form-select')]/option[text()='Select Document']/parent::select/option"));
        // Add each option's text to the ArrayList and print it
        for (WebElement option : options) {
            String text = option.getText();
            dropdownOptions.add(text);
            System.out.println(text);
        }
        Assert.assertFalse(dropdownOptions.isEmpty(), "Dropdown options should not be empty.");
        for (String optionText : dropdownOptions) {
            WebElement dropdown = driver.findElement(By.xpath("//select[contains(@class,'form-select')]/option[text()='Select Document']/parent::select/option"));
            dropdown.click();
            WebElement optionToClick = driver.findElement(By.xpath("//following::button[text()='" + optionText + "']"));
            optionToClick.click();
            WebElement ele = driver.findElement(By.xpath("//div[text()=' Justification for the implementation of required controls ']//following::button[text()='" + optionText + "']"));
            ele.click();
            Assert.assertTrue(ele.isDisplayed(), "The element for option " + optionText + " should be displayed.");
        }

    }

    public void cards(String Cards, String AssessmentName) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.findElement(auditrediness).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='" + AssessmentName + "']")));
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='" + AssessmentName + "']")).click();
        Thread.sleep(3000);
        String[] dummy = Cards.split(",");
        ArrayList<String> cardNames = new ArrayList<>(Arrays.asList(dummy));
        System.out.println(cardNames);
        for (int i = 0; i < cardNames.size(); i++) {
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()=' "+ cardNames.get(i) +" ']")));
            driver.findElement(By.xpath("//div[text()=' "+ cardNames.get(i) +" ']")).click();
            Thread.sleep(3000);
            System.out.println(cardNames.get(i)+" is clicked");
        }
    }




public void browse(String UploadFile) {
    driver.findElement(uploadIcon).sendKeys(UploadFile);
}


public void reupload(String ReuploadFile) {
    driver.findElement(reuploadButton).isDisplayed();
    driver.findElement(reuploadButton).sendKeys(ReuploadFile);
}

public void editJustification(String EditText) {
        if(driver.findElement(By.xpath("//button[text()='System activity monitoring reports']")).isDisplayed()) {
            driver.findElement(By.xpath("//button[text()='System activity monitoring reports']")).click();
            driver.findElement(ediTicon).click();
            driver.findElement(editData).sendKeys(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE);
        }
}

public void saveJustifiaction(String JustificationToaster) {
    driver.findElement(saveIcon).click();
    driver.findElement(justificationToaster).isDisplayed();
    String toaster = driver.findElement(justificationToaster).getText();
    System.out.println(toaster);
    Assert.assertEquals(JustificationToaster, toaster);
}

public void summraize() {
    driver.findElement(summarize).isDisplayed();
    driver.findElement(summarize).click();
}

public void probability() {
    String probability = driver.findElement(probavilityOfPassingCertification).getText();
    System.out.println(probability);
}

public void downloadIcon() {
    if(driver.findElement(By.xpath("//button[text()='System activity monitoring reports']")).isDisplayed()) {
        driver.findElement(By.xpath("//button[text()='System activity monitoring reports']")).click();
    driver.findElement(downloadIcon).click();
}}

public void deleteIcon() {
    if(driver.findElement(By.xpath("//button[text()='System activity monitoring reports']")).isDisplayed()) {
        driver.findElement(By.xpath("//button[text()='System activity monitoring reports']")).click();
    driver.findElement(deleteIcon).click();
}}

public void deletepopup() {
    driver.findElement(deleteIcon).click();
    driver.findElement(yes).click();
}

public void sortIcons() throws InterruptedException {
    Thread.sleep(2000);
    if (driver.findElements(docTypeSort).size() > 0) {
        Thread.sleep(2000);
        driver.findElement(docTypeSort).click();
    }
    Thread.sleep(2000);
    driver.findElement(FileNameSort).isDisplayed();
    driver.findElement(FileNameSort).click();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    driver.findElement(downloadIcon).click();
    driver.findElement(deleteIcon).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(popup));
}

public void pagination() {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
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

public void regulationtabs(String Regulationtabs) throws InterruptedException {
    driver.findElement(nextIcon).click();
    Thread.sleep(3000);
}


public void implemetationDropdown(String UploadFile) throws InterruptedException {
    driver.findElement(implementaionDropdown).click();
    Thread.sleep(3000);
    WebElement ele = driver.findElement(implementaionDropdown);
    Select dropdown = new Select(ele);
    List<WebElement> dropdownOptions = driver.findElements(By.xpath("//select[contains(@class,'form-select')]/option[text()='Select Document']/parent::select/option"));
    int size = dropdownOptions.size();
    for (int i = 1; i <= size; i++) {
        dropdown.selectByIndex(i);
        browse(UploadFile);
}

}

public void previousIconOfRegulation(String Regulationtabs) throws InterruptedException {
    driver.findElement(previous).click();
    Thread.sleep(3000);
}

public void uploadRelevenatDoc(String UploadFile) throws InterruptedException {
    driver.findElement(uploadRelevantDoc).click();
    Thread.sleep(3000);
    WebElement ele = driver.findElement(uploadRelevantDoc);
    Select dropdown = new Select(ele);
    dropdown.selectByIndex(1);
}

public void uploadedDocsTable() {
    ArrayList<String> dropdownOptions = new ArrayList<>();
    List<WebElement> options = driver.findElements(By.xpath("//select[contains(@class,'form-select')]/option[text()='Select Document']/parent::select/option"));
    for (WebElement option : options) {
        String text = option.getText();
        dropdownOptions.add(text);
        System.out.println(text);
    }
    Assert.assertFalse(dropdownOptions.isEmpty(), "Dropdown options should not be empty.");
    for (String optionText : dropdownOptions) {
        WebElement tableElement = driver.findElement(By.xpath("//table//td//span[text()='" + optionText + "']"));
        Assert.assertTrue(tableElement.isDisplayed(), "The option " + optionText + " should be displayed in the table.");
        System.out.println(optionText + " is displayed in the table");
    }
    }

    public void uploadPolicyDoc(String UploadPolicy, String PolicyDocToaster) {
        driver.findElement(uploadPolicy).sendKeys(UploadPolicy);
       if(driver.findElement(policytoaster).isDisplayed()){
           String policy=driver.findElement(policytoaster).getText();
           System.out.println(policy);
           Assert.assertEquals(PolicyDocToaster, policy);
       }
    }
}

