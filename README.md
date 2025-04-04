# Selenium SauceDemo Product Scraper

This project is a full end-to-end Selenium automation script using Java and Maven. It logs into the [SauceDemo](https://www.saucedemo.com) website, scrapes product data, filters and adds products to the cart based on price, completes the checkout process, and logs out of the session.


## Features

- Logs into the [SauceDemo](https://www.saucedemo.com) website
- Scrapes all visible product data on the inventory page:
    - Product name
    - Description
    - Price (parsed as `double`, excluding `$`)
- Filters products under `$20` and adds them to the cart
- Proceeds to the cart and through the full checkout process:
    - Fills in personal information
    - Handles and logs form errors if they occur
    - Verifies confirmation message
- Logs out after completing the purchase
- Uses modular code and page-structured design:
    - `LoginPage.java`
    - `ProductPage.java`
    - `CartPage.java`
    - `LogOut.java`

## Technologies Used

- Java
- Selenium WebDriver
- Maven
- IntelliJ IDEA

## Project Structure

```
src
└── main
    └── java
        └── com.saucedemo.scraper
            ├── LoginPage.java
            ├── ProductPage.java
            ├── CartPage.java
            ├── LogOut.java
            └── SauceDemoProductScraper.java (main class)
```

## Quick Start

1. Clone the repo:
   ```bash
   git clone https://github.com/joshrod94/selenium-saucedemo-product-scraper.git

2. Open in IntelliJ (or your IDE of choice).

3. Let Maven import dependencies from `pom.xml`

4. Navigate to:
   ```
   src > main > java > com.saucedemo.scraper > SauceDemoProductScraper.java
   ```
5. Right-click on `SauceDemoProductScraper.java` and select `Run 'SauceDemoProductScraper.main()'`

## Login Info for SauceDemo
- **Username:** standard_user
- **Password:** secret_sauce

## Outputs

Sample terminal output includes:

- Total products found
- Each product's name, description, and price
- Products added to cart
- Checkout success or validation errors
- Final confirmation message
- Logout confirmation

## Requirements

    Java 23 (or higher)
    Maven 3.9.9+ ( you can check the latest version at https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java )
    (Optional) IntelliJ IDEA (this was created with Ultimate version 2024.2.3 ) 
    Selenium 4.30.0+

## License

This project is licensed under the
[Creative Commons Attribution-NonCommercial 4.0 License](LICENSE). **This software is free for everyone**, except it cannot be used for commercial purposes. See `LICENSE` for details.
