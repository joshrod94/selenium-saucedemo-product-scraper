package com.saucedemo.scraper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {
    private WebDriver driver;
    public CartPage(WebDriver driver) {
        this.driver = driver;
    }
    //Personal information
    String firstName = "John";
    String lastName = "Doe";
    String postalCode = "12345";

    //Method to navigate to the cart page
    public void navigateToCart() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("shopping_cart_badge")));
        //Click on the cart icon
        driver.findElement(By.className("shopping_cart_link")).click();
        //Wait for the cart page to load
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("cart_list")));
        //Click on the checkout button
        driver.findElement(By.id("checkout")).click();
        //Wait for the checkout page to load
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("checkout_info")));
        //Fill in the personal information
        System.out.println("Filling in personal information...");
        driver.findElement(By.id("first-name")).sendKeys(firstName);
        driver.findElement(By.id("last-name")).sendKeys(lastName);
        driver.findElement(By.id("postal-code")).sendKeys(postalCode);
        //Click on the continue button
        driver.findElement(By.id("continue")).click();
        //Check if an error message appears
        try {
            //Wait for the error message to appear
            wait.until(ExpectedConditions.presenceOfElementLocated(By.className("error-message-container")));
            System.out.println("Error: " + driver.findElement(By.cssSelector("h3[data-test='error']")).getText());
            return;
        } catch (org.openqa.selenium.TimeoutException e) {
            // If it times out waiting for the error, the input was successful
            System.out.println("Input of personal info successful");
        }
        //Wait for the overview page to load
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("summary_info")));
        //Click on the finish button
        driver.findElement(By.id("finish")).click();
        //Wait for the confirmation page to load
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("checkout_complete_container")));
        //Print the confirmation message
        String confirmationHeader = driver.findElement(By.className("complete-header")).getText();
        String confirmationMessage = driver.findElement(By.className("complete-text")).getText();
        System.out.println("Confirmation Message: " + confirmationHeader + "\n" + confirmationMessage);
    }
}
