package demo;

import java.util.List;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class checkbox {
    public static void main(String[] args) {

        // Setup EdgeDriver
        System.setProperty("webdriver.edge.driver", "C:\\edgedriver\\msedgedriver.exe");
        EdgeDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        // Open HTML file
        driver.get("file:///D:/new.html");

        // Find all checkboxes
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        System.out.println("Total checkboxes: " + checkboxes.size());

        // Click every 4th checkbox
        for (int i = 0; i < checkboxes.size(); i += 4) {
            checkboxes.get(i).click();
        }

        // Count checked and unchecked
        int checkedCount = 0, uncheckedCount = 0;
        for (WebElement checkbox : checkboxes) {
            if (checkbox.isSelected()) {
                checkedCount++;
            } else {
                uncheckedCount++;
            }
        }

        System.out.println("Selected checkboxes: " + checkedCount);
        System.out.println("Unselected checkboxes: " + uncheckedCount);
    }
}
