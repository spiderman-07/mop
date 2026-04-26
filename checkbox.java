package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import java.time.Duration;
import java.util.List;

public class objectcount {
    public static void main(String[] args) {

        // Setup EdgeDriver
        System.setProperty("webdriver.edge.driver", "C:\\edgedriver\\msedgedriver.exe");
        EdgeDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        // Open website
        driver.get("https://compsem24.web.app/");

        // Find all <p> elements and count
        List<WebElement> paragraphs = driver.findElements(By.xpath("//p"));
        int num = paragraphs.size();

        System.out.println("The number of <p> elements present are: " + num);
    }
}
