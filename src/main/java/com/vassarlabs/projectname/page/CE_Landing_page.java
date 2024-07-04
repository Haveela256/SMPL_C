package com.vassarlabs.projectname.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CE_Landing_page {
    private WebDriver driver;
    private By signIn=By.xpath("//div[text()=' Sign In Into Company Successfull ']");
    private By switchCompany=By.xpath("//span[text()='Switch Company']");
    public CE_Landing_page(WebDriver driver) {
        this.driver=driver;
    }

    public void companyCard(String CompanyName) throws InterruptedException {
        if(driver.findElement(By.xpath("//h5[text()='"+CompanyName+"']/../../..")).isDisplayed()){
            Thread.sleep(3000);
            driver.findElement(By.xpath("//h5[text()='"+CompanyName+"']/../../..")).click();
            Thread.sleep(3000);
        }
    }

    public void signIntoCompany(String ToasterMessage) {
        if (driver.findElement(signIn).isDisplayed()) {
            String toaster = driver.findElement(signIn).getText();
            System.out.println(toaster);
            Assert.assertEquals(ToasterMessage, toaster);
        }
    }
    public void switchtoCompany() throws InterruptedException {
        driver.findElement(switchCompany).click();
        Thread.sleep(3000);
    }
}
