package com.Selenium_for_Intellij;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.*;

public class Form {

    public static void main(String[] args)  {

        System.setProperty("webdriver.chrome.driver","/home/supriya/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        // open the link

        driver.get("https://formy-project.herokuapp.com/form");

        //first name

        WebElement fname = driver.findElement( By.id( "first-name" ) );
        fname.click();
        fname.sendKeys( "Supriya" );

        //last name

        WebElement lname =driver.findElement( By.id( "last-name" ) );
        lname.click();
        lname.sendKeys( "Kumari" );

        //job-title

        WebElement jobtitle = driver.findElement( By.id( "job-title" ) );
        jobtitle.click();
        jobtitle.sendKeys( "Senior QA" );

        //Highest level of education

        WebElement radio3 = driver.findElement( By.cssSelector("input#radio-button-3" ) );
        radio3.click();

        //Sex

        WebElement sex = driver.findElement( By.cssSelector( "input[value='checkbox-2']" ) );
        sex.click();

        //date

        WebElement datep = driver.findElement( By.id( "datepicker" ) );
        datep.click();
        datep.sendKeys( "05/03/2019" );

        //year of experience

        Select dropd = new Select(driver.findElement( By.id( "select-menu" ) ));
        dropd.selectByValue( "2" );

        //submit
        WebElement submit = driver.findElement( By.cssSelector( "a[role='button']" ) );
        submit.click();

        WebDriverWait wait = new WebDriverWait( driver,10 );
        WebElement alert = wait.until( ExpectedConditions.visibilityOfElementLocated( By.className( "alert" ) ) );

        String alerttext = alert.getText();

        assertEquals( "The form was successfully submitted!", alerttext);




        //close the browser
        driver.quit();
    }
}

