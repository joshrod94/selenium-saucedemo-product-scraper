package com.saucedemo.scraper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    private WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    //Login credentials
    String username = "standard_user";
    String password = "secret_sauce";

    public void login() {
        // Locate the username and password fields and enter the credentials
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        // Click the login button
        driver.findElement(By.id("login-button")).click();
        // Wait and check if login was successful or not
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.className("error-button")));
            System.out.println("Login failed");
        } catch (org.openqa.selenium.TimeoutException e) {
            // If it times out waiting for the error, the login was successful
            System.out.println("Login successful");
        }
    }
}
