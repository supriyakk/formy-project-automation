package com.Selenium_for_Intellij;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static java.lang.Thread.sleep;

public class Switch_ActiveWindow {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty( "webdriver.chrome.driver", "/home/supriya/Downloads/chromedriver" );
        WebDriver driver = new ChromeDriver( );

        // open the link

        driver.get( "https://formy-project.herokuapp.com/switch-window" );

        WebElement newTab = driver.findElement( By.id( "new-tab-button" ) );
        newTab.click();

        String originalHandle = driver.getWindowHandle(); // get original window handle

        long l = 1000;
        Thread.sleep( l );

        for (String a : driver.getWindowHandles())
        {
            driver.switchTo( ).window(a);
        }
        driver.switchTo().window(originalHandle);

        Thread.sleep( l );
        //close the browser
        driver.quit();

        }
    }
