package com.demosite;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class demoSiteLogin {
        WebDriver driver;
        @BeforeSuite
        public void start(){
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                        driver.get("https://s2.demo.opensourcecms.com/orangehrm/symfony/web/index.php/auth/login");
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        }
        @Test
        public void loginLogout(){
                loginAndLogout login= new loginAndLogout(driver);
//                Set<String> window = driver.getWindowHandles();
//                Iterator<String> it1 = window.iterator();
//                String childwindow = it1.next();
//                driver.switchTo().window(childwindow);
                 login.login();
                 login.logout();
        }


        @AfterSuite
        public void end(){
                driver.close();
        }
}
