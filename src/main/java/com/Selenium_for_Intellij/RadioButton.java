package com.Selenium_for_Intellij;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import static java.lang.Thread.*;

public class RadioButton {
    public static void main (String[] args) throws InterruptedException {
        System.setProperty( "webdriver.chrome.driver", "/home/supriya/Downloads/chromedriver" );
        WebDriver driver = new ChromeDriver(  );

        //opens the link
        driver.get( "http://formy-project.herokuapp.com/radiobutton" );

        long l = 100;

        WebElement radio1 = driver.findElement( By.id( "radio-button-1" ) );
        radio1.click();
        sleep( l );

        WebElement radio2 = driver.findElement( By.cssSelector("input[value ='option2']"));
        radio2.click();
        sleep( l );

        WebElement radio3 = driver.findElement( By.xpath( "/html/body/div/div[3]/input" ) ) ;
        sleep( l );


        // closes the browser

        driver.quit();

    }

}
