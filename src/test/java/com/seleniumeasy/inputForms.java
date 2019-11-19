package com.seleniumeasy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;

import javax.xml.xpath.XPath;

public class inputForms {
    WebDriver driver;

    @FindBy(how=How.XPATH,using="//li/a[text()='Input Forms']")
    WebElement inputforms;

//    By inputforms = By.xpath("//li/a[text()='Input Forms']");
    By simpleforms = By.xpath("//li[@class='tree-branch']//a[text()='Simple Form Demo']");
    By singleinput = By.xpath("//input[@placeholder='Please enter your Message']");
    By showmessage = By.xpath("//button[contains(text(),'Show Message')]");
    By inputa = By.xpath("//label[text()='Enter a']/following-sibling::input[@placeholder='Enter value']");
    By inputb =By.xpath("//label[text()='Enter b']/following-sibling::input[@placeholder='Enter value']");
    By gettotal = By.xpath("//button[text()='Get Total']");
    By total = By.xpath("//span[@id='displayvalue']");
    public inputForms(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(how= How.XPATH,using = "//li[@class='tree-branch']//descendant::li/a[text()='Checkbox Demo']")
    WebElement checkboxdemo;
//    By checkboxdemo = By.xpath("//li[@class='tree-branch']//descendant::li/a[text()='Checkbox Demo']");

    @FindBy(xpath="//input[@type='checkbox']/ancestor::label[text()='Click on this check box']")
    WebElement singlecheckbox;

    @FindBy(xpath="//input[@value='Check All']")
    WebElement checkall;

    @FindBy(xpath = "//label[text()='Option 3']")
    WebElement option3;

    @FindBy(xpath = "//label[text()='Option 4']")
    WebElement option4;

    @FindBy(xpath = "//div[@id='txtAge']")
    WebElement text;


    void singleinputs() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",inputforms);
        Thread.sleep(5000);
//        driver.findElement(inputforms).click();
        inputforms.click();
        Thread.sleep(2000);
        driver.findElement(simpleforms).click();
        driver.findElement(singleinput).sendKeys("hello world");
        driver.findElement(showmessage).click();
    }

    void twoinputfields(String value1, String value2) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",inputforms);
        Thread.sleep(5000);
        inputforms.click();
        Thread.sleep(3000);
        driver.findElement(simpleforms).click();
        driver.findElement(inputa).sendKeys(value1);
        driver.findElement(inputb).sendKeys(value2);
        driver.findElement(gettotal).click();
        String value = driver.findElement(total).getText();
        System.out.println(value);
        System.out.println("values");
        driver.close();
    }

    void checkboxes() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollIntoView();",driver.findElement(inputforms));
        js.executeScript("arguments[0].scrollIntoView();",inputforms);
        Thread.sleep(5000);
//        driver.findElement(inputforms).click();
        inputforms.click();
        Thread.sleep(3000);
        checkboxdemo.click();
//        driver.findElement(checkboxdemo).click();
        singlecheckbox.click();
        checkall.click();
        System.out.println(text.getText());
        option3.click();
        option4.click();
        Thread.sleep(2000);
        System.out.println(checkall.getAttribute("value"));
    }



}