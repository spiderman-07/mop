import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class gcd {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.edge.driver", "C:\\edgedriver\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("file:///D:/gcd.html");
    }

    @Test
    public void testGcd() {
        WebElement num1 = driver.findElement(By.name("n1"));
        WebElement num2 = driver.findElement(By.name("n2"));
        WebElement button = driver.findElement(By.cssSelector("input[type='button']"));
        WebElement result = driver.findElement(By.name("result"));

        num1.sendKeys("5");
        num2.sendKeys("6");
        button.click();

        // Get the result value
        String gcdResult = result.getAttribute("value");
        System.out.println("The GCD is: " + gcdResult);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}