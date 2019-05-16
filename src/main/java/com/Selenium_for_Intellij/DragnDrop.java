package com.Selenium_for_Intellij;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static java.lang.Thread.*;


public class DragnDrop {

    public static void main (String []args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/home/supriya/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        // open  the page
        driver.get("https://formy-project.herokuapp.com/dragdrop");

        long l = 10000;
        sleep( l );

        WebElement image = driver.findElement( By.id( "image" ) );
        WebElement box = driver.findElement(By.id( "box" ) );

        Actions actions = new Actions( driver );
        actions.dragAndDrop( image,box ).build().perform();

        // closes the window
        driver.quit();

    }

}
