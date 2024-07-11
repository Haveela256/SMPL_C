//package com.vassarlabs.projectname.page;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//
//import java.time.Duration;
//
//public class MyProfile_page {
//    private WebDriver driver;
//    private By userProfileIcon = By.xpath("//img[@class='profile-style']");
//    private By myProfileOption = By.xpath("//button[normalize-space()='My Profile']");
//    private By myProfileTitle = By.xpath("//div[text()=' My Profile']");
//    private By editButtonPath = By.xpath("//button[@class='btn btn-primary btn-sm']//i");
//    private By firstNameField = By.xpath("//input[@placeholder='Enter First Name']");
//    private By middleNameField = By.xpath("//input[@placeholder='Enter Middle Name']");
//    private By lastNameField = By.xpath("//input[@placeholder='Enter Last Name']");
//    private By designation = By.xpath("//input[@placeholder='Enter Designation']");
//    private By uploadImage = By.xpath("//div[@class='profile-picture']//span[text()='Browse']");
//    private By image = By.xpath("//input[@class='form-control']");
//    private By cancelButton = By.xpath("//button[text()='Cancel']");
//    private By submitButton = By.xpath("//button[text()='Submit']");
//    private By userDetailsUpdatedToaster = By.xpath("//div[text()=' Profile updated successfully ']");
//    private By alpahabetError = By.xpath("//span[text()='Only Alphabets are allowed']");
//    private By firstNameRequired = By.xpath("//span[text()='First Name is required']");
//    private By lastNameRequired = By.xpath("//span[text()='Last Name is required']");
//    private By browse = By.xpath("//span[text()='Browse']/../../..//input[@type='file']");
//    private By ok = By.xpath("//button[normalize-space()='Ok']");
//    private By cropPopup = By.xpath("//h4[text()='Crop Image']");
//    private By cropPopupCancel = By.xpath("//button[@type='button'][normalize-space()='Cancel']");
//    private By cropPlus = By.xpath("//i[@class='bi bi-plus-lg']");
//    private By cropMinus = By.xpath("//div[@class='modal-body']//button[2]");
//    private By imageSize = By.xpath("//span[@class='ngx-ic-resize ngx-ic-bottomleft ng-star-inserted']");
//    private By fitImage = By.xpath("//button[@id='imageFitting']");
//    private By deleteUser = By.xpath("//button[@ngbtooltip='Delete User']");
//    private By firstInvalid = By.xpath("//span[text()=' First name is Invalid ']");
//    private By lastNameInavlid = By.xpath("//span[text()=' Last name is Invalid ']");
//    private By emailInavlid = By.xpath("//span[text()=' Email is not Valid ']");
//    private By middleNameInvalid = By.xpath("//span[text()=' Middle name is Invalid ']");
//    private By designationInvalid = By.xpath("//span[text()=' Please enter a title with at least 3 characters ']");
//    private By cropPopupTitle = By.xpath("//h4[@class='modal-title']");
//    private By replaceIcon = By.xpath("//input[@type='file']");
//    boolean submit = false;
//
//
//    public MyProfile_page(WebDriver driver) {
//        this.driver = driver;
//
//    }
//
//    public void myProfile() throws InterruptedException {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        driver.findElement(userProfileIcon).click();
//        Thread.sleep(9000);
//        driver.findElement(myProfileOption).click();
//        Thread.sleep(3000);
//        driver.findElement(myProfileTitle).isDisplayed();
//        Thread.sleep(3000);
//    }
//
//    public void editButton() throws InterruptedException {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        wait.until(ExpectedConditions.elementToBeClickable(editButtonPath));
//        if (driver.findElement(editButtonPath).isDisplayed()) {
//            Thread.sleep(3000);
//            driver.findElement(editButtonPath).click();
//            System.out.println("Edit button clicked");
//        } else {
//            System.out.println("Edit button is not displayed");
//        }
//    }
//
//
//    public void clickOnCancelButton() throws InterruptedException {
//        driver.findElement(cancelButton).isDisplayed();
//        Thread.sleep(3000);
//        driver.findElement(cancelButton).click();
//        Thread.sleep(3000);
//    }
//
//    public void addDetails(String FirstName, String MiddleName, String LastName, String Designation, String File, String ReplaceFile, String EmailAddress) throws InterruptedException {
//        if (driver.findElement(editButtonPath).isDisplayed()) {
//            Thread.sleep(6000);
//            driver.findElement(editButtonPath).click();
//            Thread.sleep(5000);
//            WebElement ele1 = driver.findElement(firstNameField);
//            Thread.sleep(5000);
//            ele1.click();
//            Thread.sleep(5000);
//            ele1.sendKeys(Keys.CONTROL + "a" + Keys.DELETE);
//            ele1.sendKeys(FirstName);
//            Thread.sleep(3000);
//            WebElement ele2 = driver.findElement(middleNameField);
//            ele2.click();
//            ele2.sendKeys(Keys.CONTROL + "a" + Keys.DELETE);
//            ele2.sendKeys(MiddleName);
//            WebElement ele3 = driver.findElement(lastNameField);
//            ele3.click();
//            ele3.sendKeys(Keys.CONTROL + "a" + Keys.DELETE);
//            ele3.sendKeys(LastName);
//            String emailEntered=driver.findElement(By.xpath("//input[@formcontrolname='email']")).getText();
//            System.out.println("Email displayed is " +EmailAddress);
//            WebElement ele4 = driver.findElement(designation);
//            ele4.click();
//            ele4.sendKeys(Keys.CONTROL + "a" + Keys.DELETE);
//            ele4.sendKeys(Designation);
//        }
//
//    }
//    public void profile(String File, String ReplaceFile) throws InterruptedException {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
////        if (driver.findElement(image).isDisplayed()) {
////            driver.findElement(image).sendKeys(File);
////            Thread.sleep(3000);}
//            if (driver.findElement(browse).isDisplayed()) {
//                Thread.sleep(3000);
//                driver.findElement(browse).sendKeys(File);
//                System.out.println("File selected");
//                Thread.sleep(7000);
//                if (driver.findElement(cropPopup).isDisplayed()) {
//                    driver.findElement(cropPopupCancel).isDisplayed();
//                    driver.findElement(cropPopupCancel).click();
//                    driver.findElement(browse).sendKeys(File);
//                    System.out.println("File selected");
//                    Thread.sleep(7000);
//                    if (driver.findElement(cropPopupTitle).isDisplayed()) {
//                        driver.findElement(cropMinus).click();
//                        driver.findElement(cropPlus).click();
//                        driver.findElement(fitImage).click();
//                        driver.findElement(ok).isDisplayed();
//                        Thread.sleep(3000);
//                        driver.findElement(ok).click();
//                    } else if (driver.findElement(replaceIcon).isDisplayed()) {
//                        Thread.sleep(9000);
//                        driver.findElement(replaceIcon).sendKeys(ReplaceFile);
//                    }
//                }
//            }}
//
//    public void clickOnSubmitButton(String FirstName, String MiddleName, String LastName, String Designation, String ErrorMessage, String DetailsUpdatedToaster, String ErrorToaster) throws InterruptedException {
////        if (driver.findElement(editButtonPath).isDisplayed()) {
////            Thread.sleep(7000);
////            driver.findElement(editButtonPath).click();
////            Thread.sleep(5000);
////            Thread.sleep(3000);
//            System.out.println(ErrorMessage);
//            int value = 0;
//            if (ErrorMessage.contains("First Name")) {
//                value = 1;
//                System.out.println("Case 1 Will Run");
//            }
//            if (ErrorMessage.contains("Middle Name")) {
//                value = 2;
//                System.out.println("Case 2 Will Run");
//            }
//            if (ErrorMessage.contains("Last Name")) {
//                value = 3;
//                System.out.println("Case 3 Will Run");
//            }
//            if (ErrorMessage.contains("Designation")) {
//                value = 4;
//                System.out.println("Case 4 Will Run");
//            }
//            switch (value) {
//                case 1:
//                    if (driver.findElements(firstInvalid).size() > 0) {
//                        String firstnameError = driver.findElement(firstInvalid).getText();
//                        System.out.println(firstnameError);
//                        Assert.assertEquals(ErrorMessage, firstnameError);
//                        submit = true;
//                    }
//                    break;
//                case 2:
//                    if (driver.findElements(middleNameInvalid).size() > 0) {
//                        String middleNameError = driver.findElement(middleNameInvalid).getText();
//                        System.out.println(middleNameError);
//                        Assert.assertEquals(ErrorMessage, middleNameError);
//                        submit = true;
//                    }
//                    break;
//                case 3:
//                    if (driver.findElements(lastNameInavlid).size() > 0) {
//                        String lastNameError = driver.findElement(lastNameInavlid).getText();
//                        System.out.println(lastNameError);
//                        Assert.assertEquals(ErrorMessage, lastNameError);
//                        submit = true;
//                    }
//                    break;
//                case 4:
//                    if (driver.findElements(designationInvalid).size() > 0) {
//                        String designationError = driver.findElement(designationInvalid).getText();
//                        System.out.println(designationError);
//                        Assert.assertEquals(ErrorMessage, designationError);
//                        submit = true;
//                    }
//                    break;
//                case 5:
//                    if (driver.findElements(firstNameRequired).size() > 0) {
//                        String firstNameRequiredError = driver.findElement(firstNameRequired).getText();
//                        System.out.println(firstNameRequiredError);
//                        Assert.assertEquals(ErrorMessage, firstNameRequiredError);
//                        submit = true;
//                    }
//                    break;
//                case 6:
//                    if (driver.findElements(lastNameRequired).size() > 0) {
//                        String lastNameRequiredError = driver.findElement(lastNameRequired).getText();
//                        System.out.println(lastNameRequiredError);
//                        Assert.assertEquals(ErrorMessage, lastNameRequiredError);
//                        submit = true;
//                    }
//                    break;
//                default:
//                    submit = false;
//            }
//            if (!submit && !(driver.findElements(By.xpath("//button[text()='Submit'][@disabled]")).size() > 0)) {
//                Thread.sleep(8000);
//                driver.findElement(submitButton).click();
//            } else {
//                System.out.println("Submit disabled");
//            }
//        }
//    public void replaceIcon(String ReplaceFile) throws InterruptedException {
//        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
////        Thread.sleep(3000);
////        driver.findElement(editButtonPath).click();
////        if (driver.findElement(replaceIcon).isDisplayed()) {
////            driver.findElement(replaceIcon).sendKeys(ReplaceFile);
////            Thread.sleep(3000);
//        if (driver.findElement(By.xpath("//input[@type='file']")).isDisplayed()){
//           driver.findElement(By.xpath("//input[@type='file']")).sendKeys(ReplaceFile);
//        } else {
//            System.out.println("Submission failed");
//        }
//    }}
//
//


