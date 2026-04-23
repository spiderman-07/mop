import java.util.List;
import java.time.Duration;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.JavascriptExecutor;

public class checkbox {
    public static void main(String[] args) {
        EdgeDriver driver = new EdgeDriver(); 
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
        driver.manage().window().maximize(); 
        driver.get("file:///D:/new.html"); 

        //List<WebElement> CheckBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        //System.out.println("Number of Check boxes : " + CheckBoxes.size());

        // JavascriptExecutor js = (JavascriptExecutor) driver;
        //for(int i = 0; i < CheckBoxes.size(); i = i + 4) {
        //	js.executeScript("arguments[0].click();", CheckBoxes.get(i));
        //}
        //
        //int checkedCount = 0, uncheckedCount = 0;
        //for(int i = 0; i < CheckBoxes.size(); i++) {
        //	boolean isChecked = CheckBoxes.get(i).isSelected();
        //	System.out.println(i + " checkbox is selected: " + isChecked);
        //	if (isChecked) checkedCount++;
        //	else uncheckedCount++;
        //}
        
        List<org.openqa.selenium.WebElement>CheckBoxes =driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("Number of Check boxes : "+Integer.toString(CheckBoxes.size()));
		
		for(int i=0; i<CheckBoxes.size(); i=i+4) {
			CheckBoxes.get(i).click();
		}
		
		int checkedCount=0, uncheckedCount=0;
		for(int i=0; i<CheckBoxes.size(); i++) {
			System.out.println(i+" checkbox is selected "+CheckBoxes.get(i).isSelected());
			if(CheckBoxes.get(i).isSelected()) {
				checkedCount++;
			} else {
				uncheckedCount++;
			}
		}
		
        System.out.println("Number of selected checkboxes: " + checkedCount);
        System.out.println("Number of unselected checkboxes: " + uncheckedCount);

        driver.quit();
    }
}