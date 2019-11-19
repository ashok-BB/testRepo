package com.seleniumeasy;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class testCaseImpl {
    WebDriver driver;
    @BeforeSuite
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.HOURS);
        
        Alert al = driver.switchTo().alert();
//        al

    }

    @Test(dataProvider = "testdata",enabled = true)
    public void inputformstest1(String value1, String value2) throws InterruptedException {
//        inputForms forms = new inputForms(driver);
//        forms.singleinputs();
        inputForms forms = PageFactory.initElements(driver,inputForms.class);
        forms.twoinputfields(value1,value2);
    }
    @Test(enabled = false)
    public void checkboxtest() throws InterruptedException {
//        inputForms forms = new inputForms(driver);
        inputForms forms = PageFactory.initElements(driver,inputForms.class);
        forms.checkboxes();
    }

    @AfterSuite
    public void end(){
        driver.close();
    }



    @DataProvider(name="testdata")
    public Object[][] data(){
        Object[][] value = new Object[2][2];
        value[0][0] = "12";
        value[0][1] = "18";
        value[1][0] = "5";
        value[1][1] = "1";
        return value;
    }

}

