package com.vassarlabs.projectname.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class TestYopm_page {
private WebDriver driver;
    private By yopmailEmailField=By.xpath("//input[@class='ycptinput']");
    private By registerButton = By.xpath("//tbody//tr//td//div//div//div");
    public TestYopm_page(WebDriver driver) {
        this.driver=driver;
    }

    public void emaiL() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(yopmailEmailField).sendKeys("admin.smpl@yopmail.com");
        driver.findElement(yopmailEmailField).sendKeys(Keys.ENTER);
        driver.navigate().refresh();
        driver.findElement(registerButton).click();
    }
}
