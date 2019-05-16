package com.Selenium_for_Intellij;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static java.lang.Thread.sleep;

public class Scroll {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty( "webdriver.chrome.driver", "/home/supriya/Downloads/chromedriver" );
        WebDriver driver = new ChromeDriver( );

        // open the link

        driver.get( "https://formy-project.herokuapp.com/scroll" );
        long l = 0x3e8;
        Thread.sleep(l);


        WebElement name = driver.findElement( By.id( "name" ) );

        WebElement date = driver.findElement( By.id( "date" ) );


        Actions actions = new Actions(driver); //create a new object

        // click on screen element and then enter the value
        actions.moveToElement( name );
        name.sendKeys( "Supriya Kumari" );
        actions.moveToElement( date );
        date.sendKeys( "05/07/2019"  );

        Thread.sleep(l);

        /* close the browser */
        driver.quit( );
    }
}
