package com.Selenium_for_Intellij;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.*;


public class JavaScriptExecutor {

    public static void main (String []args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/home/supriya/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

      // open  the page
        driver.get("https://formy-project.herokuapp.com/modal");

        WebElement openButton = driver.findElement( By.id( "modal-button" ) );
        openButton.click();
        long l = 1000;
        sleep( l );

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement closeButton = driver.findElement( By.id( "ok-button" ) );

        js.executeScript( "arguments[0].click();", closeButton );


        sleep( l );



      // closes the window
        driver.quit();





    }



}
