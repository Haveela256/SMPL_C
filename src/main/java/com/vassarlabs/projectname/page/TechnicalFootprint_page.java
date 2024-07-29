package com.vassarlabs.projectname.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.w3c.dom.ls.LSOutput;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TechnicalFootprint_page {
    private WebDriver driver;
    private By technicalFootprintModule = By.xpath("//span[text()='Technical Footprint']");

    private By title = By.xpath("//div[text()=' Technical Footprint']");

    private By firstQuestion = By.xpath("//button[text()='1. Is your company fully Remote?']");

    private By secondQuestion = By.xpath("//button[text()='2. Number of privileged users']");
    private By thirdQuestion=By.xpath("//button[text()='3. What are the general descriptions and types of Controlled Unclassified Information (CUI) that are processed, stored, or transmitted by the system, and how are they determined and documented?']");

    private By thirdQuestionText = By.xpath("//textarea[@placeholder='Enter here']");

    private By fourthQuestion = By.xpath("//button[text()='4. Is all hardware and software maintained and owned by the organization?']");

    private By fifthQuestion = By.xpath("//button[text()='5. What is the function/purpose of the system?']");

    private By sixthQuestion = By.xpath("//button[text()='6. What collaboration and productivity tools are you using?']");

    private By seventhQuestion = By.xpath("//button[text()='7. What security systems are you using?']");

    private By eighthQuestion = By.xpath("//button[text()='8. What Project Management Systems do you utilize?']");

    private By ninethQuestion = By.xpath("//button[text()='9. What Financial Management Systems do you utilize?']");

    private By tenthQuestion = By.xpath("//button[text()='10. What Supply Chain Management Systems do you utilize?']");

    private By eleventhQuestion = By.xpath("//button[text()='11. What Human Resources System are you currently using?']");

    private By twelthQuestion = By.xpath("//button[text()='12. Finally, what CMM Systems do you utilize?']");


    private By thirdQuestionTexfield = By.xpath("//button[text()='3. What are the general descriptions and types of Controlled Unclassified Information (CUI) that are processed, stored, or transmitted by the system, and how are they determined and documented?']//following::div[3]//input");

    private By fifthQuestionTextfield = By.xpath("//button[text()='5. What is the function/purpose of the system?']//following::div//textarea[@placeholder='Enter here']");

    private By seconfQuestionTextfield = By.xpath("//button[text()='2. Number of privileged users']//following::input");

    private By cancelButton = By.xpath("//div[text()=' Technical Footprint']//following::button[text()='Cancel']");

    private By submitButton = By.xpath("//button[text()='Submit']");

    private By detailsUpdatedToaster = By.xpath("//div[text()=' Company security details saved successfully ']");

    private By technicalFootprint = By.xpath("//div[text()=' Technical Footprint']");
    private By gapAssessment = By.xpath("//div[text()='Gap Assessment']");


    public TechnicalFootprint_page(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnmodule() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.findElement(technicalFootprintModule).isDisplayed();
        wait.until(ExpectedConditions.elementToBeClickable(technicalFootprintModule));
        driver.findElement(technicalFootprintModule).click();
    }


    public void answertheQuestions(String FirstQstn, String SecondQstnNoOfUsers, String ThirdQstnTypeOfCUI, String FourthQstn, String FifthQstnPurposeOfSystem, String SixthQstn, String SeventhQstn, String EighthQstn, String NinethQstn, String TenthQstn, String EleventhQstn, String TwelthQstn, String TextfieldData, String ToasterMessage) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.findElement(technicalFootprintModule).isDisplayed();
        wait.until(ExpectedConditions.elementToBeClickable(technicalFootprintModule));
        driver.findElement(technicalFootprintModule).click();
        Thread.sleep(3000);
        String options = " Yes "; // Replace with the actual text
        ArrayList<String> questions = new ArrayList<>(Arrays.asList(FirstQstn.split(",")));
        // Print the questions list
        System.out.println(questions);
        // Iterate through the questions and check their presence in the graph
            if (driver.findElement(firstQuestion).isDisplayed()) {
                driver.findElement(firstQuestion).click();
                driver.findElement(By.xpath("//label[text()='" + options + "']/.././/input")).click();
                System.out.println(options + " is clicked");
                driver.findElement(firstQuestion).click();
                Thread.sleep(3000);
            } else {
                System.out.println(options + " is not clicked");
            }
        driver.findElement(secondQuestion).click();
            driver.findElement(seconfQuestionTextfield).click();
            driver.findElement(seconfQuestionTextfield).sendKeys( Keys.CONTROL + "a" + Keys.DELETE);
        Thread.sleep(3000);
        driver.findElement(seconfQuestionTextfield).sendKeys(SecondQstnNoOfUsers);
        driver.findElement(secondQuestion).click();
        driver.findElement(thirdQuestion).click();
        Thread.sleep(3000);
        driver.findElement(thirdQuestionText).click();
        driver.findElement(thirdQuestionText).sendKeys(Keys.CONTROL + "a" + Keys.DELETE);
        driver.findElement(thirdQuestionText).sendKeys(ThirdQstnTypeOfCUI);
        driver.findElement(thirdQuestion).click();
        String option = " Yes "; // Replace with the actual text
        ArrayList<String> questionss = new ArrayList<>(Arrays.asList(FirstQstn.split(",")));
        // Print the questions list
        System.out.println(questions);
        // Iterate through the questions and check their presence in the graph
            if (driver.findElement(fourthQuestion).isDisplayed()) {
                driver.findElement(fourthQuestion).click();
                driver.findElement(By.xpath("//label[text()='" + option + "']/.././/input")).click();
                Thread.sleep(3000);
                System.out.println(option + " is clicked");
                driver.findElement(fourthQuestion).click();
            } else {
                System.out.println(option + " is not clicked");
            }
            if (driver.findElement(fifthQuestion).isDisplayed()) {
                driver.findElement(fifthQuestion).click();
                driver.findElement(fifthQuestionTextfield).click();
                driver.findElement(fifthQuestionTextfield).sendKeys( Keys.CONTROL + "a" + Keys.DELETE);
                driver.findElement(fifthQuestionTextfield).sendKeys(FifthQstnPurposeOfSystem);
                Thread.sleep(3000);
                driver.findElement(fifthQuestion).click();
            } else {
                System.out.println("data is not entered");
            }
        String sixOptions = " Microsoft 365 "; // Replace with the actual text
        ArrayList<String> sixQuestions = new ArrayList<>(Arrays.asList(FirstQstn.split(",")));
        System.out.println(sixOptions);
        if (driver.findElement(sixthQuestion).isDisplayed()) {
            driver.findElement(sixthQuestion).click();
            driver.findElement(By.xpath("//input[@type='checkbox']//following::label[text()='"+sixOptions+"']")).click();
            Thread.sleep(3000);
            System.out.println(sixOptions + " is clicked");
            driver.findElement(sixthQuestion).click();
        } else {
            System.out.println(sixOptions + " is not clicked");
        }
        String seventhOptions = " BitLocker "; // Replace with the actual text
        ArrayList<String> seventhQuestions = new ArrayList<>(Arrays.asList(FirstQstn.split(",")));
// Assuming 'seventhQuestion' is defined as a By object earlier in your code

// Print the questions list (assuming 'questions' should be 'seventhQuestions')
        System.out.println(seventhQuestions);
        if (driver.findElement(seventhQuestion).isDisplayed()) {
            Thread.sleep(3000);
            driver.findElement(seventhQuestion).click();
            driver.findElement(By.xpath("//input[@type='checkbox']//following::label[text()='"+seventhOptions+"']")).click();
            Thread.sleep(3000);
            System.out.println(seventhOptions + " is clicked");
            driver.findElement(seventhQuestion).click();

            } else {
                // Print if the question element is not displayed
                System.out.println(seventhQuestion + " is not displayed or clickable");
            }

        String eigthOptions = " Other ";
        ArrayList<String> eigthQuestions = new ArrayList<>(Arrays.asList(FirstQstn.split(",")));
        System.out.println(eigthQuestions);

        if (driver.findElement(eighthQuestion).isDisplayed()) {
            driver.findElement(eighthQuestion).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='" + eigthOptions + "']/.././/input")));
            Thread.sleep(3000);
            driver.findElement(By.xpath("//label[text()='" + eigthOptions + "']/.././/input")).click();
            Thread.sleep(3000);

            // Check if the input field is displayed
            List<WebElement> textFields = driver.findElements(By.xpath("//button[text()='8. What Project Management Systems do you utilize?']//following::div//input[@type='text']"));
            if (!textFields.isEmpty() && textFields.get(0).isDisplayed()) {
                WebElement textField = textFields.get(0);
                textField.click();
                textField.sendKeys(Keys.CONTROL + "a" + Keys.DELETE);
                textField.sendKeys(TextfieldData);
                driver.findElement(eighthQuestion).click();
                System.out.println(TextfieldData + " is entered");
            } else {
                System.out.println("Textfield is not displayed");
            }
        } else {
            // Handle case if eighthQuestion is not displayed
            System.out.println(TextfieldData + " is not entered");
        }
        String ninthOptions = " FreshBooks "; // Replace with the actual text
        ArrayList<String> ninthQuestions = new ArrayList<>(Arrays.asList(FirstQstn.split(",")));

