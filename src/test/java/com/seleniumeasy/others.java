package com.seleniumeasy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class others {
    WebDriver driver = new FirefoxDriver();

//    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);


//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    wait.until(ExpectedConditions.elementToBeClickable(By.id("usernme")));


//      Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//                                 .withTimeout(30, TimeUnit.SECONDS)
//                                .pollingEvery(5, TimeUnit.SECONDS)
//                                .ignoring(NoSuchElementException.class);



//    Set<String> allWindowHandles = driver.getWindowHandles();
//     for(String handle : allWindowHandles)
//    {
//        driver.switchTo().window(handle); //Switch to the desired window first and then execute commands using driver
//        driver.get("http://google.com");
//    }


//    //Specifying desired capabilities for Chrome browser
//    DesiredCapabilities acceptSSLCertificate = DesiredCapabilities.chrome();
//    //Setting capability to accept SSL certificates
//    acceptSSLCertificate.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
//    //Binding the capabilities to a new instance of chrome browser
//    WebDriver driver = new ChromeDriver(acceptSSLCertificate);
}

