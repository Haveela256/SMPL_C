package com.vassarlabs.projectname.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class HireAnExpert_Page {
    private WebDriver driver;
    private By usernamePath = By.xpath("//input[@formcontrolname='email']");
    private By passwordPath = By.xpath("//input[@formcontrolname='password']");
    private By siginButtonPath = By.xpath("//button[text()='Sign In ']");
    private By hireAnExpertPath = By.xpath("//span[text()='Hire an Expert']");
    private By searchPath = By.xpath("//input[@placeholder='Search']");
    private By pinSubmitButtonPath = By.xpath("//button[text()='Submit']");
    private By resendCodePath = By.xpath("//u[text()='Resend code']");
    private By morePath = By.xpath("//i[@class='bi bi-three-dots-vertical']");
    private By emailButtonPath = By.xpath("//button[text()='Email']");
    private By subjectPath = By.xpath("//input[@id='subject']");
    private By bodyPath = By.xpath("//textarea[@id='body']");
    private By submitButtonPath = By.xpath("//button[text()='Submit']");
    private By toasterPath = By.xpath("//div[@id='toast-container']/div/div");
    private By requestPath = By.xpath("//span[text()='Requests']");
    private By pendingDropDownPath = By.xpath("//select[@class='form-select form-select-sm ng-pristine ng-valid ng-touched']");
    private By bodyError = By.xpath("//span[text()=' Email Body is Required ']");

    String expected = "Expected: ";
    String but_Found = "But Found: ";
    String expectedToaster;


    public HireAnExpert_Page(WebDriver driver) {
        this.driver = driver;
    }


    public void loginWithValidCredential(String username, String password, String pin) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        wait.until(ExpectedConditions.elementToBeClickable(usernamePath));
        driver.findElement(usernamePath).sendKeys(username);
        driver.findElement(passwordPath).sendKeys(password);

        wait.until(ExpectedConditions.elementToBeClickable(siginButtonPath));
        driver.findElement(siginButtonPath).click();

        wait.until(ExpectedConditions.elementToBeClickable(resendCodePath));
        int num = 1;
        for (String p : pin.split("-")) {
            driver.findElement(By.xpath("//div[@class='otp-container']/input[" + num + "]")).sendKeys(p);
            num++;
        }
        driver.findElement(pinSubmitButtonPath).click();

    }

    public void goToHireAnExpert(String search, String Subject, String body, String toaster, String ErrorMessage) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        wait.until(ExpectedConditions.elementToBeClickable(hireAnExpertPath));
        driver.findElement(hireAnExpertPath).click();

        if (!driver.findElements(searchPath).isEmpty()) {
            wait.until(ExpectedConditions.elementToBeClickable(searchPath));
            driver.findElement(searchPath).sendKeys(search);
            Thread.sleep(2000);

            wait.until(ExpectedConditions.elementToBeClickable(morePath));
            driver.findElement(morePath).click();
            wait.until(ExpectedConditions.elementToBeClickable(emailButtonPath));
            driver.findElement(emailButtonPath).click();
            Thread.sleep(1000);
            wait.until(ExpectedConditions.elementToBeClickable(subjectPath));
            Thread.sleep(1000);
            driver.findElement(subjectPath).sendKeys(Subject);
            Thread.sleep(1000);
            driver.findElement(bodyPath).sendKeys(body);
            wait.until(ExpectedConditions.elementToBeClickable(submitButtonPath));
            driver.findElement(submitButtonPath).click();
            Thread.sleep(3000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(toasterPath));
            Thread.sleep(3000);
            expectedToaster = driver.findElement(toasterPath).getText();
            Assert.assertEquals(toaster, expectedToaster);

        } else {
            System.out.println("No experts Found");
        }

        //Request
        wait.until(ExpectedConditions.elementToBeClickable(requestPath));
        driver.findElement(requestPath).click();
        if (!driver.findElements(By.xpath("//div[@class='card ng-star-inserted']")).isEmpty()) {
            //Mail
            driver.findElement(By.xpath("//div[@class='card ng-star-inserted']/descendant::button[text()='Email'][1]")).click();
            wait.until(ExpectedConditions.elementToBeClickable(subjectPath));
            driver.findElement(subjectPath).sendKeys(Subject);
            driver.findElement(bodyPath).sendKeys(body);
            wait.until(ExpectedConditions.elementToBeClickable(submitButtonPath));
            driver.findElement(submitButtonPath).click();
            Thread.sleep(3000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(toasterPath));
            Thread.sleep(3000);
            expectedToaster = driver.findElement(toasterPath).getText();
            Assert.assertEquals(expectedToaster, toaster, expected + expectedToaster + but_Found + toaster);

            //Decline
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@class='card ng-star-inserted'][1]/descendant::button[text()='Decline'][1]"))));
            driver.findElement(By.xpath("//div[@class='card ng-star-inserted'][1]/descendant::button[text()='Decline'][1]")).click();

            //Approve
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@class='card ng-star-inserted'][1]/descendant::button[text()='Approve'][1]"))));
            driver.findElement(By.xpath("//div[@class='card ng-star-inserted'][1]/descendant::button[text()='Approve'][1]")).click();

        } else if (driver.findElement(bodyError).isDisplayed()) {
            String error = driver.findElement(bodyError).getText();
            System.out.println(bodyError);
            Assert.assertEquals(ErrorMessage, error);
        } else {
            System.out.println("Error is not displayed");
        }
    }
}
