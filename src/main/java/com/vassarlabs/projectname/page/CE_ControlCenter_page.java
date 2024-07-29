package com.vassarlabs.projectname.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CE_ControlCenter_page {
    private WebDriver driver;
    private By hamburgerPath = By.xpath("//button[@class='btn btn-side-nav']//i[@class='bi bi-list']");

    public CE_ControlCenter_page(WebDriver driver) {
        this.driver=driver;
    }


}
