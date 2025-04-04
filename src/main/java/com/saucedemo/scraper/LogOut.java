package com.saucedemo.scraper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LogOut {
    private WebDriver driver;
    public LogOut(WebDriver driver) {
        this.driver = driver;
    }

    public void logOut() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("checkout_complete_container")));
        // Click on the menu button
        driver.findElement(By.id("react-burger-menu-btn")).click();
        // Wait for the logout button to be clickable
        wait.until(ExpectedConditions.elementToBeClickable(By.id("logout_sidebar_link")));
        // Click on the logout button
        driver.findElement(By.id("logout_sidebar_link")).click();
        // Wait for the login page to load
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("login-button")));
        System.out.println("Logged out successfully");
    }
}
