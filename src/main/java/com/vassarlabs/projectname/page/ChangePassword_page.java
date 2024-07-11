package com.vassarlabs.projectname.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChangePassword_page {
 private WebDriver driver;
 private By userProfileIcon = By.xpath("//img[@class='profile-style']");
 private By changePasswordOption = By.xpath("//button[@class='dropdown-item']/text()/parent::button");
 private By oldPassword = By.xpath("//input[@formcontrolname='oldPassword']");
 private By newPassword = By.xpath("//input[@formcontrolname='newPassword']");
 private By confirmPassword = By.xpath("//input[@formcontrolname='confirmPassword']");
 private By resetButton = By.xpath("//button[text()='Reset Password']");
 private By backHyperlink = By.xpath("//a[text()='Back']");
 private By newpasswordCharacters = By.xpath("//span[text()='Password must be atleast of 8 characters long']");
 private By oldPasswordRequired = By.xpath("//span[text()='Old Password is required.']");
 private By newPassordRequired = By.xpath("//span[text()='New Password is required']");
 private By confirmPasswordRequired = By.xpath("//span[text()='Confirm Password is required']");
 private By newPasswordFormat = By.xpath("//span[text()='Password must contain atleast one Uppercase character']");
 private By confirmPasswordError = By.xpath("//span[text()='Password doesn’t match']");
 private By changePasswordTitle = By.xpath("//h3[text()='Change Password ']");
 private By controlCenter = By.xpath("//div[text()=' Control Center']");
 private By changePasswordSame=By.xpath("//div[text()='New password can not be same as your current password!']");
 boolean reset = false;


 public ChangePassword_page(WebDriver driver) throws InterruptedException {
  this.driver = driver;
 }

 public void clickOnChangePasssword() throws InterruptedException {
  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
  driver.findElement(userProfileIcon).click();
  Thread.sleep(3000);
  driver.findElements(changePasswordOption).get(1).click();
  Thread.sleep(3000);
  driver.findElement(changePasswordTitle).isDisplayed();
  Thread.sleep(3000);
 }

 public void oldPassword(String OldPassword) throws InterruptedException {
  driver.findElement(oldPassword).click();
  Thread.sleep(3000);
  driver.findElement(oldPassword).sendKeys(OldPassword);
 }

 public void newPassword(String NewPassword) throws InterruptedException {
  driver.findElement(newPassword).click();
  Thread.sleep(3000);
  driver.findElement(newPassword).sendKeys(NewPassword);
 }

 public void confirmPassword(String ConfirmPassword) throws InterruptedException {
  driver.findElement(confirmPassword).click();
  Thread.sleep(3000);
  driver.findElement(confirmPassword).sendKeys(ConfirmPassword);
 }


 public void resetButton(String OldPassword, String NewPassword, String ConfirmPassword) throws InterruptedException {
  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
  if (driver.findElement(resetButton).isDisplayed()) {
   System.out.println("Reset Button is displayed");
     }
  }
 public void errors(String OldPasswordError,String PasswordCharacterError, String PasswordUppercaseError, String PasswordsError, String NewPasswordError, String ConfirmPasswordError, String ErrorToaster ) {
  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
  if (driver.findElement(resetButton).isEnabled()) {
   driver.findElement(resetButton).click();
  } else if (wait.until(ExpectedConditions.visibilityOfElementLocated(changePasswordTitle)).isDisplayed()) {
   driver.findElement(changePasswordTitle).click();
   int value = 0;
   if (OldPasswordError.contains("Old Password is required.")) {
    value = 1;
    System.out.println("Case 1 Will Run");
   }
   if (PasswordUppercaseError.contains("atleast one Uppercase")) {
    value = 2;
    System.out.println("Case 2 Will Run");
   }
   if (PasswordCharacterError.contains("atleast of 8 characters")) {
    value = 3;
    System.out.println("Case 3 Will Run");
   }
   if (PasswordsError.contains("Passwords doesn't match")) {
    value = 4;
    System.out.println("Case 4 Will Run");
   }
   if (NewPasswordError.contains("New Password is Required")) {
    value = 5;
    System.out.println("Case 5 Will Run");
   }
   if (ConfirmPasswordError.contains("Confirm Password is Required")) {
    value = 6;
    System.out.println("Case 6 Will Run");
   }
   if (ErrorToaster.contains("New password can not be same as your current password")) {
    value = 7;
    System.out.println("Case 7 Will Run");
   }


   switch (value) {
    case 1:
     Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(oldPasswordRequired)).isDisplayed(),"Old Password is required");
     String error1 = driver.findElement(oldPasswordRequired).getText();
     System.out.println(error1);
     Assert.assertEquals(OldPasswordError, error1);
     reset = true;
     break;
    case 2:
     Assert.assertTrue(driver.findElement(newPasswordFormat).isDisplayed(),"atleast one Uppercase");
     String error2 = driver.findElement(newPasswordFormat).getText();
     System.out.println(error2);
     Assert.assertEquals(PasswordUppercaseError, error2);
     reset = true;
     break;
    case 3:
     Assert.assertTrue(driver.findElement(newpasswordCharacters).isDisplayed(), "atleast of 8 characters");
     String error3 = driver.findElement(newpasswordCharacters).getText();
     System.out.println(error3);
     Assert.assertEquals(PasswordCharacterError, error3);
     reset = true;
     break;
    case 4:
     Assert.assertTrue(driver.findElement(confirmPasswordError).isDisplayed(), "Password doesn’t match");
     String error4 = driver.findElement(confirmPasswordError).getText();
     System.out.println(error4);
     Assert.assertEquals(PasswordsError , error4);
     reset = true;
     break;
    case 5:
     Assert.assertTrue(driver.findElement(newPassordRequired).isDisplayed(), "New Password is Required");
     String error5 = driver.findElement(newPassordRequired).getText();
     System.out.println(error5);
     Assert.assertEquals(NewPasswordError, error5);
     reset = true;
     break;
    case 6:
     Assert.assertTrue(driver.findElement(confirmPasswordRequired).isDisplayed(), "Confirm Password is required");
     String error6 = driver.findElement(confirmPasswordRequired).getText();
     System.out.println(error6);
     Assert.assertEquals(ConfirmPasswordError, error6);
     reset = true;
     break;
   case 7:
    Assert.assertTrue(driver.findElement(changePasswordSame).isDisplayed(), "New password can not be same as your current password!");
    String error7 = driver.findElement(changePasswordSame).getText();
    System.out.println(error7);
    Assert.assertEquals(ConfirmPasswordError, error7);
    reset = true;
    break;
    default:
     System.out.println("No case matched.");
     break;
   }
  } else {
   System.out.println("Error message is not displayed");
  }
 }


 public void backHyperlink() throws InterruptedException {
  try {
   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

   // Wait for the backHyperlink to be visible
   WebElement backLink = wait.until(ExpectedConditions.visibilityOfElementLocated(backHyperlink));

   if (backLink.isDisplayed()) {
    System.out.println("Back Hyperlink is displayed");
    // Click the back hyperlink
    backLink.click();

    // Wait for the control center to be displayed
    WebElement controlCenterElement = wait.until(ExpectedConditions.visibilityOfElementLocated(controlCenter));

    if (controlCenterElement.isDisplayed()) {
     System.out.println("controlCenter is displayed");
    } else {
     System.out.println("controlCenter is not displayed after clicking the back hyperlink");
    }
   } else {
    System.out.println("Back Hyperlink is not displayed");
   }
  } catch (Exception e) {
   System.out.println("An error occurred: " + e.getMessage());
  }
 }


}

