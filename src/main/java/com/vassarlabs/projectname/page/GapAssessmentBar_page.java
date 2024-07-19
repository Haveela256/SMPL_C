package com.vassarlabs.projectname.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;

public class GapAssessmentBar_page {
    private WebDriver driver;
    Actions act;


    By listOfModules = By.xpath("//ul[@class='nav nav-underline']/li[contains(@class,'nav-item')]/a");
    By Question = By.xpath("//div[contains(@class,'quiz-question')]/div/markdown/p");
    By QuizSubmit = By.xpath("//button[text()=' Submit ']");
    By ImplementStatusDrop = By.xpath("//div/label[text()='Implementation Status']/../select");
    By poadDrop = By.xpath("//div/label[text()='Plan of Action & Milestones (POA&M) Status']/../select");
    By backButton = By.xpath("//div[text()=' Access Control']/../button");
    By ProgressbarPercentage = By.xpath("//span[text()='Progress :']/parent::label/span[@class='value']");

    public GapAssessmentBar_page(WebDriver driver) {
        this.driver=driver;
    }


    public void clickOnTheBarGraph(String Bar, String Modules) throws Throwable {
        Thread.sleep(3000);
        int barLocation = Integer.parseInt(Bar.split("-")[1]);
        WebElement Source = driver.findElements(By.xpath("//highcharts-chart//*[@class='highcharts-root']//*[@class='highcharts-point']")).get(barLocation);
        Actions act=new Actions(driver);
        act.moveToElement(Source).perform();
        driver.findElement(By.xpath("//highcharts-chart//*[@class='highcharts-root']//*[@class='highcharts-point highcharts-point-hover']")).click();
        verifyModules(Modules);
    }


    public void verifyModules(String Modules) throws Throwable {
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
        }
    }


    public void AttendQuiz(String options, String Modules, String Implementation_Status, String POAM_Status) throws Throwable {
        Thread.sleep(3000);
        String[] Mod = Modules.split(",");
        String[] Option = options.split("-");
        String[] Imp = Implementation_Status.split(",");
        String[] POAM = POAM_Status.split(",");
        for (int i = 0; i < Mod.length; i++) {
            if (driver.findElement(By.xpath("//ul[@class='nav nav-underline']/li[contains(@class,'nav-item')]/a[text()='" + Mod[i] + "']")).isDisplayed()) {
                Thread.sleep(3000);
                driver.findElement(By.xpath("//ul[@class='nav nav-underline']/li[contains(@class,'nav-item')]/a[text()='" + Mod[i] + "']")).click();
                driver.navigate().refresh();
                fillOptions(Option[i]);
                fillDropdowns(Imp[i], POAM[i]);
                clickSubmitButton();
            }
        }
    }


    public void fillOptions(String option) throws Throwable {
        Thread.sleep(3000);
        String que = driver.findElement(Question).getText().trim();
        String[] opt = option.split(",");
        for (String s : opt) {
            System.out.println("option Clicked: " + s.toLowerCase());
            switch (s) {
                case "Yes":
                case "No":
                    s = s.toLowerCase();
                    break;
                case "Not Sure":
                    s = "notSure";
                    break;
                case "Not Applicable":
                    s = "notApplicable";
                    break;
            }
            driver.findElement(By.xpath("//div[contains(@class,'quiz-question')]//div[contains(@class,'form-check')]/input[@id='" + s + "']")).click();
            Thread.sleep(1000);
            if (!(que.equals(driver.findElement(Question).getText()))) {
                Assert.assertTrue(true);
            }
            int num = Integer.parseInt(driver.findElement(By.xpath("//div[contains(@class,'divided')]")).getText().trim().split("/")[0]);
            Thread.sleep(2000);
            if (num == 5 && driver.findElements(By.xpath("//button[@disabled][text()=' Submit ']")).isEmpty()) {
                driver.findElement(QuizSubmit).click();
            }
        }
        Thread.sleep(5000);
        VerifyOptions(option);
    }


    public void VerifyOptions(String option) throws Throwable {
        System.out.println("verify options Method started");
        Thread.sleep(2000);
        String[] opt = option.split(",");
        int yesCount = 0;
        int noCount = 0;
        int notSureCount = 0;
        int notApplicableCount = 0;
        for (String value : opt) {
            switch (value.toLowerCase()) {
                case "yes":
                    yesCount++;
                    break;
                case "no":
                    noCount++;
                    break;
                case "not sure":
                    notSureCount++;
                    break;
                case "not applicable":
                    notApplicableCount++;
                    break;
                default:
                    break;
            }
        }
        System.out.println(yesCount);
        System.out.println(noCount);
        System.out.println(notSureCount);
        System.out.println(notApplicableCount);
        Thread.sleep(3000);
        for (String value : opt) {
            int Count = Integer.parseInt(driver.findElement(By.xpath("//div[@class='legends']/div[@class='legend-item']//span[@class='result-item'][text()='" + value + ":']/following-sibling::span")).getText());
            switch (value.toLowerCase()) {
                case "yes":
                    Assert.assertEquals(yesCount, Count);
                    break;
                case "no":
                    Assert.assertEquals(noCount, Count);
                    break;
                case "not sure":
                    Assert.assertEquals(notSureCount, Count);
                    break;
                case "not applicable":
                    Assert.assertEquals(notApplicableCount, Count);
                    break;
                default:
                    break;
            }
        }


    }


    private void fillDropdowns(String implementationStatus, String poamStatus) throws Throwable {
        Thread.sleep(3000);
        System.out.println("fillDropdown Method started");
        if (driver.findElement(ImplementStatusDrop).isDisplayed()) {
            WebElement ele = driver.findElement(ImplementStatusDrop);
            Select dropdown = new Select(ele);
            dropdown.selectByVisibleText(implementationStatus.trim());
        }
        if (driver.findElement(poadDrop).isDisplayed()) {
            WebElement ele = driver.findElement(poadDrop);
            Select dropdown = new Select(ele);
            dropdown.selectByVisibleText(poamStatus);
        }
    }

    public void clickSubmitButton() throws Throwable {
        Thread.sleep(3000);
        if (driver.findElements(By.xpath("//button[text()='Submit'][@disabled]")).isEmpty()) {
            Thread.sleep(3000);
            driver.findElement(By.xpath("//button[text()='Submit']")).click();
        }
    }

    public void validateProgressBar() throws Throwable {
        Thread.sleep(3000);
        driver.findElement(backButton).click();
        Thread.sleep(3000);
        double percentageInteger = Integer.parseInt(driver.findElement(ProgressbarPercentage).getText().split("%")[0].split("\\.")[0]);
        double percentageDecimal = Integer.parseInt(driver.findElement(ProgressbarPercentage).getText().split("%")[0].split("\\.")[1]);
        Assert.assertTrue(percentageInteger > 0 || percentageDecimal > 0);
    }


}
