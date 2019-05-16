package com.Selenium_for_Intellij;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class ExplicitWait {

    public static void main(String[] args)  {

        System.setProperty("webdriver.chrome.driver","/home/supriya/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        // open the link

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        //select the name

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("2345 Crystal Drive, Arlington, VA, USA");

        WebDriverWait wait = new WebDriverWait(driver,10);
        WebElement autoCompleteResult =  wait.until( ExpectedConditions.visibilityOfElementLocated( By.className( "pac-item" ) ));


        //WebElement autoCompleteResult = driver.findElement(By.className("pac-item"));

        autoCompleteResult.click();

        //close the browser
        driver.quit();
    }
}