// Print the questions list
        System.out.println(ninthQuestions);

// Iterate through the questions and check their presence in the graph
        if (driver.findElement(ninethQuestion).isDisplayed()) {
            Thread.sleep(3000);
            driver.findElement(ninethQuestion).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//input[@type='checkbox']//following::label[text()='"+ninthOptions+"']")).click();
            Thread.sleep(3000);
            System.out.println(ninthOptions + " is clicked");
            driver.findElement(ninethQuestion).click();
            } else {
                System.out.println(ninthOptions + " is not clicked for question: " +ninethQuestion);
            }
                        String tenthOptions = " Oracle SCM Cloud "; // Replace with the actual text
                        ArrayList<String> tenthQuestions = new ArrayList<>(Arrays.asList(FirstQstn.split(",")));
                        // Print the questions list
                        System.out.println(questions);
                        // Iterate through the questions and check their presence in the graph
                            if (driver.findElement(tenthQuestion).isDisplayed()) {
                                Thread.sleep(3000);
                                driver.findElement(tenthQuestion).click();
                                driver.findElement(By.xpath("//label[text()='"+tenthOptions+"']/.././/input")).click();
                                System.out.println(tenthOptions + " is clicked");
                                Thread.sleep(3000);
                            } else {
                                System.out.println(tenthOptions + " is not clicked");
                            }
                            String eleventhOptions = " BambooHR "; // Replace with the actual text
                            ArrayList<String> eleventhQuestions = new ArrayList<>(Arrays.asList(FirstQstn.split(",")));
                            // Print the questions list
                            System.out.println(questions);
                            // Iterate through the questions and check their presence in the graph
                                if (driver.findElement(eleventhQuestion).isDisplayed()) {
                                    Thread.sleep(3000);
                                    driver.findElement(eleventhQuestion).click();
                                    driver.findElement(By.xpath("//label[text()='" + eleventhOptions + "']/.././/input")).click();
                                    System.out.println(eleventhOptions + " is clicked");
                                    driver.findElement(eleventhQuestion).click();
                                } else {
                                    System.out.println(eleventhOptions + " is not clicked");
                                }
                                String twelthOptions = " Infor EAM "; // Replace with the actual text
                                ArrayList<String> twelthQuestions = new ArrayList<>(Arrays.asList(FirstQstn.split(",")));
                                // Print the questions list
                                System.out.println(questions);
                                // Iterate through the questions and check their presence in the graph
                                    if (driver.findElement(twelthQuestion).isDisplayed()) {
                                        Thread.sleep(3000);
                                        driver.findElement(twelthQuestion).click();
                                        Thread.sleep(3000);
                                        driver.findElement(By.xpath("//label[text()='" + twelthOptions + "']/.././/input")).click();
                                        Thread.sleep(3000);
                                        System.out.println(twelthOptions + " is clicked");
                                        driver.findElement(twelthQuestion).click();
                                    } else {
                                        System.out.println(eleventhOptions + " is not clicked");
                                    }
                                }

    public void cancelbutton() throws InterruptedException {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()=' Technical Footprint']//following::button[text()='Cancel']")));
        Thread.sleep(4000);
        driver.findElement(By.xpath("//div[text()=' Technical Footprint']//following::button[text()='Cancel']")).click();
        Thread.sleep(3000);
        driver.findElement(gapAssessment).isDisplayed();
    }

    public void submitButton(String FirstQstn, String SecondQstnNoOfUsers, String ThirdQstnTypeOfCUI, String FourthQstn, String FifthQstnPurposeOfSystem, String SixthQstn, String SeventhQstn, String EighthQstn, String NinethQstn, String TenthQstn, String EleventhQstn, String TwelthQstn, String TextfieldData, String ToasterMessage) throws InterruptedException {
    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
   if(driver.findElement(submitButton).isEnabled()){
    driver.findElement(submitButton).click();
        }
   else {
       System.out.println("Submit button is disabled");
   }
    }}


