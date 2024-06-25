package com.vassarlabs.projectname.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DataFlowDiagrams_page {
    private WebDriver driver;
    private By dataFlowTab= By.xpath("//a[text()='Data Flow Diagrams']");
    public DataFlowDiagrams_page(WebDriver driver) {
        this.driver=driver;
    }

    public void dataFlow() {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.findElement(dataFlowTab).click();
    }
}
