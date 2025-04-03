# Selenium SauceDemo Product Scraper

This project uses Selenium WebDriver with Java and Maven to log into [SauceDemo](https://www.saucedemo.com), scrape product information, and automate part of the purchase process. It simulates a realistic e-commerce flow and applies basic scraping and conditional logic.

## Features

- Logs into SauceDemo using standard credentials
- Scrapes all product cards on the main page:
   - Product name
   - Product description
   - Price
- Prints each product's info to the terminal
- Adds products under $20 to the cart
- Proceeds to the cart and continues through the checkout process

## Technologies Used

- Java
- Selenium WebDriver
- Maven
- IntelliJ IDEA

## Quick Start

1. Clone the repo:
   ```bash
   git clone https://github.com/joshrod94/selenium-saucedemo-product-scraper.git

2. Open in IntelliJ (or your IDE of choice).

3. Let Maven load dependencies.

4. Navigate to SauceDemoProductScraper.java and run the main method.

## Requirements

    Java 23 (or higher)
    Maven 3.9.9+ ( you can check the latest version at https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java )
    (Optional) IntelliJ IDEA (this was created with Ultimate version 2024.2.3 ) 
    Selenium 4.30.0+

## License

This project is licensed under the
[Creative Commons Attribution-NonCommercial 4.0 License](LICENSE). **This software is free for everyone**, except it cannot be used for commercial purposes. See `LICENSE` for details.