//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//import java.util.ArrayList;
//import java.util.Arrays;
//
//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        driver.findElement(technicalFootprintModule).isDisplayed();
//        wait.until(ExpectedConditions.elementToBeClickable(technicalFootprintModule));
//        driver.findElement(technicalFootprintModule).click();
//        Thread.sleep(3000);
//String options = " Yes "; // Replace with the actual text
//ArrayList<String> questions = new ArrayList<>(Arrays.asList(FirstQstn.split(",")));
//// Print the questions list
//        System.out.println(questions);
//// Iterate through the questions and check their presence in the graph
//            if (driver.findElement(firstQuestion).isDisplayed()) {
//        driver.findElement(firstQuestion).click();
//                driver.findElement(By.xpath("//label[text()='" + options + "']/.././/input")).click();
//                System.out.println(options + " is clicked");
//                driver.findElement(firstQuestion).click();
//                Thread.sleep(3000);
//            } else {
//                    System.out.println(options + " is not clicked");
//            }
//                    driver.findElement(secondQuestion).click();
//            driver.findElement(seventhQuestion).sendKeys(Keys.CONTROL + "a" + Keys.DELETE);
//        Thread.sleep(3000);
//        driver.findElement(seconfQuestionTextfield).sendKeys(SecondQstnNoOfUsers);
//        driver.findElement(thirdQuestion).click();
//        Thread.sleep(3000);
//        driver.findElement(thirdQuestionText).sendKeys(ThirdQstnTypeOfCUI);
//String option = " Yes "; // Replace with the actual text
//ArrayList<String> questionss = new ArrayList<>(Arrays.asList(FirstQstn.split(",")));
//// Print the questions list
//        System.out.println(questions);
//// Iterate through the questions and check their presence in the graph
//            if (driver.findElement(fourthQuestion).isDisplayed()) {
//        driver.findElement(fourthQuestion).click();
//                driver.findElement(By.xpath("//label[text()='" + option + "']/.././/input")).click();
//                Thread.sleep(3000);
//                System.out.println(option + " is clicked");
//                driver.findElement(fourthQuestion).click();
//            } else {
//                    System.out.println(option + " is not clicked");
//            }
//String optionsss = ""; // Replace with the actual text
//ArrayList<String> questionsss = new ArrayList<>(Arrays.asList(FirstQstn.split(",")));
//// Print the questions list
//        System.out.println(questions);
//// Iterate through the questions and check their presence in the graph
//            if (driver.findElement(fifthQuestion).isDisplayed()) {
//        driver.findElement(fifthQuestion).click();
//                driver.findElement(fifthQuestion).sendKeys( Keys.CONTROL + "a" + Keys.DELETE);
//                driver.findElement(fifthQuestionTextfield).sendKeys(FifthQstnPurposeOfSystem);
//                Thread.sleep(3000);
//            } else {
//                    System.out.println("data is not entered");
//            }
//String sixOptions = "Asana"; // Replace with the actual text
//ArrayList<String> sixQuestions = new ArrayList<>(Arrays.asList(FirstQstn.split(",")));
//        System.out.println(sixQuestions);
//        if (driver.findElement(sixthQuestion).isDisplayed()) {
//        driver.findElement(sixthQuestion).click();
//            driver.findElement(By.xpath("//label[text()='" + sixOptions + "']/.././/input")).click();
//            Thread.sleep(3000);
//            System.out.println(sixOptions + " is clicked");
//            driver.findElement(sixthQuestion).click();
//        } else {
//                System.out.println(sixOptions + " is not clicked");
//        }
//String seventhOptions = "BitLocker"; // Replace with the actual text
//ArrayList<String> seventhQuestions = new ArrayList<>(Arrays.asList(FirstQstn.split(",")));
//// Assuming 'seventhQuestion' is defined as a By object earlier in your code
//
//// Print the questions list (assuming 'questions' should be 'seventhQuestions')
//        System.out.println(seventhQuestions);
//
//// Iterate through each question
//        for (String question : seventhQuestions) {
//// Assuming 'seventhQuestion' is correctly defined as a By object earlier in your code
//By questionLocator = By.xpath("//label[text()='" + question.trim() + "']");
//
//// Check if the question element is displayed
//            if (driver.findElement(questionLocator).isDisplayed()) {
//        driver.findElement(questionLocator).click();
//
//// Locate and click on the corresponding option
//                driver.findElement(By.xpath("//label[text()='" + seventhOptions + "']/.././/input")).click();
//
//// Print confirmation message
//                System.out.println(seventhOptions + " is clicked");
//
//// Click the question again (if needed)
//                driver.findElement(questionLocator).click();
//            } else {
//                    // Print if the question element is not displayed
//                    System.out.println(question + " is not displayed or clickable");
//            }
//                    }
//// Replace with the actual text for eigthOptions
//String eigthOptions = " Other ";
//
//// Split FirstQstn into eigthQuestions ArrayList
//ArrayList<String> eigthQuestions = new ArrayList<>(Arrays.asList(FirstQstn.split(",")));
//
//// Print the questions list (assuming 'questions' should be 'eigthQuestions')
//        System.out.println(eigthQuestions);
//
//// Iterate through the questions and check their presence in the graph
//        if (driver.findElement(eighthQuestion).isDisplayed()) {
//        driver.findElement(eighthQuestion).click();
//            driver.findElement(By.xpath("//label[text()='" + eigthOptions + "']/.././/input")).click();
//            Thread.sleep(3000);
//
//// Check if the input field is displayed and enter TextfieldData if so
//            if (driver.findElement(By.xpath("//button[text()='8. What Project Management Systems do you utilize?']//following::div//input[@type='text']")).isDisplayed()) {
//WebElement inputField = driver.findElement(By.xpath("//button[text()='8. What Project Management Systems do you utilize?']//following::div//input[@type='text']"));
//                inputField.sendKeys(Keys.CONTROL + "a" + Keys.DELETE);
//                inputField.sendKeys(TextfieldData);
//            }
//                    } else {
//                    // Handle case if eighthQuestion is not displayed
//                    System.out.println(TextfieldData + " is entered");
//            driver.findElement(eighthQuestion).click();
//        }
//String ninthOptions = "FreshBooks"; // Replace with the actual text
//ArrayList<String> ninthQuestions = new ArrayList<>(Arrays.asList(FirstQstn.split(",")));
//
//// Print the questions list
//        System.out.println(ninthQuestions);
//
//// Iterate through the questions and check their presence in the graph
//        for (String question : ninthQuestions) {
//By ninthQuestion = By.xpath("//some/xpath/here"); // Define your XPath for each question
//            if (driver.findElement(ninthQuestion).isDisplayed()) {
//        driver.findElement(ninthQuestion).click();
//                driver.findElement(By.xpath("//label[text()='" + ninthOptions + "']/.././/input")).click();
//                driver.findElement(ninthQuestion).click();
//                System.out.println(ninthOptions + " is clicked for question: " + question);
//            } else {
//                    System.out.println(ninthOptions + " is not clicked for question: " + question);
//            }
//                    }
//String tenthOptions = " Oracle SCM Cloud "; // Replace with the actual text
//ArrayList<String> tenthQuestions = new ArrayList<>(Arrays.asList(FirstQstn.split(",")));
//// Print the questions list
//                        System.out.println(questions);
//// Iterate through the questions and check their presence in the graph
//                            if (driver.findElement(tenthQuestion).isDisplayed()) {
//        driver.findElement(tenthQuestion).click();
//                                driver.findElement(By.xpath("//label[text()='"+tenthOptions+"']/.././/input")).click();
//                                System.out.println(tenthOptions + " is clicked");
//                                Thread.sleep(3000);
//                            } else {
//                                    System.out.println(tenthOptions + " is not clicked");
//                            }
//String eleventhOptions = " BambooHR "; // Replace with the actual text
//ArrayList<String> eleventhQuestions = new ArrayList<>(Arrays.asList(FirstQstn.split(",")));
//// Print the questions list
//                            System.out.println(questions);
//// Iterate through the questions and check their presence in the graph
//                                if (driver.findElement(eleventhQuestion).isDisplayed()) {
//        driver.findElement(eleventhQuestion).click();
//                                    driver.findElement(By.xpath("//label[text()='" + eleventhOptions + "']/.././/input")).click();
//                                    System.out.println(eleventhOptions + " is clicked");
//                                    driver.findElement(eleventhQuestion).click();
//                                } else {
//                                        System.out.println(eleventhOptions + " is not clicked");
//                                }
//String twelthOptions = " Infor EAM "; // Replace with the actual text
//ArrayList<String> twelthQuestions = new ArrayList<>(Arrays.asList(FirstQstn.split(",")));
//// Print the questions list
//                                System.out.println(questions);
//// Iterate through the questions and check their presence in the graph
//                                    if (driver.findElement(twelthQuestion).isDisplayed()) {
//        driver.findElement(twelthQuestion).click();
//                                        driver.findElement(By.xpath("//label[text()='" + twelthOptions + "']/.././/input")).click();
//                                        System.out.println(twelthOptions + " is clicked");
//                                        driver.findElement(twelthQuestion).click();
//                                    } else {
//                                            System.out.println(eleventhOptions + " is not clicked");
//                                    }
//                                            }
