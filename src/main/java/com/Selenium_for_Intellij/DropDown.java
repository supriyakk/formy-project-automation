package com.Selenium_for_Intellij;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {

    public static void main(String []args) throws InterruptedException {

        System.setProperty( "webdriver.chrome.driver", "/home/supriya/Downloads/chromedriver" );
        WebDriver driver = new ChromeDriver( );

        // open  the page
        driver.get( "http://formy-project.herokuapp.com/dropdown" );

        WebElement dropdown = driver.findElement( By.id( "dropdownMenuButton" ) );
        dropdown.click();

        WebElement auto = driver.findElement( By.id( "autocomplete" ) );
        auto.click();


        driver.quit();

    }
}
