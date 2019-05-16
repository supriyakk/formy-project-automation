package com.Selenium_for_Intellij;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class Main {

    public static void main( String[] args ) throws InterruptedException {

        System.out.println( "HEllo" );

        System.setProperty( "webdriver.chrome.driver", "/home/supriya/Downloads/chromedriver" );
        WebDriver driver = new ChromeDriver( );
        driver.get( "https://formy-project.herokuapp.com/keypress" );

        //select the name

        WebElement name = driver.findElement( By.id( "name" ) );
        name.click( );
        name.sendKeys( "Supriyaaaa" );

        long l = 0x3e8;
        Thread.sleep( l );
        // click on button

        WebElement buttonclick = driver.findElement( By.id( "button" ) );
        buttonclick.click( );

        //close the browser
        driver.quit( );
    }
}
