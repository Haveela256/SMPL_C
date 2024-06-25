package com.vassarlabs.projectname.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.net.PasswordAuthentication;
import java.time.Duration;

public class ChangePassword_page {
    private WebDriver driver;
   private By userProfileIcon = By.xpath("//img[@class='profile-style']");
    private By changePasswordOption = By.xpath("//button[@class='dropdown-item ng-star-inserted']//i[@class='icon-reset_password']");
    private By oldPassword=By.xpath("//input[@formcontrolname='oldPassword']");
    private By newPassword= By.xpath("//input[@formcontrolname='newPassword']");
    private By confirmPassword=By.xpath("//input[@formcontrolname='confirmPassword']");
    private By resetButton=By.xpath("//button[text()='Reset Password']");
    private By backHyperlink=By.xpath("//a[text()='Back']");
    private By newpasswordCharacters=By.xpath("//span[text()='Password must be atleast of 8 characters long']");
    private By oldPasswordRequired=By.xpath("//span[text()='Old Password is required.']");
    private By newPassordRequired=By.xpath("//span[text()='New Password is required']");
    private By confirmPasswordRequired=By.xpath("//span[text()='Confirm Password is required']");
    private By newPasswordFormat=By.xpath("//span[text()='Password must contain atleast one Uppercase character']");
    private By confirmPasswordError= By.xpath("//span[text()='Password doesn’t match']");
    private By changePasswordTitle= By.xpath("//h3[text()='Change Password ']");
    private By controlCenter=By.xpath("//div[text()=' Control Center']");


    public ChangePassword_page(WebDriver driver) {
        this.driver=driver;
    }

    public void clickOnChangePasssword() throws InterruptedException {
     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
     driver.findElement(userProfileIcon).click();
     Thread.sleep(3000);
     driver.findElement(changePasswordOption).click();
     Thread.sleep(3000);
     driver.findElement(changePasswordTitle).isDisplayed();
     Thread.sleep(3000);
    }

    public void oldPassword(String OldPassword, String ErrorMessage) throws InterruptedException {
     driver.findElement(oldPassword).click();
     Thread.sleep(3000);
     driver.findElement(oldPassword).sendKeys(OldPassword);
     if (driver.findElement(oldPasswordRequired).isDisplayed()){
      Thread.sleep(3000);
      String error=driver.findElement(oldPasswordRequired).getText();
      Assert.assertEquals(ErrorMessage, error);
     }
     else {
      System.out.println("Old Password entered");
     }
    }

    public void newPassword(String NewPassword, String ErrorMessage) throws InterruptedException {
     driver.findElement(newPassword).click();
     Thread.sleep(3000);
     driver.findElement(newPassword).sendKeys(NewPassword);
     if (driver.findElement(newpasswordCharacters).isDisplayed()) {
      Thread.sleep(3000);
      String error = driver.findElement(newpasswordCharacters).getText();
      Assert.assertEquals(ErrorMessage, error);
     }
     if (driver.findElement(newPasswordFormat).isDisplayed()) {
      Thread.sleep(3000);
      String error1 = driver.findElement(newPasswordFormat).getText();
      Assert.assertEquals(ErrorMessage, error1);
     }
     if (driver.findElement(newPassordRequired).isDisplayed()) {
      Thread.sleep(3000);
      String error2 = driver.findElement(newPassordRequired).getText();
      Assert.assertEquals(ErrorMessage, error2);
     }
    }

    public void confirmPassword(String ConfirmPassword, String ErrorMessage) throws InterruptedException {
     driver.findElement(confirmPassword).click();
     Thread.sleep(3000);
     driver.findElement(confirmPassword).sendKeys(ConfirmPassword);
     if (driver.findElement(confirmPasswordError).isDisplayed()) {
      Thread.sleep(3000);
      String error = driver.findElement(confirmPasswordError).getText();
      Assert.assertEquals(ErrorMessage, error);
     }
     if (driver.findElement(confirmPasswordRequired).isDisplayed()) {
      Thread.sleep(3000);
      String error1 = driver.findElement(confirmPasswordRequired).getText();
      Assert.assertEquals(ErrorMessage, error1);
     }
    }

    public void resetButton(String OldPassword, String NewPassword, String ConfirmPassword, String ErrorMessage, String ErrorToaster) throws InterruptedException {
     oldPassword( OldPassword, ErrorMessage);
     newPassword( NewPassword,  ErrorMessage);
     confirmPassword( ConfirmPassword,  ErrorMessage);
     if(driver.findElement(resetButton).isEnabled()){
      Thread.sleep(3000);
      driver.findElement(resetButton).click();
      Thread.sleep(3000);
     }else{
      System.out.println("Reset button is disbaled");
     }
    }

    public void backHyperlink() throws InterruptedException {
     driver.findElement(backHyperlink).isEnabled();
     Thread.sleep(3000);
     driver.findElement(backHyperlink).click();
     driver.findElement(controlCenter).isDisplayed();
     Thread.sleep(3000);
     System.out.println("controlCenter is displayed");
    }
}
