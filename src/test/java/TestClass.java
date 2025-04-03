import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {
    public static void main(String[] args) {
        // Initialize ChromeDriver (Selenium Manager should handle driver downloads in Selenium 4.6+)
        WebDriver driver = new ChromeDriver();

        // Navigate to Google
        driver.get("https://www.google.com");

        // Print the page title
        String pageTitle = driver.getTitle();
        System.out.println("Page title is: " + pageTitle);

        // Close the browser
        driver.quit();
    }
}
