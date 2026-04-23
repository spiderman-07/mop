import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import java.time.Duration;
import java.util.List;

public class objectcount {
    public static void main(String[] args) {
        // Set up WebDriver for Edge
    	EdgeDriver driver = new EdgeDriver(); 
        
        // Set implicit wait and maximize window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        // Open the webpage
        driver.get("https://mail.google.com/mail/help/intl/en/logout.html#hl=en");

        // Find all <p> elements and count them
        List<WebElement> paragraphs = driver.findElements(By.xpath("//p"));
        int num = paragraphs.size();
        
        System.out.println("The number of <p> elements present are: " + num);

        // Close the browser
        driver.quit();
    }
}
