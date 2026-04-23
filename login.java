import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import java.time.Duration;

public class login {
    public static void main(String[] args) {
        // Initialize Edge WebDriver
        WebDriver driver = new EdgeDriver();
        
        // Maximize the browser window
        driver.manage().window().maximize();
        
        // Set an implicit wait (improves stability)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Open LinkedIn login page
        driver.get("https://www.linkedin.com/login");

        // Locate username and password fields
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));

        // Locate login button
        WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));

        // Enter credentials (DO NOT HARDCODE IN REAL USE)
        username.sendKeys("your-mail@gmail.com");
        password.sendKeys("your-password");

        // Click the login button
        loginButton.click();

        // Wait for the page to load and check if login is successful
        try {
            Thread.sleep(5000); // Wait for redirection (better: use explicit waits)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Check if URL contains "feed" (LinkedIn home page after login)
        if (driver.getCurrentUrl().contains("feed")) {
            System.out.println("Test Passed: Login successful!");
        } else {
            System.out.println("Test Failed: Login unsuccessful.");
        }

        // Close browser
        driver.quit();
    }
}