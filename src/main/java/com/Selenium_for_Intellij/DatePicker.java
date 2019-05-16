package com.Selenium_for_Intellij;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DatePicker {

    public static void main(String []args) throws InterruptedException


    {
        System.setProperty("webdriver.chrome.driver","/home/supriya/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();


        // open  the page
        driver.get("http://formy-project.herokuapp.com/datepicker");

        WebElement datepicker = driver.findElement( By.id( "datepicker" ) );

        datepicker.sendKeys( "03/03/2020" );
        datepicker.sendKeys( Keys.RETURN );
        long l=1000;

        Thread.sleep(l);

        driver.quit();



    }
}
