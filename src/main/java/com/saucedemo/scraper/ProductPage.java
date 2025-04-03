package com.saucedemo.scraper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ProductPage {
    private WebDriver driver;
    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }
    //Product class to store product details
    public class Product {
        String name;
        String description;
        double price;
        WebElement addToCartButton;

        public Product(String name, String description, double price, WebElement addToCartButton) {
            this.name = name;
            this.description = description;
            this.price = price;
            this.addToCartButton = addToCartButton;
        }
    }
    //List to store all products
    List<Product> productList = new ArrayList<>();
    //Method to scrape product details
    public void scrapeProductDetails () {
        //locating all the products and storing them in a list
        List<WebElement> products = driver.findElements(By.className("inventory_item"));
        for (WebElement item : products) {
            String name = item.findElement(By.className("inventory_item_name")).getText();
            String description = item.findElement(By.className("inventory_item_desc")).getText();
            String priceText = item.findElement(By.className("inventory_item_price")).getText().replace("$", "");
            double price = Double.parseDouble(priceText);
            WebElement addToCartButton = item.findElement(By.className("btn_inventory"));

            productList.add(new Product(name, description, price, addToCartButton));
        }
        // Print the total number of products and their details
        System.out.println("Total number of products: " + productList.size());
        for (Product p : productList) {
            System.out.println("Name: " + p.name);
            System.out.println("Description: " + p.description);
            System.out.println("Price: $" + p.price);
        }
    }
    //Method to add a product to the cart
    public void addToCart() {

       // click the add to cart button if the price is less than 20
        boolean itemAdded = false;
        for (Product p : productList) {
            if (p.price < 20) {
                p.addToCartButton.click();
                System.out.println("Added to the cart: " + p.name);
                itemAdded = true;
            }
        }
        if (!itemAdded) {
            System.out.println("No items met the criteria. Nothing added to the cart.");
        }
    }
}
