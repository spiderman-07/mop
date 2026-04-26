package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class gcd {
    public static void main(String[] args) {

        // Setup EdgeDriver
        System.setProperty("webdriver.edge.driver", "C:\\edgedriver\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        try {
            // Open GCD HTML page
            driver.get("file:///D:/gcd.html");

            // Find input fields and button
            WebElement num1Input = driver.findElement(By.id("num1"));
            WebElement num2Input = driver.findElement(By.id("num2"));
            WebElement calculateButton = driver.findElement(
                    By.xpath("//button[text()='Calculate GCD']"));

            // Enter numbers
            num1Input.sendKeys("5");
            num2Input.sendKeys("6");

            // Click calculate
            calculateButton.click();

            // Wait for result
            Thread.sleep(2000);

            // Get and print result
            WebElement result = driver.findElement(By.id("result"));
            System.out.println("Test Result: " + result.getText());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
