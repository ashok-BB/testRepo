package com.demosite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginAndLogout {
    WebDriver driver;
    By username = By.xpath("//input[@id='txtUsername']");
    By pwd = By.xpath("//input[@id='txtPassword']");
    By login = By.xpath("//input[@id='btnLogin']");
    By logout = By.xpath("//a[contains(text(),'Logout')]");

    public loginAndLogout(WebDriver driver){

        this.driver=driver;
    }
    void login(){
        driver.findElement(username).sendKeys("opensourcecms");
        driver.findElement(pwd).sendKeys("opensourcecms");
        driver.findElement(login).click();
    }
    void logout(){
        driver.findElement(logout).click();
    }
}
