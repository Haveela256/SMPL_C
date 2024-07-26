package com.vassarlabs.projectname.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class SA_GapAssessment_page {
    private WebDriver driver;
    private By downloadTemplate = By.xpath("//span[@class='me-2']");
    private By quiz = By.xpath("//div[contains(text(),'Quiz')]");
    private By poamNotes = By.xpath("//label[text()='Notes ']//following::textarea");
    By listOfModules = By.xpath("//ul[@class='nav nav-underline']/li[contains(@class,'nav-item')]/a");
    private By quizresult=By.xpath("//div[text()='Kayla says you have ']//following::div[@class='legends']/..");

    public SA_GapAssessment_page(WebDriver driver) {
        this.driver = driver;
    }

    public void quizOptions() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.findElement(downloadTemplate).click();
        List<WebElement> quizCard = driver.findElements(quiz);
        if (!quizCard.isEmpty() && quizCard.get(0).isDisplayed()) {
            System.out.println("Kayla's Quiz is displayed");
        } else {
            System.out.println("Kayla's Quiz is not displayed");
        }
        List<WebElement> quizResult= driver.findElements(quizresult);
        if (!quizResult.isEmpty() && quizResult.get(0).isDisplayed()) {
            String result=driver.findElement(quizresult).getText();
            System.out.println(result+ " are displayed");
        } else {
            System.out.println("Kayla's Quiz Result is not displayed");
        }
        if (driver.findElement(poamNotes).isDisplayed()) {
            String poam=driver.findElement(poamNotes).getText();
            System.out.println(poam+ " is displayed on the POAM&M notes");
        } else {
            System.out.println("POA&M Notes is not displayed");
        }
    }

    public void clickOnbars(String Bar, String Modules) throws InterruptedException {
        Thread.sleep(3000);
        int barLocation = Integer.parseInt(Bar.split("-")[1]);
        WebElement Source = driver.findElements(By.xpath("//highcharts-chart//*[@class='highcharts-root']//*[@class='highcharts-point']")).get(barLocation);
       Actions act=new Actions(driver);
        act.moveToElement(Source).perform();
        driver.findElement(By.xpath("//highcharts-chart//*[@class='highcharts-root']//*[@class='highcharts-point highcharts-point-hover']")).click();
        Thread.sleep(3000);
        ArrayList<String> UiData = new ArrayList<>();
        for (int i = 0; i < driver.findElements(listOfModules).size(); i++) {
            UiData.add(driver.findElements(listOfModules).get(i).getText().trim());
        }
        String[] Mod = Modules.split(",");
        for (String item : Mod) {
            System.out.println(item);
            if (UiData.contains(item)) {
                Assert.assertTrue(UiData.contains(item));
            }

        }}}

