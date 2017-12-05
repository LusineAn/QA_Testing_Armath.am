/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.instigatemobile.armath.web;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Andreasyan Family
 */
public class AboutPageTest {

    private String driverPath = "/home/student/Desktop/My_Resources/QA_Testing/armathtest/src/test/java/com/instigatemobile/armath/web/chromedriver";
//   @Test
    // void checkPageTitle() {
    //     System.setProperty("webdriver.chrome.driver", "D:\\Luys\\INSTIGATE\\Testing\\vivustest\\src\\test\\java\\com\\instigatemobile\\vivus\\web\\chromedriver.exe");
    //     WebDriver driver = new ChromeDriver();
    //     AboutPage aboutPage = new AboutPage(driver);
    //     String title = aboutPage.getTitle();
    //     assertTrue(title.contains("about"));
    // }
     
    @Test
     public void checkHomeButton() {
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        AboutPage homePage = new AboutPage(driver);
        homePage.signInHomePage(driver);
        String currentURL = homePage.getHomePageURL();
        assertTrue(driver.getCurrentUrl().contains(currentURL));
    }
}