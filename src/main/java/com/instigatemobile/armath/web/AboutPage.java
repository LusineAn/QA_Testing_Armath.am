/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.instigatemobile.armath.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 *
 * @author Andreasyan Lusine
 */
public class AboutPage {
    
    private By aboutButtonBy = By.linkText("About");
    private WebDriver webDriver;
    private String homeButtonID = "id_home";
    private String aboutButtonID = "id_about";
    private String armathLabsButtonID = "id_labs";
    private String onlineResourcesButtonID = "id_online_resources";
    private String eventsButtonID = "id_events";
    private String partnersButtonID = "id_partners";
    private String galleryButtonID = "id_gallery";
    private String contactsButtonID = "id_contacts";
    private String donateButtonID = "id_donate";
    private String joinArmathButtonID = "  ";
    
    private String homePageURL = "index.html";
    private String aboutPageURL = "about.html";
    private String armathLabsPageURL = "labs.html";
    private String onlineResourcesPageURL = "https://ggg.nairi.education/#1";
    private String eventsPageURL = "events.html";
    private String partnersPageURL = "partners.html";
    private String galleryPageURL = "gallery.html";
    private String contactsPageURL = "contacts.html";
    private String donatePageURL = "donate.html";
    private String joinArmathPageURL = "  ";

      

    public AboutPage(WebDriver driver) { 
       webDriver = driver;
       webDriver.get("https://armath.am/about.html");
    };
    
    // public void signInAboutPage() {
    //     WebElement aboutButton = webDriver.findElement(aboutButtonBy);
    //     aboutButton.click();
    // }
    public void signInHomePage(WebDriver driver) {
        webDriver = driver;
        WebElement homeButton = webDriver.findElement(By.id(homeButtonID));
        homeButton.click();
    }
    public String getHomePageURL() {
        return homePageURL;
    }
}
