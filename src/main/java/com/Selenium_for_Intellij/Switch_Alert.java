package com.Selenium_for_Intellij;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class Switch_Alert {

    public static void main(String[] args) throws InterruptedException
    {
        System.setProperty( "webdriver.chrome.driver", "/home/supriya/Downloads/chromedriver" );
        WebDriver driver = new ChromeDriver( );

        // open the link
        driver.get( "https://formy-project.herokuapp.com/switch-window" );
        long l = 1000;

        WebElement alert_button = driver.findElement( By.id( "alert-button" ) );
        alert_button.click();
        Thread.sleep( l );

        Alert alert = driver.switchTo().alert();
        alert.accept();

        Thread.sleep( l );

        /* close the browser */
        driver.quit( );
    }
}
