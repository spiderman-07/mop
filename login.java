package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import java.time.Duration;

public class login {
    public static void main(String[] args) {

        // Setup EdgeDriver
        System.setProperty("webdriver.edge.driver", "C:\\edgedriver\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Open login page
        driver.get("http://aucse.unaux.com/login.html");

        // Find username, password and login button
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));

        // Enter credentials and click login
        username.sendKeys("user");
        password.sendKeys("pass");
        loginButton.click();

        // Wait for page to load
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Check if login was successful
        if (driver.getCurrentUrl().contains("index.html")) {
            System.out.println("Test Passed: Login successful!");
        } else {
            System.out.println("Test Failed: Login unsuccessful.");
        }
    }
}
