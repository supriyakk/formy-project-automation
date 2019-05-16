package com.Selenium_for_Intellij;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Checkbox {

    public static void main(String []args)
    {

        System.setProperty( "webdriver.chrome.driver", "/home/supriya/Downloads/chromedriver" );
        WebDriver driver=new ChromeDriver(  );

        driver.get( "http://formy-project.herokuapp.com/checkbox" );

        WebElement check1 = driver.findElement( By.cssSelector( "input#checkbox-1" ) );
        check1.click();

        WebElement check2 = driver.findElement( By.cssSelector( "input[value='checkbox-2']" ) );
        check2.click();

        WebElement check3 = driver.findElement( By.cssSelector( "input#checkbox-3" ) );
        check3.click();

        //closes the driver
        driver.quit();
    }


}
