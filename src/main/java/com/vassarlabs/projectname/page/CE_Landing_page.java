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

    public void companyCard(String CompanyName) {
        if(driver.findElement(By.xpath("//h5[text()='"+CompanyName+"']/../../..")).isDisplayed()){
            driver.findElement(By.xpath("//h5[text()='"+CompanyName+"']/../../..")).click();
        }
    }

    public void signIntoCompany(String ToasterMessage) {
      String toaster=  driver.findElement(signIn).getText();
        System.out.println(toaster);
        Assert.assertEquals(ToasterMessage,toaster);
    }

    public void switchtoCompany() {
        driver.findElement(switchCompany).click();
    }
}
