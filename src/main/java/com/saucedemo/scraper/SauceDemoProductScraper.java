package com.saucedemo.scraper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemoProductScraper {
    public static void main(String[] args) {
        //Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        //Open SauceDemo website
        driver.get("https://www.saucedemo.com/");
        //Create instances of the page classes
        LoginPage loginPage = new LoginPage(driver);
        //Login to the website
        loginPage.login();
    }
}
